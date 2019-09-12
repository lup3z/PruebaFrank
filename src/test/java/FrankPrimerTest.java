import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrankPrimerTest {
public static WebDriver driver;

    public static void main(String[] args) {
    //Paso 1: instancio el navegador:
        //tomo la la direccion local del driver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\chromedriver.exe");
        //lo llamo para utilizarlo
        driver = new ChromeDriver();
        //aplico el uso en una URL especifica
        driver.get("http://songs-by-sinatra.herokuapp.com/");

    //Paso 2: empiezo a definir casos de prueba
        //caso a)
        //caso b)
        //caso c)

}


}