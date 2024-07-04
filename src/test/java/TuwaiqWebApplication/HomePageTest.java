package TuwaiqWebApplication; // Declares the package name as TuwaiqWebApplication

import Base.BaseClass; // Imports BaseClass from the Base package
import ObjectsPath.HomeObjects; // Imports HomeObjects from the ObjectsPath package
import Pages.HomePages; // Imports HomePages from the Pages package
import org.openqa.selenium.By; // Imports necessary Selenium classes
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test; // Imports Test annotation from TestNG

public class HomePageTest extends BaseClass { // Defines a public class named HomePageTest, extending BaseClass

    @Test
    public void HomePageMethod() throws InterruptedException {
        HomePages homepage = new HomePages(driver); // Creates an instance of HomePages class

        // Test steps for the home page method
        homepage.OpenTuwaiqUrl(); // Opens the Tuwaiq URL
        homepage.VerifyEnglish(); // Verifies and clicks on the English language button
        Thread.sleep(1000); // Pauses execution for 1 second
        homepage.LearnNow(); // Clicks on the Learn Now tab
        Thread.sleep(1000); // Pauses execution for 1 second
        homepage.scrollToPosition(0, 250); // Scrolls to a specific position on the page
        Thread.sleep(1000); // Pauses execution for 1 second
        homepage.FilterIcon(); // Clicks on the filter icon
        Thread.sleep(1000); // Pauses execution for 1 second
        homepage.Region(); // Clicks on the region dropdown list
        Thread.sleep(1000); // Pauses execution for 1 second
        homepage.RegionValueStatic(); // Selects a static region value
        Thread.sleep(1000); // Pauses execution for 1 second
        homepage.CategoryValue(); // Clicks on a category value
        Thread.sleep(1000); // Pauses execution for 1 second
        homepage.scrollToPosition(0, 480); // Scrolls to a specific position on the page
        Thread.sleep(1000); // Pauses execution for 1 second
        homepage.ProgramCard(); // Clicks on a specific program card
        Thread.sleep(1000); // Pauses execution for 1 second
    }

    @Test
    public void BootCampsMethods() throws InterruptedException {
        HomePages homepage = new HomePages(driver); // Creates an instance of HomePages class

        // Test steps for the Boot Camps and Courses method
        homepage.OpenTuwaiqUrl(); // Opens the Tuwaiq URL
        homepage.VerifyEnglish(); // Verifies and clicks on the English language button
        Thread.sleep(2000); // Pauses execution for 2 seconds
        homepage.BootCampsAndCourses(); // Clicks on the Boot Camps and Courses tab
    }

    @Test
    public void FilterBootCampsAndCourses() throws InterruptedException {
        HomePages homepage = new HomePages(driver); // Creates an instance of HomePages class

        BootCampsMethods(); // Calls the BootCampsMethods test method to set up initial state

        homepage.scrollToPosition(0, 250); // Scrolls to a specific position on the page
        homepage.FilterIcon(); // Clicks on the filter icon
        homepage.Region(); // Clicks on the region dropdown list

        // Generates a dynamic By object for selecting a region option
        By regionOption = HomeObjects.regionValueDynamic("الرياض");
        homepage.regionOptions(regionOption); // Selects a region option based on the dynamic By object

        homepage.SearchData(); // Enters search data
        homepage.CategoryValue(); // Clicks on a category value
        homepage.scrollToPosition(0, 480); // Scrolls to a specific position on the page
        homepage.ProgramCard(); // Clicks on a specific program card
    }
}
