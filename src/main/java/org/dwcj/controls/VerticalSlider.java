package org.dwcj.controls;

import com.basis.bbj.proxies.sysgui.BBjWindow;
import org.dwcj.bridge.PanelAccessor;
import org.dwcj.panels.AbstractDwcjPanel;

public class VerticalSlider extends AbstractDwcControl implements IStyleable, IThemable {
    
    public VerticalSlider() {}

    @Override
    void create(AbstractDwcjPanel p) {
        try {
            BBjWindow w = PanelAccessor.getDefault().getBBjWindow(p);
            //todo: honor visibility flag, if set before adding the control to the form, so it's created invisibly right away
            w.addVerticalSlider(w.getAvailableControlID(), BASISNUMBER_1, BASISNUMBER_1, BASISNUMBER_1, BASISNUMBER_1);
            catchUp();
        } catch (Exception e)  {
            e.printStackTrace();
        }
    }

    @Override
    public VerticalSlider setStyle(String property, String value) {
        super.setControlStyle(property, value);
        return this;
    }

    @Override
    public VerticalSlider addClass(String selector) {
        super.addControlCssClass(selector);
        return this;
    }

    @Override
    public VerticalSlider removeClass(String selector) {
        super.removeControlCssClass(selector);
        return this;
    }

    @Override
    public VerticalSlider setTheme(Theme theme) {
        super.setControlTheme(theme);
        return this;
    }
}
