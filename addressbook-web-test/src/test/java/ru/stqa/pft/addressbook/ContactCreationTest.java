package ru.stqa.pft.addressbook;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase {

  @Test
  public void testContactCreation() {
    gotoAddNewContact();
    unitNewFirstName();
    fillContactForm(new ContactData("Kate", "Belch", "9801 W Parmer", "apartmen 1"));
    submitNewContact();
    gotoContactPage();
  }


}
