package org.dwcj.events;

import org.dwcj.controls.ComboBox;

public class ComboBoxSelectEvent implements IDwcEvent {

    private final ComboBox control;

    public ComboBoxSelectEvent(ComboBox cComboBox) {
        this.control = cComboBox;
    }

    @Override
    public ComboBox getControl() { return control; }
}
