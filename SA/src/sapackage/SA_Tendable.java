package sapackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class SA_Tendable {
	public WebDriver driver;
	  
	  @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver-win64\\chromedriver.exe");
			
			driver = new ChromeDriver();
	  }

	  @AfterTest
	  public void afterTest() {
		  driver.close();
	  }
	  @Test(priority=1)
	  public void f() {
		  driver.get("https://www.tendable.com//");
	  }
	  @Test(priority=2)
	public void accessible() throws InterruptedException {
		  
		  WebElement home =driver.findElement(By.xpath("//a[@href='https://www.tendable.com/']"));
		Assert.assertEquals(true,home.isEnabled());
		
		WebElement Our_Story = driver.findElement(By.linkText("Our Story"));
		Assert.assertEquals(true,Our_Story.isEnabled());
		
		WebElement Our_Solution = driver.findElement(By.linkText("Our Solution"));
		Assert.assertEquals(true,Our_Solution.isEnabled());
		
		WebElement Why_Tendable = driver.findElement(By.linkText("Why Tendable?"));
		Assert.assertEquals(true,Why_Tendable.isEnabled());
		
		//home.click();
		WebElement Request_a_Demo = driver.findElement(By.linkText("Request a Demo"));
		Assert.assertEquals(true,Request_a_Demo.isEnabled());
		
		Our_Story.click();
		Assert.assertEquals(true,Request_a_Demo.isEnabled());
		
		Our_Solution.click();
		Assert.assertEquals(true,Request_a_Demo.isEnabled());
		
		Why_Tendable.click();
		Assert.assertEquals(true,Request_a_Demo.isEnabled());
	}
	  @Test(priority=3)
	  public void contactUs() throws InterruptedException {
		  WebElement Contact_Us= driver.findElement(By.linkText("Contact Us"));
			Contact_Us.click();
			
			WebElement marketing= driver.findElement(By.xpath("//button[text()='Contact']"));
			marketing.click();
			WebElement fullName= driver.findElement(By.name("fullName"));
			fullName.sendKeys("Prachi Singla");
			WebElement organisationName= driver.findElement(By.name("organisationName"));
			organisationName.sendKeys("TSYS");
			WebElement cellPhone= driver.findElement(By.name("cellPhone"));
			cellPhone.sendKeys("8872233491");
			WebElement email= driver.findElement(By.name("email"));
			email.sendKeys("prachisingla18@gmail.com");
			WebElement jobRole= driver.findElement(By.name("jobRole"));
			Select select = new Select(jobRole);
			select.selectByValue("Executive Board Member");
			WebElement consentAgreed= driver.findElement(By.name("consentAgreed"));
			
			consentAgreed.click();
			Thread.sleep(4000);
			WebElement submit= driver.findElement(By.name("form_page_submit"));
			submit.click();
			Thread.sleep(4000);
			Assert.assertEquals(driver.findElement(By.xpath("//*[@id='contactMarketingPipedrive-163701']/div[1]/p"))
					.getText(), "Sorry, there was an error submitting the form. Please try again.");
			
		}

	}
