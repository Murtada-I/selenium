import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;



import io.appium.java_client.touch.offset.PointOption;

public class NoonRealDevice {
WebDriver driver;
@BeforeClass
public void setUp() throws MalformedURLException {
// Set up desired capabilities and pass the Android app-activity and app-package
// to Appium
DesiredCapabilities capabilities = new DesiredCapabilities();
//Nokia capabilities
capabilities.setCapability("deviceName", "192.168.1.13:5555");
capabilities.setCapability("platformName", "Android");
capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
capabilities.setCapability("platformVersion", "8.1.0");
capabilities.setCapability("automationName", "UiAutomator2");
//needed to launch chrome websites with this driver setup
(AndroidDriver)
capabilities.setCapability("appium:chromeOptions",
ImmutableMap.of("w3c", false));
//Create Driver instance and connect to the Appium server
// launching driver at desired capabilites
driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),
capabilities);
}

// ----------------Test:

@Test
public void test() throws Exception {
// ----------------real device automation:
//Define wait method
WebDriverWait wait = new WebDriverWait(driver, 20);
Thread.sleep(3000);
driver.get("https://www.noon.com/saudi-en/");Thread.sleep(8000);
//------------------------------

//Electronics
driver.findElement(By.xpath("//span[contains(text(),'Categories')]")).
click();Thread.sleep(5000);
driver.findElement(By.xpath("//div[contains(text(),'Electronics')]")).
click();Thread.sleep(5000);



JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("scrollBy(0, 500)");Thread.sleep(2000);
driver.findElement(By.xpath("//p[contains(text(),'Cameras')]")).click(
);Thread.sleep(5000);
WebElement action =
driver.findElement(By.xpath("//p[contains(text(),'Action')]"));
((JavascriptExecutor)
driver).executeScript("arguments[0].scrollIntoView(true);", action);
action.click();Thread.sleep(8000);
// select product
WebElement dji =
driver.findElement(By.xpath("//span[contains(text(),'dji Pocket 2
Creator')]"));
((JavascriptExecutor)
driver).executeScript("arguments[0].scrollIntoView(true);", dji);
dji.click();Thread.sleep(5000);
//// Add to Cart
driver.findElement(By.xpath("//div[@class='loaderCtr
inactiveLoading']")).click();Thread.sleep(5000);
//Continue Shopping
driver.findElement(By.xpath("//button[@class='sc-1g6zspo-9
fUWDSU']")).click();Thread.sleep(5000);
//------------------------------

//Beauty
driver.findElement(By.xpath("//input[@id='searchBar']")).sendKeys("fac
ial moisturizer" + Keys.ENTER);Thread.sleep(8000);
// ST.IVES Collagen product selection

WebElement fm = driver.findElement(By.xpath("//div[@class='sc-14wnt1u-
0 hxqhii grid' and "

+ "@title='ST.IVES Collagen Elastin Facial Moisturizer 283g ']"));
((JavascriptExecutor)
driver).executeScript("arguments[0].scrollIntoView(true);", fm);
fm.click();Thread.sleep(5000);
//// Add to Cart
driver.findElement(By.xpath("//div[@class='loaderCtr
inactiveLoading']")).click();Thread.sleep(5000);
//Continue Shopping
driver.findElement(By.xpath("//button[@class='sc-1g6zspo-9
fUWDSU']")).click();Thread.sleep(5000);
// ------------------------------

//Back To School
driver.findElement(By.xpath("//span[contains(text(),'Back to
School')]")).click();Thread.sleep(5000);
WebElement stationary =
driver.findElement(By.xpath("//img[@alt='/stationery']"));


((JavascriptExecutor)
driver).executeScript("arguments[0].scrollIntoView(true);",
stationary);
stationary.click();Thread.sleep(5000);
// Hema A5 Fabric product
WebElement notebook =
driver.findElement(By.xpath("//span[contains(text(),'Hema A5
Fabric')]"));
((JavascriptExecutor)
driver).executeScript("arguments[0].scrollIntoView(true);", notebook);
notebook.click();Thread.sleep(5000);
//// Add to Cart
driver.findElement(By.xpath("//div[@class='loaderCtr
inactiveLoading']")).click();Thread.sleep(5000);
//Continue Shopping
driver.findElement(By.xpath("//button[@class='sc-1g6zspo-9
fUWDSU']")).click();Thread.sleep(5000);
// -----------------------
//Groceries
driver.findElement(By.xpath("//span[contains(text(),'Categories')]")).
click();Thread.sleep(5000);
WebElement grocery =
driver.findElement(By.xpath("//div[contains(text(),'Grocery')]"));
((JavascriptExecutor)
driver).executeScript("arguments[0].scrollIntoView(true);", grocery);
grocery.click();Thread.sleep(5000);
driver.findElement(By.xpath("//p[contains(text(),'Household
supplies')]")).click();Thread.sleep(5000);

//select product
WebElement NCHD =
driver.findElement(By.xpath("//span[contains(text(),'Noon Care Heavy
Duty,')]"));
((JavascriptExecutor)
driver).executeScript("arguments[0].scrollIntoView(true);", NCHD);
NCHD.click();Thread.sleep(5000);
//// Add to Cart
driver.findElement(By.xpath("//div[@class='loaderCtr
inactiveLoading']")).click();Thread.sleep(5000);
//Continue Shopping
driver.findElement(By.xpath("//button[@class='sc-1g6zspo-9
fUWDSU']")).click();Thread.sleep(5000);
//------------------------------

//Home Products
driver.findElement(By.xpath("//span[contains(text(),'Categories')]")).
click();Thread.sleep(5000);
WebElement home =
driver.findElement(By.xpath("//div[contains(text(),'Home &
Kitchen')]"));
((JavascriptExecutor)
driver).executeScript("arguments[0].scrollIntoView(true);", home);


home.click();Thread.sleep(5000);
driver.findElement(By.xpath("//p[contains(text(),'Bath')]")).click();T
hread.sleep(5000);
//
WebElement bath =
driver.findElement(By.xpath("//p[contains(text(),'Bath Hardware')]"));
((JavascriptExecutor)
driver).executeScript("arguments[0].scrollIntoView(true);", bath);
bath.click();Thread.sleep(8000);

//select product
WebElement bathp =
driver.findElement(By.xpath("//span[contains(text(),'For & More
Filtered')]"));
((JavascriptExecutor)
driver).executeScript("arguments[0].scrollIntoView(true);", bathp);
bathp.click();Thread.sleep(5000);

//// Add to Cart
driver.findElement(By.xpath("//div[@class='loaderCtr
inactiveLoading']")).click();Thread.sleep(5000);
//checkout
driver.findElement(By.xpath("//button[@class='sc-1g6zspo-8
bswpPM']")).click();Thread.sleep(5000);
driver.findElement(By.xpath("//button[@class='ripple']")).click();Thre
ad.sleep(10000);
//
driver.findElement(By.xpath("//input[@name='email']")).sendKeys("testemail.com");
//Password
driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password" + Keys.ENTER);
Thread.sleep(5000);

WebElement Error= driver.findElement(By.xpath("//p[text()='Please
enter a valid email']"));
System.out.println("Error message thrown: " + Error.getText());

}
@AfterClass
public void teardown() {
// close the app
driver.quit();
}

}