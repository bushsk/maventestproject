package mavenproj2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleTest {
	@Test
	public static void main(String args[]){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.get("C:\\Users\\admin\\eclipse-workspace\\mavenproj2\\src\\test\\sample.html");

        List<WebElement> radioButtons = driver.findElements(By.name("color"));
        radioButtons.get(1).click();

        for (WebElement radioButton:radioButtons) {
            if (radioButton.isSelected()){
                System.out.println(radioButton.getAttribute("value"));
            }
        }

	}
}
