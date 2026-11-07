package project_collage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.time.Duration;

public class small_project_1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();

			driver.get("https://www.amazon.com");

			WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
			searchBox.sendKeys("iPhone 17");
			searchBox.submit();

			List<WebElement> prices = driver.findElements(By.className("a-price-whole"));

			System.out.println("--- Found " + prices.size() + " prices ---");

			for (WebElement price : prices) {
				String priceText = price.getText();
				if (!priceText.isEmpty()) {
					System.out.println("Price: $" + priceText);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 6. Close the browser
			Thread.sleep(5000);
			driver.quit();
		}

	}
}
