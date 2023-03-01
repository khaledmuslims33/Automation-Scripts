import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends TestBase {

    RegisterBase registerbase = new RegisterBase(driver);
    @Test
    public void ValidRegister()
    {
        RegisterBase registerbase = new RegisterBase(driver);
        registerbase.Open_Register_page();
        registerbase.Registertion("Khaled" , "Mahmoud" , "kmahmoud@ictcube.com" , "123456" , "123456");
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]")).getText().contains("Your registration completed"));
    }

}
