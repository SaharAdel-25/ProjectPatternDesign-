package Calc;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class BorderDecorator extends UIDecorator {

    private final Color color;

    public BorderDecorator(UIComponent component, Color color) {
        super(component);
        this.color = color;
    }

    @Override
    public void apply(JComponent root) {
        super.apply(root);

        if (root instanceof AbstractButton b) {
            b.setBorder(new LineBorder(color.darker(), 2, true));
            b.setBackground(color);
            b.setForeground(Color.DARK_GRAY);
        }

        if (root instanceof JTextField t) {
            t.setBorder(new LineBorder(color.darker(), 2, true));
            t.setBackground(color.brighter());
            t.setForeground(Color.DARK_GRAY);
        }
    }
}
