package mavenproj2;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.*;

import org.openqa.selenium.chrome.*;

public class AppTest {
	@Test
	public void testhelloworld() {
		// System.out.println("Hello world test 1 ");
		
		  System.setProperty("webdriver.chrome.driver",
		  "C:\\Users\\Student\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"
		  ); WebDriver driver = new ChromeDriver(); driver.get(
		  "C:\\ProgramData\\Jenkins\\.jenkins\workspace\\Selenium_testjob\\mavenproj2\\src\\test\\sample.html");
		  
		  List<WebElement> radioButtons = driver.findElements(By.name("color"));
		  radioButtons.get(2).click();
		  
		  for (WebElement radioButton:radioButtons) { if (radioButton.isSelected()){
		  System.out.println(radioButton.getAttribute("value")); }
		  
		  }
		 

		
		  
		 

	}

}
