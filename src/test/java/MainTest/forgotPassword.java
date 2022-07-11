package MainTest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.By.cssSelector;

public class forgotPassword extends HelpMethods {
    @Test
    @DisplayName("Забыли пароль")
    void Dsad() {
        selectDropdownValue(cssSelector(".links-container"), "click");
    }

    @Nested
    @Order(2)
    @DisplayName("Правильный login")
    class goodLogin {
        @Test
        @DisplayName("Ввели правильны пароль")
        public void eze(){
            selectDropdownValue(cssSelector("[name = 'loginOrEmail']"), "fominaelena");
            selectDropdownValue(cssSelector("[type='submit']"), "click");
            selectDropdownValues(cssSelector(".success")).isEmpty();
        }
        @Nested
        @DisplayName("Письмо на аккаунт")
        class messege{
            @Test
            public void dablay(){
                selectDropdownValue(cssSelector(".links-container"), "click");
                writes("fominaelena","1P73BP4Z");
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                selectDropdownValue(cssSelector(".mira-notification-info-widget-notifications"), "click");
                selectDropdownValue(cssSelector("[data-mira-grid-row = '0'] [data-mira-grid-column='8']"), "click");
                selectDropdownValue(cssSelector("[href^='https://lmslite47vr.demo.mirapolis.ru/mira/Do?doaction=index&s=']"), "click");
                selectDropdownValue(cssSelector("[name='newpassword1'] .mira-field-input-container"), "click");
                selectDropdownValue(cssSelector("[name='newpassword1'] .mira-field-input-container"), "z0K6CTQR");
                selectDropdownValue(cssSelector("[name='newpassword2'] .mira-field-input-container"), "z0K6CTQR");
                selectDropdownValue(cssSelector("[data-mira-id='Button45']"), "click");
            }
        }
       /* @Nested
        @DisplayName("После смены пароля")
        class wtf{
            @Test
            @DisplayName("Заебался")
            public void dsadas(){
                writes("fominaelena","z0K6CTQR");
            }
        }*/
    }
    @Nested
    @Order(1)
    @DisplayName("Не правильный логин")
    class failedLogin {
        @Test
        public void dsad() {
            selectDropdownValue(cssSelector("[name = 'loginOrEmail']"), "1");
            selectDropdownValue(cssSelector("[type='submit']"), "click");
            selectDropdownValues(cssSelector(".alert")).isEmpty();
        }
    }
}
