package org.dwcj.controls;

import com.basis.bbj.proxies.sysgui.BBjListEdit;
import com.basis.bbj.proxies.sysgui.BBjWindow;
import com.basis.startup.type.BBjException;
import com.basis.startup.type.BBjVector;
import org.dwcj.bridge.PanelAccessor;
import org.dwcj.panels.AbstractDwcjPanel;

import java.util.Iterator;
import java.util.Map;

/**
 * ComboBoxEdit Control
 */
public class ListEdit extends AbstractDwclistControl implements IStyleable, IThemable, IExpansible {

    public ListEdit() {
    }

    @Override
    void create(AbstractDwcjPanel p) {

        try {
            BBjWindow w = PanelAccessor.getDefault().getBBjWindow(p);
            //todo: honor visibility flag, if set before adding the control to the form, so it's created invisibly right away
            ctrl = w.addListEdit(w.getAvailableControlID(), BASISNUMBER_1, BASISNUMBER_1, BASISNUMBER_250, BASISNUMBER_250, "");
            ctrl.setAttribute("max-row-count", "25");
            ctrl.setAttribute("open-width", "2500");
            ctrl.setAttribute("button-height", "auto");
            populate();
            catchUp();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * set the list of items into the ComboBoxEdit
     *
     * @param values A Map object containing the key-value pairs for the list
     * @return the control itself
     */
    public ListEdit setItems(Map<Object, String> values) {
        this.values = values;
        populate();
        return this;
    }


    @SuppressWarnings("unchecked")
    private void populate() {
        if (values != null && ctrl != null) try {
            BBjListEdit cb = (BBjListEdit) ctrl;
            cb.removeAllItems();
            BBjVector v = new BBjVector();
            Iterator<Object> it = values.keySet().iterator();
            while (it.hasNext()) {
                v.add(values.get(it.next()));
            }
            cb.insertItems(0, v);
        } catch (BBjException e) {
            e.printStackTrace();
        }

    }


    @Override
    public ListEdit setExpanse(Expanse expanse) {
        super.setControlExpanse(expanse);
        return this;
    }

    @Override
    public ListEdit setStyle(String property, String value) {
        super.setControlStyle(property, value);
        return this;
    }

    @Override
    public ListEdit addClass(String selector) {
        super.addControlCssClass(selector);
        return this;
    }

    @Override
    public ListEdit removeClass(String selector) {
        super.removeControlCssClass(selector);
        return this;
    }

    @Override
    public ListEdit setTheme(Theme theme) {
        super.setControlTheme(theme);
        return this;
    }

}
