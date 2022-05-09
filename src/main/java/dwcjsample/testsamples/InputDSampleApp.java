package dwcjsample.testsamples;

import org.dwcj.App;
import org.dwcj.controls.InputD;
import org.dwcj.exceptions.DwcAppInitializeException;
import org.dwcj.panels.AppPanel;

public class InputDSampleApp extends App {
    @Override
    public void run() throws DwcAppInitializeException {
        new InputDSampleAppPanel();
    }
}

class InputDSampleAppPanel extends AppPanel {

    public InputDSampleAppPanel() throws DwcAppInitializeException {

        super();

        setStyle("display", "inline-grid");
        setStyle("grid-template-columns", "1fr 2fr");
        setStyle("gap", "20px");
        setStyle("left", "20px");
        setStyle("top", "20px");
        setStyle("border", "1px dotted");
        setStyle("padding", "10px");

        InputD inputD = new InputD();
        add(inputD);
    }
}
