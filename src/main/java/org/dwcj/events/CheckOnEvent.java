package org.dwcj.events;

import org.dwcj.controls.CheckBox;

public class CheckOnEvent implements IDwcEvent{

    private final CheckBox control;

    public CheckOnEvent(CheckBox cCheckBox) { this.control = cCheckBox; }

    @Override
    public CheckBox getControl() { return control; }
}
