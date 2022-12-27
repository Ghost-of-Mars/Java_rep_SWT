package addressbook.tests.tests;

import addressbook.tests.models.ContactData;
import org.testng.annotations.*;

public class AddContactTest extends TestBase {
  @Test
  public void testAddContact() throws Exception {
    app.getNavigationHelper().goToTheAddNewContact();
    app.getContactHelper().fillNewContactForm(new ContactData(
            "Elias",
            "Triangle",
             "Msk",
            "8 800 800 80 80",
            "elias_triangle@gmail.com"));
    app.getContactHelper().submitContactCreation();
    app.getNavigationHelper().goToTheHomeLink();
  }
}
