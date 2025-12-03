
package Calc;

public class CalculatorMemento {
    private final String currentOperand;
    private final String previousOperand;
    private final String operationSymbol;
    private final String unaryOperation; // إضافة جديدة

    public CalculatorMemento(String current, String previous, String symbol, String unary) {
        this.currentOperand = current;
        this.previousOperand = previous;
        this.operationSymbol = symbol;
        this.unaryOperation = unary;
    }

    // Getters
    public String getCurrentOperand() { return currentOperand; }
    public String getPreviousOperand() { return previousOperand; }
    public String getOperationSymbol() { return operationSymbol; }
    public String getUnaryOperation() { return unaryOperation; } // جديد
}