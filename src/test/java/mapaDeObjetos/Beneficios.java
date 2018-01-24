package mapaDeObjetos;

import static mapaDeObjetos.Login.driver;
import static mapaDeObjetos.Global.explicitWait;

import java.text.DecimalFormat;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class Beneficios {

	// variables para verificar la creación del beneficio
	private static String beneficio = null, tipoDeBeneficio = null, monto = null, frecuencia = null,
			unidadDeTiempoFrecuenciaDeUso = null, porcentajeDeCoaseguroLocal = null,
			porcentajeDeCoaseguroInternacional = null;

	// variables para el control de los beneficios que se estan adicionando
	private static String categoria = null, grupo = null, servicio = null, tipoCobertura = null, cobertura = null;
	
	

	// variable para contener la matriz del cuadro de beneficios
	private static String[][] matrizCuadroDeBeneficiosInicial, matrizCuadroDeBeneficiosCopiado;

	public static void presionarBotonAgregarCategoria() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement elemento = driver
				.findElement(By.xpath("//*[@id=\"formEstructuraBeneficios\"]/div[1]/div[2]/a/span"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", elemento);
	}

	public static void seleccionarNombreDelBeneficio(String valor, String valor2) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		new Select(driver.findElement(By.id("service"))).selectByVisibleText(valor);
		beneficio = valor;
		tipoDeBeneficio = valor2;
		almacenarElBeneficioAdicionado();
	}

	public static void seleccionarNombreDeLaCobertura(String valor, String valor2) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String[] partes = valor.split("-");
		String parte1 = partes[0]; // Código
		String parte2 = partes[1]; // Descripción
		driver.findElement(By.id("autocompletarNombreCobertura")).sendKeys(parte1);
		explicitWait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.autocomplete-suggestion")));
		driver.findElement(By.cssSelector("div.autocomplete-suggestion")).click();
		beneficio = parte2;
		tipoDeBeneficio = valor2;
		almacenarElBeneficioAdicionado();
	}

	private static void almacenarElBeneficioAdicionado() {
		if (tipoDeBeneficio == "Categoría") {
			categoria = beneficio;
		} else if (tipoDeBeneficio == "Grupo Cobertura") {
			grupo = beneficio;
		} else if (tipoDeBeneficio == "Servicio") {
			servicio = beneficio;
		} else if (tipoDeBeneficio == "Tipo Cobertura") {
			tipoCobertura = beneficio;
		} else if (tipoDeBeneficio == "Cobertura") {
			cobertura = beneficio;
		}
	}

	public static void presionarBotonAñadir(String valor) {
		if (valor == "Grupo") {
			añadirGrupoDeCobertura();
		} else if (valor == "Servicio") {
			añadirServicio();
		} else if (valor == "Tipo de cobertura") {
			añadirTipoDeCobertura();
		} else if (valor == "Cobertura") {
			añadirCobertura();
		}
	}

	private static void añadirGrupoDeCobertura() {
		int posicionDeLaCategoria = ubicarLaPosicionDeLaCategoria();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if (posicionDeLaCategoria == 1) {
			WebElement elemento = driver.findElement(By.cssSelector("span.icon-fa-table.fa.fa-plus"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", elemento);
		} else {
			WebElement elemento = driver
					.findElement(By.xpath("//*[@id=\"formEstructuraBeneficios\"]/div[2]/div/div/table/tbody/tr["
							+ posicionDeLaCategoria + "]/td[8]/div/a[3]/span"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", elemento);
		}
	}

	private static void añadirServicio() {
		int posicionDeLaCategoria = ubicarLaPosicionDeLaCategoria();
		int posicionDelGrupo = ubicarLaPosicionDelGrupo(posicionDeLaCategoria);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if (posicionDelGrupo == 1) {
			WebElement elemento = driver.findElement(By.cssSelector("span.icon-fa-table.fa.fa-plus"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", elemento);
		} else {
			WebElement elemento = driver
					.findElement(By.xpath("//*[@id=\"formEstructuraBeneficios\"]/div[2]/div/div/table/tbody/tr["
							+ posicionDelGrupo + "]/td[8]/div/a[3]/span"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", elemento);
		}
	}

	private static void añadirTipoDeCobertura() {
		int posicionDeLaCategoria = ubicarLaPosicionDeLaCategoria();
		int posicionDelGrupo = ubicarLaPosicionDelGrupo(posicionDeLaCategoria);
		int posicionDelServicio = ubicarLaPosicionDelServicio(posicionDelGrupo);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if (posicionDelServicio == 1) {
			WebElement elemento = driver.findElement(By.cssSelector("span.icon-fa-table.fa.fa-plus"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", elemento);
		} else {
			WebElement elemento = driver
					.findElement(By.xpath("//*[@id=\"formEstructuraBeneficios\"]/div[2]/div/div/table/tbody/tr["
							+ posicionDelServicio + "]/td[8]/div/a[3]/span"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", elemento);
		}
	}

	private static void añadirCobertura() {
		int posicionDeLaCategoria = ubicarLaPosicionDeLaCategoria();
		int posicionDelGrupo = ubicarLaPosicionDelGrupo(posicionDeLaCategoria);
		int posicionDelServicio = ubicarLaPosicionDelServicio(posicionDelGrupo);
		int posicionDelTipoDeCobertura = ubicarLaPosicionDelTipoDeCobertura(posicionDelServicio);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if (posicionDelTipoDeCobertura == 1) {
			WebElement elemento = driver.findElement(By.cssSelector("span.icon-fa-table.fa.fa-plus"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", elemento);
		} else {
			WebElement elemento = driver
					.findElement(By.xpath("//*[@id=\"formEstructuraBeneficios\"]/div[2]/div/div/table/tbody/tr["
							+ posicionDelTipoDeCobertura + "]/td[8]/div/a[3]/span"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", elemento);
		}
	}

	private static int ubicarLaPosicionDeLaCategoria() {
		WebElement tablaCuadroDeBeneficios = driver
				.findElement(By.xpath("//*[@id=\"formEstructuraBeneficios\"]/div[2]/div/div/table"));
		List<WebElement> coleccionDeFilas = tablaCuadroDeBeneficios
				.findElements(By.xpath("//*[@id=\"formEstructuraBeneficios\"]/div[2]/div/div/table/tbody/tr"));
		System.out.println("Número de filas en esta tabla = " + coleccionDeFilas.size());
		List<WebElement> coleccionDeColumnas = tablaCuadroDeBeneficios
				.findElements(By.xpath("//*[@id=\"formEstructuraBeneficios\"]/div[2]/div/div/table/tbody/tr[1]/td"));
		System.out.println("Número de columnas = " + coleccionDeColumnas.size());
		int posicionDeLaCategoria = 0;
		for (int fila = 1; fila <= coleccionDeFilas.size(); fila++) {
			for (int columna = 1; columna <= 1; columna++) {
				String valorDeLaCelda = driver
						.findElement(By.xpath("//*[@id=\"formEstructuraBeneficios\"]/div[2]/div/div/table/tbody/tr["
								+ fila + "]/td[" + columna + "]"))
						.getText();
				System.out.println("fila # " + fila + ", columna # " + columna + " texto = " + valorDeLaCelda);
				valorDeLaCelda = valorDeLaCelda.trim();
				if (categoria.equals(valorDeLaCelda)) {
					posicionDeLaCategoria = fila;
					fila = coleccionDeFilas.size();
				}
			}
		}
		return posicionDeLaCategoria;
	}

	private static int ubicarLaPosicionDelGrupo(int posicionDeLaCategoria) {
		WebElement tablaCuadroDeBeneficios = driver
				.findElement(By.xpath("//*[@id=\"formEstructuraBeneficios\"]/div[2]/div/div/table"));
		List<WebElement> coleccionDeFilas = tablaCuadroDeBeneficios
				.findElements(By.xpath("//*[@id=\"formEstructuraBeneficios\"]/div[2]/div/div/table/tbody/tr"));
		System.out.println("Número de filas en esta tabla = " + coleccionDeFilas.size());
		List<WebElement> coleccionDeColumnas = tablaCuadroDeBeneficios
				.findElements(By.xpath("//*[@id=\"formEstructuraBeneficios\"]/div[2]/div/div/table/tbody/tr[1]/td"));
		System.out.println("Número de columnas = " + coleccionDeColumnas.size());
		int posicionDelGrupo = 0;
		for (int fila = posicionDeLaCategoria; fila <= coleccionDeFilas.size(); fila++) {
			for (int columna = 1; columna <= 1; columna++) {
				String valorDeLaCelda = driver
						.findElement(By.xpath("//*[@id=\"formEstructuraBeneficios\"]/div[2]/div/div/table/tbody/tr["
								+ fila + "]/td[" + columna + "]"))
						.getText();
				System.out.println("fila # " + fila + ", columna # " + columna + " texto = " + valorDeLaCelda);
				valorDeLaCelda = valorDeLaCelda.trim();
				if (grupo.equals(valorDeLaCelda)) {
					posicionDelGrupo = fila;
					fila = coleccionDeFilas.size();
				}
			}
		}
		return posicionDelGrupo;
	}

	private static int ubicarLaPosicionDelServicio(int posicionDelGrupo) {
		WebElement tablaCuadroDeBeneficios = driver
				.findElement(By.xpath("//*[@id=\"formEstructuraBeneficios\"]/div[2]/div/div/table"));
		List<WebElement> coleccionDeFilas = tablaCuadroDeBeneficios
				.findElements(By.xpath("//*[@id=\"formEstructuraBeneficios\"]/div[2]/div/div/table/tbody/tr"));
		System.out.println("Número de filas en esta tabla = " + coleccionDeFilas.size());
		List<WebElement> coleccionDeColumnas = tablaCuadroDeBeneficios
				.findElements(By.xpath("//*[@id=\"formEstructuraBeneficios\"]/div[2]/div/div/table/tbody/tr[1]/td"));
		System.out.println("Número de columnas = " + coleccionDeColumnas.size());
		int posicionDelServicio = 0;
		for (int fila = posicionDelGrupo; fila <= coleccionDeFilas.size(); fila++) {
			for (int columna = 1; columna <= 1; columna++) {
				String valorDeLaCelda = driver
						.findElement(By.xpath("//*[@id=\"formEstructuraBeneficios\"]/div[2]/div/div/table/tbody/tr["
								+ fila + "]/td[" + columna + "]"))
						.getText();
				System.out.println("fila # " + fila + ", columna # " + columna + " texto = " + valorDeLaCelda);
				valorDeLaCelda = valorDeLaCelda.trim();
				if (servicio.equals(valorDeLaCelda)) {
					posicionDelServicio = fila;
					fila = coleccionDeFilas.size();
				}
			}
		}
		return posicionDelServicio;
	}

	private static int ubicarLaPosicionDelTipoDeCobertura(int posicionDelServicio) {
		WebElement tablaCuadroDeBeneficios = driver
				.findElement(By.xpath("//*[@id=\"formEstructuraBeneficios\"]/div[2]/div/div/table"));
		List<WebElement> coleccionDeFilas = tablaCuadroDeBeneficios
				.findElements(By.xpath("//*[@id=\"formEstructuraBeneficios\"]/div[2]/div/div/table/tbody/tr"));
		System.out.println("Número de filas en esta tabla = " + coleccionDeFilas.size());
		List<WebElement> coleccionDeColumnas = tablaCuadroDeBeneficios
				.findElements(By.xpath("//*[@id=\"formEstructuraBeneficios\"]/div[2]/div/div/table/tbody/tr[1]/td"));
		System.out.println("Número de columnas = " + coleccionDeColumnas.size());
		int posicionDelTipoDeCobertura = 0;
		for (int fila = posicionDelServicio; fila <= coleccionDeFilas.size(); fila++) {
			for (int columna = 1; columna <= 1; columna++) {
				String valorDeLaCelda = driver
						.findElement(By.xpath("//*[@id=\"formEstructuraBeneficios\"]/div[2]/div/div/table/tbody/tr["
								+ fila + "]/td[" + columna + "]"))
						.getText();
				System.out.println("fila # " + fila + ", columna # " + columna + " texto = " + valorDeLaCelda);
				valorDeLaCelda = valorDeLaCelda.trim();
				if (tipoCobertura.equals(valorDeLaCelda)) {
					posicionDelTipoDeCobertura = fila;
					fila = coleccionDeFilas.size();
				}
			}
		}
		return posicionDelTipoDeCobertura;
	}

	public static void ingresarMontoLimite(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("montoLimite")).sendKeys(valor);
		driver.findElement(By.id("montoLimite")).sendKeys(Keys.TAB);
		monto = valor; // se asigna el valor para verificarlo en la creación del
						// beneficio
	}

	public static void seleccionarUnidadDeTiempoMontoBeneficio(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		new Select(driver.findElement(By.id("unidadDeTiempoMonto"))).selectByVisibleText(valor);
		driver.findElement(By.id("unidadDeTiempoMonto")).sendKeys(Keys.TAB);
	}

	public static void presionarBotonGuardar() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement elemento = driver.findElement(By.id("botonForm"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", elemento);
	}

	public static void rangoMaximoMontoBeneficio(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		new Select(driver.findElement(By.id("rangoMaximoMonto"))).selectByVisibleText(valor);
		driver.findElement(By.id("rangoMaximoMonto")).sendKeys(Keys.TAB);
	}

	public static void ingresarPorcentajeDeCoaseguroLocal(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("porcentajeCoaseguro")).sendKeys(valor);
		driver.findElement(By.id("porcentajeCoaseguro")).sendKeys(Keys.TAB);
		porcentajeDeCoaseguroLocal = valor; // se asigna el valor para
											// verificarlo en la creación del
											// beneficio
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

	public static void seleccionarRangoMaximoCoaseguroLocal(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		new Select(driver.findElement(By.id("rangoCoaseguroLocal"))).selectByVisibleText(valor);
		driver.findElement(By.id("rangoCoaseguroLocal")).sendKeys(Keys.TAB);
	}

	public static void ingresarPorcentajeDefinitivoCoaseguroLocal(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("porcentajeDefinitivo")).sendKeys(valor);
		driver.findElement(By.id("porcentajeDefinitivo")).sendKeys(Keys.TAB);
	}

	public static void ingresarPorcentajeDeCoaseguroInternacional(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("porcentajeCoaseguroInt")).sendKeys(valor);
		driver.findElement(By.id("porcentajeCoaseguroInt")).sendKeys(Keys.TAB);
		porcentajeDeCoaseguroInternacional = valor; // se asigna el valor para
													// verificarlo en la
													// creación del beneficio
	}

	public static void ingresarMontoDeCoaseguroInternacional(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("montoCoaseguroInt")).sendKeys(valor);
		driver.findElement(By.id("montoCoaseguroInt")).sendKeys(Keys.TAB);
	}

	public static void seleccionarUnidadDeTiempoCoaseguroInternacional(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		new Select(driver.findElement(By.id("unidadTiempoCoaseguroInt"))).selectByVisibleText(valor);
		driver.findElement(By.id("unidadTiempoCoaseguroInt")).sendKeys(Keys.TAB);
	}

	public static void seleccionarRangoMaximoCoaseguroInternacional(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		new Select(driver.findElement(By.id("rangoCoaseguroInt"))).selectByVisibleText(valor);
		driver.findElement(By.id("rangoCoaseguroInt")).sendKeys(Keys.TAB);
	}

	public static void ingresarPorcentajeDefinitivoCoaseguroInternacional(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("porcentajeDefinitivoInt")).sendKeys(valor);
		driver.findElement(By.id("porcentajeDefinitivoInt")).sendKeys(Keys.TAB);
	}

	public static void seleccionarTipoDeReembolsoLocal(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		new Select(driver.findElement(By.id("idTipoReembolsoLocal"))).selectByVisibleText(valor);
		driver.findElement(By.id("idTipoReembolsoLocal")).sendKeys(Keys.TAB);
	}

	public static void ingresarPorcentajeDeReembolsoLocal(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("idPorcentajeReembolsoLocal")).sendKeys(valor);
		driver.findElement(By.id("idPorcentajeReembolsoLocal")).sendKeys(Keys.TAB);
	}

	public static void ingresarFrecuenciaDeReembolsoLocal(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("idFrecuenciaReembolsoLocal")).sendKeys(valor);
		driver.findElement(By.id("idFrecuenciaReembolsoLocal")).sendKeys(Keys.TAB);
	}

	public static void seleccionarUnidadDeTiempoDeReembolsoLocal(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		new Select(driver.findElement(By.id("idUnidadTiempoFrecuenciaReembolsoLocal"))).selectByVisibleText(valor);
		driver.findElement(By.id("idUnidadTiempoFrecuenciaReembolsoLocal")).sendKeys(Keys.TAB);
	}

	public static void seleccionarRangoMaximoDelReembolsoLocal(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		new Select(driver.findElement(By.id("idRangoMaximoFrecuenciaReembolsoLocal"))).selectByVisibleText(valor);
		driver.findElement(By.id("idRangoMaximoFrecuenciaReembolsoLocal")).sendKeys(Keys.TAB);
	}

	public static void ingresarMontoDeReembolsoLocal(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("idMontoReembolsoLocal")).sendKeys(valor);
		driver.findElement(By.id("idMontoReembolsoLocal")).sendKeys(Keys.TAB);
	}

	public static void seleccionarUnidadDeTiempoDeMontoReembolsoLocal(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		new Select(driver.findElement(By.id("idUnidadTiempoMontoReembolsoLocal"))).selectByVisibleText(valor);
		driver.findElement(By.id("idUnidadTiempoMontoReembolsoLocal")).sendKeys(Keys.TAB);
	}

	public static void seleccionarRangoMaximoDelMontoReembolsoLocal(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		new Select(driver.findElement(By.id("idRangoMaximoMontoReembolsoLocal"))).selectByVisibleText(valor);
		driver.findElement(By.id("idRangoMaximoMontoReembolsoLocal")).sendKeys(Keys.TAB);
	}

	public static void seleccionarTipoDeReembolsoInternacional(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		new Select(driver.findElement(By.id("idTipoReembolsoInternacional"))).selectByVisibleText(valor);
		driver.findElement(By.id("idTipoReembolsoInternacional")).sendKeys(Keys.TAB);
	}

	public static void ingresarPorcentajeDeReembolsoInternacional(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("idPorcentajeReembolsoInternacional")).sendKeys(valor);
		driver.findElement(By.id("idPorcentajeReembolsoInternacional")).sendKeys(Keys.TAB);
	}

	public static void ingresarFrecuenciaDeReembolsoInternacional(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("idFrecuenciaReembolsoInternacional")).sendKeys(valor);
		driver.findElement(By.id("idFrecuenciaReembolsoInternacional")).sendKeys(Keys.TAB);
	}

	public static void seleccionarUnidadDeTiempoDeReembolsoInternacional(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		new Select(driver.findElement(By.id("idUnidadTiempoFrecuenciaReembolsoInternacional")))
				.selectByVisibleText(valor);
		driver.findElement(By.id("idUnidadTiempoFrecuenciaReembolsoInternacional")).sendKeys(Keys.TAB);
	}

	public static void seleccionarRangoMaximoDelReembolsoInternacional(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		new Select(driver.findElement(By.id("idRangoMaximoFrecuenciaReembolsoInternacional")))
				.selectByVisibleText(valor);
		driver.findElement(By.id("idRangoMaximoFrecuenciaReembolsoInternacional")).sendKeys(Keys.TAB);
	}

	public static void ingresarMontoDeReembolsoInternacional(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("idMontoReembolsoInternacional")).sendKeys(valor);
		driver.findElement(By.id("idMontoReembolsoInternacional")).sendKeys(Keys.TAB);
	}

	public static void seleccionarUnidadDeTiempoDeMontoReembolsoInternacional(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		new Select(driver.findElement(By.id("idUnidadTiempoMontoReembolsoInternacional"))).selectByVisibleText(valor);
		driver.findElement(By.id("idUnidadTiempoMontoReembolsoInternacional")).sendKeys(Keys.TAB);
	}

	public static void seleccionarRangoMaximoDelMontoReembolsoInternacional(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		new Select(driver.findElement(By.id("idRangoMaximoMontoReembolsoInternacional"))).selectByVisibleText(valor);
		driver.findElement(By.id("idRangoMaximoMontoReembolsoInternacional")).sendKeys(Keys.TAB);
	}

	public static void seleccionarTipoDeCopago(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		new Select(driver.findElement(By.id("tipoCopago"))).selectByVisibleText(valor);
		driver.findElement(By.id("tipoCopago")).sendKeys(Keys.TAB);
	}

	public static void ingresarCopago(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("copago")).sendKeys(valor);
		driver.findElement(By.id("copago")).sendKeys(Keys.TAB);
	}

	public static void ingresarTiempoDeEspera(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("tiempoEspera")).sendKeys(valor);
		driver.findElement(By.id("tiempoEspera")).sendKeys(Keys.TAB);
	}

	public static void seleccionarUnidadDeTiempoDeEspera(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		new Select(driver.findElement(By.id("unidadTiempoEspera"))).selectByVisibleText(valor);
		driver.findElement(By.id("unidadTiempoEspera")).sendKeys(Keys.TAB);
	}

	public static void ingresarFrecuenciaDeUso(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("frecuenciaUso")).sendKeys(valor);
		driver.findElement(By.id("frecuenciaUso")).sendKeys(Keys.TAB);
		frecuencia = valor; // se asigna el valor para verificarlo en la
							// creación del beneficio
	}

	public static void seleccionarUnidadDeTiempoFrecuenciaDeUso(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		new Select(driver.findElement(By.id("unidadTiempoFrecuencia"))).selectByVisibleText(valor);
		driver.findElement(By.id("unidadTiempoFrecuencia")).sendKeys(Keys.TAB);
		unidadDeTiempoFrecuenciaDeUso = valor; // se asigna el valor para
												// verificarlo en la creación
												// del beneficio
	}

	public static void ingresarEdadMinimaElegibilidad(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("edadMinima")).sendKeys(valor);
		driver.findElement(By.id("edadMinima")).sendKeys(Keys.TAB);
	}

	public static void ingresarEdadMaximaElegibilidad(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("edadMaxima")).sendKeys(valor);
		driver.findElement(By.id("edadMaxima")).sendKeys(Keys.TAB);
	}

	public static void seleccionarTipoDeAfiliado(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		new Select(driver.findElement(By.id("tipoAfiliado"))).selectByVisibleText(valor);
		driver.findElement(By.id("tipoAfiliado")).sendKeys(Keys.TAB);
	}

	public static void seleccionarParentesco(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		new Select(driver.findElement(By.id("parentescos"))).selectByVisibleText(valor);
		driver.findElement(By.id("parentescos")).sendKeys(Keys.TAB);
	}

	public static void seleccionarGenero(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		new Select(driver.findElement(By.id("configuracion.genero"))).selectByVisibleText(valor);
		driver.findElement(By.id("configuracion.genero")).sendKeys(Keys.TAB);
	}

	public static void seleccionarEstadoCivil(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		new Select(driver.findElement(By.id("configuracion.estadoCivil"))).selectByVisibleText(valor);
		driver.findElement(By.id("configuracion.estadoCivil")).sendKeys(Keys.TAB);
	}

	public static void seleccionarTipoDeReclamante(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		new Select(driver.findElement(By.id("idTipoReclamante"))).selectByVisibleText(valor);
		driver.findElement(By.id("idTipoReclamante")).sendKeys(Keys.TAB);
	}

	public static void verificarMensajeDeMontoLimiteSuperior() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		explicitWait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"contenedorErrores\"]/div/p/label")));
		String mensaje = driver.findElement(By.xpath("//*[@id=\"contenedorErrores\"]/div/p/label")).getText();
		Assert.assertEquals("El monto límite configurado supera el valor de su predecesor", mensaje);
	}

	public static void verificarMensajeDeMontoLimiteSuperiorAPartirDeLaConfiguracionDelGrupoDeCobertura() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		explicitWait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"contenedorErrores\"]/div/p/label")));
		String mensaje = driver.findElement(By.xpath("//*[@id=\"contenedorErrores\"]/div/p/label")).getText();
		Assert.assertEquals("El monto limite supera el valor del monto limite padre", mensaje);
	}

	public static void verificarMensajeDeUnidadDeTiempoSuperior() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		explicitWait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"contenedorErrores\"]/div/p/label")));
		String mensaje = driver.findElement(By.xpath("//*[@id=\"contenedorErrores\"]/div/p/label")).getText();
		Assert.assertEquals("La unidad de tiempo seleccionada es mayor o igual a la unidad de tiempo de la propuesta",
				mensaje);
	}

	public static void verificarCreacionDelBeneficio() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Boolean beneficioAgregado = obtenerBeneficioDelCuadroDeBeneficios();
		Assert.assertEquals(true, beneficioAgregado);
	}

	private static Boolean obtenerBeneficioDelCuadroDeBeneficios() {
		WebElement tablaCuadroDeBeneficios = driver
				.findElement(By.xpath("//*[@id=\"formEstructuraBeneficios\"]/div[2]/div/div/table"));
		List<WebElement> coleccionDeFilas = tablaCuadroDeBeneficios
				.findElements(By.xpath("//*[@id=\"formEstructuraBeneficios\"]/div[2]/div/div/table/tbody/tr"));
		System.out.println("Número de filas en esta tabla = " + coleccionDeFilas.size());
		List<WebElement> coleccionDeColumnas = tablaCuadroDeBeneficios
				.findElements(By.xpath("//*[@id=\"formEstructuraBeneficios\"]/div[2]/div/div/table/tbody/tr[1]/td"));
		System.out.println("Número de columnas = " + coleccionDeColumnas.size());
		Boolean nombreEsperado = false, tipoEsperado = false, verificarInformacionDelBeneficio = false;
		for (int fila = 1; fila <= coleccionDeFilas.size(); fila++) {
			for (int columna = 1; columna <= 2; columna++) {
				String valorDeLaCelda = driver
						.findElement(By.xpath("//*[@id=\"formEstructuraBeneficios\"]/div[2]/div/div/table/tbody/tr["
								+ fila + "]/td[" + columna + "]"))
						.getText();
				System.out.println("fila # " + fila + ", columna # " + columna + " texto = " + valorDeLaCelda);
				if (columna == 1) {
					valorDeLaCelda = valorDeLaCelda.trim();
					if (beneficio.equals(valorDeLaCelda)) {
						nombreEsperado = true;
					} else {
						nombreEsperado = false;
					}
				}
				if (columna == 2) {
					valorDeLaCelda = valorDeLaCelda.trim();
					if (tipoDeBeneficio.equals(valorDeLaCelda)) {
						tipoEsperado = true;
					} else {
						tipoEsperado = false;
					}
				}
			}
			if (nombreEsperado == true && tipoEsperado == true) {
				verificarInformacionDelBeneficio = verificarInformacionDelBeneficioEnElCuadroDeBeneficios(fila);
				break;
			}
		}
		if (nombreEsperado == true && tipoEsperado == true && verificarInformacionDelBeneficio == true) {
			return true;
		} else {
			return false;
		}
	}

	private static Boolean verificarInformacionDelBeneficioEnElCuadroDeBeneficios(int numerofila) {
		WebElement tablaCuadroDeBeneficios = driver
				.findElement(By.xpath("//*[@id=\"formEstructuraBeneficios\"]/div[2]/div/div/table"));
		List<WebElement> coleccionDeFilas = tablaCuadroDeBeneficios
				.findElements(By.xpath("//*[@id=\"formEstructuraBeneficios\"]/div[2]/div/div/table/tbody/tr"));
		System.out.println("Número de filas en esta tabla = " + coleccionDeFilas.size());
		List<WebElement> coleccionDeColumnas = tablaCuadroDeBeneficios
				.findElements(By.xpath("//*[@id=\"formEstructuraBeneficios\"]/div[2]/div/div/table/tbody/tr[1]/td"));
		System.out.println("Número de columnas = " + coleccionDeColumnas.size());
		Boolean montoEsperado = false, frecuenciaEsperada = false, unidadDeTiempoEsperada = false,
				coaseguroLocalEsperado = false, coaseguroInternacionalEsperado = false;
		for (int fila = numerofila; fila <= numerofila; fila++) {
			for (int columna = 1; columna <= coleccionDeColumnas.size(); columna++) {
				String valorDeLaCelda = driver
						.findElement(By.xpath("//*[@id=\"formEstructuraBeneficios\"]/div[2]/div/div/table/tbody/tr["
								+ fila + "]/td[" + columna + "]"))
						.getText();
				System.out.println("fila # " + fila + ", columna # " + columna + " texto = " + valorDeLaCelda);
				if (columna == 3) {
					if (monto == "" || monto == null) {
						monto = "$";
						valorDeLaCelda = valorDeLaCelda.trim();
					} else {
						valorDeLaCelda = valorDeLaCelda.trim();
						valorDeLaCelda = desenmascararValorEnPesos(valorDeLaCelda);
					}
					if (monto.equals(valorDeLaCelda)) {
						montoEsperado = true;
					} else {
						montoEsperado = false;
					}
				}
				if (columna == 4) {
					if (frecuencia == "" || frecuencia == null) {
						frecuencia = "";
					}
					valorDeLaCelda = valorDeLaCelda.trim();
					if (frecuencia.equals(valorDeLaCelda)) {
						frecuenciaEsperada = true;
					} else {
						frecuenciaEsperada = false;
					}
				}
				if (columna == 5) {
					if (unidadDeTiempoFrecuenciaDeUso == "" || unidadDeTiempoFrecuenciaDeUso == null) {
						unidadDeTiempoFrecuenciaDeUso = "";
					}
					valorDeLaCelda = valorDeLaCelda.trim();
					if (unidadDeTiempoFrecuenciaDeUso.equals(valorDeLaCelda)) {
						unidadDeTiempoEsperada = true;
					} else {
						unidadDeTiempoEsperada = false;
					}
				}
				if (columna == 6) {
					if (porcentajeDeCoaseguroLocal == "" || porcentajeDeCoaseguroLocal == null) {
						porcentajeDeCoaseguroLocal = "%";
					} else {
						porcentajeDeCoaseguroLocal = enmascararValorEnPorcentaje(porcentajeDeCoaseguroLocal);
					}
					valorDeLaCelda = valorDeLaCelda.trim();
					if (porcentajeDeCoaseguroLocal.equals(valorDeLaCelda)) {
						coaseguroLocalEsperado = true;
					} else {
						coaseguroLocalEsperado = false;
					}
				}
				if (columna == 7) {
					if (porcentajeDeCoaseguroInternacional == "" || porcentajeDeCoaseguroInternacional == null) {
						porcentajeDeCoaseguroInternacional = "%";
					} else {
						porcentajeDeCoaseguroInternacional = enmascararValorEnPorcentaje(
								porcentajeDeCoaseguroInternacional);
					}
					valorDeLaCelda = valorDeLaCelda.trim();
					if (porcentajeDeCoaseguroInternacional.equals(valorDeLaCelda)) {
						coaseguroInternacionalEsperado = true;
					} else {
						coaseguroInternacionalEsperado = false;
					}
				}
			}
		}
		if (montoEsperado == true && frecuenciaEsperada == true && unidadDeTiempoEsperada == true
				&& coaseguroLocalEsperado == true && coaseguroInternacionalEsperado == true) {
			return true;
		} else {
			return false;
		}
	}

	private static String enmascararValorEnPorcentaje(String valor) {
		DecimalFormat formateador = new DecimalFormat("0.00");
		int valorAEntero = Integer.parseInt(valor);
		String valorFormateado = formateador.format(valorAEntero);
		String enmascararValor = valorFormateado + "%";
		enmascararValor = enmascararValor.replace(",", ".");
		return enmascararValor;
	}

	private static String desenmascararValorEnPesos(String valor) {
		String valorDesenmascarado = valor.replace("$", "");
		valorDesenmascarado = valorDesenmascarado.replace(".", "");
		while (valorDesenmascarado.indexOf(",") > -1) {
			valorDesenmascarado = valorDesenmascarado.replace(",", "");
		}
		return valorDesenmascarado;
	}

	private static String enmascararValorEnPorcentajeCobertura(String valor) {
		String enmascararValor = valor + "%";
		return enmascararValor;
	}

	public static void ingresarAlTipoDeCoberturaQueContieneLasCoberturasAsociadas() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement elemento = driver.findElement(By.cssSelector("span.icon-fa-table.fa.fa-th-list"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", elemento);
	}

	public static void verificarCreacionDeLaCobertura() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Boolean beneficioAgregado = obtenerBeneficioDelCuadroDeCoberturas();
		Assert.assertEquals(true, beneficioAgregado);
	}

	private static Boolean obtenerBeneficioDelCuadroDeCoberturas() {
		WebElement tablaCuadroDeBeneficios = driver.findElement(By.xpath("//*[@id=\"tablaVerCoberturas\"]"));
		List<WebElement> coleccionDeFilas = tablaCuadroDeBeneficios
				.findElements(By.xpath("//*[@id=\"tablaVerCoberturas\"]/tbody/tr"));
		System.out.println("Número de filas en esta tabla = " + coleccionDeFilas.size());
		List<WebElement> coleccionDeColumnas = tablaCuadroDeBeneficios
				.findElements(By.xpath("//*[@id=\"tablaVerCoberturas\"]/tbody/tr[1]/td"));
		System.out.println("Número de columnas = " + coleccionDeColumnas.size());
		Boolean nombreEsperado = false, verificarInformacionDelBeneficio = false;
		String beneficioCobertura = grupo + "/" + servicio + "/" + tipoCobertura + "/" + cobertura;
		for (int fila = 1; fila <= coleccionDeFilas.size(); fila++) {
			for (int columna = 1; columna <= 1; columna++) {
				String valorDeLaCelda = driver
						.findElement(
								By.xpath("//*[@id=\"tablaVerCoberturas\"]/tbody/tr[" + fila + "]/td[" + columna + "]"))
						.getText();
				System.out.println("fila # " + fila + ", columna # " + columna + " texto = " + valorDeLaCelda);
				if (columna == 1) {
					valorDeLaCelda = valorDeLaCelda.trim();
					if (beneficioCobertura.equals(valorDeLaCelda)) {
						nombreEsperado = true;
					} else {
						nombreEsperado = false;
					}
				}
			}
			if (nombreEsperado == true) {
				verificarInformacionDelBeneficio = verificarInformacionDeLaCoberturaEnElCuadroDeCoberturas(fila);
				break;
			}
		}
		if (nombreEsperado == true && verificarInformacionDelBeneficio == true) {
			return true;
		} else {
			return false;
		}
	}

	private static Boolean verificarInformacionDeLaCoberturaEnElCuadroDeCoberturas(int numerofila) {
		WebElement tablaCuadroDeBeneficios = driver.findElement(By.xpath("//*[@id=\"tablaVerCoberturas\"]"));
		List<WebElement> coleccionDeFilas = tablaCuadroDeBeneficios
				.findElements(By.xpath("//*[@id=\"tablaVerCoberturas\"]/tbody/tr"));
		System.out.println("Número de filas en esta tabla = " + coleccionDeFilas.size());
		List<WebElement> coleccionDeColumnas = tablaCuadroDeBeneficios
				.findElements(By.xpath("//*[@id=\"tablaVerCoberturas\"]/tbody/tr[1]/td"));
		System.out.println("Número de columnas = " + coleccionDeColumnas.size());
		Boolean montoEsperado = false, frecuenciaEsperada = false, unidadDeTiempoEsperada = false,
				coaseguroLocalEsperado = false, coaseguroInternacionalEsperado = false;
		for (int fila = numerofila; fila <= numerofila; fila++) {
			for (int columna = 1; columna <= coleccionDeColumnas.size(); columna++) {
				String valorDeLaCelda = driver
						.findElement(
								By.xpath("//*[@id=\"tablaVerCoberturas\"]/tbody/tr[" + fila + "]/td[" + columna + "]"))
						.getText();
				System.out.println("fila # " + fila + ", columna # " + columna + " texto = " + valorDeLaCelda);
				if (columna == 2) {
					if (monto == "" || monto == null) {
						monto = "";
						valorDeLaCelda = valorDeLaCelda.trim();
					} else {
						valorDeLaCelda = valorDeLaCelda.trim();
						valorDeLaCelda = desenmascararValorEnPesos(valorDeLaCelda);
					}
					if (monto.equals(valorDeLaCelda)) {
						montoEsperado = true;
					} else {
						montoEsperado = false;
					}
				}
				if (columna == 3) {
					if (frecuencia == "" || frecuencia == null) {
						frecuencia = "-";
					}
					valorDeLaCelda = valorDeLaCelda.trim();
					if (frecuencia.equals(valorDeLaCelda)) {
						frecuenciaEsperada = true;
					} else {
						frecuenciaEsperada = false;
					}
				}
				if (columna == 4) {
					if (unidadDeTiempoFrecuenciaDeUso == "" || unidadDeTiempoFrecuenciaDeUso == null) {
						unidadDeTiempoFrecuenciaDeUso = "-";
					}
					valorDeLaCelda = valorDeLaCelda.trim();
					if (unidadDeTiempoFrecuenciaDeUso.equals(valorDeLaCelda)) {
						unidadDeTiempoEsperada = true;
					} else {
						unidadDeTiempoEsperada = false;
					}
				}
				if (columna == 5) {
					if (porcentajeDeCoaseguroLocal == "" || porcentajeDeCoaseguroLocal == null) {
						porcentajeDeCoaseguroLocal = "";
					} else {
						porcentajeDeCoaseguroLocal = enmascararValorEnPorcentajeCobertura(porcentajeDeCoaseguroLocal);
					}
					valorDeLaCelda = valorDeLaCelda.trim();
					if (porcentajeDeCoaseguroLocal.equals(valorDeLaCelda)) {
						coaseguroLocalEsperado = true;
					} else {
						coaseguroLocalEsperado = false;
					}
				}
				if (columna == 6) {
					if (porcentajeDeCoaseguroInternacional == "" || porcentajeDeCoaseguroInternacional == null) {
						porcentajeDeCoaseguroInternacional = "";
					} else {
						porcentajeDeCoaseguroInternacional = enmascararValorEnPorcentajeCobertura(
								porcentajeDeCoaseguroInternacional);
					}
					valorDeLaCelda = valorDeLaCelda.trim();
					if (porcentajeDeCoaseguroInternacional.equals(valorDeLaCelda)) {
						coaseguroInternacionalEsperado = true;
					} else {
						coaseguroInternacionalEsperado = false;
					}
				}
			}
		}
		if (montoEsperado == true && frecuenciaEsperada == true && unidadDeTiempoEsperada == true
				&& coaseguroLocalEsperado == true && coaseguroInternacionalEsperado == true) {
			return true;
		} else {
			return false;
		}
	}

	public static void reiniciarVariablesGlobales() {
		beneficio = null;
		tipoDeBeneficio = null;
		monto = null;
		frecuencia = null;
		unidadDeTiempoFrecuenciaDeUso = null;
		porcentajeDeCoaseguroLocal = null;
		porcentajeDeCoaseguroInternacional = null;
		categoria = null;
		grupo = null;
		servicio = null;
		tipoCobertura = null;
	}

	public static void verificarMensajeDeBeneficioYaExistente() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		explicitWait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"contenedorErrores\"]/div/p/label")));
		String mensaje = driver.findElement(By.xpath("//*[@id=\"contenedorErrores\"]/div/p/label")).getText();
		Assert.assertEquals("Este item ya se encuentra asociado", mensaje);
	}

	public static void verificarMensajeDeCoberturaYaExistente() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		explicitWait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"contenedorErrores\"]/div/p/label")));
		String mensaje = driver.findElement(By.xpath("//*[@id=\"contenedorErrores\"]/div/p/label")).getText();
		Assert.assertEquals(
				"La cobertura no puede ingresarse bajo el tipo de cobertura seleccionado porque ya existe para ese tipo de cobertura",
				mensaje);
	}

	public static void presionarBotonEditar(String valor) {
		if (valor == "Categoría") {
			editarCategoria();
		} else if (valor == "Grupo") {
			editarGrupoDeCobertura();
		} else if (valor == "Servicio") {
			editarServicio();
		} else if (valor == "Tipo de cobertura") {
			editarTipoDeCobertura();
		} else if (valor == "Cobertura") {
			editarCobertura();
		}
	}

	private static void editarCategoria() {
		int posicionDeLaCategoria = ubicarLaPosicionDeLaCategoria();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if (posicionDeLaCategoria == 1) {
			WebElement elemento = driver.findElement(By.cssSelector("span.icon-fa-table.fa.fa-pencil"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", elemento);
		} else {
			WebElement elemento = driver
					.findElement(By.xpath("//*[@id=\"formEstructuraBeneficios\"]/div[2]/div/div/table/tbody/tr["
							+ posicionDeLaCategoria + "]/td[8]/div/a[1]/span"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", elemento);
		}
	}

	private static void editarGrupoDeCobertura() {
		int posicionDeLaCategoria = ubicarLaPosicionDeLaCategoria();
		int posicionDelGrupo = ubicarLaPosicionDelGrupo(posicionDeLaCategoria);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if (posicionDelGrupo == 1) {
			WebElement elemento = driver.findElement(By.cssSelector("span.icon-fa-table.fa.fa-pencil"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", elemento);
		} else {
			WebElement elemento = driver
					.findElement(By.xpath("//*[@id=\"formEstructuraBeneficios\"]/div[2]/div/div/table/tbody/tr["
							+ posicionDelGrupo + "]/td[8]/div/a[1]/span"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", elemento);
		}
	}

	private static void editarServicio() {
		int posicionDeLaCategoria = ubicarLaPosicionDeLaCategoria();
		int posicionDelGrupo = ubicarLaPosicionDelGrupo(posicionDeLaCategoria);
		int posicionDelServicio = ubicarLaPosicionDelServicio(posicionDelGrupo);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if (posicionDelServicio == 1) {
			WebElement elemento = driver.findElement(By.cssSelector("span.icon-fa-table.fa.fa-pencil"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", elemento);
		} else {
			WebElement elemento = driver
					.findElement(By.xpath("//*[@id=\"formEstructuraBeneficios\"]/div[2]/div/div/table/tbody/tr["
							+ posicionDelServicio + "]/td[8]/div/a[1]/span"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", elemento);
		}
	}

	private static void editarTipoDeCobertura() {
		int posicionDeLaCategoria = ubicarLaPosicionDeLaCategoria();
		int posicionDelGrupo = ubicarLaPosicionDelGrupo(posicionDeLaCategoria);
		int posicionDelServicio = ubicarLaPosicionDelServicio(posicionDelGrupo);
		int posicionDelTipoDeCobertura = ubicarLaPosicionDelTipoDeCobertura(posicionDelServicio);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if (posicionDelTipoDeCobertura == 1) {
			WebElement elemento = driver.findElement(By.cssSelector("span.icon-fa-table.fa.fa-pencil"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", elemento);
		} else {
			WebElement elemento = driver
					.findElement(By.xpath("//*[@id=\"formEstructuraBeneficios\"]/div[2]/div/div/table/tbody/tr["
							+ posicionDelTipoDeCobertura + "]/td[8]/div/a[1]/span"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", elemento);
		}
	}

	private static void editarCobertura() {
		int posicionDeLaCobertura = ubicarLaPosicionDeLaCobertura();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if (posicionDeLaCobertura == 1) {
			WebElement elemento = driver.findElement(By.cssSelector("span.fa.fa-pencil"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", elemento);
		} else {
			WebElement elemento = driver.findElement(By.xpath(
					"//*[@id=\"tablaVerCoberturas\"]/tbody/tr[" + posicionDeLaCobertura + "]/td[7]/div/a[1]/span"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", elemento);
		}
	}

	private static int ubicarLaPosicionDeLaCobertura() {
		WebElement tablaCuadroDeBeneficios = driver.findElement(By.xpath("//*[@id=\"tablaVerCoberturas\"]"));
		List<WebElement> coleccionDeFilas = tablaCuadroDeBeneficios
				.findElements(By.xpath("//*[@id=\"tablaVerCoberturas\"]/tbody/tr"));
		System.out.println("Número de filas en esta tabla = " + coleccionDeFilas.size());
		List<WebElement> coleccionDeColumnas = tablaCuadroDeBeneficios
				.findElements(By.xpath("//*[@id=\"tablaVerCoberturas\"]/tbody/tr[1]/td"));
		System.out.println("Número de columnas = " + coleccionDeColumnas.size());
		String beneficioCobertura = grupo + "/" + servicio + "/" + tipoCobertura + "/" + cobertura;
		int posicionDeLaCobertura = 0;
		for (int fila = 1; fila <= coleccionDeFilas.size(); fila++) {
			for (int columna = 1; columna <= 1; columna++) {
				String valorDeLaCelda = driver
						.findElement(
								By.xpath("//*[@id=\"tablaVerCoberturas\"]/tbody/tr[" + fila + "]/td[" + columna + "]"))
						.getText();
				System.out.println("fila # " + fila + ", columna # " + columna + " texto = " + valorDeLaCelda);
				valorDeLaCelda = valorDeLaCelda.trim();
				if (beneficioCobertura.equals(valorDeLaCelda)) {
					posicionDeLaCobertura = fila;
					fila = coleccionDeFilas.size();
				}
			}
		}
		return posicionDeLaCobertura;
	}

	public static void presionarBotonEliminar(String valor) {
		if (valor == "Categoría") {
			eliminarCategoria();
		} else if (valor == "Grupo") {
			eliminarGrupoDeCobertura();
		} else if (valor == "Servicio") {
			eliminarServicio();
		} else if (valor == "Tipo de cobertura") {
			eliminarTipoDeCobertura();
		} else if (valor == "Cobertura") {
			eliminarCobertura();
		}
	}

	private static void eliminarCategoria() {
		int posicionDeLaCategoria = ubicarLaPosicionDeLaCategoria();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if (posicionDeLaCategoria == 1) {
			WebElement elemento = driver.findElement(By.cssSelector("span.fa.fa-trash-o"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", elemento);
		} else {
			WebElement elemento = driver
					.findElement(By.xpath("//*[@id=\"formEstructuraBeneficios\"]/div[2]/div/div/table/tbody/tr["
							+ posicionDeLaCategoria + "]/td[8]/div/a[4]/span"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", elemento);
		}
	}

	private static void eliminarGrupoDeCobertura() {
		int posicionDeLaCategoria = ubicarLaPosicionDeLaCategoria();
		int posicionDelGrupo = ubicarLaPosicionDelGrupo(posicionDeLaCategoria);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if (posicionDelGrupo == 1) {
			WebElement elemento = driver.findElement(By.cssSelector("span.fa.fa-trash-o"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", elemento);
		} else {
			WebElement elemento = driver
					.findElement(By.xpath("//*[@id=\"formEstructuraBeneficios\"]/div[2]/div/div/table/tbody/tr["
							+ posicionDelGrupo + "]/td[8]/div/a[4]/span"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", elemento);
		}
	}

	private static void eliminarServicio() {
		int posicionDeLaCategoria = ubicarLaPosicionDeLaCategoria();
		int posicionDelGrupo = ubicarLaPosicionDelGrupo(posicionDeLaCategoria);
		int posicionDelServicio = ubicarLaPosicionDelServicio(posicionDelGrupo);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if (posicionDelServicio == 1) {
			WebElement elemento = driver.findElement(By.cssSelector("span.fa.fa-trash-o"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", elemento);
		} else {
			WebElement elemento = driver
					.findElement(By.xpath("//*[@id=\"formEstructuraBeneficios\"]/div[2]/div/div/table/tbody/tr["
							+ posicionDelServicio + "]/td[8]/div/a[4]/span"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", elemento);
		}
	}

	private static void eliminarTipoDeCobertura() {
		int posicionDeLaCategoria = ubicarLaPosicionDeLaCategoria();
		int posicionDelGrupo = ubicarLaPosicionDelGrupo(posicionDeLaCategoria);
		int posicionDelServicio = ubicarLaPosicionDelServicio(posicionDelGrupo);
		int posicionDelTipoDeCobertura = ubicarLaPosicionDelTipoDeCobertura(posicionDelServicio);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if (posicionDelTipoDeCobertura == 1) {
			WebElement elemento = driver.findElement(By.cssSelector("span.fa.fa-trash-o"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", elemento);
		} else {
			WebElement elemento = driver
					.findElement(By.xpath("//*[@id=\"formEstructuraBeneficios\"]/div[2]/div/div/table/tbody/tr["
							+ posicionDelTipoDeCobertura + "]/td[8]/div/a[4]/span"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", elemento);
		}
	}

	private static void eliminarCobertura() {
		int posicionDeLaCobertura = ubicarLaPosicionDeLaCobertura();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		if (posicionDeLaCobertura == 1) {
			WebElement elemento = driver.findElement(By.cssSelector("span.fa.fa-trash-o"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", elemento);
		} else {
			WebElement elemento = driver.findElement(By.xpath(
					"//*[@id=\"tablaVerCoberturas\"]/tbody/tr[" + posicionDeLaCobertura + "]/td[7]/div/a[3]/span"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", elemento);
		}
	}

	public static void verificarMensajeDeConfirmacionParaLaEliminacionDelBeneficio(String beneficio)
			throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		explicitWait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//*[@id=\"contenedorAdvertenciaConfirmacion\"]/div/p/label")));
		String mensaje = driver.findElement(By.xpath("//*[@id=\"contenedorAdvertenciaConfirmacion\"]/div/p/label"))
				.getText();
		if (tipoDeBeneficio == "Categoría") {
			Assert.assertEquals("¿Está seguro de eliminar esta " + beneficio + "?", mensaje);
		} else if (tipoDeBeneficio == "Cobertura") {
			Assert.assertEquals("Está seguro de eliminar esta " + beneficio + " ?", mensaje);
		} else {
			Assert.assertEquals("Está seguro de eliminar este " + beneficio + " ?", mensaje);
		}
	}

	public static void presionarBotonConfirmarEliminacion() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement elemento = driver.findElement(By.id("idMensajeAdvertenciaConfirmacionAceptar"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", elemento);
	}

	public static void verificarMensajeDeEliminacionDelBeneficio(String valor) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		explicitWait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"contenedorExitoso\"]/div/p/label")));
		String mensaje = driver.findElement(By.xpath("//*[@id=\"contenedorExitoso\"]/div/p/label")).getText();
		if (valor == "Categoría") {
			Assert.assertEquals("Se realizó la eliminación del beneficio " + categoria + " exitosamente", mensaje);
		} else if (valor == "Grupo") {
			Assert.assertEquals("Se eliminó el beneficio no capitado " + grupo, mensaje);
		} else if (valor == "Servicio") {
			Assert.assertEquals("Se eliminó el beneficio no capitado " + servicio, mensaje);
		} else if (valor == "Tipo de cobertura") {
			Assert.assertEquals("Se eliminó el beneficio no capitado " + tipoCobertura, mensaje);
		} else if (valor == "Cobertura") {
			Assert.assertEquals("Se eliminó el beneficio no capitado " + cobertura, mensaje);
		}
	}

	public static void presionarBotonCerrar() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement elemento = driver.findElement(By.id("idMensajeExitosoAceptar"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", elemento);
	}

	public static void verificarEliminacionDelBeneficio() {
		boolean beneficioEliminado = ubicarBeneficioEliminado();
		Assert.assertEquals(true, beneficioEliminado);
	}

	private static boolean ubicarBeneficioEliminado() {
		WebElement tablaCuadroDeBeneficios = driver
				.findElement(By.xpath("//*[@id=\"formEstructuraBeneficios\"]/div[2]/div/div/table"));
		List<WebElement> coleccionDeFilas = tablaCuadroDeBeneficios
				.findElements(By.xpath("//*[@id=\"formEstructuraBeneficios\"]/div[2]/div/div/table/tbody/tr"));
		System.out.println("Número de filas en esta tabla = " + coleccionDeFilas.size());
		List<WebElement> coleccionDeColumnas = tablaCuadroDeBeneficios
				.findElements(By.xpath("//*[@id=\"formEstructuraBeneficios\"]/div[2]/div/div/table/tbody/tr[1]/td"));
		System.out.println("Número de columnas = " + coleccionDeColumnas.size());
		boolean beneficioEliminado = true;
		for (int fila = 1; fila < coleccionDeFilas.size(); fila++) {
			for (int columna = 1; columna <= 1; columna++) {
				String valorDeLaCelda = driver
						.findElement(By.xpath("//*[@id=\"formEstructuraBeneficios\"]/div[2]/div/div/table/tbody/tr["
								+ fila + "]/td[" + columna + "]"))
						.getText();
				System.out.println("fila # " + fila + ", columna # " + columna + " texto = " + valorDeLaCelda);
				valorDeLaCelda = valorDeLaCelda.trim();
				if (beneficio.equals(valorDeLaCelda)) {
					beneficioEliminado = false;
					fila = coleccionDeFilas.size();
				}
			}
		}
		return beneficioEliminado;
	}

	public static void verificarEliminacionDeLaCobertura() {
		boolean beneficioEliminado = ubicarCoberturaEliminada();
		Assert.assertEquals(true, beneficioEliminado);
	}

	private static boolean ubicarCoberturaEliminada() {
		WebElement tablaCuadroDeBeneficios = driver.findElement(By.xpath("//*[@id=\"tablaVerCoberturas\"]"));
		List<WebElement> coleccionDeFilas = tablaCuadroDeBeneficios
				.findElements(By.xpath("//*[@id=\"tablaVerCoberturas\"]/tbody/tr"));
		System.out.println("Número de filas en esta tabla = " + coleccionDeFilas.size());
		List<WebElement> coleccionDeColumnas = tablaCuadroDeBeneficios
				.findElements(By.xpath("//*[@id=\"tablaVerCoberturas\"]/tbody/tr[1]/td"));
		System.out.println("Número de columnas = " + coleccionDeColumnas.size());
		String beneficioCobertura = grupo + "/" + servicio + "/" + tipoCobertura + "/" + cobertura;
		boolean beneficioEliminado = true;
		for (int fila = 1; fila <= coleccionDeFilas.size(); fila++) {
			for (int columna = 1; columna <= 1; columna++) {
				String valorDeLaCelda = driver
						.findElement(
								By.xpath("//*[@id=\"tablaVerCoberturas\"]/tbody/tr[" + fila + "]/td[" + columna + "]"))
						.getText();
				System.out.println("fila # " + fila + ", columna # " + columna + " texto = " + valorDeLaCelda);
				valorDeLaCelda = valorDeLaCelda.trim();
				if (beneficioCobertura.equals(valorDeLaCelda)) {
					beneficioEliminado = false;
					fila = coleccionDeFilas.size();
				}
			}
		}
		return beneficioEliminado;
	}

	public static void limpiarCamposAModificarEnElBeneficioDeSalud() {
		new Select(driver.findElement(By.id("unidadDeTiempoMonto"))).selectByVisibleText("Seleccione");
		driver.findElement(By.id("montoLimite")).clear();
		driver.findElement(By.id("porcentajeCoaseguro")).clear();
		driver.findElement(By.id("porcentajeCoaseguroInt")).clear();
		driver.findElement(By.id("frecuenciaUso")).clear();
	}

	public static void verificarSiElBotonAñadirCategoriaEsVisible() {
		boolean botonAñadirCategoriaEsVisible = false;
		try {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			if (driver.findElement(By.xpath("//*[@id=\"formEstructuraBeneficios\"]/div[1]/div[2]/a/span")).isDisplayed()) {
				botonAñadirCategoriaEsVisible = true;
			}
		} catch (Exception e) {
			botonAñadirCategoriaEsVisible = false;
		}
		Assert.assertEquals(false, botonAñadirCategoriaEsVisible);
	}

	public static void verificarSiElBotonAñadirBeneficioEsVisible() {
		boolean botonAñadirBeneficioEsVisible = false;
		try {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			if (driver.findElement(By.cssSelector("span.icon-fa-table.fa.fa-plus")).isDisplayed()) {
				botonAñadirBeneficioEsVisible = true;
			}
		} catch (Exception e) {
			botonAñadirBeneficioEsVisible = false;
		}
		Assert.assertEquals(false, botonAñadirBeneficioEsVisible);
	}

	public static void presionarBotonPrimas() {
		explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"formEstructuraBeneficios\"]/div[1]/div/a[1]/span")));
		WebElement elemento = driver.findElement(By.xpath("//*[@id=\"formEstructuraBeneficios\"]/div[1]/div/a[1]/span"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", elemento);
	}

	public static void presionarBotonAdicionarAnalisisTecnico() {
		explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"formEstructuraBeneficios\"]/div[1]/div[1]/a/span")));
		WebElement elemento = driver.findElement(By.xpath("//*[@id=\"formEstructuraBeneficios\"]/div[1]/div[1]/a/span"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", elemento);
	}

	public static void verificarMensajeDeCreacionDelAnalisisTecnico() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"contenedorExitoso\"]/div/p/label")));
		boolean mensajeDeConfirmacionEsVisible = false;
		if (driver.getPageSource().contains("Se duplicó el paquete de beneficios exitosamente")) {
			mensajeDeConfirmacionEsVisible = true;
		} else {
			mensajeDeConfirmacionEsVisible = false;
		}
		Assert.assertEquals(true, mensajeDeConfirmacionEsVisible);
	}

	public static void almacenarInformacionDelCuadroDeBeneficiosInicial() {
		WebElement tablaCuadroDeBeneficios = driver
				.findElement(By.xpath("//*[@id=\"formEstructuraBeneficios\"]/div[2]/div/div/table"));
		List<WebElement> coleccionDeFilas = tablaCuadroDeBeneficios
				.findElements(By.xpath("//*[@id=\"formEstructuraBeneficios\"]/div[2]/div/div/table/tbody/tr"));
		System.out.println("Número de filas en esta tabla = " + coleccionDeFilas.size());
		List<WebElement> coleccionDeColumnas = tablaCuadroDeBeneficios
				.findElements(By.xpath("//*[@id=\"formEstructuraBeneficios\"]/div[2]/div/div/table/tbody/tr[1]/td"));
		System.out.println("Número de columnas = " + coleccionDeColumnas.size());
		matrizCuadroDeBeneficiosInicial = new String[coleccionDeFilas.size()][9];
		for (int fila = 1; fila <= coleccionDeFilas.size(); fila++) {
			for (int columna = 1; columna <= 9; columna++) {
				String valorDeLaCelda = driver
						.findElement(By.xpath("//*[@id=\"formEstructuraBeneficios\"]/div[2]/div/div/table/tbody/tr["
								+ fila + "]/td[" + columna + "]"))
						.getText();
				System.out.println("fila # " + fila + ", columna # " + columna + " texto = " + valorDeLaCelda);
				valorDeLaCelda = valorDeLaCelda.trim();
				matrizCuadroDeBeneficiosInicial[fila - 1][columna - 1] = valorDeLaCelda;
			}
		}
	}

	public static void almacenarInformacionDelCuadroDeBeneficiosCopiado() {
		WebElement tablaCuadroDeBeneficios = driver
				.findElement(By.xpath("//*[@id=\"formEstructuraBeneficios\"]/div[2]/div/div/table"));
		List<WebElement> coleccionDeFilas = tablaCuadroDeBeneficios
				.findElements(By.xpath("//*[@id=\"formEstructuraBeneficios\"]/div[2]/div/div/table/tbody/tr"));
		System.out.println("Número de filas en esta tabla = " + coleccionDeFilas.size());
		List<WebElement> coleccionDeColumnas = tablaCuadroDeBeneficios
				.findElements(By.xpath("//*[@id=\"formEstructuraBeneficios\"]/div[2]/div/div/table/tbody/tr[1]/td"));
		System.out.println("Número de columnas = " + coleccionDeColumnas.size());
		matrizCuadroDeBeneficiosCopiado = new String[coleccionDeFilas.size()][9];
		for (int fila = 1; fila <= coleccionDeFilas.size(); fila++) {
			for (int columna = 1; columna <= 9; columna++) {
				String valorDeLaCelda = driver
						.findElement(By.xpath("//*[@id=\"formEstructuraBeneficios\"]/div[2]/div/div/table/tbody/tr["
								+ fila + "]/td[" + columna + "]"))
						.getText();
				System.out.println("fila # " + fila + ", columna # " + columna + " texto = " + valorDeLaCelda);
				valorDeLaCelda = valorDeLaCelda.trim();
				matrizCuadroDeBeneficiosCopiado[fila - 1][columna - 1] = valorDeLaCelda;
			}
		}
	}

	public static void compararInformacionEntreElCuadroDeBeneficiosIncialYLaCopia() {
		Boolean informacionEsIgual = false, BeneficioAValidar = false;
		int filaCuadroDeBeneficiosCopiado = 0;
		for (int filaCuadroDeBeneficiosInicial = 0; filaCuadroDeBeneficiosInicial < matrizCuadroDeBeneficiosInicial.length; filaCuadroDeBeneficiosInicial++) {
			System.out.println("--------------- Verificar Copiado del Beneficio #" + filaCuadroDeBeneficiosInicial + " ---------------");
			for (int columna = 0; columna < matrizCuadroDeBeneficiosInicial[filaCuadroDeBeneficiosInicial].length; columna++) {
				if (columna == 0) {
					for (filaCuadroDeBeneficiosCopiado = 0; filaCuadroDeBeneficiosCopiado < matrizCuadroDeBeneficiosCopiado.length; filaCuadroDeBeneficiosCopiado++) {
						if (matrizCuadroDeBeneficiosInicial[filaCuadroDeBeneficiosInicial][columna].equals(matrizCuadroDeBeneficiosCopiado[filaCuadroDeBeneficiosCopiado][0])) {
							BeneficioAValidar = true;
							break;
						} else {
							BeneficioAValidar = false;
						}
					}
				}
				if (BeneficioAValidar == true) {
					System.out.println("matrizIncial["+ filaCuadroDeBeneficiosInicial + "][" + columna + "] = " + matrizCuadroDeBeneficiosInicial[filaCuadroDeBeneficiosInicial][columna]);
					System.out.println("matrizCopiada["+ filaCuadroDeBeneficiosCopiado + "][" + columna + "] = " + matrizCuadroDeBeneficiosCopiado[filaCuadroDeBeneficiosCopiado][columna]);
					if (matrizCuadroDeBeneficiosInicial[filaCuadroDeBeneficiosInicial][columna].equals(matrizCuadroDeBeneficiosCopiado[filaCuadroDeBeneficiosCopiado][columna])) {
				    	informacionEsIgual = true;
					} else {
						informacionEsIgual = false;
						filaCuadroDeBeneficiosInicial = matrizCuadroDeBeneficiosInicial.length;
						columna = matrizCuadroDeBeneficiosInicial[filaCuadroDeBeneficiosInicial].length;
					}
				}
			}
			System.out.println("--------------- Fin del Verificar Copiado del Beneficio #" + filaCuadroDeBeneficiosInicial + "---------------");
		}
		Assert.assertEquals(true, informacionEsIgual);
	}

	public static void verificarSiElBotonAñadirCategoriaEsVisibleEnElNuevoAnalisisTecnico() {
		boolean botonAñadirCategoriaEsVisible = false;
		try {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			if (driver.findElement(By.xpath("//*[@id=\"formEstructuraBeneficios\"]/div[1]/div[3]/a/span")).isDisplayed()) {
				botonAñadirCategoriaEsVisible = true;
			}
		} catch (Exception e) {
			botonAñadirCategoriaEsVisible = false;
		}
		Assert.assertEquals(true, botonAñadirCategoriaEsVisible);
	}
	
	public static void verificarSiElBotonAñadirBeneficioEsVisibleEnElNuevoAnalisisTecnico() {
		boolean botonAñadirBeneficioEsVisible = false;
		try {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			if (driver.findElement(By.cssSelector("span.icon-fa-table.fa.fa-plus")).isDisplayed()) {
				botonAñadirBeneficioEsVisible = true;
			}
		} catch (Exception e) {
			botonAñadirBeneficioEsVisible = false;
		}
		Assert.assertEquals(true, botonAñadirBeneficioEsVisible);
	}

	public static void verificarNombreDelConsecutivoDelAnalisisTecnico() {
		String nombreDelConsecutivo = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div/div[2]/div/div[1]/h3"))
				.getText();
		nombreDelConsecutivo = nombreDelConsecutivo.trim();
		Assert.assertEquals("Propuesta 1 / Análisis Técnico 2", nombreDelConsecutivo);
	}

	public static void presionarBotonPrimasDelNuevoAnalisisTecnico() {
		explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"formEstructuraBeneficios\"]/div[1]/div[2]/a[1]/span")));
		WebElement elemento = driver.findElement(By.xpath("//*[@id=\"formEstructuraBeneficios\"]/div[1]/div[2]/a[1]/span"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", elemento);
	}

	public static void presionarBotonAdicionarPropuesta() {
		explicitWait.until(ExpectedConditions.elementToBeClickable(By.linkText("Adicionar Propuesta")));
		WebElement elemento = driver.findElement(By.linkText("Adicionar Propuesta"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", elemento);
	}

	public static void verificarMensajeDeCreacionDeLaNuevaPropuesta() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"contenedorExitoso\"]/div/p/label")));
		boolean mensajeDeConfirmacionEsVisible = false;
		if (driver.getPageSource().contains("Se ha adicionado una nueva propuesta: Propuesta 2")) {
			mensajeDeConfirmacionEsVisible = true;
		} else {
			mensajeDeConfirmacionEsVisible = false;
		}
		Assert.assertEquals(true, mensajeDeConfirmacionEsVisible);
	}

	public static void verificarNombreDelConsecutivoDeLaNuevaPropuesta() {
		String nombreDelConsecutivo = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div/div[2]/div/div[1]/h3"))
				.getText();
		nombreDelConsecutivo = nombreDelConsecutivo.trim();
		Assert.assertEquals("Propuesta 2", nombreDelConsecutivo);
	}

	public static void almacenarInformacionDelCuadroDeBeneficiosInicialParaElUsuarioDeProducto() {
		WebElement tablaCuadroDeBeneficios = driver
				.findElement(By.xpath("//*[@id=\"formEstructuraBeneficios\"]/div[2]/div/div/table"));
		List<WebElement> coleccionDeFilas = tablaCuadroDeBeneficios
				.findElements(By.xpath("//*[@id=\"formEstructuraBeneficios\"]/div[2]/div/div/table/tbody/tr"));
		System.out.println("Número de filas en esta tabla = " + coleccionDeFilas.size());
		List<WebElement> coleccionDeColumnas = tablaCuadroDeBeneficios
				.findElements(By.xpath("//*[@id=\"formEstructuraBeneficios\"]/div[2]/div/div/table/tbody/tr[1]/td"));
		System.out.println("Número de columnas = " + coleccionDeColumnas.size());
		matrizCuadroDeBeneficiosInicial = new String[coleccionDeFilas.size()][7];
		for (int fila = 1; fila <= coleccionDeFilas.size(); fila++) {
			for (int columna = 1; columna <= 7; columna++) {
				String valorDeLaCelda = driver
						.findElement(By.xpath("//*[@id=\"formEstructuraBeneficios\"]/div[2]/div/div/table/tbody/tr["
								+ fila + "]/td[" + columna + "]"))
						.getText();
				System.out.println("fila # " + fila + ", columna # " + columna + " texto = " + valorDeLaCelda);
				valorDeLaCelda = valorDeLaCelda.trim();
				matrizCuadroDeBeneficiosInicial[fila - 1][columna - 1] = valorDeLaCelda;
			}
		}
	}

	public static void almacenarInformacionDelCuadroDeBeneficiosCopiadoParaElUsuarioDeProducto() {
		WebElement tablaCuadroDeBeneficios = driver
				.findElement(By.xpath("//*[@id=\"formEstructuraBeneficios\"]/div[2]/div/div/table"));
		List<WebElement> coleccionDeFilas = tablaCuadroDeBeneficios
				.findElements(By.xpath("//*[@id=\"formEstructuraBeneficios\"]/div[2]/div/div/table/tbody/tr"));
		System.out.println("Número de filas en esta tabla = " + coleccionDeFilas.size());
		List<WebElement> coleccionDeColumnas = tablaCuadroDeBeneficios
				.findElements(By.xpath("//*[@id=\"formEstructuraBeneficios\"]/div[2]/div/div/table/tbody/tr[1]/td"));
		System.out.println("Número de columnas = " + coleccionDeColumnas.size());
		matrizCuadroDeBeneficiosCopiado = new String[coleccionDeFilas.size()][7];
		for (int fila = 1; fila <= coleccionDeFilas.size(); fila++) {
			for (int columna = 1; columna <= 7; columna++) {
				String valorDeLaCelda = driver
						.findElement(By.xpath("//*[@id=\"formEstructuraBeneficios\"]/div[2]/div/div/table/tbody/tr["
								+ fila + "]/td[" + columna + "]"))
						.getText();
				System.out.println("fila # " + fila + ", columna # " + columna + " texto = " + valorDeLaCelda);
				valorDeLaCelda = valorDeLaCelda.trim();
				matrizCuadroDeBeneficiosCopiado[fila - 1][columna - 1] = valorDeLaCelda;
			}
		}
	}

	public static void verificarNombreDelConsecutivoDelAnalisisTecnicoParaLaNuevaPropuesta() {
		String nombreDelConsecutivo = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div/div[2]/div/div[1]/h3"))
				.getText();
		nombreDelConsecutivo = nombreDelConsecutivo.trim();
		Assert.assertEquals("Propuesta 2 / Análisis Técnico 2", nombreDelConsecutivo);
	}

	public static void presionarBotonPrimasDeLaNuevaPropuesta() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"formEstructuraBeneficios\"]/div[1]/div[2]/a[1]/span")));
		WebElement elemento = driver.findElement(By.xpath("//*[@id=\"formEstructuraBeneficios\"]/div[1]/div[2]/a[1]/span"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", elemento);
	}

}
