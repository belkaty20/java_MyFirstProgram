package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTest extends TestBase {

  @Test
  public void testContactCreation() {
    app.gotoAddNewContact();
    app.unitNewFirstName();
    app.fillContactForm(new ContactData("Kate", "Belch", "9801 W Parmer", "apartmen 1"));
    app.submitNewContact();
    app.gotoContactPage();
  }


}
