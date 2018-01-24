package mapaDeObjetos;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static mapaDeObjetos.Login.driver;
import static mapaDeObjetos.Login.tamanoDeLaVentana;;

public class Menu {

	private static void desplegarElMenu() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement elemento = driver.findElement(By.cssSelector("a.x-navigation-control"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", elemento);
	}

	public static void ingresarALaOpcionDePropuestas() throws InterruptedException, IOException {
		if (tamanoDeLaVentana <= 945) {
			
		}
		//desplegarElMenu();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement elemento = driver.findElement(By.xpath("//*[@id=\"mCSB_2_container\"]/ul/li[3]/a/span[2]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", elemento);
	}

	public static void ingresarALaOpcionDeNuevaSalud() throws IOException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement elemento = driver.findElement(By.linkText("Nueva SALUD"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", elemento);
	}

	public static void ingresarALaOpcionDeNuevaVida() throws IOException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement elemento = driver.findElement(By.linkText("Nueva Vida"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", elemento);
	}

	public static void ingresarALaOpcion(String valor) {
		WebElement elemento = driver.findElement(By.linkText(valor));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", elemento);
	}

	public static void ingresarAlaPropuesta() {
		WebElement elemento = driver
				.findElement(By.xpath("//*[@id=\"mCSB_2_container\"]/ul/li[3]/ul/li[3]/ul/li/a/span"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", elemento);
	}

	public static void ingresarAlaPropuestaConElUsuarioTecnico() {
		WebElement elemento = driver.findElement(By.xpath("//*[@id=\"mCSB_2_container\"]/ul/li[3]/ul/li/ul/li/a/span"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", elemento);
	}

	public static void ingresarALaPrimeraVersionDeLaPropuesta() {
		driver.findElement(By.xpath("//*[@id=\"mCSB_2_container\"]/ul/li[3]/ul/li[3]/ul/li/ul[1]/li[2]/ul/li/a/span"))
				.click();
	}

	public static void ingresarALaPrimeraVersionDeLaPropuestaConElUsuarioTecnico() {
		driver.findElement(By.xpath("//*[@id=\"mCSB_2_container\"]/ul/li[3]/ul/li/ul/li/ul[1]/li[2]/ul/li/a/span"))
				.click();
	}

	public static void ingresarALaOpcionDeConceptualizacion() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement elemento = driver.findElement(By.linkText("Conceptualización"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", elemento);
	}

	public static void ingresarALaSegundaVersionDeLaPropuestaConElUsuarioTecnico() {
		driver.findElement(By.xpath("//*[@id=\"mCSB_2_container\"]/ul/li[3]/ul/li/ul/li/ul[1]/li[2]/ul/li[2]/a/span"))
				.click();
	}

	public static void ingresarALaSegundaVersionDeLaPropuesta() {
		driver.findElement(
				By.xpath("//*[@id=\"mCSB_2_container\"]/ul/li[3]/ul/li[3]/ul/li/ul[1]/li[2]/ul/li[2]/a/span")).click();
	}

}
