import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class registrationFacebookTest {

    @Test
    public void fullRegistrationTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        driver.findElement(By.linkText("Crear cuenta nueva")).click();
        Thread.sleep(3000);

        driver.findElement(By.name("firstname")).sendKeys("John");
        driver.findElement(By.name("lastname")).sendKeys("Smith");
        driver.findElement(By.name("reg_email__")).sendKeys("5555555");
        driver.findElement(By.name("reg_passwd__")).sendKeys("123456789");

        Thread.sleep(3000);
        WebElement dia = driver.findElement(By.name("birthday_day"));
        Select elementoDia = new Select(dia);
        elementoDia.selectByVisibleText("26");

        Thread.sleep(3000);
        WebElement mes = driver.findElement(By.name("birthday_month"));
        Select elementoMes = new Select(mes);
        elementoMes.selectByVisibleText("jun");

        Thread.sleep(3000);
        WebElement año = driver.findElement(By.name("birthday_year"));
        Select elementoAño = new Select(año);
        elementoAño.selectByIndex(42);

        Thread.sleep(5000);
        driver.findElement(By.id("u_1_3")).click();
    }
}
