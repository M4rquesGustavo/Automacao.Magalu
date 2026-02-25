package core;

import enums.Browser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;

public class Driver {
    private static WebDriver driver;
    public static WebDriverWait wait;

    private static File pastaEvidencias;
    private static int contadorPrint = 0;

    public Driver(Browser navegador) {
        switch (navegador) {
            case CHROME:
                startChrome();
                break;

            case EDGE:
                startEdge();
                break;
        }
        wait = new WebDriverWait(Driver.driver, Duration.ofSeconds(10));
        Driver.driver.manage().window().maximize();
    }

    private static void startEdge() {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver(new EdgeOptions());
    }

    private static void startChrome() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions chromeOptions = new ChromeOptions();
        //chromeOptions.addArguments("--headless=new");

        driver = new ChromeDriver(chromeOptions);
    }

    public static WebDriver getDriver() {
        return Driver.driver;
    }

    public static void fecharDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
