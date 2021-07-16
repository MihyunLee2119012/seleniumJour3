package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//ChromeDriver driver1 = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize(); // pour maximiser d'afficher la fenetre
		
		String titlePage = driver.getTitle(); // verifier le titre de website manuellement
		System.out.println("le titre est : "+titlePage);
		if(titlePage.equals("OrangeHRM")) {
			System.out.println("le test title est réussi");
		} else{
			System.out.println("le test title est échoué");
		}
		String adresseURL = driver.getCurrentUrl();
		System.out.println("Adresse URL est : "+adresseURL);
		if(adresseURL.equals("https://opensource-demo.orangehrmlive.com/")) {
			System.out.println("le test URL est réussi");
		}else{
			System.out.println("le test URL est échoué");
		}

	}

}
