package addressbook.tests.tests;

import addressbook.tests.models.ContactData;
import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase{
    @Test
    public void testContactDeletion() throws Exception {
        app.getContactHelper().selectContactCheckbox();
        app.getContactHelper().initContactDeletionAndConfirmation();
        app.getNavigationHelper().goToTheHomeLink();
    }
}
