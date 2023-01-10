package addressbook.tests.appmanager;

import addressbook.tests.models.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ContactHelper extends HelperBase {
    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void submitContactCreation() {
        click(By.xpath("//div[@id='content']/form/input[21]"));
    }

    public void fillNewContactForm(ContactData contactData, boolean creation) {
        type(By.name("firstname"), contactData.firstName());
        type(By.name("lastname"), contactData.lastName());
        type(By.name("address"), contactData.address());
        type(By.name("mobile"), contactData.mobilePhone());
        type(By.name("email"), contactData.email());
        if (creation) {
            new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
        }
        else {
            Assert.assertFalse(isElementPresent(By.name("new_group")));
        }
    }

    public void selectContactCheckbox() {
        click(By.name("selected[]"));
    }

    public void initContactDeletionAndConfirmation() {
        click(By.xpath("//input[@value='Delete']"));
        wd.switchTo().alert().accept();
    }

    public void initContactEdition() {
        click(By.xpath("//img[@alt='Edit']"));
        //click(By.cssSelector("img[alt=\"Edit\"]"));
    }

    public void submitContactEdition() {
        click(By.name("update"));
    }

    public void createContact(ContactData contactData ) {
        fillNewContactForm(contactData, true);
        submitContactCreation();
    }

    public boolean isThereAContact() {
        return isElementPresent(By.name("selected[]"));
    }

    public boolean isThereGroupWithName(String groupName) {
        return isElementPresent(By.xpath("//*[@name=\"new_group\"]//*[text() = \"" + groupName +"\"]"));
    }
}
