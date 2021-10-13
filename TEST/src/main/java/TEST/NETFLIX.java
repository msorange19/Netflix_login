package TEST;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class NETFLIX {
    WebDriver driver;

    // TODO Auto-generated method stub
    @BeforeClass
    public void browse() {

        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://netflix.com/");
        driver.manage().window().maximize();
    }

    @Deprecated
    @Test
    public void test() {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.findElement(By.className("redButton")).click();
    }

    @Deprecated
    @Test(priority = 2)
    public void login() throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        WebElement m = driver.findElement(By.id("id_userLoginId"));
        m.sendKeys("1234");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.findElement(By.className("country-select")).click();
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.findElement(By.id("BD")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.className("login-button")).click();

        int j = 11;
        Thread.sleep(1000);
        if (!m.equals(j)) {
            driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

            System.out.println(driver.findElement(By.className("inputError")).getText());

            driver.findElement(By.id("id_password")).sendKeys("A912@ii");
            for (int i = 0; i <= 4; i++) {
                m.sendKeys(Keys.BACK_SPACE);
            }


            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            m.sendKeys("1612346989");

            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.findElement(By.className("login-button")).click();

        }


        else
        {
           System.out.println("Followed validation of mobile number");
        }
    }

}
