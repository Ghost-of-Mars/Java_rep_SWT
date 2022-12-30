package addressbook.tests.tests;

import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase{
    @Test
    public void testContactModification() throws Exception {
        app.getNavigationHelper().goToTheAddNewContact();

        app.getNavigationHelper().goToTheHomeLink();
    }
}
