package Jenkins;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase {
	WebDriver driver;

    @BeforeClass
    public void setUp() {
    	WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
    }

    @Test
    public void testAddition() {
        // Simple test case: testing addition
        int a = 5;
        int b = 3;
        int sum = a + b;
        Assert.assertEquals(sum, 8, "Sum should be 8");
        System.out.println("Test addition passed.");
    }
    
    @Test
    public void testAddition1() {
        // Simple test case: testing addition
        int a = 57;
        int b = 78;
        int sum = a + b;
        Assert.assertEquals(sum,135, "Sum should be 135");
        System.out.println("Test addition passed.");
    }

    @AfterClass
    public void tearDown() {
        // Code to clean up after tests
        System.out.println("Cleaning up after tests...");
        driver.quit();
    }
}
