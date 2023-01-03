package addressbook.tests.tests.contacts;

import addressbook.tests.models.ContactData;
import addressbook.tests.tests.TestBase;
import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {
    @Test
    public void testContactModification() throws Exception {
        app.getContactHelper().initContactEdition();
        app.getContactHelper().fillNewContactForm(new ContactData(
                "One",
                "Two",
                "ThreeAddress",
                "9 999 999 99 99",
                "Five@mail.jungle"));
        app.getContactHelper().submitContactEdition();
        app.getNavigationHelper().goToTheHomeLink();
    }
}
