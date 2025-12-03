package Calc;

import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class HistoryManager {

    private final Stack<CalculatorMemento> historyStack = new Stack<>();
    private final List<String> historyDisplayList = new ArrayList<>();

    public void AddMemento(CalculatorMemento memento, String operationText) {
        historyStack.push(memento);
        if (operationText != null && !operationText.isEmpty()) {
            historyDisplayList.add(operationText);
        }
    }

    // Undo
    public CalculatorMemento getMemento() {
        if (!historyStack.isEmpty()) {
            if (!historyDisplayList.isEmpty()) {
                historyDisplayList.remove(historyDisplayList.size() - 1);
            }
            return historyStack.pop();
        }
        return null;
    }

    public List<String> getHistory() {
        return historyDisplayList;
    }
}
