package com.launch;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.basepage.BaseAndroid;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BasicsTest extends BaseAndroid {

@Test	
public void basicTesting() throws MalformedURLException {
		//add another comment
		AndroidDriver<AndroidElement> driver = desiredCap();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementById("com.example.rollnumbers:id/rollButton").click();
		AndroidElement ele = driver.findElementById("com.example.rollnumbers:id/textView");
		Assert.assertEquals(ele.getText(), "How Many?");
		driver.quit();
		
//		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
//		driver.findElementById("android:id/checkbox").click();
//		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
//		driver.findElementByClassName("android.widget.EditText").sendKeys("hello");
//		driver.findElementsByClassName("android.widget.Button").get(1).click();

	}

}
