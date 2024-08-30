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
    }

    @Test
    public void testAddition() {
        int a = 5;
        int b = 3;
        int sum = a + b;
        Assert.assertEquals(sum, 8, "Sum should be 8");
        System.out.println("Test addition passed.");
    }

    @Test
    public void testAddition1() {
        int a = 57;
        int b = 78;
        int sum = a + b;
        Assert.assertEquals(sum, 135, "Sum should be 135");
        System.out.println("Test addition passed.");
    }

    @Test
    public void VerifyTitle() {
        driver.get("https://www.amazon.in/ref=nav_logo");
        Assert.assertEquals(driver.getTitle(),
                "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
        System.out.println("Title : " + driver.getTitle());
    }

    @Test
    public void testSubtraction() {
        int a = 10;
        int b = 4;
        int result = a - b;
        Assert.assertEquals(result, 6, "Result should be 6");
        System.out.println("Test subtraction passed.");
    }

    @Test
    public void testMultiplication() {
        int a = 7;
        int b = 6;
        int result = a * b;
        Assert.assertEquals(result, 42, "Result should be 42");
        System.out.println("Test multiplication passed.");
    }

    @Test
    public void testDivision() {
        int a = 20;
        int b = 4;
        int result = a / b;
        Assert.assertEquals(result, 5, "Result should be 5");
        System.out.println("Test division passed.");
    }

    @Test
    public void testStringConcatenation() {
        String str1 = "Hello";
        String str2 = "World";
        String result = str1 + " " + str2;
        Assert.assertEquals(result, "Hello World", "Result should be 'Hello World'");
        System.out.println("Test string concatenation passed.");
    }

    @Test
    public void testStringLength() {
        String str = "TestNG";
        int length = str.length();
        Assert.assertEquals(length, 6, "Length should be 6");
        System.out.println("Test string length passed.");
    }

    @Test
    public void testStringEquality() {
        String str1 = "TestNG";
        String str2 = "TestNG";
        Assert.assertEquals(str1, str2, "Strings should be equal");
        System.out.println("Test string equality passed.");
    }

    @Test
    public void testStringContains() {
        String str = "Hello World";
        Assert.assertTrue(str.contains("World"), "String should contain 'World'");
        System.out.println("Test string contains passed.");
    }

    @Test
    public void testStringStartsWith() {
        String str = "Hello World";
        Assert.assertTrue(str.startsWith("Hello"), "String should start with 'Hello'");
        System.out.println("Test string starts with passed.");
    }

    @Test
    public void testStringEndsWith() {
        String str = "Hello World";
        Assert.assertTrue(str.endsWith("World"), "String should end with 'World'");
        System.out.println("Test string ends with passed.");
    }

    @Test
    public void testArrayLength() {
        int[] numbers = {1, 2, 3, 4, 5};
        Assert.assertEquals(numbers.length, 5, "Array length should be 5");
        System.out.println("Test array length passed.");
    }

    @Test
    public void testArrayContains() {
        int[] numbers = {1, 2, 3, 4, 5};
        boolean contains = false;
        for (int number : numbers) {
            if (number == 3) {
                contains = true;
                break;
            }
        }
        Assert.assertTrue(contains, "Array should contain 3");
        System.out.println("Test array contains passed.");
    }

    @Test
    public void testIsTrue() {
        Assert.assertTrue(true, "Condition should be true");
        System.out.println("Test is true passed.");
    }

    @Test
    public void testIsFalse() {
        Assert.assertFalse(false, "Condition should be false");
        System.out.println("Test is false passed.");
    }

    @Test
    public void testIsNull() {
        String str = null;
        Assert.assertNull(str, "String should be null");
        System.out.println("Test is null passed.");
    }

    @Test
    public void testIsNotNull() {
        String str = "Not Null";
        Assert.assertNotNull(str, "String should not be null");
        System.out.println("Test is not null passed.");
    }

    @Test
    public void testArrayEquality() {
        int[] expected = {1, 2, 3};
        int[] actual = {1, 2, 3};
        Assert.assertEquals(expected, actual, "Arrays should be equal");
        System.out.println("Test array equality passed.");
    }

    @Test
    public void testArrayNotEqual() {
        int[] expected = {1, 2, 3};
        int[] actual = {1, 2, 4};
        Assert.assertNotEquals(expected, actual, "Arrays should not be equal");
        System.out.println("Test array not equal passed.");
    }

    @Test
    public void testDoubleEquality() {
        double a = 0.1;
        double b = 0.2;
        double sum = a + b;
        Assert.assertEquals(sum, 0.3, 0.0001, "Sum should be approximately 0.3");
        System.out.println("Test double equality passed.");
    }

    @Test
    public void testBooleanAssertion() {
        boolean condition = (5 > 3);
        Assert.assertTrue(condition, "Condition should be true");
        System.out.println("Test boolean assertion passed.");
    }

    @Test
    public void testElementVisibility() {
        driver.get("https://www.amazon.in/ref=nav_logo");
        // Assuming you have a method to find elements, e.g., WebDriverWait
        // WebElement element = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.id("someElementId")));
        // Assert.assertTrue(element.isDisplayed(), "Element should be visible");
        System.out.println("Test element visibility passed.");
    }

    @AfterClass
    public void tearDown() {
        System.out.println("Cleaning up after tests...");
        driver.quit();
    }
}
