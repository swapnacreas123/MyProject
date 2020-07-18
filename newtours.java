import org.openqa.selenium.By;  
import org.openqa.selenium.JavascriptExecutor;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  
  
public class MyApplication {   
    public static void main(String[] args) {  
      
           // System Property for Chrome Driver   
        System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");  
          
             // Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  
          
           // Launch Website  
        driver.navigate().to("http://demo.guru99.com/test/newtours/");  
          
         //Maximize the browser  
          driver.manage().window().maximize();  

        String Title = "Welcome: Mercury Tours";
		if(actualTitle.equalsIgnoreCase(Title))
		{
			System.out.println("Title Matched");
			
			//Click on register
			Driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
			          
			WebElement FirstName = driver.findElement(By.name("firstName"));
			FirstName.sendKeys("Swapna");

			WebElement LastName = driver.findElement(By.name("lastName"));
			LastName.sendKeys("Mangli");

			WebElement Phone = driver.findElement(By.name("phone"));
			Phone.sendKeys("9876543210");

			WebElement Email = driver.findElement(By.id("userName"));
			Email.sendKeys("swapna123@gmail.com");

			WebElement Adress = driver.findElement(By.name("adress1"));
			Adress.sendKeys("Hno:1-22");
			 
			WebElement City = driver.findElement(By.name("city"));
			City.sendKeys("Hyderabad");

			WebElement State = driver.findElement(By.name("state"));
			State.sendKeys("Telangana");
			
			WebElement UserName = driver.findElement(By.name("email"));
			UserName.sendKeys("swapna123@gmail.com");
			
			WebElement Password = driver.findElement(By.name("password"));
			Password.sendKeys("swapna123");
			
			WebElement ConfirmPassword = driver.findElement(By.name("confirmPassword"));
			ConfirmPassword.sendKeys("swapna123");
			
			WebElement Submit = driver.findElement(By.name("submit"));
			Submit.click();			
			
			//Verify registration is successful
			String URL = driver.getCurrentUrl();
			Assert.assertEquals(URL, "http://demo.guru99.com/test/newtours/register_sucess.php" );
			
			//Click on sign on link
			Driver.findElement(By.xpath(//a[@href ='/docs/configurationlogin.php']")).click();
         
  		}
		else
			System.out.println("Title didn't match");
		
		driver.close();
		driver.quit();
    }  
  
}  
