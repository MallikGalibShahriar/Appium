package CalculatorAutomation;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class CalculatorTest {

	static AppiumDriver driver;
	
	public static void main(String[] args) throws Exception {
		openCalculator();
	}

	
	public static void openCalculator() throws Exception{
		DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","Primo RX7 Mini");
        capabilities.setCapability("udid", "SRX7MN003G032G0200");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "9");
        capabilities.setCapability("appPackage", "com.google.android.calculator");
        capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
        
        URL url = new URL ("http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver (url, capabilities);


        
        System.out.println("Apps Started..");
        
	}
}