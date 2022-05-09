package dwcjsample;

import org.dwcj.App;
import org.dwcj.exceptions.DwcAppInitializeException;

public class MySampleApp extends App {

    @Override
    public void run() throws DwcAppInitializeException {

        new MySampleAppPanel();

    }

}