package basicsPackage;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


import io.appium.java_client.AppiumBy;


public class AppiumBasics extends BaseTest{

    @Test
    public void WifiSettingsName() {
    	//code to start server	
    			//AndroidDriver , IOSDriver
    			//Appium code - > Appium Server -> Mobile 		
    			//Actual automation
    			//Xpath, id, accessibilityId, classname, androidUIAutomator
    			
    		//tagName[@attribute='value']  -> //tagName
        driver.findElement(AppiumBy.accessibilityId("Preference")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
        driver.findElement(By.id("android:id/checkbox")).click();
        driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
    	String alertTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
		Assert.assertEquals(alertTitle, "WiFi settings");
        driver.findElement(By.id("android:id/edit")).sendKeys("Setting Wifi Name");
        driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();

        
    }
}

