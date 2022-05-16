package seleniumgluecode;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    private static ChromeDriver driver;
    private static int numberOfCase = 1;

    @Before
    public void setUp(){
        System.out.println("SE ESTÁ EJECUTANDO EL ESCENARIO N1 : "+numberOfCase+".");
        System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
    }
    @After
    public void tearDown(){
        System.out.println("EL ESCENARIO Nº : "+numberOfCase+" SE HA EJECUTADO CORRECTAMENTE.");
    }
    public static ChromeDriver getDriver(){
        return driver;
    }

}
