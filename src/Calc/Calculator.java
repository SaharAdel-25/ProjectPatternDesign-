package Calc;


public final class Calculator {
    
    private final ComplexMath complex = new ComplexMath();
    private String currentOperand;
    private String previousOperand;
    private String operation;
    private String unaryOperation = "";

    public Calculator() {
        this.clear();
    }

    public void clear() {
        this.currentOperand = "";
        this.previousOperand = "";
        this.operation = "";
    }

    public void appendNumber(String number) {
        if (this.currentOperand.equals("0") && number.equals("0")) {
            return;
        }
        if (number.equals(".") && this.currentOperand.contains(".")) {
            return;
        }
        if (this.currentOperand.equals("0")
                && !number.equals("0")
                && !number.equals(".")) {
            this.currentOperand = "";
        }
        this.currentOperand += number;
    }

    public void chooseOperation(String operation) {
        if (this.currentOperand.equals("") && !this.previousOperand.equals("")) {
            this.operation = operation;
            return;
        }
        if (this.currentOperand.equals("")) {
            return;
        }
        if (!this.previousOperand.equals("")) {
            this.compute();
        }
        this.operation = operation;
        this.previousOperand = this.currentOperand;
        this.currentOperand = "";
    }
    public void startUnaryOperation(String operation) {
        if (!currentOperand.isEmpty()) return; 
        unaryOperation = operation;
        previousOperand = operation + "(";
        currentOperand = ""; 
    }

    public void compute() {
    try {
        if (!unaryOperation.isEmpty() && !currentOperand.isEmpty()) {
            float a = Float.parseFloat(currentOperand.replace("(", "").replace(")", ""));
            Operation opr = getOperation(unaryOperation);
            float result = opr.apply(a, 0);
            if (Float.isNaN(result) || Float.isInfinite(result)) {
                clear();
                currentOperand = "Error";
                return;
            }
            currentOperand = (result - (int) result) != 0 ? Float.toString(result) : Integer.toString((int) result);
            unaryOperation = "";
            previousOperand = "";
            return;
        }

        if (currentOperand.equals("") || previousOperand.equals("") || operation.isEmpty()) return;

        float curr = Float.parseFloat(currentOperand.replace("(", "").replace(")", ""));
        float prev = Float.parseFloat(previousOperand.replace("(", "").replace(")", ""));

        if (operation.equals("/") && curr == 0) {
            clear();
            currentOperand = "Error";
            return;
        }

        Operation oprObj = getOperation(operation);
        float computation = oprObj.apply(prev, curr);

        currentOperand = (computation - (int) computation) != 0 ? Float.toString(computation) : Integer.toString((int) computation);
        previousOperand = "";
        operation = "";
    } catch (NumberFormatException e) {
        currentOperand = "Error";
    }
}
    public Operation getOperation(String op) {
        switch (op) {
            case "+": return new AddOperation();
            case "-": return new SubOperation();
            case "*": return new MulOperation();
            case "/": return new DivOperation();
            case "^": return new ComplexMathAdapter(complex, ComplexMathAdapter.OpType.POW);
            case "sqr": return new ComplexMathAdapter(complex, ComplexMathAdapter.OpType.SQRT);
            case "exp": return new ComplexMathAdapter(complex, ComplexMathAdapter.OpType.EXP);
            case "logb": case "log": return new ComplexMathAdapter(complex, ComplexMathAdapter.OpType.LOG_BASE);
            case "π": return new ComplexMathAdapter(complex, ComplexMathAdapter.OpType.PI);
            case "%": return new ComplexMathAdapter(complex, ComplexMathAdapter.OpType.PERCENT);
            case "sin": return new ComplexMathAdapter(complex, ComplexMathAdapter.OpType.SIN);
            case "cos": return new ComplexMathAdapter(complex, ComplexMathAdapter.OpType.COS);
            case "tan": return new ComplexMathAdapter(complex, ComplexMathAdapter.OpType.TAN);
        }
        throw new IllegalArgumentException("Unknown operation: " + op);
    }

    public void setPreviousOperand(String value) {
    this.previousOperand = value;
}

    public String getCurrentOperand() {
        return currentOperand;
    }

    public String getPreviousOperand() {
        return previousOperand;
    }

    public String getOperation() {
        return operation;
    }

    public void setCurrentOperand(String value) {
        this.currentOperand = value;
    }
    public String getUnaryOperation() {
        return unaryOperation;
    }

}