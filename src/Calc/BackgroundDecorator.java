
package Calc;


import javax.swing.*;
import java.awt.*;

public class BackgroundDecorator extends UIDecorator {

    private final Color color;

    public BackgroundDecorator(UIComponent component, Color color) {
        super(component);
        this.color = color;
    }

    @Override
    public void apply(JComponent root) {
        super.apply(root);

        root.setBackground(color);
        if (root instanceof JPanel p) {
            p.setOpaque(true);
        }
    }
}

