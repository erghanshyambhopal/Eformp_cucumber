package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IngoMan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--incognito");
		WebDriver driver=WebDriverManager.chromedriver().create();
		driver.get("https://www.google.com");
	}

}
