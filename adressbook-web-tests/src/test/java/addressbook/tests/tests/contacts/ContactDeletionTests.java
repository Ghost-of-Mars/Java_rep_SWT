package addressbook.tests.tests.contacts;

import addressbook.tests.models.ContactData;
import addressbook.tests.tests.TestBase;
import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase {
    @Test
    public void testContactDeletion() throws Exception {
        if (!app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createContact(new ContactData(
                    "Elias",
                    "Triangle",
                    "Msk",
                    "8 800 800 80 80",
                    "elias_triangle@gmail.com",
                    "Master"));
        }
        app.getContactHelper().selectContactCheckbox();
        app.getContactHelper().initContactDeletionAndConfirmation();
        app.getNavigationHelper().goToTheHomeLink();
    }
}
