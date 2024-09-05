package weekend3Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com");
		driver.manage().window().maximize();
		WebElement searchBar = driver.findElement(By.xpath("//input[@name='searchVal']"));
		searchBar.sendKeys("bags");
		searchBar.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='facet-linkhead'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='facet-linkhead'])[8]")).click();
		Thread.sleep(2000);
		String total = driver.findElement(By.xpath("//div[@class='products']//div[@class='length']")).getText();
		System.out.println("Total products" + total);
		List<WebElement> Brands = driver.findElements(By.xpath("//div[@class='brand']"));
		int i = 1;
		for (WebElement b : Brands) {
			System.out.println("Brand " + i + "-" + b.getText());
			i++;
		}
		List<WebElement> BagName = driver.findElements(By.xpath("//div[@class='nameCls']"));
		int j = 1;
		for (WebElement bn : BagName) {
			System.out.println("Bag name" + j + "-" + bn.getText());
			j++;
		}

	}

}