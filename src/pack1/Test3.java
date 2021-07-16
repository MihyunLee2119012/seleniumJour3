package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//ChromeDriver driver1 = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize(); // pour maximiser d'afficher la fenetre
		
		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
		//driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		WebElement password = driver.findElement(By.name("txtPassword"));
		password.sendKeys("admin123");
		WebElement login = driver.findElement(By.id("btnLogin"));
		login.click();
		//welcome
		WebElement lienWelcome = driver.findElement(By.id("welcome"));
		lienWelcome.click(); 
		//Logout
		Thread.sleep(4000); 
		WebElement linkLogout = driver.findElement(By.linkText("Logout"));
		linkLogout.click();
		
		
	}

}
