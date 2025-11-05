package Calc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class HoverDecorator extends UIDecorator {

    private final Color color;

    public HoverDecorator(UIComponent component, Color color) {
        super(component);
        this.color = color;
    }

    @Override
    public void apply(JComponent root) {
        super.apply(root);

        if (root instanceof AbstractButton b) {

            b.setBackground(color);
            b.setForeground(Color.DARK_GRAY);

            b.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    b.setBackground(color.darker());
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    b.setBackground(color);
                }
            });
        }
    }
}
