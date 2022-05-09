package org.dwcj.events;

import org.dwcj.controls.CheckBox;

public class CheckOffEvent implements IDwcEvent {

    private final CheckBox control;

    public CheckOffEvent(CheckBox cCheckBox) { this.control = cCheckBox; }

    @Override
    public CheckBox getControl() { return control; }
}
