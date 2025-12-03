
package Calc;

public class CalculatorMemento {
    private final String currentOperand;
    private final String previousOperand;
    private final String operationSymbol;

    public CalculatorMemento(String current, String previous, String symbol) {
        this.currentOperand = current;
        this.previousOperand = previous;
        this.operationSymbol = symbol;
    }

    // Getters
    public String getCurrentOperand() { return currentOperand; }
    public String getPreviousOperand() { return previousOperand; }
    public String getOperationSymbol() { return operationSymbol; }
    
    
}
