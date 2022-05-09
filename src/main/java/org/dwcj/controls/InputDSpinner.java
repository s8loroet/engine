package org.dwcj.controls;

import com.basis.bbj.proxies.sysgui.BBjWindow;
import org.dwcj.bridge.PanelAccessor;
import org.dwcj.panels.AbstractDwcjPanel;

public class InputDSpinner extends AbstractDwcControl implements IThemable, IExpansible {
    
    public InputDSpinner() {}
    
    @Override
    void create(AbstractDwcjPanel p) {
        try {
            BBjWindow w = PanelAccessor.getDefault().getBBjWindow(p);
            //todo: honor visibility flag, if set before adding the control to the form, so it's created invisibly right away
            ctrl = w.addInputDSpinner(w.getAvailableControlID(), BASISNUMBER_1, BASISNUMBER_1, BASISNUMBER_250, BASISNUMBER_250);
            catchUp();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public InputDSpinner setExpanse(Expanse expanse) {
        super.setControlExpanse(expanse);
        return this;
    }
    
    @Override
    public InputDSpinner setTheme(Theme theme) {
        super.setControlTheme(theme);
        return this;
    }
}
