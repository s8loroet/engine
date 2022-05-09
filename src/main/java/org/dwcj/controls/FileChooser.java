package org.dwcj.controls;

import com.basis.bbj.proxies.sysgui.BBjWindow;
import org.dwcj.bridge.PanelAccessor;
import org.dwcj.panels.AbstractDwcjPanel;

public class FileChooser extends AbstractDwcControl implements IStyleable, IThemable {
    
    public FileChooser() {}

    @Override
    void create(AbstractDwcjPanel p) {

        try {
            BBjWindow w = PanelAccessor.getDefault().getBBjWindow(p);
            //todo: honor visibility flag, if set before adding the control to the form, so it's created invisibly right away
            w.addFileChooser(w.getAvailableControlID(), BASISNUMBER_1, BASISNUMBER_1, BASISNUMBER_1, BASISNUMBER_1, "");
            catchUp();
        } catch (Exception e)  {
            e.printStackTrace();
        }
    }

    @Override
    public FileChooser setStyle(String property, String value) {
        super.setControlStyle(property, value);
        return this;
    }

    @Override
    public FileChooser addClass(String selector) {
        super.addControlCssClass(selector);
        return this;
    }

    @Override
    public FileChooser removeClass(String selector) {
        super.removeControlCssClass(selector);
        return this;
    }

    @Override
    public FileChooser setTheme(Theme theme) {
        super.setControlTheme(theme);
        return this;
    }
}
