package Guru99.Tests;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import Guru99.utils.AssertionUtils;



public class BaseClass {
    public WebDriver driver;
    public AssertionUtils assertionUtils;

    public String baseUrl = "https://demo.guru99.com/test/newtours/";
    public String userName = "mngr551929";
    public String password = "ErUrAte";
    
    public String userIdBank = "Guru99";
    public String passwordBank = "Guru99";

    
    @BeforeClass
    public void setUp() {
//        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
        driver = new ChromeDriver();	
        driver.manage().window().maximize();
//        driver.get(baseUrl);
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
    
    public void captureScreenshot(String testName) {
        try {
            // Convert WebDriver object to TakesScreenshot
            TakesScreenshot screenshot = (TakesScreenshot) driver;

            // Capture screenshot as File
            File srcFile = screenshot.getScreenshotAs(OutputType.FILE);

            // Get the current time stamp
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd-HHmmss");
            String timestamp = dateFormat.format(new Date());

            // Define the destination path and file name with the time stamp
            Path destPath = Paths.get("screenshots", testName + "_" + timestamp + ".png");

            // Copy the screenshot to the destination path
            Files.copy(srcFile.toPath(), destPath);

            System.out.println("Screenshot captured: " + destPath.toString());
        } catch (IOException e) {
            System.err.println("Failed to capture screenshot: " + e.getMessage());
            
        }
    }
}
