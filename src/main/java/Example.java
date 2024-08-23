import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Example {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/79227/AppData/Local/Temp/Rar$EXa8008.47296/chromedriver-win64/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/automation-practice-form");

        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.sendKeys("Alexandr"); // Шаг 1. Заполнить поле First Name произвольной строкой (Аlexandr)

        WebElement lastName = driver.findElement(By.id("lastName"));
        lastName.sendKeys("Snow"); // Шаг 2. Заполнить поле Lasst Name произвольной строкой (Snow)

        WebElement email = driver.findElement(By.id("userEmail"));
        email.sendKeys("name@example.com"); // Шаг 3. Заполнить поле Email строкой формата name@example.com

        WebElement genderMale = driver.findElement(By.xpath("//input[@id='gender-radio-1']"));
        genderMale.click(); // Шаг 4. Выбрать любое значение в Gender с помощью переключателя

        WebElement mobile = driver.findElement(By.id("userNumber"));
        mobile.sendKeys("8959333221"); // Шаг 5. Заполнить поле Mobile произвольными 10 цифрами

        WebElement dateOfBirth = driver.findElement(By.id("dateOfBirthInput"));
        dateOfBirth.click();
        Select month = new Select(driver.findElement(By.className("react-datepicker__month-select")));
        month.selectByVisibleText("April");
        Select year = new Select(driver.findElement(By.className("react-datepicker__year-select")));
        year.selectByVisibleText("1993");
        WebElement day = driver.findElement(By.xpath("//div[@aria-label='Choose Thursday, April 20th, 1993']"));
        day.click();  // Шаг 6. Заполнить поле Date of birth произвольной датой с помощью всплывающего календаря

        WebElement subjects = driver.findElement(By.id("subjectsInput"));
        subjects.sendKeys("Computer Science");
        subjects.sendKeys("\n"); // Шаг 7. Заполнить поле Subjects произвольной строкой

        WebElement uploadPicture = driver.findElement(By.id("uploadPicture"));
        uploadPicture.sendKeys("C:\\Users\\79227\\Desktop\\Mars.jpg"); // Шаг 8. Загрузить любое изображение в поле Picture

        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("Main street 1"); // Шаг 9. Загрузить любое изображение в поле Picture

        WebElement stateDropdown = driver.findElement(By.id("state"));
        stateDropdown.click();
        WebElement stateOption = driver.findElement(By.xpath("//div[text()='NCR']"));
        stateOption.click(); // Шаг 10. Выбрать любое значение в Select State с помощью выпадающего списка

        WebElement cityDropdown = driver.findElement(By.id("city"));
        cityDropdown.click();
        WebElement cityOption = driver.findElement(By.xpath("//div[text()='Delhi']"));
        cityOption.click(); // Шаг 11. Выбрать любое значение в Select City с помощью выпадающего списка

        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click(); // Шаг 12. Нажать кнопку Submit

        driver.quit(); //в условие нет, но браузер лучше закрыть)


    }
}
