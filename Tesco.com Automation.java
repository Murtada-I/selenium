import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
public class GitShare {
    
@Test
void testTesco() throws InterruptedException {


System.setProperty("webdriver.chrome.driver",
"C:\\Users\\hp\\Desktop\\chromedriver2\\chromedriver.exe");
//setup Incognito Mode
ChromeOptions options = new ChromeOptions();
options.addArguments("--incognito");
DesiredCapabilities capabilities = DesiredCapabilities.chrome();
capabilities.setCapability(ChromeOptions.CAPABILITY, options);
ChromeDriver driver = new ChromeDriver(options);
Thread.sleep(4000);
//maximize window
driver.manage().window().maximize();
// launch website
driver.get("https://www.tesco.com/groceries/en-GB/");Thread.sleep(4000);
//find search bar and search for product
driver.findElement(By.xpath("//input[@class='search-bar__input']")).sendKeys("xbox" +
Keys.ENTER);Thread.sleep(5000);
//click on desired product
WebElement bottle = driver.findElement(By.xpath("//img[@alt='Xbox Bottle']"));
bottle.click(); Thread.sleep(3000);
////
//scroll down by 500 pixels and add item to cart
JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("scrollBy(0, 500)");Thread.sleep(3000);

driver.findElement(By.xpath("//button[@class='button small add-control button-
secondary']")).click();Thread.sleep(4000);

//sign in with existing account
driver.findElement(By.xpath("//input[@name='email']")).sendKeys("");
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("");

driver.findElement(By.xpath("//button[@id='signin-
button']")).click();Thread.sleep(4000);

////
//// //navigate back to home page by clicking on Tesco logo

driver.findElement(By.xpath("//a[@class='brand-logo-link undefined pull-
left'][1]")).click();Thread.sleep(4000);

//using dropdown category list
driver.findElement(By.xpath("//span[contains(text(),'Health &
Beauty')]")).click();Thread.sleep(2000);
driver.findElement(By.xpath("//span[contains(text(),'Shampoo')]")).click();Thread.sle
ep(2000);
//Men's Shampoo
driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/header/div[1]/div[3
]/nav/ul/li[1]/"
+ "div/div[2]/ul/li[8]/ul/li[3]/ul/li[8]/a")).click();Thread.sleep(4000);
//click on product
driver.findElement(By.xpath("//img[@alt='Head&Shoulder Deep Cleanse A/Druff Shampoo
400Ml']")).click();Thread.sleep(4000);
js.executeScript("scrollBy(0, 100)");Thread.sleep(3000);

32 of 33

//add to quantity and add to cart
driver.findElement(By.xpath("//input[@class='product-input']")).sendKeys("2");
js.executeScript("scrollBy(0, 500)");Thread.sleep(3000);

driver.findElement(By.xpath("//button[@class='button small add-control button-
secondary']")).click();Thread.sleep(4000);

////
//// Accept all cookies
driver.findElement(By.xpath("//span[contains(text(),'Accept all
cookies')]")).click();Thread.sleep(2000);
//navigate back to home page

driver.findElement(By.xpath("//a[@class='brand-logo-link undefined pull-
left'][1]")).click();Thread.sleep(4000);

//scroll down to 'Fresh 5' category link and click
WebElement fresh5 = driver.findElement(By.xpath("//p[contains(text(),'Fresh 5')]"));
((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
fresh5);
fresh5.click();Thread.sleep(5000);
//add product to cart

driver.findElement(By.xpath("//button[@class='button small add-control button-
secondary'][1]")).click();Thread.sleep(8000);

// Click+Collect Checkout
driver.findElement(By.xpath("//span[contains(text(),'Checkout')]")).click();Thread.sl
eep(4000);

//This code can be used if a new slot is needed

// WebElement slot = driver.findElement(By.xpath("//*[@id=\"slot-
matrix\"]/div[2]/div[2]/div/div/div[2]/div/div/"

// +
"table/tbody/tr[14]/td[7]/div/form/button/span[2]/span[3]"));
// ((JavascriptExecutor)
driver).executeScript("arguments[0].scrollIntoView(true);", slot);
// slot.click();Thread.sleep(5000);
//
driver.findElement(By.xpath("//span[contains(text(),'Checkout')]")).click();Thr
ead.sleep(3000);
//continue checkout
driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div[1]/div[3]/div/div/div[
2]/div/div/a")).click();
Thread.sleep(3000);
//continue checkout (if offers page appears)
//
driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div[1]/div[3]/div/div/di
v/div[2]/div/div/a")).click();
// Thread.sleep(3000);
//continue to payment
driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[2]/div/div/div[2]/div/div/a
")).click();Thread.sleep(6000);
//Enter Payment Details (code from hear does not continue as payment form cant be
automated)

33 of 33
driver.findElement(By.xpath("/html/body/div/form/div[1]/div[1]/input")).sendKeys("Joh
n Doe");Thread.sleep(2000);
driver.findElement(By.xpath("/html/body/div/form/div[1]/div[2]/div/input")).sendKeys(
"123459");Thread.sleep(2000);
driver.findElement(By.xpath("/html/body/div/form/div[1]/div[3]/fieldset/input[1]")).s
endKeys("01");Thread.sleep(2000);
driver.findElement(By.xpath("/html/body/div/form/div[1]/div[3]/fieldset/input[2]")).s
endKeys("24");Thread.sleep(2000);
//Enter Address payment details
js.executeScript("scrollBy(0, 500)");Thread.sleep(3000);
driver.findElement(By.xpath("/html/body/div/form/div[1]/div[4]/input")).sendKeys("123
");Thread.sleep(2000);
driver.findElement(By.xpath("/html/body/div/form/div[2]/fieldset/div[1]/input[1]")).s
endKeys("10 Y Bae");Thread.sleep(2000);
driver.findElement(By.xpath("/html/body/div/form/div[2]/fieldset/div[2]/input")).send
Keys("Bangor");Thread.sleep(2000);
js.executeScript("scrollBy(0, 150)");Thread.sleep(3000);
driver.findElement(By.xpath("/html/body/div/form/div[2]/fieldset/div[3]/input")).send
Keys("LL57 2SZ");Thread.sleep(2000);
driver.findElement(By.xpath("/html/body/div/form/input[2]")).click();Thread.sleep(600
0);
js.executeScript("scrollBy(0, -500)");Thread.sleep(3000);
//print error message
WebElement Error= driver.findElement(By.xpath("//span[contains(text(),'Please enter
your card number')]"));
System.out.println("Error message thrown: " + Error.getText());
driver.quit();
}
}