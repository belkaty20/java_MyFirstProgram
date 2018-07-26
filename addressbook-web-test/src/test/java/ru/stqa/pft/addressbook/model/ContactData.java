package ru.stqa.pft.addressbook.model;

public class ContactData {
  private final String firstname;
  private final String lastname;
  private final String street;
  private final String apartment;

  public ContactData(String firstname, String lastname, String street, String apartment) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.street = street;
    this.apartment = apartment;
  }

  public String getFirstname() {
    return firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public String getStreet() {
    return street;
  }

  public String getApartment() {
    return apartment;
  }
}
