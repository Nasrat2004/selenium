package Class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LunchBrowserDemo1 {
    public static void mai(String [] args ){

            System.setProperty("webdriver.chrome,driver", "Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        String url=driver.getCurrentUrl();



    }
}
