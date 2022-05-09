package org.dwcj.controls;

import com.basis.bbj.proxies.sysgui.BBjWindow;
import com.basis.startup.type.BBjException;
import org.dwcj.bridge.PanelAccessor;
import org.dwcj.events.CheckOffEvent;
import org.dwcj.events.CheckOnEvent;
import org.dwcj.events.sinks.BBjCheckOffEventSink;
import org.dwcj.events.sinks.BBjCheckOnEventSink;
import org.dwcj.panels.AbstractDwcjPanel;

import java.util.function.Consumer;

public class CheckBox extends AbstractDwcControl implements IStyleable, IExpansible {

    public CheckBox() {
    }

    @Override
    void create(AbstractDwcjPanel p) {
        try {
            BBjWindow w = PanelAccessor.getDefault().getBBjWindow(p);
            //todo: honor visibility flag, if set before adding the control to the form, so it's created invisibly right away
            w.addCheckBox(w.getAvailableControlID(), BASISNUMBER_1, BASISNUMBER_1, BASISNUMBER_1, BASISNUMBER_1, "");
            catchUp();
        } catch (Exception e)  {
            e.printStackTrace();
        }
    }

    /**
     * register an event callback for the checkOff event
     *
     * @param callback A method to receive the checkOff event
     * @return the control itself
     */
    public CheckBox onCheckOff(Consumer<CheckOffEvent> callback) {
        new BBjCheckOffEventSink(this, callback);
        return this;
    }

    /**
     * register an event callback for the checkOn event
     *
     * @param callback A method to receive the checkOn event
     * @return the control itself
     */
    public CheckBox onCheckOn(Consumer<CheckOnEvent> callback) {
        new BBjCheckOnEventSink(this, callback);
        return this;
    }

    @Override
    public CheckBox setExpanse(Expanse expanse) {
        super.setControlExpanse(expanse);
        return this;
    }

    @Override
    public CheckBox setStyle(String property, String value) {
        super.setControlStyle(property, value);
        return this;
    }

    @Override
    public CheckBox addClass(String selector) {
        super.addControlCssClass(selector);
        return this;
    }

    @Override
    public CheckBox removeClass(String selector) {
        super.removeControlCssClass(selector);
        return this;
    }

}
