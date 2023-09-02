package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownProg {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://flights.qedgetech.com/");

	}

}
