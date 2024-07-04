package Base; // Declares the package name as Base

import org.openqa.selenium.WebDriver; // Imports the WebDriver class from Selenium library
import org.openqa.selenium.chrome.ChromeDriver; // Imports the ChromeDriver class from Selenium library
import org.testng.annotations.AfterClass; // Imports AfterClass annotation from TestNG
import org.testng.annotations.BeforeClass; // Imports BeforeClass annotation from TestNG

import java.util.concurrent.TimeUnit; // Imports TimeUnit class from Java's concurrent package

public class BaseClass { // Defines a public class named BaseClass

    public WebDriver driver; // Declares a WebDriver object named driver

    @BeforeClass
    public void setUp() { // Method executed before the first test method in the current class

        // Set the system property to use ChromeDriver from the specified location
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");

        driver = new ChromeDriver(); // Initializes driver as a new ChromeDriver instance
        driver.manage().window().maximize(); // Maximizes the browser window
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); // Sets implicit wait time for WebDriver operations
        driver.get("https://tuwaiq.edu.sa/"); // Navigates to the specified URL
    }

    @AfterClass
    public void tearDown() { // Method executed after all the test methods in the current class

        driver.quit(); // Closes all browser windows and ends the WebDriver session
    }
}
