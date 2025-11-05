
package Calc;


public final class Calculator {
    OperationFactory operationFactory = new OperationFactory();//factory

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
    // **بدل applyUnaryOperation، نحتفظ فقط باسم العملية الأحادية**
    public void startUnaryOperation(String operation) {
        if (!currentOperand.isEmpty()) return; // لمنع تداخل العمليات
        unaryOperation = operation;
        previousOperand = operation + "(";
        currentOperand = ""; // المستخدم سيدخل الرقم بعد ذلك
    }

    // **التنفيذ عند الضغط على =**
    public void compute() {
        if (!unaryOperation.isEmpty() && !currentOperand.isEmpty()) {
            // تنفيذ العملية الأحادية أولاً
            float a = Float.parseFloat(currentOperand);
            Operation opr = operationFactory.getOperation(unaryOperation);
            float result = opr.apply(a, 0);
            if (Float.isNaN(result) || Float.isInfinite(result)) {
                clear();
                currentOperand = "Error";
                return;
            }
            if (Math.abs(result) < 1e-6) result = 0;
            currentOperand = (result - (int) result) != 0 ? Float.toString(result) : Integer.toString((int) result);

            unaryOperation = "";
            previousOperand = "";
        }

        // ثم تنفيذ العملية الثنائية
        if (currentOperand.equals("") || previousOperand.equals("") || operation.isEmpty()) return;

        float curr = Float.parseFloat(currentOperand);
        float prev = Float.parseFloat(previousOperand);

        if (operation.equals("/") && curr == 0) {
            clear();
            currentOperand = "Error";
            return;
        }

        Operation oprObj = operationFactory.getOperation(operation);
        float computation = oprObj.apply(prev, curr);

        currentOperand = (computation - (int) computation) != 0 ? Float.toString(computation) : Integer.toString((int) computation);
        previousOperand = "";
        operation = "";
    }
    public void setPreviousOperand(String value) {
    this.previousOperand = value;
}


//    public void compute() {
//        float computation;
//        if (this.currentOperand.equals("") || this.previousOperand.equals("")) {
//            return;
//        }
//        float curr = Float.parseFloat(this.currentOperand);
//        float prev = Float.parseFloat(this.previousOperand);
//        if (Float.isNaN(curr) || Float.isNaN(prev)) {
//            return;
//        }
//        if (operation.equals("/") && curr == 0) {
//            this.clear();
//            this.currentOperand = "Error";
//            return;
//        }
//        Operation oprObj = operationFactory.getOperation(operation);
//            
//        computation = oprObj.apply(prev, curr);
//
//        this.currentOperand = (computation - (int) computation) != 0
//                ? Float.toString(computation)
//                : Integer.toString((int) computation);
//        this.previousOperand = "";
//        this.operation = "";
//    }

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
//    public void startUnaryOperation(String operation) {
//    if (!currentOperand.isEmpty()) return; // لمنع تداخل العمليات
//    unaryOperation = operation;
//    previousOperand = operation + "(";
//    currentOperand = ""; // المستخدم سيدخل الرقم بعد ذلك
//}
//
//public void closeUnaryOperation() {
//    if (unaryOperation.isEmpty() || currentOperand.isEmpty()) return;
//
//    float a = Float.parseFloat(currentOperand);
//    float result;
//    
//    Operation opr = operationFactory.getOperation(unaryOperation);
//    result = opr.apply(a, 0); 
//
//    if (Float.isNaN(result) || Float.isInfinite(result)) {
//        clear();
//        currentOperand = "Error";
//        unaryOperation = "";
//        return;
//    }
//
//    if (Math.abs(result) < 1e-6) result = 0;
//
//    currentOperand = (result - (int) result) != 0 ? Float.toString(result) : Integer.toString((int) result);
//
//    previousOperand = "";
//    unaryOperation = "";
//}


//    public void applyUnaryOperation(String operation) {
//        if (this.currentOperand.isEmpty()) return;
//
//        float a = Float.parseFloat(this.currentOperand);
//        float result;
//
//        Operation opr = operationFactory.getOperation(operation);
//        result = opr.apply(a, 0); 
//        if (Float.isNaN(result) || Float.isInfinite(result)) {
//            this.clear();
//            this.currentOperand = "Error";
//            return;
//        }
//        if (Math.abs(result) < 1e-6) {
//            result = 0;
//        }
//        this.currentOperand = (result - (int) result) != 0
//                ? Float.toString(result)
//                : Integer.toString((int) result);
//
//        this.operation = "";
//        this.previousOperand = "";
//}
public String getUnaryOperation() {
    return unaryOperation;
}

}