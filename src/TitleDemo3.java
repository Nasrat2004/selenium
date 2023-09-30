import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleDemo3 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.drive","Drivers/Chromedriver.exe." );
        WebDriver driver=new ChromeDriver();
        driver.get("https://amazon.com");
        String url=driver.getCurrentUrl();
        String title=driver.getTitle();
        System.out.println(url + "+"+title);
        if (title.equals("Amazon.com.spend less. Sell more")) {
            System.out.println("title is as expected");
        }else {
            System.out.println("title is not correct");
        }
        driver.quit();

        }
    }

