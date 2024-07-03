package org.example.base;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.ExtentReportListener.ExtentReporterNG;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.io.*;
import java.time.Duration;
import java.util.Properties;

public class TestBase {

        public static WebDriver driver;
        public static Properties props;
        public static FileInputStream ip = null;
        public static ExtentReporterNG extent;


        //Create a constructor and initialize the variables
        public TestBase(){
            try {
                props = new Properties();
               String propFileName = "config.properties";
               String propFilePath= System.getProperty("user.dir")+File.separator+"src"+File.separator+"main"+File.separator+"java"+File.separator+"org"+File.separator+"example"+File.separator+"config"+File.separator+propFileName;
                ip = new FileInputStream(propFilePath);
                props.load(ip);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public static void initialization() {
            String browserName = props.getProperty("browser");
            if(browserName.equals("chrome")){
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                ThreadWebDriver.set(driver);
            }
            else if(browserName.equals("FF")){
                WebDriverManager.firefoxdriver().setup();
                WebDriver driver = new FirefoxDriver();
            }
            driver.navigate().to(props.getProperty("url"));
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
           /* driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
            driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));*/
        }

    }

