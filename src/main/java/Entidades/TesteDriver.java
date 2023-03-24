package Entidades;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TesteDriver {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JudrianideBrito\\Desktop\\PROJETO BRITO\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.get("https://seubarriga.wcaquino.me/");
	}

}
