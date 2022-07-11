package MainTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

import static org.openqa.selenium.By.cssSelector;


public class HelpMethods {

    public static WebDriver driver;

    @BeforeAll
    static void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://lmslite47vr.demo.mirapolis.ru/mira");
    }
   /* @AfterAll
    static void shutdown(){
        driver.close();
        driver.quit();
    }*/

    public void searchBlock(final String nameBlock){
        if (nameBlock == "Login"){
        }
    }
    public WebElement selectDropdownValue(final By selector) {
        return driver.findElement(selector);
    }
    public List<WebElement> selectDropdownValues(final By selector) {
        return driver.findElements(selector);
    }
    public void selectDropdownValue(final By selector, final String action){
        if ("click".equals(action)){
            driver.findElement(selector).click();
        }else
            driver.findElement(selector).sendKeys(action);
    }

    public void writes(final String login,final String password){
        selectDropdownValue(cssSelector("[name = 'user']"), login);
        selectDropdownValue(cssSelector("[name = 'password']"), password);
        selectDropdownValue(cssSelector("[type='submit']"), "click");
    }

}
