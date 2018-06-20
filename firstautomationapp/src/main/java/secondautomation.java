import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class secondautomation {

    @Test
    public void test() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/thanosbabalas/IdeaProjects/firstautomationapp/src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.flickr.com");
        driver.manage().window().maximize();
        driver.findElement(By.id("icon-flickr_logo"));
        driver.findElement(By.id("icon-flickr_logo"));
        driver.findElement(By.xpath("//a[contains(.,'About')]"));
        driver.findElement(By.xpath("//a[contains(.,'Jobs')]"));
        driver.findElement(By.xpath("//a[contains(.,'Blog')]"));
        driver.findElement(By.xpath("//a[contains(.,'Developer')]"));
        driver.findElement(By.id("search-field")).sendKeys("Santorini");
        driver.findElement(By.className("search-icon-button")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[contains(.,'Photos')]"));
        driver.findElement(By.xpath("//a[contains(.,'Groups')]"));
        driver.findElement(By.xpath("//a[contains(.,'People')]"));
        driver.close();
        driver.quit();
        }
    }
