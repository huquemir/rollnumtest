package com.basepage;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseAndroid {
	
	
	public static AndroidDriver<AndroidElement> desiredCap() throws MalformedURLException {
		File f = new File("src/test/java");
		File fs = new File(f, "app-debug.apk");
		//add webdriver here test
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		cap.setCapability("systemPort", 8201);
		cap.setCapability("deviceName", "Pixel_3a_API_31_arm64-v8a");
		//cap.setCapability("udid", "Pixel_3a_API_31_arm64-v8a");
		AndroidDriver <AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"), cap);
		return driver;
		
		
	}

}
