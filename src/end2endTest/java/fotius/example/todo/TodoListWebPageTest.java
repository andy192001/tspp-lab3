package fotius.example.todo;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.nio.file.Paths;

class TodoListWebPageTest {

    private WebDriver driver;

    @BeforeEach
    void setup() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
    }

    @AfterEach
    void cleanup() {
        // TODO: comment quit method call to keep browser open after test
         driver.quit();
    }

    @Test
    void example() {
        goToHtmlPage();

        final WebElement todoInput = driver.findElement(By.id("todo"));
        final WebElement addButton = driver.findElement(By.id("add"));
        
        // TODO: actually test something
    }

    void goToHtmlPage() {
        driver.get(
            "file://" +
            Paths.get(System.getProperty("user.dir"))
                .resolve("src")
                .resolve("main")
                .resolve("resources")
                .resolve("todo.html")
                .toAbsolutePath()
        );
    }
}
