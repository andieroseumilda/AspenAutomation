package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import support.baseUtil;

//extend class to get the variable/ container
public class hook extends baseUtil {

    // calling the class
    public baseUtil base;

    // running an instance, and pass it to the class
    public hook(baseUtil base) {
        System.setProperty("webdriver.chrome.driver","..\\automation\\seleniumWebBrowser\\chromedriver.exe");
        this.base = base;

    }


    @Before
    public void initialize(){
        // getting the variable or temp container
        base.driver = new ChromeDriver();
    }
    @After
    public void closeTheWindow() throws InterruptedException {
        Thread.sleep(3000);
        base.driver.quit();
    }
}
