package Calc;


import javax.swing.SwingUtilities;

public class App {
    public static void main(String[] args) {
       
        // Run the calculator UI
        SwingUtilities.invokeLater(() -> {
            // If CalculatorUI2 is a Singleton:
        CalculatorUI2.getInstance().setVisible(true);

        });
    }
}
