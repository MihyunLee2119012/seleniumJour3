package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//ChromeDriver driver1 = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize(); // pour maximiser d'afficher la fenetre
		String codeSource = driver.getPageSource();
		System.out.println("Le code source est : " +codeSource);
		if(codeSource.contains("OrangeHRM")) {
			System.out.println("passed");
		}else {
			System.out.println("failed");
		}
	}

}
