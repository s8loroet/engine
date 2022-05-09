package org.dwcj.events.sinks;

import com.basis.bbj.proxies.event.BBjCheckOffEvent;
import com.basis.bbj.proxies.sysgui.BBjControl;
import org.dwcj.Environment;
import org.dwcj.bridge.ControlAccessor;
import org.dwcj.controls.CheckBox;
import org.dwcj.events.CheckOffEvent;

import java.util.function.Consumer;

public class BBjCheckOffEventSink {

    private final Consumer<CheckOffEvent> target;

    private final CheckBox checkBox;

    private final BBjControl ctrl;

    @SuppressWarnings({"static-access"})
    public BBjCheckOffEventSink(CheckBox cb, Consumer<CheckOffEvent> target) {
        this.target = target;
        this.checkBox = cb;

        BBjControl bbjctrl = null;
        try {
            bbjctrl = ControlAccessor.getDefault().getBBjControl(cb);
            bbjctrl.setCallback(Environment.getInstance().getBBjAPI().ON_CHECK_OFF, Environment.getInstance().getDwcjHelper().getEventProxy(this, "onEvent"), "onEvent");
        } catch (Exception e) {
            e.printStackTrace();
        }

        this.ctrl = bbjctrl;
    }

    public void onEvent(BBjCheckOffEvent ev) {
        CheckOffEvent dwc_ev = new CheckOffEvent(null);
        target.accept(dwc_ev);
    }

}
