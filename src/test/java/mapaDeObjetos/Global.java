package mapaDeObjetos;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.Scenario;

import static mapaDeObjetos.Login.driver;

import java.util.concurrent.TimeUnit;

public class Global {
	
	public static WebDriverWait explicitWait;

	public static void aplicarScroll(String scroll) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0," + scroll + ")", "");
	}

	public static void cerrarNavegador() {
		driver.quit();
	}

	public static void tomarEvidencia(Scenario escenario) {
		if (escenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			escenario.embed(screenshot, "imagen/png"); 
		} else {
			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			escenario.embed(screenshot, "imagen/png"); 
		}
	}
	
	public static void reiniciarVariables() {
		Beneficios.reiniciarVariablesGlobales();
		Propuesta.reiniciarVariablesGlobales();
	}

	public static void establecerTiempoDeEsperaExplicita(int tiempoDeEsperaEnSegundos) {
		explicitWait = new WebDriverWait(driver, tiempoDeEsperaEnSegundos);
	}

	public static void cerrarSesion() {
		driver.navigate().to("http://172.24.206.98:8002/SeisServices/login");
	}

}
