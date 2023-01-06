package addressbook.tests.tests.groups;

import addressbook.tests.models.GroupData;
import addressbook.tests.tests.TestBase;
import org.testng.annotations.*;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() throws Exception {
        app.getNavigationHelper().goToGroupPage();
        app.getGroupHelper().createGroup(new GroupData("Master", null, null));
        //"Master_header", "Master_footer")););
    }

}