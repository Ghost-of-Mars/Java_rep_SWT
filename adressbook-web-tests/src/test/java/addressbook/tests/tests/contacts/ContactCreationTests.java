package addressbook.tests.tests.contacts;

import addressbook.tests.models.ContactData;
import addressbook.tests.tests.TestBase;
import org.testng.annotations.*;

public class ContactCreationTests extends TestBase {
  @Test
  public void testContactCreation() throws Exception {
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
