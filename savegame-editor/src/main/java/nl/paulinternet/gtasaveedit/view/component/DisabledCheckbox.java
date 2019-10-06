package nl.paulinternet.gtasaveedit.view.component;

import javax.swing.*;

public class DisabledCheckbox extends JCheckBox {
    public DisabledCheckbox(boolean selected) {
        setEnabled(false);
        setSelected(selected);
    }
}
