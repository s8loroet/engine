package dwcjsample.testsamples;

import org.dwcj.App;
import org.dwcj.controls.TreeView;
import org.dwcj.exceptions.DwcAppInitializeException;
import org.dwcj.panels.AppPanel;

public class TreeSampleApp extends App {
    @Override
    public void run() throws DwcAppInitializeException {
        new TreeSampleAppPanel();
    }
}

class TreeSampleAppPanel extends AppPanel {

    public TreeSampleAppPanel() throws DwcAppInitializeException {

        super();

        setStyle("display", "inline-grid");
        setStyle("grid-template-columns", "1fr 2fr");
        setStyle("gap", "20px");
        setStyle("left", "20px");
        setStyle("top", "20px");
        setStyle("border", "1px dotted");
        setStyle("padding", "10px");

        TreeView tree = new TreeView();
        add(tree);
    }
}