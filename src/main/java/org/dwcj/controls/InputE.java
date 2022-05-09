package org.dwcj.controls;

import com.basis.bbj.proxies.sysgui.BBjWindow;
import org.dwcj.bridge.PanelAccessor;
import org.dwcj.panels.AbstractDwcjPanel;

public class InputE extends AbstractDwcControl implements IStyleable, IThemable, IExpansible {

    public InputE() {}

    public InputE(String text) {
        setText(text);
    }

    void create(AbstractDwcjPanel p) {
        try {
            BBjWindow w = PanelAccessor.getDefault().getBBjWindow(p);
            //todo: honor visibility flag, if set before adding the control to the form, so it's created invisibly right away
            ctrl = w.addInputE(w.getAvailableControlID(), BASISNUMBER_1, BASISNUMBER_1, BASISNUMBER_1, BASISNUMBER_1);
            catchUp();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public InputE setExpanse(Expanse expanse) {
        super.setControlExpanse(expanse);
        return this;
    }

    @Override
    public InputE setStyle(String property, String value) {
        super.setControlStyle(property, value);
        return this;
    }

    @Override
    public InputE addClass(String selector) {
        super.addControlCssClass(selector);
        return this;
    }

    @Override
    public InputE removeClass(String selector) {
        super.removeControlCssClass(selector);
        return this;
    }

    @Override
    public InputE setTheme(Theme theme) {
        super.setControlTheme(theme);
        return this;
    }

    @Override
    public InputE setText(String text) {
        super.setText(text);
        return this;
    }
}
