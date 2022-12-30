package addressbook.tests.tests;

import org.testng.annotations.Test;

public class GroupModificationTests extends TestBase{
    @Test
    public void testGroupModification() throws Exception {
        app.getNavigationHelper().goToGroupPage();

        app.getGroupHelper().returnToGroupPage();
    }
}
