package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumdemo {

    public static void main(String[] args) {
       // System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://dev.halfords.com/");
        System.out.println(driver.getTitle());


    }
}
