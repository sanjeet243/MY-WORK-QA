import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class searchPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ChromeDriver\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://es.bishalkarki.com/index.php");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.id("search_query_top"));
		search.sendKeys("Printed Dress");
		WebElement searchbtn = driver.findElement(By.name("submit_search"));
		searchbtn.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,800)");
		Thread.sleep(3000);
	}

}
