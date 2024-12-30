package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;



public class Xpath1 {

    public static void main(String[] args) throws InterruptedException {



        WebDriver  driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(15));

        driver.get("https://dev.halfords.com/");
        driver.manage().window().maximize();

      //cookie accept
        WebElement cookie=  driver.findElement(By.id("onetrust-accept-btn-handler"));
        cookie.click();


       //input sku
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("233323");
        //serach sku
       driver.findElement(By.xpath("//*[@id=\"ext-gen44\"]/body/div[1]/header/div[1]/div/div[4]/div[1]/form/div/input")).click();

        //input location
   driver.findElement(By.xpath("//*[contains(@id,'js-postcode-')]")).sendKeys("ll571ad");

   //click on location from dropdown
   driver.findElement(By.xpath("//*[@id=\"productInfoBlock\"]/div[10]/div[5]/div/div/div[1]/form/div[1]/div/div[1]/div/div/ul/li[1]")).click();

        //click on add to basket
       WebElement basket=mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"productInfoBlock\"]/div[10]/div[5]/div/div/div[3]/div[2]/div/div[2]/div[2]/button")));
       // driver.findElement(By.xpath("//*[@id=\"productInfoBlock\"]/div[10]/div[5]/div/div/div[3]/div[2]/div/div[2]/div[2]/button")).click();
        basket.click();

        //close modal
        WebElement modal=mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"modal-container\"]/div/div/div[1]/button/span")));
        modal.click();
       // driver.findElement(By.xpath("//*[@id=\"modal-container\"]/div/div/div[1]/button/span")).click();


        //go to cart
        WebElement element = driver.findElement(By.xpath("//*[@id=\"ext-gen44\"]/body/div[1]/header/div[1]/div/div[3]/div/div[7]/div/div/div/div[1]"));
        // Click using JavaScript
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        //WebElement element = driver.findElement(By.xpath("//*[@id=\"ext-gen44\"]/body/div[1]/header/div[1]/div/div[3]/div/div[7]/div/div/div/div[1]"));
       // ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        //  element.click();

//close modal
   driver.findElement(By.xpath("//*[@id=\"modal-container\"]/div/div/div[1]/button")).click();

//proceed to checkout
   driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[3]/div[4]/button")).click();

//go to guest checkout
   driver.findElement(By.xpath("//*[@id=\"guest-tab\"]")).click();

   //enter guest-gmail
       // WebElement gmail=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"loginEmail\"]")));
       // gmail.sendKeys("abcd1122@gmail.com\"");
        WebElement gmail=driver.findElement(By.xpath("//*[@id=\"loginEmail\"]"));
        gmail.click();
        gmail.sendKeys("abcd1122@gmail.com");

        //click on submit
   driver.findElement(By.xpath("//*[@id=\"guest\"]/form/div[4]/button")).click();


        //driver.close();


    }


}
