package dwcjsample.testsamples;

import org.dwcj.App;
import org.dwcj.controls.StringEditBox;
import org.dwcj.exceptions.DwcAppInitializeException;
import org.dwcj.panels.AppPanel;

public class InputESampleApp extends App {
    @Override
    public void run() throws DwcAppInitializeException {
        new InputESampleAppPanel();
    }
}

class InputESampleAppPanel extends AppPanel {

    public InputESampleAppPanel() throws DwcAppInitializeException {

        super();

        setStyle("display", "inline-grid");
        setStyle("grid-template-columns", "1fr 2fr");
        setStyle("gap", "20px");
        setStyle("left", "20px");
        setStyle("top", "20px");
        setStyle("border", "1px dotted");
        setStyle("padding", "10px");

        StringEditBox stringEditBox = new StringEditBox();
        add(stringEditBox);
    }
}
