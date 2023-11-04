package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class stepClass {
	WebDriver driver;
	
	@Given("^open application url$")
	public void open_application_url() throws Throwable {
	
		System.setProperty("Webdriver.chrome.driver", "C:\\chrome driver\\chrome-win64\\chrome.exe");
		
		ChromeOptions run = new ChromeOptions();
		run.addArguments("--remote-allow-origins=*");
		
		 driver = new ChromeDriver();
		driver.get("https://fancy-pika-6b453f.netlify.app/");
		
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.manage().window().maximize();
		
		
	}	
	@Then("^mouse hover on Academics link$")
	public void mouse_hover_on_Academics_link() throws Throwable {
	 Actions ac = new Actions(driver);
	 ac.moveToElement(driver.findElement(By.xpath("//ul[@class='menu menu-horizontal w-full px-5']//a[@class='justify-between'][normalize-space()='Academics']"))).build().perform();
	Thread.sleep(2000);
	
		
	}

	@Then("^click examinations link$")
	public void click_examinations_link() throws Throwable {
	 
	WebElement exam	= driver.findElement(By.linkText("Examinations"));
	exam.click();
	Thread.sleep(2000);
		
	}
	
	@Then("^Verify examinations page display$")
	public void verify_examinations_page_display() throws Throwable {
boolean tom	 =  driver.findElement(By.xpath("//h1[text()='Sign in']")).isDisplayed(); 
		
	Assert.assertTrue(tom);
	Thread.sleep(2000);
	driver.close();
		
	}
	@Then("^click login button$")
	public void click_login_button() throws Throwable {
	 WebElement log = driver.findElement(By.xpath("//button[text()='LogIn']"));
	 log.click();
	}

	@Then("^enter email address$")
	public void enter_email_address() throws Throwable {
	 WebElement email = driver.findElement(By.id("email"));
	 email.sendKeys("nasrin");
	 Thread.sleep(1000);
	}

	@Then("^enter password$")
	public void enter_password() throws Throwable {
	 WebElement pass = driver.findElement(By.name("password")) ;
	 pass.sendKeys("12345");
	 Thread.sleep(1000);
	 
	}
	@Then("^click sign in$")
	public void click_sign_in() throws Throwable {
	    
		WebElement cl = driver.findElement(By.xpath("//button[text()='Sign In']"));
		  cl.click();
		  Thread.sleep(3000);
	      driver.close();
	}



	}

	
	
