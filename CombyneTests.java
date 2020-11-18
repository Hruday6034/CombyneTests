/* Test case/login scenarios for https://demo.combyne.ag/login"
 * Preconditions: Java 8, Selenium webdriver, jars, Eclipse IDE, Microsoft Edge driver, Version 86.0.622.63 (Official build) (64-bit)
 * Author: 
 * Date: 
 * Last modified: 
 */

package com.qa;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
 
public class CombyneTests {
	
    public static void main(String[] args) throws InterruptedException{       //Test case 01: Login with invalid credential
    																			//incorrect username with correct password
        System.out.println("Test case execution started!!");
        System.setProperty("webdriver.edge.driver", "driver\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.combyne.ag/login");
        driver.manage().window().maximize();
        Thread.sleep(7000);
        driver.findElement(By.xpath("//*[@type='submit']")).sendKeys("@gmail.com");             //invalid username
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@type='password']")).sendKeys("54321");                //password
        driver.findElement(By.xpath("//*[@value='Next']")).click();                                     //Next button
        Thread.sleep(5000);                                                                         //wait time
        driver.findElement(By.xpath("//*[@id='ui']/div/div[1]/form/div/div[3]/div[1]/div/div[2]/div[2]"));   //Error message
        driver.quit();
        System.out.println("First test case completed Windows");
        CombyneTests.invalidcredential();                       //Running the test from main method.
        CombyneTests.forgotpasswordtest();
        CombyneTests.createnewacc();
        CombyneTests.contactus();
    }
    

    public static void invalidcredential() throws InterruptedException{                               //Test case 02
        System.out.println("EdgeDriver execution on Windows!!");
        System.setProperty("webdriver.edge.driver", "driver\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.combyne.ag/login");
        driver.manage().window().maximize();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//*[@type='submit']")).sendKeys("demotest@gmail.com");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@type='password']")).sendKeys("54321343");
        driver.findElement(By.xpath("//*[@value='Next']")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//*[@id='ui']/div/div[1]/form/div/div[3]/div[1]/div/div[2]/div[2]"));
        driver.quit();
        System.out.println("Execution complete on Windows");
    }
    
    public static void forgotpasswordtest() throws InterruptedException{                                   //Test case 03
        System.out.println("Forgot password execution started!!");
        System.setProperty("webdriver.edge.driver", "driver\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();                                                       
        driver.get("https://demo.combyne.ag/login");
        driver.manage().window().maximize();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//*[@id='ui']/div/div[1]/form/div/div[6]")).click();                   //forgot password button
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@type='text']")).sendKeys("testdemo@gmail.com");
        driver.findElement(By.xpath("//*[@type='submit']")).click();
      driver.findElement(By.xpath("//*[@id='ui']/div/div[1]/div/div/form/div[4]/div/div[2]"));
        driver.quit();
        System.out.println("forgor password execution complete on Windows!!");
    }
    
    public static void createnewacc() throws InterruptedException {                                  //create new account page
    	 System.out.println("Create new account validation started");                                     //Test case 04
         System.setProperty("webdriver.edge.driver", "driver\\msedgedriver.exe");
         WebDriver driver = new EdgeDriver();
         driver.get("https://demo.combyne.ag/login");
         driver.manage().window().maximize();
         Thread.sleep(7000);
        driver.findElement(By.tagName("span")).click();                                                          //create new account button
        Thread.sleep(3000);
        String s = driver.getTitle();
        if(s.contentEquals("Combyne")) {
        	System.out.println("Create new accout page title is verified"+ s);
        }
        driver.quit();
        System.out.println("create new acc. execution completed!!");
    }
    
    public static void contactus() throws InterruptedException {                                            //Contact page, test case 05
        System.out.println("Contact page execution started!!");                            
        System.setProperty("webdriver.edge.driver", "driver\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.combyne.ag/login");
        driver.manage().window().maximize();
        Thread.sleep(6000);
       driver.findElement(By.linkText("Contact Us"));                                                          //Contact us button
       driver.quit();
       System.out.println("contact page execution completed!!");
    }
}