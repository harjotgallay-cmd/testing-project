package project_collage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class secound_project {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));
		driver.get("http://localhost:8888/");
		// ------ login ------
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("manager");
		driver.findElement(By.id("submitButton")).click();
		// ------ completed ------

//		// ------ go_to_addministrator ------
//		WebElement administrator = driver.findElement(By.xpath("//table[1]/tbody/tr/td[3]/table/tbody/tr/td[2]/img"));
//		administrator.click();
//		driver.findElement(By.xpath("//a[@href='index.php?module=Users&action=DetailView&record=1&modechk=prefview']"))
//				.click();
//		// ------ completed ------

//		// ------ change_password ------
//		driver.findElement(By.xpath("//input[@title='Change Password [Alt+P]']")).click();
//		driver.findElement(By.xpath("//input[@type='password'][1]")).sendKeys("manager");
//		driver.findElement(By.xpath("//input[@type='password'][2]")).sendKeys("manager");
//		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
//		// ------ this_remeaning -------

		// ----- log_out_and_log_in-----
//		act.click(administrator).perform();
//		driver.findElement(By.xpath("/html/body/table[1]/tbody/tr/td[3]/table/tbody/tr/td[2]/img")).click();
//		driver.findElement(By.xpath("//*[@id=\"ondemand_sub\"]/table/tbody/tr[2]/td/a")).click();
//		driver.findElement(By.name("user_name")).sendKeys("admin");
//		driver.findElement(By.name("user_password")).sendKeys("manager");send
//		driver.findElement(By.id("submitButton")).click();
		// ------ completed ------

		// ------ administrator_2 -------
		Actions act = new Actions(driver);
//		WebElement help = driver.findElement(By.xpath("/html/body/table[1]/tbody/tr/td[3]/table/tbody/tr/td[3]/a/img"));
//		act.moveToElement(help).perform();
//		driver.findElement(By.xpath("//a[@href='http://wiki.vtiger.com/index.php/Main_Page']")).click();
//
		// test scenario 1
//		driver.findElement(By.linkText("Calendar")).click();
//		WebElement event = driver.findElement(By.xpath("//div[@id=\"create_2026-05-1210am\"]/img"));
//		act.moveToElement(event).perform();
//		event.click();
//		driver.findElement(By.xpath("//input[@name='subject']")).sendKeys("hpd");
//		WebElement eventsel = driver.findElement(By.id("eventstatus"));
//		Select sel = new Select(eventsel);
//		sel.selectByVisibleText("Held");
//		driver.findElement(By.name("eventsave")).click();
		// competed
		
		// -----  Lead ------
//		driver.findElement(By.linkText("Leads")).click();
//		driver.findElement(By.xpath("//img[@alt='Create Lead...']")).click();
//		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("harjot singh");
//		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("singh");
//		driver.findElement(By.xpath("//input[@name='company']")).sendKeys("qspiders");
//		driver.findElement(By.xpath("//input[@accesskey='S']")).click();
		//------ completed -------
//		
//		driver.findElement(By.linkText("Organizations")).click();
//		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
//		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("qspiders");
//		 WebElement sel = driver.findElement(By.name("assigned_user_id"));
//		 Select selt = new Select(sel);
//		 selt.deselectByValue("1");
//		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
//		
		// --- completed ----
		
		//----- Contacts ------
//		driver.findElement(By.linkText("Contacts")).click();
//		driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
//		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Singh");
//		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		// ----- completed -----
		
		// ----- Opportunities ------
		driver.findElement(By.linkText("Opportunities")).click();
		driver.findElement(By.xpath("//img[@alt='Create Opportunity...']")).click();
		
		
		
		
//		driver.close();
		Thread.sleep(5000);
		 driver.quit();
	}
}
