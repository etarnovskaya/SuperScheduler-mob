package com.telran.scheduler.tests;

import com.telran.scheduler.model.User;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends  TestBase{
  @Test
  public void testLogin() throws InterruptedException {
    app.getSession().pause(4000);
    app.getSession().fillLogInForm(new User()
            .withUserName("etarnovskaya+22@gmail.com")
            .withPassword("Qawsedrf"));


    app.getSession().tapLoginButton();
    app.getSession().pause(5000);

    Assert.assertTrue(app.getEvent().isPlusButtonPresent());

  }


}
