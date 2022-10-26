package page;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ProjectPage extends BasePage {
    public ProjectPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc='Menu']")
    private WebElement menu;
    @FindBy(xpath = "(//android.widget.TextView[@resource-id=\"com.todoist:id/name\"])[last()]")
    private WebElement project;

    public void clickMenuButton() {
        clickElement(menu);
    }

    public void clickOnProject() {
        clickElement(project);
    }

    public void verifyProject(String nameProject) {
        Assert.assertEquals(project.getText(), nameProject);
        System.out.println("Verify project success");
    }
}
