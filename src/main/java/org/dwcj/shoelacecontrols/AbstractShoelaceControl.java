package org.dwcj.shoelacecontrols;

import com.basis.startup.type.BBjException;
import org.dwcj.Environment;
import org.dwcj.controls.AbstractDwcControl;

public abstract class AbstractShoelaceControl extends AbstractDwcControl {

    static boolean libLoaded = false;

    protected static void loadShoelaceLib() {
        if (!libLoaded) {
            String url = "https://cdn.jsdelivr.net/npm/@shoelace-style/shoelace@2.0.0-beta.69/dist/shoelace.js";
            String css = "https://cdn.jsdelivr.net/npm/@shoelace-style/shoelace@2.0.0-beta.69/dist/themes/light.css";
            String script = "var link =  $doc.createElement('script');link.setAttribute('type','module');link.setAttribute('src','" + url + "');" + "document.head.appendChild(link);" + "var csslink =  $doc.createElement('link');" + "csslink.setAttribute('rel','stylesheet');" + "csslink.setAttribute('href','" + css + "');" + "document.head.appendChild(csslink);";
            try {
                Environment.getInstance().getSysGui().executeScript(script);
                libLoaded = true;
            } catch (BBjException e) {
                e.printStackTrace();
            }

        }
    }

    public String getText() {
        return "";
    }
}
