package com.Orange.project;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Orngeapplition {
				
					public static void main(String[] args ) {
						try {
							WebDriver driver = new ChromeDriver();
							System.setProperty("webdriver.chrome.driver", "C:\\Users\\chitti\\Desktop\\saritha\\chromedriver.exe");
							 Thread.sleep(3000);
							 driver.manage().window().maximize();
							 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
							 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
							 Thread.sleep(3000);
							 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
							 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
							 driver.findElement(By.xpath("//button[@type='submit']")).click();
							 driver.findElement(By.xpath("//span[text()='PIM']")).click();
							 Thread.sleep(3000);
							 driver.findElement(By.linkText("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[1]/ul/li[1]/a")).click();
							 driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/label/span")).isEnabled();
							 Thread.sleep(20000);
							 driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button")).click();
							 driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input")).sendKeys("Marge");
							 Thread.sleep(2000);
						 driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input")).sendKeys("saritha");
							driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/input")).sendKeys("1234");
							 Thread.sleep(4000);
							 driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]")).click();
							 List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div[1]/div[2]/div"));
							 Iterator<WebElement> iterator = list.iterator();
							 while (iterator.hasNext()) {
								WebElement webElement = (WebElement) iterator.next();
								System.out.println(webElement.getText());
								if(webElement.getText().equals("Full-Time Contract")) {
									webElement.click();
									WebElement include=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div/div[1]"));
									Select dropdown= new Select(include);
									dropdown.selectByIndex(1);
                                  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[5]/div/div[2]/div/div/input")).sendKeys("sunil rajenhn kumar");
                                  WebElement jobtitle= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[6]/div/div[2]/div/div"));
										Select dd= new Select(jobtitle);
										dd.selectByIndex(2);
									WebElement subunit = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[7]/div/div[2]/div/div/div[1]"));
								Select subdd= new Select(subunit);
								subdd.selectByIndex(3);
								driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[1]"));
									subdd.selectByIndex(3);
									 driver.findElement(By.xpath("//button[@type='submit']")).click();
									 Thread.sleep(4000);
									 driver.findElement(By.xpath("//button[@type='reset']")).click();
									 Thread.sleep(2000);
									 driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")).click();
									 Thread.sleep(3000);
									 driver.findElement(By.name("firstName")).sendKeys("prasad");
									 driver.findElement(By.name("middleName")).sendKeys("kamarathpu");
									 driver.findElement(By.name("lastName")).sendKeys("kmr");
									 driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")).sendKeys("1234");
								Thread.sleep(2000);
								 driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[2]/div/label/span")).click();
								Thread.sleep(2000);
						        driver.findElement(By.xpath("//input[@type='username']")).sendKeys("kalyani");
						        Thread.sleep(2000);
						        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12345");
						        Thread.sleep(2000);
						        driver.findElement(By.xpath("//input[@name='oxd-input oxd-input--active']")).sendKeys("12345");
						        Thread.sleep(2000);
						        driver.findElement(By.xpath("//button[@type='submit']")).click();
						        Thread.sleep(2000);
						        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[1]/div/div[2]/div/button/i"));
								}
								
							 }}
						
			
							 catch (InterruptedException e) {
								e.printStackTrace();
							
								
							}}}
	 
									 
									 
									 
									 
									 
									 
									 
									 
									 
									 
									 
									 
									 
									 
									 
									 
									 
									 


