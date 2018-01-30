package calculator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Examplecal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lenovo\\Desktop\\selinium\\Browser Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.navigate().to("http://www.calculator.net");
		driver.findElement(By.cssSelector("#hl3 > li:nth-child(1) > a:nth-child(1)")).click();
		WebElement element1 = driver.findElement(By.cssSelector("#sciout > div:nth-child(3) > div:nth-child(2) > span:nth-child(2)"));
		element1.sendKeys("5");
		WebElement element2 = driver.findElement(By.cssSelector("#sciout > div:nth-child(2) > div:nth-child(3) > span:nth-child(3)"));
		element2.sendKeys("");
		//String text = driver.findElement(By.xpath("//*[@id="sciOutPut"]")).getText();
		//System.out.println(text);

		
		

	}

}
