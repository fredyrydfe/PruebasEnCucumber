package mapaDeObjetos;

import static mapaDeObjetos.Login.driver;
import static mapaDeObjetos.Global.explicitWait;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class Propuesta {

	public static String codigoDelProyecto = null, tipoDeVenta = null, nombreDelProyecto = null, nombreDelPlan = null, compañia = null,
			ramo = null, subRamo = null, tipoPlan = null, modalidad = null, conceptualizacion = null, tecnico = null;
	
	public static void almacenarCodigoDelProyecto() {
		codigoDelProyecto = driver.findElement(By.id("idPlan")).getAttribute("value");
	}
	
	public static void seleccionarTipoDeVenta(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		new Select(driver.findElement(By.id("idTipoVenta"))).selectByVisibleText(valor);
		tipoDeVenta = valor;
	}

	public static void ingresarNombreDelProyecto(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		valor = valor + obtenerFechaActual();
		driver.findElement(By.id("nombreProyecto")).sendKeys(valor);
		nombreDelProyecto = valor;
	}

	public static void ingresarNombreDelPlan(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		valor = valor + obtenerFechaActual();
		driver.findElement(By.id("nombrePlan")).sendKeys(valor);
		int tamañoDeLaCadena = valor.length();
		if (tamañoDeLaCadena > 32) {
			int cantidadDeCaracteresAEliminar = tamañoDeLaCadena - 32;
			String valorRefactorizado = valor.substring(0, tamañoDeLaCadena - cantidadDeCaracteresAEliminar);
			nombreDelPlan = valorRefactorizado;
		} else {
			nombreDelPlan = valor;
		}
	}

	private static String obtenerFechaActual() {
		Date hoy = new Date();
		int dia = hoy.getDate();
		int mes = hoy.getMonth() + 1;
		int año = hoy.getYear();
		int hora = hoy.getHours();
		int minuto = hoy.getMinutes();
		int segundo = hoy.getSeconds();
		String fecha = dia + "-" + mes + "-" + año + " " + hora + ":" + minuto + ":" + segundo;
		return fecha;
	}

	public static void seleccionarCompañia(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		new Select(driver.findElement(By.id("idCompania"))).selectByVisibleText(valor);
		compañia = valor;
	}

	public static void seleccionarRamo(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		new Select(driver.findElement(By.id("idRamo"))).selectByVisibleText(valor);
		ramo = valor;
	}

	public static void seleccionarSubRamo(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		new Select(driver.findElement(By.id("idSubRamo"))).selectByVisibleText(valor);
		subRamo = valor;
	}

	public static void seleccionarTipoPlan(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		new Select(driver.findElement(By.id("idTipoPlan"))).selectByVisibleText(valor);
		tipoPlan = valor;
	}

	public static void seleccionarModalidad(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		new Select(driver.findElement(By.id("idModalidadPlan"))).selectByVisibleText(valor);
		modalidad = valor;
	}

	public static void ingresarComentarioEnLaConceptualizacion(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("conceptualizacion")).sendKeys(valor);
		conceptualizacion = valor;
	}

	public static void ingresarComentarioEnElCampoTecnico(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("tecnico")).sendKeys(valor);
		tecnico = valor;
	}

	public static void seleccionarTodosLosTerritoriosDeCobertura() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("button.btn.btn-secondary-gray-blue.btn-condensed")).click();
	}

	public static void ingresarPorcentajeDeCoaseguroLocal(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("porcentajeCoaseguro")).sendKeys(valor);
		driver.findElement(By.id("porcentajeCoaseguro")).sendKeys(Keys.TAB);
	}

	public static void ingresarMontoDeCoaseguroLocal(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("montoCoaseguro")).sendKeys(valor);
		driver.findElement(By.id("montoCoaseguro")).sendKeys(Keys.TAB);
	}

	public static void seleccionarUnidadDeTiempoCoaseguroLocal(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		new Select(driver.findElement(By.id("undTiempoCoaseguroLocal"))).selectByVisibleText(valor);
		driver.findElement(By.id("undTiempoCoaseguroLocal")).sendKeys(Keys.TAB);
	}

	public static void seleccionarRangoMaximoDelCoaseguroLocal(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		new Select(driver.findElement(By.id("rangoCoaseguroLocal"))).selectByVisibleText(valor);
	}

	public static void ingresarPorcentajeDefinitivoDelCoaseguroLocal(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("porcentajeDefinitivo")).sendKeys(valor);
		driver.findElement(By.id("porcentajeDefinitivo")).sendKeys(Keys.TAB);
	}

	public static void ingresarPorcentajeDeCoaseguroInternacional(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("porcentajeCoaseguroInt")).sendKeys(valor);
		driver.findElement(By.id("porcentajeCoaseguroInt")).sendKeys(Keys.TAB);
	}

	public static void ingresarMontoDeCoaseguroInternacional(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("montoCoaseguroInt")).sendKeys(valor);
		driver.findElement(By.id("montoCoaseguroInt")).sendKeys(Keys.TAB);
	}

	public static void seleccionarUnidadDeTiempoCoaseguroInternacional(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		new Select(driver.findElement(By.id("undTiempoCoaseguroInt"))).selectByVisibleText(valor);
		driver.findElement(By.id("undTiempoCoaseguroInt")).sendKeys(Keys.TAB);
	}

	public static void seleccionarRangoMaximoDelCoaseguroInternacional(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		new Select(driver.findElement(By.id("rangoCoaseguroInt"))).selectByVisibleText(valor);
	}

	public static void ingresarPorcentajeDefinitivoDelCoaseguroInternacional(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("porcentajeDefinitivoInt")).sendKeys(valor);
		driver.findElement(By.id("porcentajeDefinitivoInt")).sendKeys(Keys.TAB);
	}

	public static void seleccionarTipoDeReembolsoLocal(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		new Select(driver.findElement(By.id("idTipoReembolsoLocal"))).selectByVisibleText(valor);
	}

	public static void ingresarPorcentajeDeReembolsoLocal(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("idPorcentajeReembolsoLocal")).sendKeys(valor);
	}

	public static void ingresarFrecuenciaDeReembolsoLocal(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("idFrecuenciaReembolsoLocal")).sendKeys(valor);
		driver.findElement(By.id("idFrecuenciaReembolsoLocal")).sendKeys(Keys.TAB);
	}

	public static void seleccionarUnidadDeTiempoRemmbolsoLocal(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		new Select(driver.findElement(By.id("idUnidadTiempoFrecuenciaReembolsoLocal"))).selectByVisibleText(valor);
		driver.findElement(By.id("idUnidadTiempoFrecuenciaReembolsoLocal")).sendKeys(Keys.TAB);
	}

	public static void seleccionarRangoMaximoRemmbolsoLocal(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		new Select(driver.findElement(By.id("idRangoMaximoFrecuenciaReembolsoLocal"))).selectByVisibleText(valor);
		driver.findElement(By.id("idRangoMaximoFrecuenciaReembolsoLocal")).sendKeys(Keys.TAB);
	}

	public static void ingresarMontoDelRemmbolsoLocal(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("idMontoReembolsoLocal")).sendKeys(valor);
		driver.findElement(By.id("idMontoReembolsoLocal")).sendKeys(Keys.TAB);
	}

	public static void seleccionarUnidadDeTiempoMontoRemmbolsoLocal(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		new Select(driver.findElement(By.id("idUnidadTiempoMontoReembolsoLocal"))).selectByVisibleText(valor);
		driver.findElement(By.id("idUnidadTiempoMontoReembolsoLocal")).sendKeys(Keys.TAB);
	}

	public static void seleccionarRangoMaximoMontoRemmbolsoLocal(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		new Select(driver.findElement(By.id("idRangoMaximoMontoReembolsoLocal"))).selectByVisibleText(valor);
		driver.findElement(By.id("idRangoMaximoMontoReembolsoLocal")).sendKeys(Keys.TAB);
	}

	public static void seleccionarTipoDeReembolsoInternacional(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		new Select(driver.findElement(By.id("idTipoReembolsoInternacional"))).selectByVisibleText(valor);
	}

	public static void ingresarPorcentajeDeReembolsoInternacional(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("idPorcentajeReembolsoInternacional")).sendKeys(valor);
	}

	public static void ingresarFrecuenciaDeReembolsoInternacional(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("idFrecuenciaReembolsoInternacional")).sendKeys(valor);
		driver.findElement(By.id("idFrecuenciaReembolsoInternacional")).sendKeys(Keys.TAB);
	}

	public static void seleccionarUnidadDeTiempoRemmbolsoInternacional(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		new Select(driver.findElement(By.id("idUnidadTiempoFrecuenciaReembolsoInternacional")))
				.selectByVisibleText(valor);
		driver.findElement(By.id("idUnidadTiempoFrecuenciaReembolsoInternacional")).sendKeys(Keys.TAB);
	}

	public static void seleccionarRangoMaximoRemmbolsoInternacional(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		new Select(driver.findElement(By.id("idRangoMaximoFrecuenciaReembolsoInternacional")))
				.selectByVisibleText(valor);
		driver.findElement(By.id("idRangoMaximoFrecuenciaReembolsoInternacional")).sendKeys(Keys.TAB);
	}

	public static void ingresarMontoDelRemmbolsoInternacional(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("idMontoReembolsoInternacional")).sendKeys(valor);
		driver.findElement(By.id("idMontoReembolsoInternacional")).sendKeys(Keys.TAB);
	}

	public static void seleccionarUnidadDeTiempoMontoRemmbolsoInternacional(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		new Select(driver.findElement(By.id("idUnidadTiempoMontoReembolsoInternacional"))).selectByVisibleText(valor);
		driver.findElement(By.id("idUnidadTiempoMontoReembolsoInternacional")).sendKeys(Keys.TAB);
	}

	public static void seleccionarRangoMaximoMontoRemmbolsoInternacional(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		new Select(driver.findElement(By.id("idRangoMaximoMontoReembolsoInternacional"))).selectByVisibleText(valor);
		driver.findElement(By.id("idRangoMaximoMontoReembolsoInternacional")).sendKeys(Keys.TAB);
	}

	public static void ingresarEdadMinima(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("edadMinima")).sendKeys(valor);
		driver.findElement(By.id("edadMinima")).sendKeys(Keys.TAB);
	}

	public static void ingresarEdadMaxima(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("edadMaxima")).sendKeys(valor);
		driver.findElement(By.id("edadMaxima")).sendKeys(Keys.TAB);
	}

	public static void ingresarEdadDePermanencia(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("edadMaximaPermanencia")).sendKeys(valor);
		driver.findElement(By.id("edadMaximaPermanencia")).sendKeys(Keys.TAB);
	}

	public static void ingresarMontoLimite(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("idMontoLimitePlan")).sendKeys(valor);
		driver.findElement(By.id("idMontoLimitePlan")).sendKeys(Keys.TAB);
	}

	public static void seleccionarUnidadDeTiempoMontoLimite(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		new Select(driver.findElement(By.id("idUnidadTiempoML"))).selectByVisibleText(valor);
		driver.findElement(By.id("idUnidadTiempoML")).sendKeys(Keys.TAB);
	}

	public static void seleccionarRangoMaximoMontoLimite(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		new Select(driver.findElement(By.id("idRangoMaximoML"))).selectByVisibleText(valor);
		driver.findElement(By.id("idRangoMaximoML")).sendKeys(Keys.TAB);
	}

	public static void seleccionarPaisDeResidencia(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		new Select(driver.findElement(By.id("idPaisesResidencia"))).selectByVisibleText(valor);
		driver.findElement(By.id("idPaisesResidencia")).sendKeys(Keys.TAB);
	}

	public static void ingresarPrimaSugerida(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("primaSugerida")).sendKeys(valor);
		driver.findElement(By.id("primaSugerida")).sendKeys(Keys.TAB);
	}

	public static void seleccionarCanalDeDistribucion(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		new Select(driver.findElement(By.id("canalDistribucion"))).selectByVisibleText(valor);
		driver.findElement(By.id("canalDistribucion")).sendKeys(Keys.TAB);
	}

	public static void seleccionarTipoDeMoneda(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		new Select(driver.findElement(By.id("tipoMoneda"))).selectByVisibleText(valor);
		driver.findElement(By.id("tipoMoneda")).sendKeys(Keys.TAB);
	}

	public static void seleccionarManejoDeImpuestos(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		new Select(driver.findElement(By.id("snManejaImpuesto"))).selectByVisibleText(valor);
		driver.findElement(By.id("snManejaImpuesto")).sendKeys(Keys.TAB);
	}

	public static void ingresarComisionSugerida(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("numComisionSigerida")).sendKeys(valor);
	}

	public static void presionarBotonGuardar() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement elemento = driver.findElement(By.id("btnGuardarMostrar"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", elemento);
	}

	public static void verificarMensajeDeCreacionDeLaPropuesta() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"contenedorExitoso\"]/div/p/label")));
		String mensaje = driver.findElement(By.xpath("//*[@id=\"contenedorExitoso\"]/div/p/label")).getText();
		Assert.assertEquals("La conceptualización y registro se han guardado correctamente.", mensaje);
	}

	public static void verificarMensajeDeCamposObligatorios() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"contenedorErrores\"]/div/p/label")));
		String mensaje = driver.findElement(By.xpath("//*[@id=\"contenedorErrores\"]/div/p/label")).getText();
		Assert.assertEquals("Favor validar los campos del formulario", mensaje);
	}

	public static void ingresarNombreDelProyectoYaExistente(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("nombreProyecto")).sendKeys(valor);
	}

	public static void verificarMensajeDePropuestaYaExistente() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"contenedorErrores\"]/div/p/label")));
		String mensaje = driver.findElement(By.xpath("//*[@id=\"contenedorErrores\"]/div/p/label")).getText();
		Assert.assertEquals("Ya existe un proyecto con el mismo nombre", mensaje);
	}

	public static void presionarBotonCerrar() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		explicitWait.until(ExpectedConditions.elementToBeClickable(By.id("idMensajeExitosoAceptar")));
		WebElement elemento = driver.findElement(By.id("idMensajeExitosoAceptar"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", elemento);
	}

	public static void verificarMensajeDeEdadDePermanencia() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"contenedorErrores\"]/div/p/label")));
		String mensaje = driver.findElement(By.xpath("//*[@id=\"contenedorErrores\"]/div/p/label")).getText();
		Assert.assertEquals("La edad mínima no puede ser mayor o igual que la edad máxima", mensaje);
	}

	public static void limpiarCamposAModificarEnLaPropuestaDeSalud() {
		new Select(driver.findElement(By.id("idTipoVenta"))).deselectAll();
		driver.findElement(By.id("nombreProyecto")).clear();
		driver.findElement(By.id("nombrePlan")).clear();
		new Select(driver.findElement(By.id("idTipoPlan"))).deselectAll();
		new Select(driver.findElement(By.id("idModalidadPlan"))).deselectAll();
		driver.findElement(By.id("conceptualizacion")).clear();
	}

	public static void limpiarCamposAModificarEnLaPropuestaDeSaludParaElUsuarioTecnico() {
		driver.findElement(By.id("nombrePlan")).clear();
		new Select(driver.findElement(By.id("idTipoPlan"))).deselectAll();
		new Select(driver.findElement(By.id("idModalidadPlan"))).deselectAll();
	}

	public static void verificarInformaciónDeLosCamposModificadosEnLaPropuestaDeSalud() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Assert.assertEquals(tipoDeVenta,
				new Select(driver.findElement(By.id("idTipoVenta"))).getFirstSelectedOption().getText());
		Assert.assertEquals(nombreDelProyecto, driver.findElement(By.id("nombreProyecto")).getAttribute("value"));
		Assert.assertEquals(nombreDelPlan, driver.findElement(By.id("nombrePlan")).getAttribute("value"));
		Assert.assertEquals(compañia,
				new Select(driver.findElement(By.id("idCompania"))).getFirstSelectedOption().getText());
		Assert.assertEquals(ramo, new Select(driver.findElement(By.id("idRamo"))).getFirstSelectedOption().getText());
		Assert.assertEquals(subRamo,
				new Select(driver.findElement(By.id("idSubRamo"))).getFirstSelectedOption().getText());
		Assert.assertEquals(tipoPlan,
				new Select(driver.findElement(By.id("idTipoPlan"))).getFirstSelectedOption().getText());
		Assert.assertEquals(modalidad,
				new Select(driver.findElement(By.id("idModalidadPlan"))).getFirstSelectedOption().getText());
		Assert.assertEquals(conceptualizacion, driver.findElement(By.name("conceptualizacion")).getText());
	}

	public static void verificarMensajeDeConfirmacionParaLaModificacionDeLaPropuesta() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		explicitWait.until(ExpectedConditions.elementToBeClickable(By.id("idMensajeAdvertenciaConfirmacionGuardar")));
		boolean mensajeDeConfirmacionEsVisible = false;
		if (driver.getPageSource().contains("¿Está seguro que desea guardar cambios?")) {
			mensajeDeConfirmacionEsVisible = true;
		} else {
			mensajeDeConfirmacionEsVisible = false;
		}
		Assert.assertEquals(true, mensajeDeConfirmacionEsVisible);
	}

	public static void presionarBotonGuardarCambios() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement elemento = driver.findElement(By.id("idMensajeAdvertenciaConfirmacionGuardar"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", elemento);
	}

	public static void verificarSiElBotonGuardarEsVisible() {
		boolean botonGuardarEsVisible = false;
		try {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			if (driver.findElement(By.id("btnGuardarMostrar")).isDisplayed()) {
				botonGuardarEsVisible = true;
			}
		} catch (Exception e) {
			botonGuardarEsVisible = false;
		}
		Assert.assertEquals(false, botonGuardarEsVisible);
	}

	public static void reiniciarVariablesGlobales() {
		codigoDelProyecto = null;
		tipoDeVenta = null;
		nombreDelProyecto = null;
		nombreDelPlan = null;
		compañia = null;
		ramo = null;
		subRamo = null;
		tipoPlan = null;
		modalidad = null;
		conceptualizacion = null;
	}

	public static void limpiarCamposObligatoriosDeLaPropuesta() {
		new Select(driver.findElement(By.id("idTipoVenta"))).deselectAll();
		driver.findElement(By.id("nombreProyecto")).clear();
		driver.findElement(By.id("nombrePlan")).clear();
		new Select(driver.findElement(By.id("idCompania"))).selectByVisibleText("Seleccione");
		new Select(driver.findElement(By.id("idRamo"))).selectByVisibleText("Seleccione");
		new Select(driver.findElement(By.id("idSubRamo"))).selectByVisibleText("Seleccione");
		driver.findElement(By.id("conceptualizacion")).clear();
	}

	public static void limpiarCamposDelMontoLimiteEnLaPropuesta() {
		new Select(driver.findElement(By.id("idUnidadTiempoML"))).selectByVisibleText("Seleccione");
	}

	public static void limpiarCampoRangoMaximoRemmbolsoLocal() {
		new Select(driver.findElement(By.id("idRangoMaximoMontoReembolsoLocal"))).selectByVisibleText("Seleccione");
	}

	public static void limpiarCampoNombreDelProyecto() {
		driver.findElement(By.id("nombreProyecto")).clear();
	}

	public static void limpiarCamposDeElegibilidadYPermanencia() {
		driver.findElement(By.id("edadMinima")).clear();
		driver.findElement(By.id("edadMaxima")).clear();
		driver.findElement(By.id("edadMaximaPermanencia")).clear();
	}

	public static void verificarMensajeDeNoHaSeleccionadoRangoMaximoEnLaPropuesta() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String mensaje = driver.findElement(By.xpath("//*[@id=\"contenedorErrores\"]/div/p/label")).getText();
		Assert.assertEquals("No ha seleccionado un rango máximo del monto en el reembolso Local", mensaje);
	}

	public static void cerrarNotificacionDeLaModalidad() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement elemento = driver.findElement(By.linkText("Cerrar"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", elemento);
	}

	public static void presionarBotonNotificarAlAreaTecnica() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		explicitWait.until(ExpectedConditions.elementToBeClickable(By.id("btnNotificar")));
		WebElement elemento = driver.findElement(By.id("btnNotificar"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", elemento);
	}
	
	public static void verificarMensajeDePropuestaNotificadaAlAreaTecnica() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"contenedorExitoso\"]/div/p/label")));
		String mensaje = driver.findElement(By.xpath("//*[@id=\"contenedorExitoso\"]/div/p/label")).getText();
		Assert.assertEquals("La notificación ha sido enviada con éxito", mensaje);
	}

	public static void verificarSiElBotonNotificarAlAreaTecnicaEsVisible() {
		boolean botonNotificarEsVisible = false;
		try {
			Thread.sleep(2000);
			if (driver.findElement(By.id("btnNotificar")).isDisplayed()) {
				botonNotificarEsVisible = true;
			}
		} catch (Exception e) {
			botonNotificarEsVisible = false;
		}
		Assert.assertEquals(false, botonNotificarEsVisible);
	}
	
	public static void verificarSiElBotonNotificarAlAreaDeProductosEsVisible() {
		boolean botonNotificarEsVisible = false;
		try {
			Thread.sleep(2000);
			if (driver.findElement(By.id("btnNotificarAreaProducto")).isDisplayed()) {
				botonNotificarEsVisible = true;
			}
		} catch (Exception e) {
			botonNotificarEsVisible = false;
		}
		Assert.assertEquals(false, botonNotificarEsVisible);
	}

	public static void presionarBotonNotificarAlAreaDeProductos() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		explicitWait.until(ExpectedConditions.elementToBeClickable(By.id("btnNotificarAreaProducto")));
		WebElement elemento = driver.findElement(By.id("btnNotificarAreaProducto"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", elemento);
	}

	public static void verificarEstadoDeLaPropuesta(String estado) {
		Assert.assertEquals(estado,
				new Select(driver.findElement(By.id("estadoPropuesta"))).getFirstSelectedOption().getText());
	}

	public static void seleccionarEstado(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		new Select(driver.findElement(By.id("estadoPropuesta"))).selectByVisibleText(valor);
	}

	public static void verificarMensajeDeAprobacionDeLaPropuesta() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"contenedorExitoso\"]/div/p/label")));
		String mensaje = driver.findElement(By.xpath("//*[@id=\"contenedorExitoso\"]/div/p/label")).getText();
		Assert.assertEquals("Se envió la notificación a las áreas encargadas por el cambio de estado a Pre-Aprobado.", mensaje);
	}

}
