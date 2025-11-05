/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calc;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class HoverDecorator extends UIDecorator {
    public HoverDecorator(UIComponent component) {
        super(component);
    }

    @Override
    public void apply(JComponent root) {
        super.apply(root);

        for (Component c : getAll(root)) {
            if (c instanceof AbstractButton b) {
                b.setFocusPainted(false);

                // لون افتراضي للأزرار (وردي باهت)
                b.setBackground(new Color(255, 228, 233));
                b.setForeground(Color.DARK_GRAY);

                // تأثير عند مرور الماوس
                b.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseEntered(MouseEvent e) {
                        b.setBackground(new Color(255, 182, 193)); // وردي كلاسيكي أغمق
                    }

                    @Override
                    public void mouseExited(MouseEvent e) {
                        b.setBackground(new Color(255, 228, 233)); // يرجع للفاتح
                    }
                });
            }
        }
    }

    private java.util.List<Component> getAll(JComponent root) {
        java.util.List<Component> list = new ArrayList<>();
        collect(root, list);
        return list;
    }

    private void collect(Component c, java.util.List<Component> out) {
        if (!out.contains(c)) out.add(c);
        if (c instanceof Container) {
            for (Component child : ((Container)c).getComponents()) collect(child, out);
        }
    }
}

