package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTest extends TestBase {

  @Test
  public void testContactCreation() {
    app.getContactHelper().gotoAddNewContact();
    app.getContactHelper().unitNewFirstName();
    app.getContactHelper().fillContactForm(new ContactData("Kate", "Belch", "9801 W Parmer", "apartmen 1"));
    app.getContactHelper().submitNewContact();
    app.getNavigationHelper().gotoContactPage();
  }


}
