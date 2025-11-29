
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
