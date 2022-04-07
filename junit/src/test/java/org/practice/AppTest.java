package org.practice;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    WebDriver driver;
    @Before
    public void setUp(){
       BrowserUtil instance = BrowserUtil.getInstance();
       System.out.println("Class instance"+instance);
       driver = instance.openBrowser("chrome");
    }

    @Test
    public void shouldAnswerWithTrue()
    {
        driver.get("https://www.gmail.com");
        assertTrue(driver.getTitle().length()>0);
        System.out.println(driver);
        assertTrue( true );
        System.out.println( "Inside test class!" );
    }

    @Test
    public void shouldAnswerWithFalse() throws InterruptedException {
        System.out.println(driver);
        driver.get("https://www.gmail.com");
        assertTrue(driver.findElement(By.cssSelector(".header")).isDisplayed());

        assertFalse( false );
        System.out.println( "Inside test class2" );
    }
}
