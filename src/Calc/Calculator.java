
package Calc;

public final class Calculator {
    OperationFactory operationFactory = new OperationFactory();//factory

    private String currentOperand;
    private String previousOperand;
    private String operation;

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

    public void compute() {
        float computation;
        if (this.currentOperand.equals("") || this.previousOperand.equals("")) {
            return;
        }
        float curr = Float.parseFloat(this.currentOperand);
        float prev = Float.parseFloat(this.previousOperand);
        if (Float.isNaN(curr) || Float.isNaN(prev)) {
            return;
        }
        if (operation.equals("/") && curr == 0) {
            this.clear();
            this.currentOperand = "Error";
            return;
        }
        Operation oprObj = operationFactory.getOperation(operation);
            
        computation = oprObj.apply(prev, curr);

        this.currentOperand = (computation - (int) computation) != 0
                ? Float.toString(computation)
                : Integer.toString((int) computation);
        this.previousOperand = "";
        this.operation = "";
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


// === [ADD-ONLY] Advanced ops helper (non-invasive) ===
public float applyAdvanced(String op, float a, float b) {
    try {
        OperationFactory f = new OperationFactory();
        Operation operation = f.getOperation(op);
        return operation.apply(a, b);
    } catch (Throwable t) {
        return Float.NaN;
    }
}
}