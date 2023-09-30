package class2;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.awt.SystemColor.text;

public class LoginTextDemo {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdrive.chrome.driver","Drivers/chromedriver.exe ");
        WebDriver driver=new ChromeDriver();
        driver.get("https://dreamhiringacademy.com/");;
        System.out.println(text);
        driver.quit();




    }
}
