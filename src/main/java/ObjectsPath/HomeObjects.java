package ObjectsPath; // Declares the package name as ObjectsPath

import org.openqa.selenium.By; // Imports the By class from Selenium library

public class HomeObjects { // Defines a public class named HomeObjects

    // Static final By objects representing various web elements on the page
    public static final By language = By.xpath("/html/body/main/div/nav[2]/div[2]/button[1]");
    public static final By learnNowTab = By.xpath("//*[contains(text(),'Learn Now')]");
    public static final By bootCampsAndCoursesTab = By.xpath("/html/body/main/div/nav[2]/div[1]/div/div/ul/li[2]/a");
    public static final By filterIconBtn = By.xpath("/html/body/main/section[1]/div/section[1]/div/div[1]/div[1]/button/img");
    public static final By search = By.xpath("//input[@placeholder='ابحث']");
    public static final By regionDdl = By.xpath("//*[@id='regionSelect']");

    // Static final By object for selecting a specific static region value
    public static final By selectRegionValueStatic = By.xpath("//option[text()='الرياض']");

    // Method that returns a By object for selecting a dynamic region value
    public static By regionValueDynamic(String regionName) {
        return By.xpath("//option[text()='" + regionName + "']");
    }

    // Static final By object for selecting a category value
    public static final By selectCategoryValue = By.xpath("/html/body/main/section[1]/div/section[1]/div/div[1]/div[2]/button[2]");

    // Static final By object representing a specific program card
    public static final By automationProgramCard = By.xpath("/html/body/main/section[1]/div/section[1]/div/div[3]/div[2]/div/div[2]/a");
}
