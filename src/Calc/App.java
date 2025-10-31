package Calc;


import javax.swing.SwingUtilities;

public class App {
    public static void main(String[] args) {
       
        // Run the calculator UI
        SwingUtilities.invokeLater(() -> {
            // If CalculatorUI is a Singleton:
        CalculatorUI.getInstance().setVisible(true);

        });
    }
}
