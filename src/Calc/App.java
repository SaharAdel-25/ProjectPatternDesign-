package Calc;


import javax.swing.JComponent;
import javax.swing.SwingUtilities;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CalculatorUI ui = CalculatorUI.getInstance();
            ui.setVisible(true);

            JComponent root = (JComponent) ui.getContentPane();

            // إنشاء سلسلة المزينات
            UIComponent decorated = new HoverDecorator(
                                      new BorderDecorator(
                                        new BackgroundDecorator(
                                          new BaseUIComponent()
                                        )));

            // تطبيقها على الواجهة
            decorated.apply(root);
        });
    }
}
