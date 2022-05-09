package dwcjsample.testsamples;

import org.dwcj.App;
import org.dwcj.controls.ListBox;
import org.dwcj.exceptions.DwcAppInitializeException;
import org.dwcj.panels.AppPanel;

public class ListBoxSampleApp extends App {
    @Override
    public void run() throws DwcAppInitializeException {
        new ListBoxSampleAppPanel();
    }
}

class ListBoxSampleAppPanel extends AppPanel {

    public ListBoxSampleAppPanel() throws DwcAppInitializeException {

        super();

        setStyle("display", "inline-grid");
        setStyle("grid-template-columns", "1fr 2fr");
        setStyle("gap", "20px");
        setStyle("left", "20px");
        setStyle("top", "20px");
        setStyle("border", "1px dotted");
        setStyle("padding", "10px");

        ListBox listBox = new ListBox();
        add(listBox);
    }
}
