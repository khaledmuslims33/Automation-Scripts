import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterBase extends PageBase {
    public RegisterBase(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")
    WebElement register_Button;

    @FindBy(id = "gender-male")
    WebElement male;

    @FindBy(id = "FirstName")
    WebElement F_name ;

    @FindBy(id = "LastName")
    WebElement L_name;

    @FindBy(id = "Email")
    WebElement email;

    @FindBy(id = "Password")
    WebElement Password;

    @FindBy(id = "ConfirmPassword")
    WebElement ConfirmPassword;

    @FindBy(id = "register-button")
    WebElement reg_Button;

    public void Open_Register_page()
    {
        register_Button.click();
    }

    public void Registertion( String f , String l , String e , String p , String cp )
    {
        male.click();
        F_name.sendKeys(f);
        L_name.sendKeys(l);
        email.sendKeys(e);
        Password.sendKeys(p);
        ConfirmPassword.sendKeys(cp);
        reg_Button.click();
    }














}
