package dwcjsample.testsamples;

import org.dwcj.App;
import org.dwcj.controls.InputESpinner;
import org.dwcj.exceptions.DwcAppInitializeException;
import org.dwcj.panels.AppPanel;

public class InputESpinnerSampleApp extends App {
    @Override
    public void run() throws DwcAppInitializeException {
        new InputESpinnerSampleAppPanel();
    }
}

class InputESpinnerSampleAppPanel extends AppPanel {

    public InputESpinnerSampleAppPanel() throws DwcAppInitializeException {

        super();

        setStyle("display", "inline-grid");
        setStyle("grid-template-columns", "1fr 2fr");
        setStyle("gap", "20px");
        setStyle("left", "20px");
        setStyle("top", "20px");
        setStyle("border", "1px dotted");
        setStyle("padding", "10px");

        InputESpinner inputESpinner = new InputESpinner();
        add(inputESpinner);
    }
}
