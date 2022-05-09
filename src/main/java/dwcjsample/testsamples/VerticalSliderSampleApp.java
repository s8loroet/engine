package dwcjsample.testsamples;

import org.dwcj.App;
import org.dwcj.controls.VerticalSlider;
import org.dwcj.exceptions.DwcAppInitializeException;
import org.dwcj.panels.AppPanel;

public class VerticalSliderSampleApp extends App {
    @Override
    public void run() throws DwcAppInitializeException {
        new VerticalSliderSampleAppPanel();
    }
}

class VerticalSliderSampleAppPanel extends AppPanel {

    public VerticalSliderSampleAppPanel() throws DwcAppInitializeException {

        super();

        setStyle("display", "inline-grid");
        setStyle("grid-template-columns", "1fr 2fr");
        setStyle("gap", "20px");
        setStyle("left", "20px");
        setStyle("top", "20px");
        setStyle("border", "1px dotted");
        setStyle("padding", "10px");

        VerticalSlider verticalSlider = new VerticalSlider();
        add(verticalSlider);
    }
}
