package dwcjsample.testsamples;

import org.dwcj.App;
import org.dwcj.controls.Button;
import org.dwcj.exceptions.DwcAppInitializeException;
import org.dwcj.panels.AppPanel;

public class ButtonSampleApp extends App {

    @Override
    public void run() throws DwcAppInitializeException {
        new ButtonSampleAppPanel();
    }
}

class ButtonSampleAppPanel extends AppPanel {

    public ButtonSampleAppPanel() throws DwcAppInitializeException {

        super();

        setStyle("display", "inline-grid");
        setStyle("grid-template-columns", "1fr 2fr");
        setStyle("gap", "20px");
        setStyle("left", "20px");
        setStyle("top", "20px");
        setStyle("border", "1px dotted");
        setStyle("padding", "10px");

        Button btn = new Button("button");
        add(btn);
    }
}
