package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class testcase2 {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://dev.halfords.com/");

      WebElement cookie=  driver.findElement(By.id("onetrust-accept-btn-handler"));
        cookie.click();


        driver.findElement(By.name("q")).sendKeys("534141");
        driver.findElement(By.cssSelector(".b-search__submit")).click();




//        driver.findElement(By.linkText("Motoring")).click();
//
//     List<WebElement> linkcount=   driver.findElements(By.className("b-type7__item"));
//        System.out.println(linkcount.size());
///html/body/div[1]/header/div[1]/div/div[4]/div[1]/form/input
//        List<WebElement>totallinkcount=driver.findElements(By.tagName("a"));
//        System.out.println("Total no of links on the motoring page "+ totallinkcount.size());
//
//        List<WebElement>totalimages=driver.findElements(By.tagName("img"));
//        System.out.println("Total no of images on motoring page "+ totalimages.size());


    }
}
