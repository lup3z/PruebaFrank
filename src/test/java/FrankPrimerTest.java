import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrankPrimerTest {
	
public static ChromeDriver driver;

    public static void main(String[] args) {
    //Paso 1: instancio el navegador:
        //tomo la la direccion local del driver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiusys\\Desktop\\automation\\finaljenkins\\loyalty\\tools\\chromedriver.exe");
        //lo llamo para utilizarlo
        driver = new ChromeDriver();
        //aplico el uso en una URL especifica
        driver.get("http://songs-by-sinatra.herokuapp.com/");

    //Paso 2: empieso a definir casos de prueba
        //caso a) elementos de pantalla
        // titulo de la pagina: //title[text()="Songs By Sinatra"]
        // una solapa: //a[@href="/about"]
        // imagen: //img[@src="/images/sinatra.jpg"]
        
        
        WebElement titulo = driver.findElement(By.xpath("//title[text()='Songs By Sinatra']"));
        titulo.isDisplayed();
        
        WebElement solapa = driver.findElement(By.xpath("//a[@href='/about']"));
        solapa.isDisplayed();
        
        WebElement imagen = driver.findElement(By.xpath("//img[@src='/images/sinatra.jpg']"));
        imagen.isDisplayed();
        
        System.out.println("El test corrio bien");

}


}