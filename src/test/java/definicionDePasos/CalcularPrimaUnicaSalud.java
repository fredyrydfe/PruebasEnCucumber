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

	@Dado("^que el usuario de producto notifica una propuesta local de Salud al �rea t�cnica$")
	public void que_el_usuario_de_producto_notifica_una_propuesta_local_de_Salud_al_�rea_t�cnica() throws Throwable {
		// ---------------------------------------------------------------------
		// LOGIN
		// ---------------------------------------------------------------------
		Login.ingresarUsuario("intergrupo_user1");
		Login.ingresarContrase�a("Humano..2016");
		Login.presionarBotonIngresar();
		// ---------------------------------------------------------------------
		// M�DULO DE SEGURIDAD
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
		Propuesta.seleccionarCompa�ia("PRIMERA ARS DE HUMANO");
		Propuesta.seleccionarRamo("SALUD");
		Propuesta.seleccionarSubRamo("LOCAL");
		Propuesta.seleccionarTipoPlan("OPCIONAL");
		Propuesta.seleccionarModalidad("COLECTIVO EMPRESAS");
		Propuesta.ingresarComentarioEnLaConceptualizacion("Esto es una prueba de creaci�n de propuesta");
		// ---------------------------------------------------------------------
		// Monto Limite
		// ---------------------------------------------------------------------
		Propuesta.ingresarMontoLimite("93102");
		Propuesta.seleccionarUnidadDeTiempoMontoLimite("A�o");
		Propuesta.seleccionarRangoMaximoMontoLimite("Poliza");
		// ---------------------------------------------------------------------
		// Guardar Propuesta
		// ---------------------------------------------------------------------
		Propuesta.presionarBotonGuardar();
		// ---------------------------------------------------------------------
		// Confirmar notificaci�n
		// ---------------------------------------------------------------------
		Propuesta.verificarMensajeDeCreacionDeLaPropuesta();
		Propuesta.presionarBotonCerrar();
		Propuesta.almacenarCodigoDelProyecto();
		// ---------------------------------------------------------------------
		// Seleccionar opciones de men�
		// ---------------------------------------------------------------------
		Menu.ingresarALaOpcionDePropuestas();
		Menu.ingresarALaOpcion("Informaci�n General");
		Menu.ingresarAlaPropuesta();
		Menu.ingresarALaOpcion("Beneficios");
		Menu.ingresarALaPrimeraVersionDeLaPropuesta();
		Menu.ingresarALaOpcion("Ver Detalle");
		// ---------------------------------------------------------------------
		// CONFIGURAR BENEFICIOS
		// ---------------------------------------------------------------------
		Beneficios.presionarBotonAgregarCategoria();
		// ---------------------------------------------------------------------
		// CONFIGURAR CATEGOR�A
		// ---------------------------------------------------------------------
		Beneficios.seleccionarNombreDelBeneficio("ACCIDENTE DE TRANSITO", "Categor�a");
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
		Beneficios.presionarBotonA�adir("Grupo");
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
		Beneficios.presionarBotonA�adir("Servicio");
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
		Beneficios.presionarBotonA�adir("Tipo de cobertura");
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
		Beneficios.presionarBotonA�adir("Cobertura");
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
		Beneficios.presionarBotonA�adir("Grupo");
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
		Beneficios.presionarBotonA�adir("Servicio");
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
		Beneficios.presionarBotonA�adir("Tipo de cobertura");
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
		Beneficios.presionarBotonA�adir("Cobertura");
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
		// Seleccionar opciones de men�
		// ---------------------------------------------------------------------
		Menu.ingresarALaOpcionDePropuestas();
		Menu.ingresarALaOpcion("Informaci�n General");
		Menu.ingresarAlaPropuesta();
		Menu.ingresarALaOpcionDeConceptualizacion();
		// ---------------------------------------------------------------------
		// CONCEPTUALIZAR PROPUESTA
		// ---------------------------------------------------------------------
		Propuesta.presionarBotonNotificarAlAreaTecnica();
		Propuesta.verificarMensajeDePropuestaNotificadaAlAreaTecnica();
		Propuesta.presionarBotonCerrar();
		// ---------------------------------------------------------------------
		// CERRAR SESI�N
		// ---------------------------------------------------------------------
		Global.cerrarSesion();
	}
	
	@Dado("^he consultado la propuesta notificada por producto$")
	public void he_consultado_la_propuesta_notificada_por_producto() throws Throwable {
		// ---------------------------------------------------------------------
		// CONSULTA GENERAL
		// ---------------------------------------------------------------------
		// Filtros de B�squeda
		// ---------------------------------------------------------------------
		Consulta.ingresarCodigoDelProyectoOPlan();
		Consulta.presionarBotonBuscar();
		// ---------------------------------------------------------------------
		// Resultado de la B�squeda
		// ---------------------------------------------------------------------
		Consulta.presionarBotonEditar();
	}

	@Dado("^he ingresado a la configuraci�n de primas de la propuesta$")
	public void he_ingresado_a_la_configuraci�n_de_primas_de_la_propuesta() throws Throwable {
		// ---------------------------------------------------------------------
		// CONCEPTUALIZAR PROPUESTA
		// ---------------------------------------------------------------------
		// Seleccionar opciones de men�
		// ---------------------------------------------------------------------
		Menu.ingresarALaOpcionDePropuestas();
		Menu.ingresarALaOpcion("Informaci�n General");
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

	@Entonces("^deber�a visualizar una notificaci�n indicando el guardado de la prima �nica$")
	public void deber�a_visualizar_una_notificaci�n_indicando_el_guardado_de_la_prima_�nica() throws Throwable {
		Primas.verificarMensajeDeGuardadoDeLaPrimaUnica();
		Primas.presionarBotonCerrar();
	}

	@Entonces("^deber�a visualizar el resultado del c�lculo de la prima �nica$")
	public void deber�a_visualizar_el_resultado_del_c�lculo_de_la_prima_�nica() throws Throwable {
		Primas.verificarElCalculoDeLaPrimaUnica();
	}

	@Entonces("^deber�a visualizar el c�lculo de la prima �nica no capitada$")
	public void deber�a_visualizar_el_c�lculo_de_la_prima_�nica_no_capitada() throws Throwable {
		Primas.presionarBotonSiguiente();
		Primas.verificarElCalculoDeLaPrimaUnicaNoCapitada();
	}

	@Entonces("^deber�a visualizar el c�lculo de los beneficios capitados$")
	public void deber�a_visualizar_el_c�lculo_de_los_beneficios_capitados() throws Throwable {
		Primas.verificarElCalculoDeLosBeneficiosCapitados();
	}

	@Cuando("^ingrese un porcentaje de recargo comercial y recardo IPC$")
	public void ingrese_un_porcentaje_de_recargo_comercial_y_recardo_IPC() throws Throwable {
		// ---------------------------------------------------------------------
		// CONFIGURAR PRIMAS
		// ---------------------------------------------------------------------
		Primas.presionarBotonCalcular();
		// ---------------------------------------------------------------------
		// MODAL C�LCULO DE RECARGO COMERCIAL - %
		// ---------------------------------------------------------------------
		Primas.ingresarCalculoDeRecargoComercial();
		Primas.presionarBotonGuardarCalculoDeRecargoComercial();
		Primas.ingresarPorcentajeDeRecargoIPC();
	}

	@Cuando("^deje vac�a la informaci�n del valor individual de las primas$")
	public void deje_vac�a_la_informaci�n_del_valor_individual_de_las_primas() throws Throwable {
		// ---------------------------------------------------------------------
		// CONFIGURAR PRIMAS
		// ---------------------------------------------------------------------
		// Guardar
		// ---------------------------------------------------------------------
		Primas.presionarBotonGuardar();
	}

}
