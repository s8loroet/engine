package dwcjsample.testsamples;

import org.dwcj.App;
import org.dwcj.controls.Button;
import org.dwcj.controls.IExpansible;
import org.dwcj.controls.IThemable;
import org.dwcj.events.ButtonPushEvent;
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
        btn.setTheme(IThemable.Theme.DEFAULT);
        btn.setExpanse(IExpansible.Expanse.LARGE);
        btn.setStyle("grid-column","1 / span 2");
        btn.setStyle("width", "100%");
        btn.onClick(this::onButtonClick);
        btn.doClick();
    }

    private void onButtonClick(ButtonPushEvent ev) {
        App.msgbox("lol", 0, "");
    }
}
