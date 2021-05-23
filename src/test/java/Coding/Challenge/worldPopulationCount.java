package Coding.Challenge;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class worldPopulationCount 
{
	public static void main(String[]args) throws InterruptedException 
	{
		
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		
		driver.get("https://www.worldometers.info/world-population/");
		
		
		WebElement currWorldPop= driver.findElement(By.xpath("//div[@class='maincounter-number']//span[@class='rts-counter']"));
         
		LocalDateTime then = LocalDateTime.now();
		while (true) {
			System.out.println("Total World Population:" + currWorldPop.getText());
		    if (ChronoUnit.SECONDS.between(then, LocalDateTime.now()) >= 20) 
		    	break;
		}

	//	System.out.println("Total World Population:" + currWorldPop.getText());
	
		/*
		 * WebElement birthToday =
		 * driver.findElement(By.xpath("//span[@rel='births_today']"));
		 * System.out.println("Total World Population:" + birthToday.getText());
		 * 
		 * WebElement deathsToday =
		 * driver.findElement(By.xpath("//span[@rel='dth1s_today']"));
		 * 
		 * WebElement popgrowthToday =
		 * driver.findElement(By.xpath("//span[@rel='absolute_growth']")); WebElement
		 * birthdaysThisYear =
		 * driver.findElement(By.xpath("//span[@rel='births_this_year']")); WebElement
		 * deathsThisYear =
		 * driver.findElement(By.xpath("//span[@rel='dth1s_this_year']")); WebElement
		 * popgrowthThisYear =
		 * driver.findElement(By.xpath("//span[@rel='absolute_growth_year']"));
		 */
	    
	    

		
	}
	
	
	

}
