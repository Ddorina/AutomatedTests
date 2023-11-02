package tests;
import java.time.Duration;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import pages.LoginPageObject;
import pages.ProductDetailsPageObject;
import pages.ProductsPageObject;
import testdata.Errors;
import testdata.URL;

	public class BaseTest {

	    static WebDriver driver;
	    public static LoginPageObject loginpageobject;
	    public static ProductDetailsPageObject productdetailspageobject;
	    public static ProductsPageObject productspageobject;

	    @BeforeClass
		public static void setUp() {
		}
		@AfterClass
		public static void tearDown() {
		}
		@Before
		public void before() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\dorin\\teme\\gr10wiki\\src\\resources/chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  
			loginpageobject = new LoginPageObject (driver);
			productdetailspageobject = new ProductDetailsPageObject (driver);
			productspageobject = new ProductsPageObject (driver);
			
			driver.navigate().to(URL.LOGIN);
			
		}
		@After
		public void after() {
			driver.close();
		}
	
	
			
			
	    }
	


