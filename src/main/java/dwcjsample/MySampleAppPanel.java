package dwcjsample;

import org.dwcj.App;
import org.dwcj.controls.*;
import org.dwcj.events.ButtonPushEvent;
import org.dwcj.events.CheckOffEvent;
import org.dwcj.events.CheckOnEvent;
import org.dwcj.exceptions.DwcAppInitializeException;
import org.dwcj.panels.AppPanel;

import java.util.HashMap;
import java.util.Map;

public class MySampleAppPanel extends AppPanel{

    private final TextBox username;

    private final TextBox password;

    private final CheckBox checkBox;

    private final ListEdit cbe;

    private final InputD date;

    public MySampleAppPanel() throws DwcAppInitializeException {

        super();

        setStyle("display", "inline-grid");
        setStyle("grid-template-columns", "1fr 2fr");
        setStyle("gap", "20px");
        setStyle("left", "20px");
        setStyle("top", "20px");
        setStyle("border", "1px dotted");
        setStyle("padding", "10px");

        add(new Label("Username:"));
        username = new TextBox();
        add(username);

        add(new Label("Password:"));
        password = new TextBox();
        add(password);

        add(new Label("Gender:"));
        Map<Object, String> genders = new HashMap<>();
        genders.put("m", "Male");
        genders.put("f", "Female");
        genders.put("o", "Other");
        cbe = new ListEdit();
        cbe.setItems(genders);
        add(cbe);
        cbe.setStyle("width","100%");

        checkBox = new CheckBox();
        add(checkBox);
        checkBox.onCheckOff(this::onSampleCheckOff);
        checkBox.onCheckOn(this::onSampleCheckOn);

        add(new Label("Current date:"));
        date = new InputD();
        add(date);


        add(new Label("Password merken"));

        Button btn = new Button("Login");
        add(btn);
        btn.setTheme(IThemable.Theme.DEFAULT);
        btn.setExpanse(IExpansible.Expanse.LARGE);
        btn.setStyle("grid-column","1 / span 2");
        btn.setStyle("width", "100%");
        btn.onClick(this::onSampleButtonPush);
    }

    private void onSampleCheckOff(CheckOffEvent ev) {
        String text = "Umentschieden?";
        App.msgbox(text, 0, "Hallo Welt");
    }

    private void onSampleCheckOn(CheckOnEvent ev) {
        String text = "Cool";
        App.msgbox(text, 0, "Hallo Welt");
    }

    private void onSampleButtonPush(ButtonPushEvent ev) {
        String text;
        if (username.getText().equals("lorenz") && password.getText().equals("admin123")) {
            text = "Welcome " + username.getText() + "!";
            App.msgbox(text, 0, "Success");
        } else {
            text = "Wrong login data, try again!";
            App.msgbox(text, 0, "Failure");
            username.setText("");
            password.setText("");
        }

    }


}
