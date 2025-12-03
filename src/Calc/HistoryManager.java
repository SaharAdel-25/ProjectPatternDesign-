package Calc;

import java.util.Stack;
import java.util.List;
import java.util.ArrayList; 

public class HistoryManager {
    
    private final Stack<CalculatorMemento> historyStack = new Stack<>();
    private final Calculator originator; // الأصل

    private final List<String> historyDisplayList = new ArrayList<>(); 

    public HistoryManager(Calculator calc) {
        this.originator = calc;
    }

    
    public void save() {
        historyStack.push(originator.saveState());
    }

    public boolean undo() {
        if (!historyStack.isEmpty()) {
            CalculatorMemento memento = historyStack.pop();
            originator.restoreState(memento);
            return true;
        }
        return false;
    }
    

    public void addOperationToHistory(String operationText) {
        historyDisplayList.add(operationText);
    }

    public List<String> getHistory() {
        return historyDisplayList;
    }
}