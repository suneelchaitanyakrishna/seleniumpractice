package org.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserUtil {

    private BrowserUtil(){}
    private static BrowserUtil instance = null;
    private WebDriver driver;

    public WebDriver openBrowser(String bName){
        if(driver == null) {
            if (bName.equalsIgnoreCase("chrome")) {
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\psckr\\Downloads\\chromedriver\\chromedriver.exe");
                driver = new ChromeDriver();
            } else if (bName.equalsIgnoreCase("firefox")) {
            }
            driver.manage().window().maximize();
            return driver;
        }else{
        return driver;}
    }
    public static BrowserUtil getInstance(){
        if(instance == null){
            instance = new BrowserUtil();
        }
        return instance;
    }
}
