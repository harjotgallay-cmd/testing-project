package project_collage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class First_project {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
//		Thread.sleep(3000);
		
		
		
		//-----------------------------------
		
		
		
		
		try {
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("standard_user");
//		Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("secret_sauce");
//		Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@type='submit']")).click();
//		Thread.sleep(3000);
//		driver.navigate().back();
//		Thread.sleep(3000);
			
			
			
		//---------------------------------

			// ------- ------- ------ only first user_id is working ----- ------ ---------
			
			
			

//			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("locked_out_user");
////		Thread.sleep(3000);
//			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("secret_sauce");
////		Thread.sleep(3000);
//			driver.findElement(By.xpath("//input[@type='submit']")).click();
////		Thread.sleep(3000);
////		driver.navigate().back();
//			Thread.sleep(3000);
//		} 

//			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("problem_user");
////		Thread.sleep(3000);
//			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("secret_sauce");
////		Thread.sleep(3000);
//			driver.findElement(By.xpath("//input[@type='submit']")).click();
////		Thread.sleep(3000);
//			driver.navigate().back();
////		Thread.sleep(3000);

//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("performance_glitch_user");
////		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("secret_sauce");
////		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
////		Thread.sleep(3000);
//		driver.navigate().back();
////		Thread.sleep(3000);

//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("error_user");
////		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("secret_sauce");
////		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
////		Thread.sleep(3000);
//		driver.navigate().back();
////		Thread.sleep(3000);

//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("visual_user");
////		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("secret_sauce");
////		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
////		Thread.sleep(3000);
//		driver.navigate().back();
////		Thread.sleep(3000);

			
			
			
			//----------------------------------------
			
			

			driver.findElement(By.xpath("//button[@type='button'][1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("about_sidebar_link")).click();
			driver.navigate().back();
			driver.findElement(By.xpath("//button[@type='button'][1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("logout_sidebar_link")).click();
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("standard_user");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("secret_sauce");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			
			
			//-------------------------------------------
//		
//		driver.findElement(By.xpath("//button[@type='button'][1]")).click();
//		driver.findElement(By.linkText("Reset App State")).click();
			
			
			
			
			
			//----------------------------------------  
			
			
			
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//img[@alt='Sauce Labs Backpack']")).click();
			driver.findElement(By.xpath("//button[@id='add-to-cart']")).click();
			Thread.sleep(2000);
//			driver.findElement(By.id("remove")).click();
			driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("remove-sauce-labs-backpack")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("continue-shopping")).click();
			Thread.sleep(3000);
			
			
			//--------------------------------------------
			
			driver.findElement(By.xpath("//button[@data-test='add-to-cart-sauce-labs-backpack']")).click();
			Thread.sleep(1000);
			driver.findElement(By.name("add-to-cart-sauce-labs-bike-light")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@data-test='add-to-cart-sauce-labs-bolt-t-shirt']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@data-test='remove-sauce-labs-backpack']")).click();
			Thread.sleep(1000);
			driver.findElement(By.className("product_sort_container")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//option[@value='za']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//option[@value='lohi']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//option[@value='hilo']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//option[@value='az']")).click();
			Thread.sleep(1000);
			driver.findElement(By.className("shopping_cart_link")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@data-test='checkout']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Harjot");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Singh");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@placeholder='Zip/Postal Code']")).sendKeys("12345");
			Thread.sleep(2000);
			driver.findElement(By.className("submit-button")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("finish")).click();
			System.out.println("8. Verifying order success message...");
            WebElement successHeader = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("complete-header")));
            String successMessage = successHeader.getText();
            driver.quit();
            
			if (successMessage.equals("Thank you for your order!")) {
                System.out.println("✅ TEST PASSED: Order was successfully placed!");
            } else {
                System.out.println("❌ TEST FAILED: Unexpected success message: '" + successMessage + "'");
//			driver.quit();
			
		}} catch (Exception e) {
			System.out.println("error in 3 user_id");
			driver.quit();
		}

	
	}
	}
