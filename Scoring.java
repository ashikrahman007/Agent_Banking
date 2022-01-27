import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static java.lang.Thread.sleep;

public  class Scoring implements MainFunction{
    public static WebDriver driver;

    @Override
    public void application() throws InterruptedException {
        System.setProperty("WebDriver.FirefoxDriver.driver", "C://geckodriver.exe");
        driver = new FirefoxDriver();
        String baseurl = "https://abqa.bracits.net/";
        driver.get(baseurl);
        driver.manage().window().maximize();
        sleep(3000);
        WebElement user=driver.findElement(By.cssSelector("#username"));
        user.sendKeys("oliar30561");
        sleep(3000);


        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));

        password.sendKeys("Abcd123$");
        sleep(3000);


        WebElement login_Button = driver.findElement(By.cssSelector("#kc-login"));
        login_Button.click();
        Thread.sleep(3000);


        WebElement Dashboard =driver.findElement(By.xpath("//body/app-layout[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-landing-page[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-feature-link[2]/a[1]/span[1]/span[1]/*[1]"));
        Dashboard.click();
        Thread.sleep(3000);

        WebElement OnBoarding=driver.findElement(By.cssSelector("body.ng-tns-0-0.header-fixed.header-mobile-fixed.aside-enabled.aside-fixed.aside-minimize-hoverable.footer-fixed.brand-light.page-loaded:nth-child(2) app-layout.ng-star-inserted:nth-child(3) div.d-flex.flex-column.flex-root.ng-star-inserted:nth-child(2) div.d-flex.flex-row.flex-column-fluid.page app-aside-dynamic.aside.aside-left.d-flex.flex-column.flex-row-auto.aside-fixed.ng-star-inserted div.aside-menu-wrapper.flex-column-fluid div.aside-menu.scroll.ng-star-inserted ul.menu-nav li.menu-item.menu-item-submenu.ng-star-inserted.menu-item-open:nth-child(2) a.menu-link.menu-toggle > span.menu-text"));
        OnBoarding.click();
        Thread.sleep(3000);





    }

    @Override
    public void interviewScoring() throws InterruptedException {


    }

    @Override
    public void ownerInfo() throws InterruptedException {

    }


}




