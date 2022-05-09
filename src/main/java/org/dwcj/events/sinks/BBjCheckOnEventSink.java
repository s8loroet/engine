package org.dwcj.events.sinks;

import com.basis.bbj.proxies.event.BBjCheckOffEvent;
import com.basis.bbj.proxies.event.BBjCheckOnEvent;
import com.basis.bbj.proxies.sysgui.BBjControl;
import org.dwcj.Environment;
import org.dwcj.bridge.ControlAccessor;
import org.dwcj.controls.CheckBox;
import org.dwcj.events.CheckOffEvent;
import org.dwcj.events.CheckOnEvent;

import java.util.function.Consumer;

public class BBjCheckOnEventSink {

    private final Consumer<CheckOnEvent> target;

    private final CheckBox checkBox;

    private final BBjControl ctrl;

    @SuppressWarnings({"static-access"})
    public BBjCheckOnEventSink (CheckBox cb, Consumer<CheckOnEvent> target) {
        this.target = target;
        this.checkBox = cb;

        BBjControl bbjctrl = null;
        try {
            bbjctrl = bbjctrl = ControlAccessor.getDefault().getBBjControl(cb);
            bbjctrl.setCallback(Environment.getInstance().getBBjAPI().ON_CHECK_ON, Environment.getInstance().getDwcjHelper().getEventProxy(this, "onEvent"), "onEvent");
        } catch (Exception e) {
            e.printStackTrace();
        }

        this.ctrl = bbjctrl;
    }

    public void onEvent(BBjCheckOnEvent ev) {
        CheckOnEvent dwc_ev = new CheckOnEvent(null);
        target.accept(dwc_ev);
    }

}
