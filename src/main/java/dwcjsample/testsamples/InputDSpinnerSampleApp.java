package dwcjsample.testsamples;

import org.dwcj.App;
import org.dwcj.controls.InputDSpinner;
import org.dwcj.exceptions.DwcAppInitializeException;
import org.dwcj.panels.AppPanel;

public class InputDSpinnerSampleApp extends App {
    @Override
    public void run() throws DwcAppInitializeException {
        new InputDSpinnerSampleAppPanel();
    }
}

class InputDSpinnerSampleAppPanel extends AppPanel {

    public InputDSpinnerSampleAppPanel() throws DwcAppInitializeException {

        super();

        setStyle("display", "inline-grid");
        setStyle("grid-template-columns", "1fr 2fr");
        setStyle("gap", "20px");
        setStyle("left", "20px");
        setStyle("top", "20px");
        setStyle("border", "1px dotted");
        setStyle("padding", "10px");

        InputDSpinner inputDSpinner = new InputDSpinner();
        add(inputDSpinner);
    }
}
