package addressbook.tests.tests.contacts;

import addressbook.tests.models.ContactData;
import addressbook.tests.tests.TestBase;
import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase {
    @Test
    public void testContactDeletion() throws Exception {
        app.getContactHelper().selectContactCheckbox();
        app.getContactHelper().initContactDeletionAndConfirmation();
        app.getNavigationHelper().goToTheHomeLink();
    }
}
