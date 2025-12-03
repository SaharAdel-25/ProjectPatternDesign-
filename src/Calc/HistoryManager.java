package Calc;

import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class HistoryManager {

    // Stack لحفظ الميمينتو (لـ Undo)
    private final Stack<CalculatorMemento> historyStack = new Stack<>();

    // List لحفظ عرض السجل كنصوص
    private final List<String> historyDisplayList = new ArrayList<>();

    // حفظ الميمينتو مع نص العملية
    public void save(CalculatorMemento memento, String operationText) {
        historyStack.push(memento);
        if (operationText != null && !operationText.isEmpty()) {
            historyDisplayList.add(operationText);
        }
    }

    // Undo
    public CalculatorMemento undo() {
        if (!historyStack.isEmpty()) {
            // عند Undo نزيل آخر عنصر من السجل أيضاً
            if (!historyDisplayList.isEmpty()) {
                historyDisplayList.remove(historyDisplayList.size() - 1);
            }
            return historyStack.pop();
        }
        return null;
    }

    // جلب كل النصوص للسجل
    public List<String> getHistory() {
        return historyDisplayList;
    }
}
