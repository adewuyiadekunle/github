package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTests {

    private WebDriver driver;
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://github.com/login/");

        Thread.sleep(5000);
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.name("login")).sendKeys("adewuyi.adekunle@gmail.com");
        driver.findElement(By.name("password")).sendKeys("arikemi4171");
        driver.findElement(By.name("commit")).click();
    }

    public static void main(String args[]) throws InterruptedException {
        LoginTests test = new LoginTests();
        test.setUp();











    }




}
