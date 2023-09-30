package Class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lanchAbdMaximizeDemo2 {

    public static void main (String [] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver drive=new ChromeDriver();
        drive.get("https://www.google.com/");
        drive.manage().window().maximize();

    }
}
