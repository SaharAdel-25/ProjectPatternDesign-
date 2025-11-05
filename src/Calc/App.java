package Calc;

import javax.swing.SwingUtilities;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CalculatorUI ui = CalculatorUI.getInstance();
            ui.setLocationRelativeTo(null);
            ui.setVisible(true);            
        });
    }
}

