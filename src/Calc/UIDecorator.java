/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calc;


import javax.swing.*;

public abstract class UIDecorator implements UIComponent {
    protected UIComponent component;

    public UIDecorator(UIComponent component) {
        this.component = component;
    }

    @Override
    public void apply(JComponent root) {
        component.apply(root);
    }
}
