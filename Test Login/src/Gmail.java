import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Gmail {

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Selenium Library\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	// Website opening
	
	driver.get("https://www.google.com/");
	String PageTitle=driver.getTitle();
	System.out.println(PageTitle);
	driver.findElement(By.className("gb_g"));
	
   
}
}


