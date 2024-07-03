package TuwaiqWebApplication;

import Base.BaseClass;
import Pages.HomePages;
import org.testng.annotations.Test;

public class HomePageTest extends BaseClass {

    //@Test is TestNg notation and our test method.
    // another pre-requirement is required in BaseClass which is @BeforeTest
    @Test
    public void HomePageMethod() throws InterruptedException {
        HomePages homepage = new HomePages(driver);
        homepage.OpenTuwaiqUrl();
        homepage.VerifyEnglish();
        Thread.sleep(1000);
        homepage.LearnNow();
        Thread.sleep(1000);
        homepage.scrollToPosition(0, 250);
        Thread.sleep(1000);
        homepage.FilterIcon();
        Thread.sleep(1000);
        homepage.Region();
        Thread.sleep(1000);
        homepage.RegionValue();
        Thread.sleep(1000);
        homepage.CategoryValue();
        Thread.sleep(1000);
        homepage.scrollToPosition(0, 480);
        Thread.sleep(1000);
        homepage.ProgramCard();
        Thread.sleep(1000);

    }

    @Test
    public void LearnNowMethod() throws InterruptedException {
        HomePages homepage = new HomePages(driver);
        homepage.OpenTuwaiqUrl();
        homepage.VerifyEnglish();
        homepage.LearnNow();
    }

    @Test
    public void FilterBootCampsAndCourses() throws InterruptedException {
        HomePages homepage = new HomePages(driver);
        homepage.OpenTuwaiqUrl();
        homepage.VerifyEnglish();
        homepage.LearnNow();
        homepage.scrollToPosition(0, 250);
        homepage.FilterIcon();
        homepage.Region();
        homepage.RegionValue();
        homepage.CategoryValue();
        homepage.scrollToPosition(0, 480);
        homepage.ProgramCard();
    }
}
