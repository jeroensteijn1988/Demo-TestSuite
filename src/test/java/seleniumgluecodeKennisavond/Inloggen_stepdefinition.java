package seleniumgluecodeKennisavond;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Inloggen_stepdefinition  {

protected static WebDriver driver;

@Given("the browser is opened and showing the intranet homepage")
public static void setUp() {
driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
driver.manage().window().maximize();
driver.get(Messages.getString("Inloggen_stepdefinition.0")); //$NON-NLS-1$
System.out.println(Messages.getString("Inloggen_stepdefinition.1")); //$NON-NLS-1$
System.out.println("test sprint1");
}

@When("user logs on with valid credentials")
public static void loginfeature_validcredentials() {
driver.findElement(By.xpath(Messages.getString("Inloggen_stepdefinition.2"))).sendKeys(Messages.getString("Inloggen_stepdefinition.3")); //gebruik deze voor de gebruikersnaam //$NON-NLS-1$ //$NON-NLS-2$
driver.findElement(By.xpath(Messages.getString("Inloggen_stepdefinition.4"))).sendKeys(Messages.getString("Inloggen_stepdefinition.5")); //gebruik deze voor het wachtwoord //$NON-NLS-1$ //$NON-NLS-2$
driver.findElement(By.xpath(Messages.getString("Inloggen_stepdefinition.6"))).click(); // gebruik deze voor de inlogbutton //$NON-NLS-1$
System.out.println(Messages.getString("Inloggen_stepdefinition.7")); //$NON-NLS-1$

}
@Then("login is successful")
public static void loginfeature_successful() {
	if( driver.findElement(By.xpath(Messages.getString("Inloggen_stepdefinition.8"))).isDisplayed()){ //als dit element wordt getoond //$NON-NLS-1$
		System.out.println(Messages.getString("Inloggen_stepdefinition.9")); //dan is de test geslaagd //$NON-NLS-1$
		}else{
		System.out.println(Messages.getString("Inloggen_stepdefinition.10"));//anders is de test mislukt //$NON-NLS-1$
		}
}
	

@And("the homepage is displayed")
public static void loginfeature_homepagedisplayed() {
	String actualHeader = driver.findElement(By.xpath(Messages.getString("Inloggen_stepdefinition.11"))).getText(); //haal de tekst op van dit element //$NON-NLS-1$
	String expectedHeader = Messages.getString("Inloggen_stepdefinition.12"); //$NON-NLS-1$
	assertEquals(actualHeader, expectedHeader); //vergelijk die tekst met de tekst die ik heb opgegeven. Als dit gelijk is dan is de test geslaagd
System.out.println(Messages.getString("Inloggen_stepdefinition.13"));  //$NON-NLS-1$
}
}
