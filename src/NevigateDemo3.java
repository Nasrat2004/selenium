import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.URL;

public class NevigateDemo3 {

    public static void main (String [] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromdrive. exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate();
        String url="https://www.facebook.com/";


    }
}
