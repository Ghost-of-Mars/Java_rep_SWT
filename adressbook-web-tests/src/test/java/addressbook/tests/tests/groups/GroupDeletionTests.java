package addressbook.tests.tests.groups;

import addressbook.tests.models.GroupData;
import addressbook.tests.tests.TestBase;
import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {
    @Test
    public void testGroupDeletion() throws Exception {
        app.getNavigationHelper().goToGroupPage();
        if (!app.getGroupHelper().isThereAGroup()) {
            app.getGroupHelper().createGroup(new GroupData("Master",null, null));
        }
        app.getGroupHelper().selectGroupCheckbox();
        app.getGroupHelper().initGroupDeletion();
        app.getGroupHelper().returnToGroupPage();
    }
}
