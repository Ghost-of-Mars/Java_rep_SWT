package addressbook.tests.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper {
    private WebDriver wd;

    public NavigationHelper(WebDriver wd) {
        this.wd = wd;
    }

    public void goToGroupPage() {
        wd.findElement(By.linkText("groups")).click();
    }

    public void goToTheHomeLink() {
      wd.findElement(By.linkText("home")).click();
    }

    public void goToTheAddNewContact() {
      wd.findElement(By.linkText("add new")).click();
    }
}
