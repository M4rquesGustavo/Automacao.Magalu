package steps;

import core.Driver;
import enums.Browser;
import io.cucumber.java.Before;
import io.cucumber.java.After;

public class Hooks {

    @Before
    public void start() {
        new Driver(Browser.CHROME);
    }

    @After
    public void finish() {
        Driver.fecharDriver();
    }
}