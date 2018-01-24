package mapaDeObjetos;

import java.io.File;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	public static WebDriver driver;
	public static int tamanoDeLaVentana;

	public static void abrirElNavegador(String navegador) throws IOException {
		if (navegador == "Chrome") {
			File directorioActual = new File(".");
			System.setProperty("webdriver.chrome.driver",
					directorioActual.getCanonicalPath() + "\\userdata\\chromedriver2_33.exe");
			driver = new ChromeDriver();
		} else {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		tamanoDeLaVentana = driver.manage().window().getSize().getWidth();
	}

	public static void ingresarAlaPagina(String valor) throws IOException {
		driver.get(valor);
	}

	public static void ingresarUsuario(String valor) throws IOException {
		driver.findElement(By.name("username")).sendKeys(valor);
	}

	public static void ingresarContraseña(String valor) throws IOException {
		driver.findElement(By.name("password")).sendKeys(valor);
	}

	public static void presionarBotonIngresar() throws IOException {
		driver.findElement(By.name("ingresar")).click();
	}

	public static void ingresarAlModuloDePlanes() throws IOException {
		driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div/div[2]/a/div[3]")).click();
	}

	public static void verificarIngresoAlAplicativo() throws IOException {
		if (driver.getTitle() == "Planes") {
			Assert.assertEquals("Planes", driver.getTitle());
		}
	}

}
