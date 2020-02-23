package com.telran.scheduler.manager;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class ApplicationManager {
  AppiumDriver driver;
  SessionHelper session;

  public void init() throws MalformedURLException {
    DesiredCapabilities capabilities = new DesiredCapabilities();

    capabilities.setCapability("platformName", "Android");
    capabilities.setCapability("deviceName", "qa22");
    capabilities.setCapability("platformVersion", "8.0");

    capabilities.setCapability("automationName", "Appium");

    capabilities.setCapability("appPackage", "com.example.svetlana.scheduler");
    capabilities.setCapability("appActivity", ".presentation.splashScreen.SplashScreenActivity");

    capabilities.setCapability("app",
            "C:/Users/Elena/Documents/GitHub/SuperScheduler-mob/src/test/resources/apk/v.0.0.2.apk");

    driver = new AppiumDriver
            (new URL("http://127.0.0.1:4723/wd/hub"), capabilities);


    session = new SessionHelper(driver);
  }

  public void stop() throws InterruptedException {
    Thread.sleep(3000);
    driver.quit();
  }

  public SessionHelper getSession() {
    return session;
  }
}
