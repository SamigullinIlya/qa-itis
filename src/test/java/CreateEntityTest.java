// Generated by Selenium IDE

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.Map;

public class CreateEntityTest {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;

    @Before
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "E:\\GeckoDriver\\geckodriver.exe");
        driver = new FirefoxDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void createEntity() {
        driver.get("https://mobislenotes.com/app/");
        driver.manage().window().setSize(new Dimension(928, 694));
        driver.findElement(By.cssSelector(".outline img")).click();
        driver.findElement(By.name("title")).sendKeys("Some text");
        driver.findElement(By.id("todos")).click();
    }
}
