package mapaDeObjetos;

import static mapaDeObjetos.Global.explicitWait;
import static mapaDeObjetos.Login.driver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Primas {
	
	public static int sumaValorPrimaUnicaNoCapitada = 0, sumaValorBeneficiosCapitados = 0;
	
	// variables para almacenar el valor del calculo de primas
	private static String PrimaUnica, PrimaUnicaNoCapitada, BeneficiosCapitados;

	public static void verificarSiElBotonGuardarEsVisible() {
		boolean botonGuardarEsVisible = false;
		try {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			if (driver.findElement(By.id("botonForm")).isDisplayed()) {
				botonGuardarEsVisible = true;
			}
		} catch (Exception e) {
			botonGuardarEsVisible = false;
		}
		Assert.assertEquals(false, botonGuardarEsVisible);
	}

	public static void ingresarValorIndividualDeLasPrimas() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement tablaCuadroDePrimas = driver.findElement(By.xpath("//*[@id=\"tablaPrimas\"]"));
		List<WebElement> coleccionDeFilas = tablaCuadroDePrimas
				.findElements(By.xpath("//*[@id=\"tablaPrimas\"]/tbody/tr"));
		System.out.println("Número de filas en esta tabla = " + coleccionDeFilas.size());
		List<WebElement> coleccionDeColumnas = tablaCuadroDePrimas
				.findElements(By.xpath("//*[@id=\"tablaPrimas\"]/tbody/tr[1]/td"));
		System.out.println("Número de columnas = " + coleccionDeColumnas.size());
		int max = 10, min = 999999;
		int contador = 0, contadorBeneficioCapitado = 1;
		String tipoDeConfiguracion = null;
		Boolean beneficioCapitado = false;
		for (int fila = 1; fila <= coleccionDeFilas.size(); fila++) {
			for (int columna = 1; columna <= 1; columna++) {
				String valorDeLaCelda = driver
						.findElement(By.xpath("//*[@id=\"tablaPrimas\"]/tbody/tr[" + fila + "]/td[" + columna + "]/input[@class='tipoConfiguracion']"))
						.getAttribute("value");
				System.out.println("fila # " + fila + ", columna # " + columna + " texto = " + valorDeLaCelda);
				valorDeLaCelda = valorDeLaCelda.trim();
				tipoDeConfiguracion = valorDeLaCelda; // se captura el tipo de beneficio
				int valorAleatorio = (int)(Math.random() * ((max - min) + 1)) + min;
				String convertirAStringValorAleatorio = Integer.toString(valorAleatorio);
				if (tipoDeConfiguracion.equals("GRUPO_COBERTURA")) {
					if (contadorBeneficioCapitado % 2 == 0) {
						beneficioCapitado = true;
					} else {
						beneficioCapitado = false;
					}
					contadorBeneficioCapitado++;
				}
				if (beneficioCapitado == true) {
					if (tipoDeConfiguracion.equals("GRUPO_COBERTURA")) {
						driver.findElement(By.name(contador + "capitado")).click();
						driver.findElement(By.name(contador + "primaRiesgo")).sendKeys(convertirAStringValorAleatorio);
						driver.findElement(By.name(contador + "primaRiesgo")).sendKeys(Keys.TAB);
					}
				} else {
					if (tipoDeConfiguracion.equals("GRUPO_COBERTURA")) {
						driver.findElement(By.name(contador + "montoMedioPrima")).sendKeys(convertirAStringValorAleatorio);
					} else if (tipoDeConfiguracion.equals("SERVICIO")) {
						driver.findElement(By.name(contador + "montoMedioPrima")).sendKeys(convertirAStringValorAleatorio);
					} else if (tipoDeConfiguracion.equals("TIPO_COBERTURA")) {
						driver.findElement(By.name(contador + "montoMedioPrima")).sendKeys(convertirAStringValorAleatorio);
						driver.findElement(By.name(contador + "frecuenciaPrima")).sendKeys(convertirAStringValorAleatorio);
					}
				}
				contador++;
			}
		}
	}

	public static void presionarBotonGuardar() {
		explicitWait.until(ExpectedConditions.elementToBeClickable(By.id("botonForm")));
		WebElement elemento = driver.findElement(By.id("botonForm"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", elemento);
	}

	public static void verificarMensajeDeGuardadoDeLaPrimaUnica() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"contenedorExitoso\"]/div/p/label")));
		String mensaje = driver.findElement(By.xpath("//*[@id=\"contenedorExitoso\"]/div/p/label")).getText();
		Assert.assertEquals("Se ha guardado exitosamente el cálculo de prima única", mensaje);
	}
	
	public static void presionarBotonCerrar() {
		explicitWait.until(ExpectedConditions.elementToBeClickable(By.id("idMensajeExitosoAceptar")));
		WebElement elemento = driver.findElement(By.id("idMensajeExitosoAceptar"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", elemento);
	}

	public static void verificarElCalculoDeLaPrimaUnica() {
		WebElement tablaCuadroDePrimas = driver.findElement(By.xpath("//*[@id=\"tablaPrimas\"]"));
		List<WebElement> coleccionDeFilas = tablaCuadroDePrimas
				.findElements(By.xpath("//*[@id=\"tablaPrimas\"]/tbody/tr"));
		System.out.println("Número de filas en esta tabla = " + coleccionDeFilas.size());
		List<WebElement> coleccionDeColumnas = tablaCuadroDePrimas
				.findElements(By.xpath("//*[@id=\"tablaPrimas\"]/tbody/tr[1]/td"));
		System.out.println("Número de columnas = " + coleccionDeColumnas.size());
		int contador = 0, contadorPrimaComercial = 0, sumaPrimaComercial = 0;
		String valorDeLaPrimaComercial = null;
		for (int fila = 1; fila <= coleccionDeFilas.size(); fila++) {
			if (contador == contadorPrimaComercial) {
				valorDeLaPrimaComercial = driver.findElement(By.name(contador + "primacomercial")).getAttribute("value");
				if (valorDeLaPrimaComercial.indexOf(",") > -1) {
					System.out.println("el valor de la prima comercial es: " + valorDeLaPrimaComercial);
					while (valorDeLaPrimaComercial.indexOf(",") > -1) {
						valorDeLaPrimaComercial = valorDeLaPrimaComercial.replace(",", "");
					}
					valorDeLaPrimaComercial = valorDeLaPrimaComercial.replace("$", "");
					valorDeLaPrimaComercial = valorDeLaPrimaComercial.replace(".", "");
					System.out.println("el valor de la prima comercial desenmascarado es: " + valorDeLaPrimaComercial);
				} else {
					valorDeLaPrimaComercial = "0";
				}
				int convertirAEnteroValorDeLaPrimaComercial = Integer.parseInt(valorDeLaPrimaComercial);
				if (driver.findElement(By.name(contadorPrimaComercial + "capitado")).isSelected()) {
					sumaValorBeneficiosCapitados = sumaValorBeneficiosCapitados + convertirAEnteroValorDeLaPrimaComercial;
				} else {
					sumaValorPrimaUnicaNoCapitada = sumaValorPrimaUnicaNoCapitada + convertirAEnteroValorDeLaPrimaComercial;
				}
				sumaPrimaComercial = sumaPrimaComercial + convertirAEnteroValorDeLaPrimaComercial;
				contadorPrimaComercial = contadorPrimaComercial + 3;
			}
			contador++;
		}
		String valorDeLaPrimaUnica = driver.findElement(By.id("primaUnica")).getAttribute("value");
		while (valorDeLaPrimaUnica.indexOf(",") > -1) {
			valorDeLaPrimaUnica = valorDeLaPrimaUnica.replace(",", "");
		}
		valorDeLaPrimaUnica = valorDeLaPrimaUnica.replace("$", "");
		valorDeLaPrimaUnica = valorDeLaPrimaUnica.replace(".", "");
		String convertirAStringSumaPrimaComercial = Integer.toString(sumaPrimaComercial);
		Assert.assertEquals(valorDeLaPrimaUnica, convertirAStringSumaPrimaComercial);
	}

	public static void verificarElCalculoDeLaPrimaUnicaNoCapitada() {
		String valorDeLaPrimaUnicaNoCapitada = driver.findElement(By.id("idPrimaNoCapitada")).getAttribute("value");
		while (valorDeLaPrimaUnicaNoCapitada.indexOf(",") > -1) {
			valorDeLaPrimaUnicaNoCapitada = valorDeLaPrimaUnicaNoCapitada.replace(",", "");
		}
		valorDeLaPrimaUnicaNoCapitada = valorDeLaPrimaUnicaNoCapitada.replace("$", "");
		valorDeLaPrimaUnicaNoCapitada = valorDeLaPrimaUnicaNoCapitada.replace(".", "");
		int convertirAEnteroValorDeLaPrimaUnicaNoCapitada = Integer.parseInt(valorDeLaPrimaUnicaNoCapitada);
		Assert.assertEquals(convertirAEnteroValorDeLaPrimaUnicaNoCapitada, sumaValorPrimaUnicaNoCapitada);
	}

	public static void verificarElCalculoDeLosBeneficiosCapitados() {
		String valorDeLosBeneficiosCapitados = driver.findElement(By.id("idBeneficiosCapitados")).getAttribute("value");
		while (valorDeLosBeneficiosCapitados.indexOf(",") > -1) {
			valorDeLosBeneficiosCapitados = valorDeLosBeneficiosCapitados.replace(",", "");
		}
		valorDeLosBeneficiosCapitados = valorDeLosBeneficiosCapitados.replace("$", "");
		valorDeLosBeneficiosCapitados = valorDeLosBeneficiosCapitados.replace(".", "");
		int convertirAEnteroValorDeLosBeneficiosCapitados = Integer.parseInt(valorDeLosBeneficiosCapitados);
		Assert.assertEquals(convertirAEnteroValorDeLosBeneficiosCapitados, sumaValorBeneficiosCapitados);
	}

	public static void presionarBotonSiguiente() {
		explicitWait.until(ExpectedConditions.elementToBeClickable(By.linkText("Siguiente")));
		WebElement elemento = driver.findElement(By.linkText("Siguiente"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", elemento);
	}

	public static void presionarBotonCalcular() {
		explicitWait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.btn.btn-secondary-gray-blue.btn-condensed")));
		WebElement elemento = driver.findElement(By.cssSelector("button.btn.btn-secondary-gray-blue.btn-condensed"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", elemento);
	}

	public static void ingresarCalculoDeRecargoComercial() {
		limpiarCamposDelFormularioCalcularRecargoComercial();
		int min = 5, max = 99;
		int porcentajeTotalAleatorio = (int)(Math.random() * ((max - min) + 1)) + min;
		int porcentajeIndividual = porcentajeTotalAleatorio / 5;
		String convertirAStringPorcentajeIndividual = Integer.toString(porcentajeIndividual);
		driver.findElement(By.id("GastosAdministrativos")).sendKeys(convertirAStringPorcentajeIndividual);
		driver.findElement(By.id("ComisionInterna")).sendKeys(convertirAStringPorcentajeIndividual);
		driver.findElement(By.id("ComisionExterna")).sendKeys(convertirAStringPorcentajeIndividual);
		driver.findElement(By.id("Utilidad")).sendKeys(convertirAStringPorcentajeIndividual);
		driver.findElement(By.id("RecargoDesviacion")).sendKeys(convertirAStringPorcentajeIndividual);
	}

	private static void limpiarCamposDelFormularioCalcularRecargoComercial() {
		driver.findElement(By.id("GastosAdministrativos")).clear();
		driver.findElement(By.id("ComisionInterna")).clear();
		driver.findElement(By.id("ComisionExterna")).clear();
		driver.findElement(By.id("Utilidad")).clear();
		driver.findElement(By.id("RecargoDesviacion")).clear();
	}

	public static void presionarBotonGuardarCalculoDeRecargoComercial() {
		explicitWait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.btn.btn-success.btn-condensed")));
		WebElement elemento = driver.findElement(By.cssSelector("button.btn.btn-success.btn-condensed"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", elemento);
	}

	public static void ingresarPorcentajeDeRecargoIPC() throws InterruptedException {
		int min = 5, max = 99;
		int porcentajeRecargoIPC = (int)(Math.random() * ((max - min) + 1)) + min;
		String convertirAStringPorcentajeRecargoIPC= Integer.toString(porcentajeRecargoIPC);
		Thread.sleep(1000);
		driver.findElement(By.id("numRecargoIPC")).sendKeys(convertirAStringPorcentajeRecargoIPC);
	}

	public static void presionarBotonRegresar() {
		explicitWait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("span.fa.fa-arrow-left")));
		WebElement elemento = driver.findElement(By.cssSelector("span.fa.fa-arrow-left"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", elemento);
	}

	public static void almacenarElCalculoDeLaPrimaUnica() {
		PrimaUnica = driver.findElement(By.id("primaUnica")).getAttribute("value");
	}

	public static void almacenarElCalculoDeLaPrimaUnicaCapitadaYNoCapitada() {
		explicitWait.until(ExpectedConditions.elementToBeClickable(By.id("idPrimaNoCapitada")));
		PrimaUnicaNoCapitada = driver.findElement(By.id("idPrimaNoCapitada")).getAttribute("value");
		BeneficiosCapitados = driver.findElement(By.id("idBeneficiosCapitados")).getAttribute("value");
	}

	public static void compararInformacionDeLaPrimaUnicaInicalYLaPrimaUnicaDelNuevoAnalisisTecnico() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		explicitWait.until(ExpectedConditions.elementToBeClickable(By.id("primaUnica")));
		String PrimaUnicaDelNuevoAnalisisTecnico = driver.findElement(By.id("primaUnica")).getAttribute("value");
		Assert.assertEquals(PrimaUnica, PrimaUnicaDelNuevoAnalisisTecnico);
	}

	public static void compararInformacionDeLaPrimaUnicaCapitadaYNoCapitada() {
		explicitWait.until(ExpectedConditions.elementToBeClickable(By.id("idPrimaNoCapitada")));
		String PrimaUnicaNoCapitadaDelNuevoAnalisisTecnico = driver.findElement(By.id("idPrimaNoCapitada")).getAttribute("value");
		String BeneficiosCapitadosDelNuevoAnalisisTecnico = driver.findElement(By.id("idBeneficiosCapitados")).getAttribute("value");
		Boolean calculoDeBeneficiosCapitadosYNoCapitadosEsIgual = false;
		if (PrimaUnicaNoCapitada.equals(PrimaUnicaNoCapitadaDelNuevoAnalisisTecnico) && BeneficiosCapitados.equals(BeneficiosCapitadosDelNuevoAnalisisTecnico)) {
			calculoDeBeneficiosCapitadosYNoCapitadosEsIgual = true;
		}
		Assert.assertEquals(true, calculoDeBeneficiosCapitadosYNoCapitadosEsIgual);
	}

	public static void presionarBotonSeleccionarComoDefinitivo() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"gestionarEstadoDefinitivo\"]/label")));
		WebElement elemento = driver.findElement(By.xpath("//*[@id=\"gestionarEstadoDefinitivo\"]/label"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", elemento);
	}

	public static void verificarMensajeDeConfirmacionDeLaSeleccionDelAnalisisTecnico() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		explicitWait.until(ExpectedConditions.elementToBeClickable(By.id("contenedorAdvertenciaConfirmacion")));
		boolean mensajeDeConfirmacionEsVisible = false;
		if (driver.getPageSource().contains("¿Está seguro que desea seleccionar el análisis técnico como definitivo?")) {
			mensajeDeConfirmacionEsVisible = true;
		} else {
			mensajeDeConfirmacionEsVisible = false;
		}
		Assert.assertEquals(true, mensajeDeConfirmacionEsVisible);
	}

	public static void presionarBotonConfirmarAnalisisTecnicoDefinitivo() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement elemento = driver.findElement(By.id("idMensajeAdvertenciaConfirmacionAceptar"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", elemento);
	}

	public static void verificarSiElBotonDeseleccionarComoDefinitivoEsVisible() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(5000);
		boolean mensajeDeConfirmacionEsVisible = false;
		if (driver.getPageSource().contains("Deseleccionar")) {
			mensajeDeConfirmacionEsVisible = true;
		} else {
			mensajeDeConfirmacionEsVisible = false;
		}
		Assert.assertEquals(true, mensajeDeConfirmacionEsVisible);
	}

}
