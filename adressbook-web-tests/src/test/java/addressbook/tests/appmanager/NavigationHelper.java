package addressbook.tests.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase {

    public NavigationHelper(WebDriver wd) {
        super(wd);
    }

    public void goToGroupPage() {
        click(By.linkText("groups"));
    }

    public void goToTheHomeLink() {
        if (isElementPresent(By.id("maintable"))) {
            return;
        }

        click(By.linkText("home"));
    }

    public void goToTheAddNewContact() {
        click(By.linkText("add new"));
    }
}
