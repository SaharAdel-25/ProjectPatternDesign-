package Calc;

import java.util.List;

public final class Calculator {

    private final ComplexMath complex = new ComplexMath();
    private final HistoryManager historyManager;

    private String currentOperand;
    private String previousOperand;
    private Operation strategy;
    private String unaryOperation = "";
    private String operationSymbol = "";

    public Calculator() {
        this.historyManager = new HistoryManager();
        clear();
    }

    public void clear() {
        this.currentOperand = "";
        this.previousOperand = "";
        this.strategy = null;
        this.unaryOperation = "";
        this.operationSymbol = "";
    }

    public void appendNumber(String number) {
        if (currentOperand.equals("0") && number.equals("0")) return;
        if (number.equals(".") && currentOperand.contains(".")) return;
        if (currentOperand.equals("0") && !number.equals("0") && !number.equals(".")) {
            currentOperand = "";
        }
        currentOperand += number;
    }

    public void chooseOperation(String op) {
        this.operationSymbol = op;

        if (currentOperand.equals("") && !previousOperand.equals("")) {
            strategy = getOperation(op);
            return;
        }
        if (currentOperand.equals("")) return;

        strategy = getOperation(op);

        if (!previousOperand.equals("") && !currentOperand.equals("")) {
            compute();
        }

        previousOperand = currentOperand;
        currentOperand = "";
    }


    public void startUnaryOperation(String op) {
        if (!currentOperand.isEmpty()) return;

        unaryOperation = op;
        previousOperand = op + "(";
        currentOperand = "";
        strategy = getOperation(op);
        operationSymbol = "";
    }

    public void compute() {

        try {
            if (!unaryOperation.isEmpty() && !currentOperand.isEmpty()) {
                float a = Float.parseFloat(currentOperand.replace("(", "").replace(")", ""));
                float result = strategy.apply(a, 0);

                if (Float.isNaN(result) || Float.isInfinite(result)) {
                    clear();
                    currentOperand = "Error";
                    return;
                }
                
                String operationText = previousOperand + " " + operationSymbol + " " + " = " + result;
                historyManager.AddMemento(this.storeInMemento(), operationText);


                currentOperand = (result - (int) result) != 0
                        ? Float.toString(result)
                        : Integer.toString((int) result);
                
                unaryOperation = "";
                previousOperand = "";
                strategy = null;
                operationSymbol = "";
                return;
            }

            if (currentOperand.equals("") || previousOperand.equals("") || strategy == null) return;
            float curr = Float.parseFloat(currentOperand.replace("(", "").replace(")", ""));
            float prev = Float.parseFloat(previousOperand.replace("(", "").replace(")", ""));
            
            float computation = strategy.apply(prev, curr);
            
            String operationText = previousOperand + " " + operationSymbol + " " + currentOperand + " = " + computation;
            historyManager.AddMemento(this.storeInMemento(), operationText);

            currentOperand = (computation - (int) computation) != 0
                    ? Float.toString(computation)
                    : Integer.toString((int) computation);
            

            previousOperand = "";
            strategy = null;
            operationSymbol = "";

        } catch (ArithmeticException | NumberFormatException e) {
            clear();
            currentOperand = "Error";
        }
    }

    public Operation getOperation(String op) {
        switch (op) {
            case "+": return new AddOperation();
            case "-": return new SubOperation();
            case "*": return new MulOperation();
            case "/": return new DivOperation();
            case "^": return new ComplexMathAdapter(complex, OpType.POW);
            case "sqr": case "√": return new ComplexMathAdapter(complex, OpType.SQRT);
            case "exp": return new ComplexMathAdapter(complex, OpType.EXP);
            case "logb": case "log": return new ComplexMathAdapter(complex, OpType.LOG_BASE);
            case "π": return new ComplexMathAdapter(complex, OpType.PI);
            case "%": return new ComplexMathAdapter(complex, OpType.PERCENT);
            case "sin": return new ComplexMathAdapter(complex, OpType.SIN);
            case "cos": return new ComplexMathAdapter(complex, OpType.COS);
            case "tan": return new ComplexMathAdapter(complex, OpType.TAN);
        }
        throw new IllegalArgumentException("Unknown operation: " + op);
    }

    // Getters و Setters
    public String getCurrentOperand() { return currentOperand; }
    public String getPreviousOperand() { return previousOperand; }
    public String getUnaryOperation() { return unaryOperation; }
    public String getOperationSymbol() { return operationSymbol; }

    public void setCurrentOperand(String value) { this.currentOperand = value; }
    public void setPreviousOperand(String value) { this.previousOperand = value; }

    // Memento 
    public CalculatorMemento storeInMemento() {
        return new CalculatorMemento(
            currentOperand.replace("(", "").replace(")", ""),
            previousOperand.replace("(", "").replace(")", ""),
            operationSymbol,
            unaryOperation
        );
    }


    public void restoreFromMemento(CalculatorMemento memento) {
        this.currentOperand = memento.getCurrentOperand();
        this.previousOperand = memento.getPreviousOperand();
        this.operationSymbol = memento.getOperationSymbol();
        this.unaryOperation = memento.getUnaryOperation(); 
    }
    
    
    public void undo() {
        CalculatorMemento memento = historyManager.getMemento();
        if (memento != null) {
            restoreFromMemento(memento);
        } else {
            clear();
        }
    }

    // History 
    public List<String> getHistoryManager() {
        return historyManager.getHistory();
    }

}
