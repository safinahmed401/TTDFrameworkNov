package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Main;

public class RegisterPage extends Main{
@FindBy(name="submit")
WebElement submitBtn;
public RegisterPage() {
PageFactory.initElements(driver, this);
}
public void clickSubmitBtn() {
submitBtn.click();
}
public boolean validateSubmitBtn() {
return submitBtn.isEnabled();
}
public String getRegisterPageTitle() {
return driver.getTitle();
}

}