package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class BaseClass {

    public WebDriver driver;
    //This a public declaration for WebDriver driver

    @BeforeClass
    public void setUp() {
        // Set the path to ChromeDriver executable:
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\hpcom\\IdeaProjects\\SeleniumPilot\\drivers\\chromedriver.exe");

        // Initialize ChromeDriver instance
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//        driver.get("https://tuwaiq.edu.sa/");

    }

    @AfterClass
    public void tearDown() {
        driver.quit();


    }
}

