package mapaDeObjetos;

import static mapaDeObjetos.Login.driver;
import static mapaDeObjetos.Propuesta.codigoDelProyecto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Consulta {

	public static void ingresarCodigoDelProyectoOPlan() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("codigo")).sendKeys(codigoDelProyecto); // el código se obtiene del metodo almacenarCodigoDelProyecto
	}

	public static void presionarBotonBuscar() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement elemento = driver
				.findElement(By.xpath("//*[@id=\"formConsultarPropuestas\"]/div[1]/div/div[2]/div[3]/div[4]/button/span"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", elemento);
	}

	public static void presionarBotonEditar() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement elemento = driver
				.findElement(By.cssSelector("i.icon-fa-table.fa.fa-pencil"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", elemento);
	}
	
}
