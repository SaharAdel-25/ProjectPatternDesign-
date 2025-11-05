/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calc;


import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.util.*;

public class BorderDecorator extends UIDecorator {
    public BorderDecorator(UIComponent component) {
        super(component);
    }

    @Override
    public void apply(JComponent root) {
        super.apply(root);

        for (Component c : getAll(root)) {
            if (c instanceof AbstractButton b) {
              
                b.setBorder(new LineBorder(new Color(255, 182, 193), 2, true));
                b.setBackground(new Color(255, 228, 233)); 
                b.setForeground(Color.DARK_GRAY);         
            }
            if (c instanceof JTextField t) {
                // حدود حقول الإدخال
                t.setBorder(new LineBorder(new Color(255, 182, 193), 2, true));
                t.setBackground(new Color(255, 240, 245)); 
                t.setForeground(Color.DARK_GRAY);
            }
        }
    }

    private java.util.List<Component> getAll(JComponent root) {
        java.util.List<Component> list = new ArrayList<>();
        collect(root, list);
        return list;
    }

    private void collect(Component c, java.util.List<Component> out) {
        out.add(c);
        if (c instanceof Container) {
            for (Component child : ((Container)c).getComponents()) collect(child, out);
        }
    }
}
