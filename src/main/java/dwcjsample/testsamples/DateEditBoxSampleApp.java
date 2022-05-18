package dwcjsample.testsamples;

import org.dwcj.App;
import org.dwcj.controls.Button;
import org.dwcj.controls.DateEditBox;
import org.dwcj.events.ButtonPushEvent;
import org.dwcj.exceptions.DwcAppInitializeException;
import org.dwcj.panels.AppPanel;

import java.util.function.Consumer;

public class DateEditBoxSampleApp extends App {
    @Override
    public void run() throws DwcAppInitializeException {
        new DateEditBoxSampleAppPanel();
    }
}

class DateEditBoxSampleAppPanel extends AppPanel {

    private DateEditBox dateEditBox;

    public DateEditBoxSampleAppPanel() throws DwcAppInitializeException {

        super();

        setStyle("display", "inline-grid");
        setStyle("grid-template-columns", "1fr 2fr");
        setStyle("gap", "20px");
        setStyle("left", "20px");
        setStyle("top", "20px");
        setStyle("border", "1px dotted");
        setStyle("padding", "10px");

        dateEditBox = new DateEditBox();
        add(dateEditBox);
        Button btn = new Button();
        add(btn);
        btn.onClick(this::calendarClick);
    }

    public void calendarClick(ButtonPushEvent ev) {
        dateEditBox.calendar();
    }
}
