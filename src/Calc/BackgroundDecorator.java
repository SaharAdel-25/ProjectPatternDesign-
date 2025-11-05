/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calc;


import javax.swing.*;
import java.awt.*;

public class BackgroundDecorator extends UIDecorator {
    public BackgroundDecorator(UIComponent component) {
        super(component);
    }

    @Override
    public void apply(JComponent root) {
        super.apply(root);

       
        root.setBackground(new Color(255, 192, 203)); // Pink
        if (root instanceof JPanel p) {
            p.setOpaque(true);
        }
    }
}
