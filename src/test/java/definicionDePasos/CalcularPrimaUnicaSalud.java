package definicionDePasos;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import mapaDeObjetos.Beneficios;
import mapaDeObjetos.Consulta;
import mapaDeObjetos.Global;
import mapaDeObjetos.Login;
import mapaDeObjetos.Menu;
import mapaDeObjetos.Primas;
import mapaDeObjetos.Propuesta;

public class CalcularPrimaUnicaSalud {

	@Dado("^que el usuario de producto notifica una propuesta local de Salud al área técnica$")
	public void que_el_usuario_de_producto_notifica_una_propuesta_local_de_Salud_al_área_técnica() throws Throwable {
		// ---------------------------------------------------------------------
		// LOGIN
		// ---------------------------------------------------------------------
		Login.ingresarUsuario("intergrupo_user1");
		Login.ingresarContraseña("Humano..2016");
		Login.presionarBotonIngresar();
		// ---------------------------------------------------------------------
		// MÓDULO DE SEGURIDAD
		// ---------------------------------------------------------------------
		Login.ingresarAlModuloDePlanes();
		// ---------------------------------------------------------------------
		// CONSULTAR PROYECTO
		// ---------------------------------------------------------------------
		Menu.ingresarALaOpcionDePropuestas();
		Menu.ingresarALaOpcionDeNuevaSalud();
		// ---------------------------------------------------------------------
		// CONCEPTUALIZAR PROPUESTA
		// ---------------------------------------------------------------------
		// Datos del Proyecto
		// ---------------------------------------------------------------------
		Propuesta.seleccionarTipoDeVenta("Individual");
		Propuesta.ingresarNombreDelProyecto("Propuesta de Salud - ");
		Propuesta.ingresarNombreDelPlan("Plan de Salud - ");
		Propuesta.seleccionarCompañia("PRIMERA ARS DE HUMANO");
		Propuesta.seleccionarRamo("SALUD");
		Propuesta.seleccionarSubRamo("LOCAL");
		Propuesta.seleccionarTipoPlan("OPCIONAL");
		Propuesta.seleccionarModalidad("COLECTIVO EMPRESAS");
		Propuesta.ingresarComentarioEnLaConceptualizacion("Esto es una prueba de creación de propuesta");
		// ---------------------------------------------------------------------
		// Monto Limite
		// ---------------------------------------------------------------------
		Propuesta.ingresarMontoLimite("93102");
		Propuesta.seleccionarUnidadDeTiempoMontoLimite("Año");
		Propuesta.seleccionarRangoMaximoMontoLimite("Poliza");
		// ---------------------------------------------------------------------
		// Guardar Propuesta
		// ---------------------------------------------------------------------
		Propuesta.presionarBotonGuardar();
		// ---------------------------------------------------------------------
		// Confirmar notificación
		// ---------------------------------------------------------------------
		Propuesta.verificarMensajeDeCreacionDeLaPropuesta();
		Propuesta.presionarBotonCerrar();
		Propuesta.almacenarCodigoDelProyecto();
		// ---------------------------------------------------------------------
		// Seleccionar opciones de menú
		// ---------------------------------------------------------------------
		Menu.ingresarALaOpcionDePropuestas();
		Menu.ingresarALaOpcion("Información General");
		Menu.ingresarAlaPropuesta();
		Menu.ingresarALaOpcion("Beneficios");
		Menu.ingresarALaPrimeraVersionDeLaPropuesta();
		Menu.ingresarALaOpcion("Ver Detalle");
		// ---------------------------------------------------------------------
		// CONFIGURAR BENEFICIOS
		// ---------------------------------------------------------------------
		Beneficios.presionarBotonAgregarCategoria();
		// ---------------------------------------------------------------------
		// CONFIGURAR CATEGORÍA
		// ---------------------------------------------------------------------
		Beneficios.seleccionarNombreDelBeneficio("ACCIDENTE DE TRANSITO", "Categoría");
		// ---------------------------------------------------------------------
		// Monto Beneficio
		// ---------------------------------------------------------------------
		Beneficios.ingresarMontoLimite("90000");
		Beneficios.seleccionarUnidadDeTiempoMontoBeneficio("Mes");
		Global.aplicarScroll("1200");
		// ---------------------------------------------------------------------
		// Guardar
		// ---------------------------------------------------------------------
		Beneficios.presionarBotonGuardar();
		// ---------------------------------------------------------------------
		// CONFIGURAR BENEFICIOS
		// ---------------------------------------------------------------------
		Beneficios.presionarBotonAñadir("Grupo");
		// ---------------------------------------------------------------------
		// CONFIGURAR 1ER GRUPO DE COBERTURA
		// ---------------------------------------------------------------------
		Beneficios.seleccionarNombreDelBeneficio("ASISTENCIA PRENATAL", "Grupo Cobertura");
		// ---------------------------------------------------------------------
		// Monto Beneficio
		// ---------------------------------------------------------------------
		Beneficios.ingresarMontoLimite("80000");
		Beneficios.seleccionarUnidadDeTiempoMontoBeneficio("Mes");
		Global.aplicarScroll("1200");
		// ---------------------------------------------------------------------
		// Guardar
		// ---------------------------------------------------------------------
		Beneficios.presionarBotonGuardar();
		// ---------------------------------------------------------------------
		// CONFIGURAR BENEFICIOS
		// ---------------------------------------------------------------------
		Beneficios.presionarBotonAñadir("Servicio");
		// ---------------------------------------------------------------------
		// CONFIGURAR SERVICIO
		// ---------------------------------------------------------------------
		Beneficios.seleccionarNombreDelBeneficio("AMBULATORIO", "Servicio");
		// ---------------------------------------------------------------------
		// Monto Beneficio
		// ---------------------------------------------------------------------
		Beneficios.ingresarMontoLimite("80000");
		Beneficios.seleccionarUnidadDeTiempoMontoBeneficio("Mes");
		Global.aplicarScroll("1200");
		// ---------------------------------------------------------------------
		// Guardar
		// ---------------------------------------------------------------------
		Beneficios.presionarBotonGuardar();
		// ---------------------------------------------------------------------
		// CONFIGURAR BENEFICIOS
		// ---------------------------------------------------------------------
		Beneficios.presionarBotonAñadir("Tipo de cobertura");
		// ---------------------------------------------------------------------
		// CONFIGURAR TIPO DE COBERTURA
		// ---------------------------------------------------------------------
		Beneficios.seleccionarNombreDelBeneficio("ANATOMIA PATOLOGICA", "Tipo Cobertura");
		// ---------------------------------------------------------------------
		// Monto Beneficio
		// ---------------------------------------------------------------------
		Beneficios.ingresarMontoLimite("80000");
		Beneficios.seleccionarUnidadDeTiempoMontoBeneficio("Mes");
		Global.aplicarScroll("1200");
		// ---------------------------------------------------------------------
		// Guardar
		// ---------------------------------------------------------------------
		Beneficios.presionarBotonGuardar();
		// ---------------------------------------------------------------------
		// CONFIGURAR BENEFICIOS
		// ---------------------------------------------------------------------
		Beneficios.presionarBotonAñadir("Cobertura");
		// ---------------------------------------------------------------------
		// CONFIGURAR COBERTURA
		// ---------------------------------------------------------------------
		Beneficios.seleccionarNombreDeLaCobertura("199-RADIOGRAFIA DE ARTICULACIONES ESTERNOCLAVICULARES", "Cobertura");
		// ---------------------------------------------------------------------
		// Monto Beneficio
		// ---------------------------------------------------------------------
		Beneficios.ingresarMontoLimite("8000");
		Beneficios.seleccionarUnidadDeTiempoMontoBeneficio("Mes");
		Global.aplicarScroll("1200");
		// ---------------------------------------------------------------------
		// Guardar
		// ---------------------------------------------------------------------
		Beneficios.presionarBotonGuardar();
		// ---------------------------------------------------------------------
		// CONFIGURAR BENEFICIOS
		// ---------------------------------------------------------------------
		Beneficios.presionarBotonAñadir("Grupo");
		// ---------------------------------------------------------------------
		// CONFIGURAR 2DO GRUPO DE COBERTURA
		// ---------------------------------------------------------------------
		Beneficios.seleccionarNombreDelBeneficio("ATENCION CLINICA", "Grupo Cobertura");
		// ---------------------------------------------------------------------
		// Monto Beneficio
		// ---------------------------------------------------------------------
		Beneficios.ingresarMontoLimite("80000");
		Beneficios.seleccionarUnidadDeTiempoMontoBeneficio("Mes");
		Global.aplicarScroll("1200");
		// ---------------------------------------------------------------------
		// Guardar
		// ---------------------------------------------------------------------
		Beneficios.presionarBotonGuardar();
		// ---------------------------------------------------------------------
		// CONFIGURAR BENEFICIOS
		// ---------------------------------------------------------------------
		Beneficios.presionarBotonAñadir("Servicio");
		// ---------------------------------------------------------------------
		// CONFIGURAR SERVICIO
		// ---------------------------------------------------------------------
		Beneficios.seleccionarNombreDelBeneficio("INDEMNIZATORIO", "Servicio");
		// ---------------------------------------------------------------------
		// Monto Beneficio
		// ---------------------------------------------------------------------
		Beneficios.ingresarMontoLimite("80000");
		Beneficios.seleccionarUnidadDeTiempoMontoBeneficio("Mes");
		Global.aplicarScroll("1200");
		// ---------------------------------------------------------------------
		// Guardar
		// ---------------------------------------------------------------------
		Beneficios.presionarBotonGuardar();
		// ---------------------------------------------------------------------
		// CONFIGURAR BENEFICIOS
		// ---------------------------------------------------------------------
		Beneficios.presionarBotonAñadir("Tipo de cobertura");
		// ---------------------------------------------------------------------
		// CONFIGURAR TIPO DE COBERTURA
		// ---------------------------------------------------------------------
		Beneficios.seleccionarNombreDelBeneficio("SERVICIOS LEGALES", "Tipo Cobertura");
		// ---------------------------------------------------------------------
		// Monto Beneficio
		// ---------------------------------------------------------------------
		Beneficios.ingresarMontoLimite("80000");
		Beneficios.seleccionarUnidadDeTiempoMontoBeneficio("Mes");
		Global.aplicarScroll("1200");
		// ---------------------------------------------------------------------
		// Guardar
		// ---------------------------------------------------------------------
		Beneficios.presionarBotonGuardar();
		// ---------------------------------------------------------------------
		// CONFIGURAR BENEFICIOS
		// ---------------------------------------------------------------------
		Beneficios.presionarBotonAñadir("Cobertura");
		// ---------------------------------------------------------------------
		// CONFIGURAR COBERTURA
		// ---------------------------------------------------------------------
		Beneficios.seleccionarNombreDeLaCobertura("2-ACIDO URICO", "Cobertura");
		// ---------------------------------------------------------------------
		// Monto Beneficio
		// ---------------------------------------------------------------------
		Beneficios.ingresarMontoLimite("8000");
		Beneficios.seleccionarUnidadDeTiempoMontoBeneficio("Mes");
		Global.aplicarScroll("1200");
		// ---------------------------------------------------------------------
		// Guardar
		// ---------------------------------------------------------------------
		Beneficios.presionarBotonGuardar();
		// ---------------------------------------------------------------------
		// CONFIGURAR BENEFICIOS
		// ---------------------------------------------------------------------
		// Seleccionar opciones de menú
		// ---------------------------------------------------------------------
		Menu.ingresarALaOpcionDePropuestas();
		Menu.ingresarALaOpcion("Información General");
		Menu.ingresarAlaPropuesta();
		Menu.ingresarALaOpcionDeConceptualizacion();
		// ---------------------------------------------------------------------
		// CONCEPTUALIZAR PROPUESTA
		// ---------------------------------------------------------------------
		Propuesta.presionarBotonNotificarAlAreaTecnica();
		Propuesta.verificarMensajeDePropuestaNotificadaAlAreaTecnica();
		Propuesta.presionarBotonCerrar();
		// ---------------------------------------------------------------------
		// CERRAR SESIÓN
		// ---------------------------------------------------------------------
		Global.cerrarSesion();
	}
	
	@Dado("^he consultado la propuesta notificada por producto$")
	public void he_consultado_la_propuesta_notificada_por_producto() throws Throwable {
		// ---------------------------------------------------------------------
		// CONSULTA GENERAL
		// ---------------------------------------------------------------------
		// Filtros de Búsqueda
		// ---------------------------------------------------------------------
		Consulta.ingresarCodigoDelProyectoOPlan();
		Consulta.presionarBotonBuscar();
		// ---------------------------------------------------------------------
		// Resultado de la Búsqueda
		// ---------------------------------------------------------------------
		Consulta.presionarBotonEditar();
	}

	@Dado("^he ingresado a la configuración de primas de la propuesta$")
	public void he_ingresado_a_la_configuración_de_primas_de_la_propuesta() throws Throwable {
		// ---------------------------------------------------------------------
		// CONCEPTUALIZAR PROPUESTA
		// ---------------------------------------------------------------------
		// Seleccionar opciones de menú
		// ---------------------------------------------------------------------
		Menu.ingresarALaOpcionDePropuestas();
		Menu.ingresarALaOpcion("Información General");
		Menu.ingresarAlaPropuestaConElUsuarioTecnico();
		Menu.ingresarALaOpcion("Beneficios");
		Menu.ingresarALaPrimeraVersionDeLaPropuestaConElUsuarioTecnico();
		Menu.ingresarALaOpcion("Ver Detalle");
		// ---------------------------------------------------------------------
		// CONFIGURAR BENEFICIOS
		// ---------------------------------------------------------------------
		Beneficios.presionarBotonPrimas();
	}

	@Cuando("^he ingresado los valores individuales de las primas para beneficios capitados y no capitados$")
	public void he_ingresado_los_valores_individuales_de_las_primas_para_beneficios_capitados_y_no_capitados()
			throws Throwable {
		// ---------------------------------------------------------------------
		// CONFIGURAR PRIMAS
		// ---------------------------------------------------------------------
		Primas.ingresarValorIndividualDeLasPrimas();
		// ---------------------------------------------------------------------
		// Guardar
		// ---------------------------------------------------------------------
		Primas.presionarBotonGuardar();
	}

	@Entonces("^debería visualizar una notificación indicando el guardado de la prima única$")
	public void debería_visualizar_una_notificación_indicando_el_guardado_de_la_prima_única() throws Throwable {
		Primas.verificarMensajeDeGuardadoDeLaPrimaUnica();
		Primas.presionarBotonCerrar();
	}

	@Entonces("^debería visualizar el resultado del cálculo de la prima única$")
	public void debería_visualizar_el_resultado_del_cálculo_de_la_prima_única() throws Throwable {
		Primas.verificarElCalculoDeLaPrimaUnica();
	}

	@Entonces("^debería visualizar el cálculo de la prima única no capitada$")
	public void debería_visualizar_el_cálculo_de_la_prima_única_no_capitada() throws Throwable {
		Primas.presionarBotonSiguiente();
		Primas.verificarElCalculoDeLaPrimaUnicaNoCapitada();
	}

	@Entonces("^debería visualizar el cálculo de los beneficios capitados$")
	public void debería_visualizar_el_cálculo_de_los_beneficios_capitados() throws Throwable {
		Primas.verificarElCalculoDeLosBeneficiosCapitados();
	}

	@Cuando("^ingrese un porcentaje de recargo comercial y recardo IPC$")
	public void ingrese_un_porcentaje_de_recargo_comercial_y_recardo_IPC() throws Throwable {
		// ---------------------------------------------------------------------
		// CONFIGURAR PRIMAS
		// ---------------------------------------------------------------------
		Primas.presionarBotonCalcular();
		// ---------------------------------------------------------------------
		// MODAL CÁLCULO DE RECARGO COMERCIAL - %
		// ---------------------------------------------------------------------
		Primas.ingresarCalculoDeRecargoComercial();
		Primas.presionarBotonGuardarCalculoDeRecargoComercial();
		Primas.ingresarPorcentajeDeRecargoIPC();
	}

	@Cuando("^deje vacía la información del valor individual de las primas$")
	public void deje_vacía_la_información_del_valor_individual_de_las_primas() throws Throwable {
		// ---------------------------------------------------------------------
		// CONFIGURAR PRIMAS
		// ---------------------------------------------------------------------
		// Guardar
		// ---------------------------------------------------------------------
		Primas.presionarBotonGuardar();
	}

}
