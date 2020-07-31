import org.openqa.selenium.By;  
import org.openqa.selenium.JavascriptExecutor;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  
  
public class MyApp_Test2 {   
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
			
					          
			WebElement UserName= driver.findElement(By.name("userName"));
			UserName= .sendKeys("swapnacreas123@gmail.com");

			WebElement Password = driver.findElement(By.name("password"));
			Password.sendKeys("Cre@s1234");

			WebElement Submit = driver.findElement(By.name("submit"));
			Submit.click();	

			//Verify flighter finder page
			String URL = driver.getCurrentUrl();
			Assert.assertEquals(URL, "http://demo.guru99.com/test/newtours/reservation.php" );

			 //Select one way radiobutton
			driver.findElement(By.xpath("//input[@value='oneway']")).click(); 
			
			//Click on continue
			WebElement Continue = driver.findElement(By.name("findFlights"));

			//Verify you are on select flight page
			String URL = driver.getCurrentUrl();
			Assert.assertEquals(URL, "http://demo.guru99.com/test/newtours/reservation2.php" );

        		//Logout
			WebElement Logout = driver.findElement(By.xpath(//a[@href ='index.php']"));
			Logout.click();	
  		}
		else
			System.out.println("Title didn't match");
		
		driver.close();
		driver.quit();
    }  
  
}  
