package dwcjsample.testsamples;

import org.dwcj.App;
import org.dwcj.controls.TextBoxSpinner;
import org.dwcj.exceptions.DwcAppInitializeException;
import org.dwcj.panels.AppPanel;

public class TextBoxSpinnerSampleApp extends App {
    @Override
    public void run() throws DwcAppInitializeException {
        new TextBoxSpinnerSampleAppPanel();
    }
}

class TextBoxSpinnerSampleAppPanel extends AppPanel {

    public TextBoxSpinnerSampleAppPanel() throws DwcAppInitializeException {

        super();

        setStyle("display", "inline-grid");
        setStyle("grid-template-columns", "1fr 2fr");
        setStyle("gap", "20px");
        setStyle("left", "20px");
        setStyle("top", "20px");
        setStyle("border", "1px dotted");
        setStyle("padding", "10px");

        TextBoxSpinner textBoxSpinner = new TextBoxSpinner();
        add(textBoxSpinner);
    }
}
