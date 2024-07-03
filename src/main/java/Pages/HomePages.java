package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import static ObjectsPath.HomeObjects.*;


public class HomePages {
    WebDriver driver = null;

    public HomePages(WebDriver driver) {
        this.driver = driver;
    }

    public void OpenTuwaiqUrl (){
        driver.get("https://tuwaiq.edu.sa/");
    }

    public void VerifyEnglish() {
        WebElement english = driver.findElement(language);
        english.click();
    }

    public void LearnNow() {
        WebElement learnBtn = driver.findElement(learnNowBtn);
        learnBtn.click();
        //driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
    }

    public void FilterIcon() {
        WebElement filterBtn = driver.findElement(filterIconBtn);
        filterBtn.click();
    }

    public void Region() {
        WebElement regionList = driver.findElement(regionDdl);
        regionList.click();
    }

    public void RegionValue() {
        WebElement selectingRegion = driver.findElement(selectRegionValue);
        selectingRegion.click();
    }

    public void CategoryValue() {
        WebElement selectingCategory = driver.findElement(selectCategoryValue);
        selectingCategory.click();
    }

    public void ProgramCard() {
        WebElement selectProgram = driver.findElement(automationProgramCard);
        selectProgram.click();
    }

    public void scrollUptoBotton(){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeAsyncScript("window.scrollTo(0,document.body.scrollHeight);","");
    }

    public void scrollToPosition(int x, int y){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollTo(arguments[0], arguments[1]);", x, y);
    }

}

