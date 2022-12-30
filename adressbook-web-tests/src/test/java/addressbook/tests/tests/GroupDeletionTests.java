package addressbook.tests.tests;

import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase{
    @Test
    public void testGroupDeletion() throws Exception {
        app.getNavigationHelper().goToGroupPage();
        app.getGroupHelper().selectGroupCheckbox();
        app.getGroupHelper().initGroupDeletion();
        app.getGroupHelper().returnToGroupPage();
    }
}
