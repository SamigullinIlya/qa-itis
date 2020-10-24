package tests;

import base.TestBase;
import dto.Account;
import dto.Note;
import org.openqa.selenium.By;

public class CreateAnotherEntityTest extends TestBase {
    @Override
    public void testCase() {
        // login
        Account testAccount = new Account("yajanah653@glenwoodave.com", "qwerty123");

        resizeWindow(928, 694);
        loginWith(testAccount);

        // entity creation
        Note testNote = new Note("Another Sample Text");

        navigateTo("/app");
        createNoteWith(testNote);
    }

    private void createNoteWith(Note note) {
        driver.findElement(By.xpath("//*[@id=\"todos\"]/ul/li[1]/a")).click();
        driver.findElement(By.cssSelector(".outline img")).click();
        driver.findElement(By.name("title")).sendKeys(note.getContent());
        driver.findElement(By.id("todos")).click();
    }
}
