package dwcjsample.testsamples;

import org.dwcj.App;
import org.dwcj.controls.ColorPicker;
import org.dwcj.exceptions.DwcAppInitializeException;
import org.dwcj.panels.AppPanel;

public class ColorChooserSampleApp extends App {
    
    @Override
    public void run() throws DwcAppInitializeException {
        new ColorChooserSampleAppPanel();
    }
}

class ColorChooserSampleAppPanel extends AppPanel {

    public ColorChooserSampleAppPanel() throws DwcAppInitializeException {

        super();

        setStyle("display", "inline-grid");
        setStyle("grid-template-columns", "1fr 2fr");
        setStyle("gap", "20px");
        setStyle("left", "20px");
        setStyle("top", "20px");
        setStyle("border", "1px dotted");
        setStyle("padding", "10px");

        ColorPicker colorPicker = new ColorPicker();
        add(colorPicker);
    }
}
