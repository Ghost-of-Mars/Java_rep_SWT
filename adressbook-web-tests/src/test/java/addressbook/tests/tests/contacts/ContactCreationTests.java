package addressbook.tests.tests.contacts;

import addressbook.tests.models.ContactData;
import addressbook.tests.models.GroupData;
import addressbook.tests.tests.TestBase;
import org.testng.annotations.*;

public class ContactCreationTests extends TestBase {
  @Test
  public void testContactCreation() throws Exception {
    String groupName = "Master";

    app.getNavigationHelper().goToTheAddNewContact();
    if (! app.getContactHelper().isThereGroupWithName(groupName)) {
      app.getNavigationHelper().goToGroupPage();
      app.getGroupHelper().createGroup(new GroupData(groupName, null, null));
      app.getNavigationHelper().goToTheAddNewContact();
    }
    app.getContactHelper().createContact(new ContactData(
            "Elias",
            "Triangle",
             "Msk",
            "8 800 800 80 80",
            "elias_triangle@gmail.com",
            groupName));
    app.getNavigationHelper().goToTheHomeLink();
  }
}
