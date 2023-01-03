package addressbook.tests.tests.groups;

import addressbook.tests.models.GroupData;
import addressbook.tests.tests.TestBase;
import org.testng.annotations.Test;

public class GroupModificationTests extends TestBase {
    @Test

    public void testGroupModification() throws Exception {
        app.getNavigationHelper().goToGroupPage();
        app.getGroupHelper().selectGroupCheckbox();
        app.getGroupHelper().initGroupEdition();
        app.getGroupHelper().fillGroupForm(new GroupData(
                "newName",
                "newHeader",
                "newFooter"));
        app.getGroupHelper().submitGroupEdition();
        app.getGroupHelper().returnToGroupPage();
    }
}
