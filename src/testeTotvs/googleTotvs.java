package testeTotvs;

//import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class googleTotvs {
	private WebDriver driver;
	  @BeforeTest
	  public void setUp() throws Exception {
		  driver = new FirefoxDriver();
	  }

	  @Test
	  public void testlinkclass() throws Exception {
	        driver.get("http://www.google.com");
	        driver.findElement(By.name("q")).sendKeys("TOTVS");
	        Thread.sleep(3000);
	        driver.findElement(By.name("btnG")).click();
	        driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[4]/div[7]/div[1]/div[4]/div/div/ol[1]/li/div[1]/div/div[1]/ol/div[2]/div/div[2]/div[1]/a")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("/html/body/div[2]/footer/div/div[1]/ul/li[2]/ul/li[4]/a")).click();
	        Thread.sleep(5000);
	  }
	        
	  @Test
	  public void testimageclass() throws Exception {
	  		driver.get("http://www.google.com");
      		driver.findElement(By.name("q")).sendKeys("TOTVS");
      		Thread.sleep(3000);
      		driver.findElement(By.name("btnG")).click();
	        driver.findElement(By.linkText("Imagens")).click();
	        driver.findElement(By.xpath("/html/body/div[5]/div[4]/div[2]/div[3]/div/div[2]/div[2]/div/div/div/div/div[1]/div[1]/div[1]/div[1]/a/img")).click();
	        driver.findElement(By.xpath("/html/body/div[5]/div[4]/div[2]/div[3]/div/div[2]/div[2]/div/div/div/div/div[2]/div/div[1]/div[3]/div[3]/div[1]/div[2]/table[1]/tbody/tr/td[2]/a/span")).click();
	        Thread.sleep(6000);
	        }
	  @AfterTest
	  public void tearDown() throws Exception {
		  driver.quit();
	  }

}
