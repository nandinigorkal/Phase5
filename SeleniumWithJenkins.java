package com.phase5.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class SeleniumWithJenkins {      
        private WebDriver driver;   
        SoftAssert soft=new SoftAssert();
        @Test               
        public void testEasy() {    
            driver=new ChromeDriver();
            driver.get("https://www.facebook.com");  
            String title = driver.getTitle();                
            soft.assertEquals("FB Login",title);        
        }   
        @BeforeTest
        public void beforeTest() {  
            driver = new ChromeDriver();  
        }       
        @AfterTest
        public void afterTest() throws InterruptedException {
            Thread.sleep(3000);
            driver.quit();          
        }       
}

