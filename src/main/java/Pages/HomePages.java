package Pages; // Declares the package name as Pages

import org.openqa.selenium.By; // Imports necessary Selenium classes
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import static ObjectsPath.HomeObjects.*; // Imports static variables from HomeObjects class

public class HomePages { // Defines a public class named HomePages

    WebDriver driver = null; // Declares a WebDriver instance variable

    public HomePages(WebDriver driver) { // Constructor that initializes the WebDriver instance
        this.driver = driver;
    }

    public void OpenTuwaiqUrl () { // Method to open the Tuwaiq URL in the browser
        driver.get("https://tuwaiq.edu.sa/");
    }

    public void VerifyEnglish() { // Method to verify and click on the English language button
        WebElement english = driver.findElement(language);
        english.click();
    }

    public void BootCampsAndCourses() { // Method to click on the Boot Camps and Courses tab
        WebElement bootCampsBtn = driver.findElement(bootCampsAndCoursesTab);
        bootCampsBtn.click();
    }

    public void LearnNow() { // Method to click on the Learn Now tab
        WebElement learnBtn = driver.findElement(learnNowTab);
        learnBtn.click();
    }

    public void FilterIcon() { // Method to click on the filter icon button
        WebElement filterBtn = driver.findElement(filterIconBtn);
        filterBtn.click();
    }

    public void SearchData() { // Method to enter search data in the search input field
        driver.findElement(search).sendKeys("اختبار");
    }

    public void Region() { // Method to click on the region dropdown list
        WebElement regionList = driver.findElement(regionDdl);
        regionList.click();
    }

    public void RegionValueStatic() { // Method to select a static region value
        WebElement selectingRegionStatic = driver.findElement(selectRegionValueStatic);
        selectingRegionStatic.click();
    }

    public void regionOptions(By locator) { // Method to select a region value based on provided locator
        WebElement selectingRegion = driver.findElement(locator);
        selectingRegion.click();
    }

    public void CategoryValue() { // Method to select a category value
        WebElement selectingCategory = driver.findElement(selectCategoryValue);
        selectingCategory.click();
    }

    public void ProgramCard() { // Method to click on a specific program card
        WebElement selectProgram = driver.findElement(automationProgramCard);
        selectProgram.click();
    }

    public void scrollUptoBotton() { // Method to scroll to the bottom of the page
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeAsyncScript("window.scrollTo(0,document.body.scrollHeight);", "");
    }

    public void scrollToPosition(int x, int y) { // Method to scroll to a specific position on the page
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(arguments[0], arguments[1]);", x, y);
    }
}
