package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CssSelectorsILCarro {

    WebDriver driver = new ChromeDriver();

    @Test
    public void cssSelectorsIlCarro(){
        driver.navigate().to("https://ilcarro.web.app/search");
        driver.manage().window().maximize();

        WebElement elementCity = driver.findElement(By.cssSelector("input#city"));
        elementCity.sendKeys("Tel Aviv");
        pause(3);
        elementCity.sendKeys(Keys.ARROW_DOWN);
        elementCity.sendKeys(Keys.ENTER);
        pause(3);
        WebElement elementDates = driver.findElement(By.cssSelector("input#dates"));
        elementDates.sendKeys("9/4/2024 - 9/5/2024");
        WebElement btnYalla = driver.findElement(By.cssSelector("button[type='submit']"));
        btnYalla.click();
        pause(5);

        WebElement btnLetCarWork = driver.findElement(By.cssSelector("a[href^='/let']"));
        btnLetCarWork.click();
        pause(2);
        WebElement btnTermsUse = driver.findElement(By.cssSelector("a[href^='/term']"));
        btnTermsUse.click();
        pause(2);
        WebElement btnSignUp = driver.findElement(By.cssSelector("a[href^='/reg']"));
        btnSignUp.click();
        pause(2);
        WebElement btnLogIn = driver.findElement(By.cssSelector("a[href^='/login']"));
        btnLogIn.click();
        pause(2);
        WebElement btnJoin = driver.findElement(By.cssSelector("a[href^='login']"));
        btnJoin.click();
        pause(2);
        WebElement btnSearch = driver.findElement(By.cssSelector("a[href^='/search']"));
        btnSearch.click();
        pause(2);

        WebElement iconFacebook = driver.findElement(By.cssSelector("i.icon-facebook-squared"));
        iconFacebook.click();
        pause(3);
        driver.navigate().back();
        WebElement iconTelegram = driver.findElement(By.cssSelector("i.icon-telegram"));
        iconTelegram.click();
        pause(3);
        driver.navigate().back();
        WebElement iconVkontacte = driver.findElement(By.cssSelector("i.icon-vkontakte"));
        iconVkontacte.click();
        pause(3);
        driver.navigate().back();
        WebElement iconInstagram = driver.findElement(By.cssSelector("i.icon-instagram"));
        iconInstagram.click();
        pause(3);
        driver.navigate().back();
        WebElement iconSlack = driver.findElement(By.cssSelector("i.icon-slack"));
        iconSlack.click();
        pause(3);
        driver.navigate().back();

        WebElement logoHeader = driver.findElement(By.cssSelector("div.header a.logo img"));
        logoHeader.click();
        pause(2);
        WebElement logoFooter = driver.findElement(By.cssSelector("div.footer-container a.logo img"));
        logoFooter.click();
    }

    private void pause(int time) {
        try {
            Thread.sleep(time*1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
