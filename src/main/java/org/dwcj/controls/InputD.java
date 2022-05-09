package org.dwcj.controls;

import com.basis.bbj.proxies.sysgui.BBjWindow;
import org.dwcj.bridge.PanelAccessor;
import org.dwcj.panels.AbstractDwcjPanel;

public class InputD extends AbstractDwcControl implements IStyleable, IThemable, IExpansible {
    
    public InputD(){}

    public InputD(String text) { setText(text); }
    
    @Override
    void create(AbstractDwcjPanel p) {
        try {
            BBjWindow w = PanelAccessor.getDefault().getBBjWindow(p);
            //todo: honor visibility flag, if set before adding the control to the form, so it's created invisibly right away
            ctrl = w.addInputD(w.getAvailableControlID(), BASISNUMBER_1, BASISNUMBER_1, BASISNUMBER_1, BASISNUMBER_1);
            catchUp();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public InputD 
setExpanse(Expanse expanse) {
        super.setControlExpanse(expanse);
        return this;
    }

    @Override
    public InputD 
setStyle(String property, String value) {
        super.setControlStyle(property, value);
        return this;
    }

    @Override
    public InputD 
addClass(String selector) {
        super.addControlCssClass(selector);
        return this;
    }

    @Override
    public InputD 
removeClass(String selector) {
        super.removeControlCssClass(selector);
        return this;
    }

    @Override
    public InputD 
setTheme(Theme theme) {
        super.setControlTheme(theme);
        return this;
    } 
}
