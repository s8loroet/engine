package org.dwcj.controls;

import com.basis.bbj.proxies.sysgui.BBjWindow;
import org.dwcj.bridge.PanelAccessor;
import org.dwcj.panels.AbstractDwcjPanel;

public class InputN extends AbstractDwcControl implements IStyleable, IThemable, IExpansible {

    public InputN() {}

    public InputN(String text) {
        setText(text);
    }

    void create(AbstractDwcjPanel p) {
        try {
            BBjWindow w = PanelAccessor.getDefault().getBBjWindow(p);
            //todo: honor visibility flag, if set before adding the control to the form, so it's created invisibly right away
            ctrl = w.addInputN(w.getAvailableControlID(), BASISNUMBER_1, BASISNUMBER_1, BASISNUMBER_1, BASISNUMBER_1);
            catchUp();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public InputN setExpanse(Expanse expanse) {
        super.setControlExpanse(expanse);
        return this;
    }

    @Override
    public InputN setStyle(String property, String value) {
        super.setControlStyle(property, value);
        return this;
    }

    @Override
    public InputN addClass(String selector) {
        super.addControlCssClass(selector);
        return this;
    }

    @Override
    public InputN removeClass(String selector) {
        super.removeControlCssClass(selector);
        return this;
    }

    @Override
    public InputN setTheme(Theme theme) {
        super.setControlTheme(theme);
        return this;
    }

    @Override
    public InputN setText(String text) {
        super.setText(text);
        return this;
    }
}
