package test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Main;
import pageFactory.HomePage;
import pageFactory.RegisterPage;

public class HomePageLinkTest extends Main{
HomePage hp;
RegisterPage rp;     // creating instance to use in other partsc making is public to use elsewhere

@BeforeMethod
public void loadUrl() {
initialization();
hp = new HomePage();
rp = new RegisterPage();
}
@AfterMethod
public void closeBrowser() {
tearDown();
}
@Test
public void registerLinkTest() {
hp.clickRegisterLink();
Assert.assertEquals(rp.getRegisterPageTitle(), prop.getProperty("registerPageTitle")); // getting the title from config.prop
Assert.assertTrue(rp.validateSubmitBtn());
}
}
