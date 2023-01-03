package addressbook.tests.appmanager;

import addressbook.tests.models.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactHelper extends HelperBase{
    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void submitContactCreation() {
        click(By.xpath("//div[@id='content']/form/input[21]"));
    }

    public void fillNewContactForm(ContactData contactData) {
        type(By.name("firstname"), contactData.firstName());
        type(By.name("lastname"), contactData.lastName());
        type(By.name("address"), contactData.address());
        type(By.name("mobile"), contactData.mobilePhone());
        type(By.name("email"), contactData.email());
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

    public void submitContactEdition () {
        click(By.name("update"));
    }
}