package MainTest;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.By.cssSelector;

public class chrometestdemo extends HelpMethods {

    @Test
    @DisplayName("Авторизация")
    public void Auth() {
        writes("fominaelena","z0K6CTQR");
       // selectDropdownValue(cssSelector("[name = 'user']"), "fominaelena");
        //selectDropdownValue(cssSelector("[name = 'password']"), "z0K6CTQR");
    }
    @Test
    @DisplayName("Авторизация")
    public void Glas() {
        selectDropdownValue(cssSelector("[type='password'][name = 'password']"));
        selectDropdownValue(cssSelector("[type='button']"), "click");
        selectDropdownValue(cssSelector("[type='text'][name = 'password']"));
    }
    @Test
    @DisplayName("Пытался сделать проверку на валидацию")
    public void Dasalas() {
        selectDropdownValue(cssSelector("[name = 'user']"), "fominaelena31212");
        selectDropdownValue(cssSelector("[type='submit']"), "click");
        driver.switchTo().alert().accept();
        String a = driver.findElement(cssSelector("[name = 'user']")).getAttribute("border");
    }
}



