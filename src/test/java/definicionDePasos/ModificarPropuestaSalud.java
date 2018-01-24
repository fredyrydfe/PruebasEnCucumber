package definicionDePasos;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import mapaDeObjetos.Beneficios;
import mapaDeObjetos.Consulta;
import mapaDeObjetos.Global;
import mapaDeObjetos.Login;
import mapaDeObjetos.Menu;
import mapaDeObjetos.Propuesta;

public class ModificarPropuestaSalud {

	@Dado("^he creado una conceptualizaci�n de propuesta de salud$")
	public void he_creado_una_conceptualizaci�n_de_propuesta_de_salud() throws Throwable {
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
		Propuesta.seleccionarTipoDeVenta("Opcional");
		Propuesta.ingresarNombreDelProyecto("Propuesta de Salud - ");
		Propuesta.ingresarNombreDelPlan("Plan de Salud - ");
		Propuesta.seleccionarCompa�ia("PRIMERA ARS DE HUMANO");
		Propuesta.seleccionarRamo("SALUD");
		Propuesta.seleccionarSubRamo("LOCAL");
		Propuesta.seleccionarTipoPlan("OPCIONAL");
		Propuesta.seleccionarModalidad("COLECTIVO EMPRESAS");
		Propuesta.ingresarComentarioEnLaConceptualizacion("Esto es una prueba de creaci�n de propuesta");
		Global.aplicarScroll("500");
		// ---------------------------------------------------------------------
		// Territorios de Cobertura
		// ---------------------------------------------------------------------
		Propuesta.seleccionarTodosLosTerritoriosDeCobertura();
		Global.aplicarScroll("930");
		// ---------------------------------------------------------------------
		// Coaseguro Local
		// ---------------------------------------------------------------------
		Propuesta.ingresarPorcentajeDeCoaseguroLocal("50");
		Propuesta.ingresarMontoDeCoaseguroLocal("390000");
		Propuesta.seleccionarUnidadDeTiempoCoaseguroLocal("A�o");
		Propuesta.seleccionarRangoMaximoDelCoaseguroLocal("Poliza");
		Propuesta.ingresarPorcentajeDefinitivoDelCoaseguroLocal("50");
		// ---------------------------------------------------------------------
		// Coaseguro Internacional
		// ---------------------------------------------------------------------
		Propuesta.ingresarPorcentajeDeCoaseguroInternacional("50");
		Propuesta.ingresarMontoDeCoaseguroInternacional("390000");
		Propuesta.seleccionarUnidadDeTiempoCoaseguroInternacional("A�o");
		Propuesta.seleccionarRangoMaximoDelCoaseguroInternacional("Poliza");
		Propuesta.ingresarPorcentajeDefinitivoDelCoaseguroInternacional("50");
		Global.aplicarScroll("1350");
		// ---------------------------------------------------------------------
		// Reembolso Local
		// ---------------------------------------------------------------------
		Propuesta.seleccionarTipoDeReembolsoLocal("Monto Reclamado");
		Propuesta.ingresarPorcentajeDeReembolsoLocal("10");
		Propuesta.ingresarFrecuenciaDeReembolsoLocal("2");
		Propuesta.seleccionarUnidadDeTiempoRemmbolsoLocal("A�o");
		Propuesta.seleccionarRangoMaximoRemmbolsoLocal("Poliza");
		Propuesta.ingresarMontoDelRemmbolsoLocal("1000000");
		Propuesta.seleccionarUnidadDeTiempoMontoRemmbolsoLocal("A�o");
		Propuesta.seleccionarRangoMaximoMontoRemmbolsoLocal("Poliza");
		// ---------------------------------------------------------------------
		// Reembolso Internacional
		// ---------------------------------------------------------------------
		Propuesta.seleccionarTipoDeReembolsoInternacional("Monto Reclamado");
		Propuesta.ingresarPorcentajeDeReembolsoInternacional("10");
		Propuesta.ingresarFrecuenciaDeReembolsoInternacional("2");
		Propuesta.seleccionarUnidadDeTiempoRemmbolsoInternacional("A�o");
		Propuesta.seleccionarRangoMaximoRemmbolsoInternacional("Poliza");
		Propuesta.ingresarMontoDelRemmbolsoInternacional("1000000");
		Propuesta.seleccionarUnidadDeTiempoMontoRemmbolsoInternacional("A�o");
		Propuesta.seleccionarRangoMaximoMontoRemmbolsoInternacional("Poliza");
		Global.aplicarScroll("1730");
		// ---------------------------------------------------------------------
		// Elegibilidad y Permanencia
		// ---------------------------------------------------------------------
		Propuesta.ingresarEdadMinima("18");
		Propuesta.ingresarEdadMaxima("66");
		Propuesta.ingresarEdadDePermanencia("78");
		// ---------------------------------------------------------------------
		// Monto Limite
		// ---------------------------------------------------------------------
		Propuesta.ingresarMontoLimite("93102");
		Propuesta.seleccionarUnidadDeTiempoMontoLimite("A�o");
		Propuesta.seleccionarRangoMaximoMontoLimite("Poliza");
		// ---------------------------------------------------------------------
		// Alcance de la Cobertura
		// ---------------------------------------------------------------------
		Propuesta.seleccionarPaisDeResidencia("REPUBLICA DOMINICANA");
		Propuesta.ingresarPrimaSugerida("330000000");
		Propuesta.seleccionarCanalDeDistribucion("Banca Seguros");
		Propuesta.seleccionarTipoDeMoneda("Peso Dominicano");
		Propuesta.seleccionarManejoDeImpuestos("Si");
		Propuesta.ingresarComisionSugerida("7");
		// ---------------------------------------------------------------------
		// Guardar Propuesta
		// ---------------------------------------------------------------------
		Propuesta.presionarBotonGuardar();
		// ---------------------------------------------------------------------
		// Confirmar notificaci�n
		// ---------------------------------------------------------------------
		Propuesta.verificarMensajeDeCreacionDeLaPropuesta();
		Propuesta.presionarBotonCerrar();
	}

	@Cuando("^modifique la propuesta$")
	public void modifique_la_propuesta() throws Throwable {
		// ---------------------------------------------------------------------
		// CONCEPTUALIZAR PROPUESTA
		// ---------------------------------------------------------------------
		// Se limpian los campos ha modificar en el formulario
		// ---------------------------------------------------------------------
		Propuesta.limpiarCamposAModificarEnLaPropuestaDeSalud();
		// ---------------------------------------------------------------------
		// Datos del Proyecto
		// ---------------------------------------------------------------------
		Propuesta.seleccionarTipoDeVenta("Individual");
		Propuesta.ingresarNombreDelProyecto("Propuesta de Salud - ");
		Propuesta.ingresarNombreDelPlan("Plan de Salud - ");
		Propuesta.seleccionarCompa�ia("HUMANO");
		Propuesta.seleccionarRamo("SALUD");
		Propuesta.seleccionarSubRamo("INTERNACIONAL");
		Propuesta.seleccionarTipoPlan("PRIVADO");
		Propuesta.seleccionarModalidad("INDIVIDUAL");
		Propuesta.ingresarComentarioEnLaConceptualizacion("Se modifica la propuesta");
		Global.aplicarScroll("1730");
		// ---------------------------------------------------------------------
		// Guardar Propuesta
		// ---------------------------------------------------------------------
		Propuesta.presionarBotonGuardar();
	}

	@Cuando("^modifique la propuesta con el usuario t�cnico$")
	public void modifique_la_propuesta_con_el_usuario_t�cnico() throws Throwable {
		// ---------------------------------------------------------------------
		// CONCEPTUALIZAR PROPUESTA
		// ---------------------------------------------------------------------
		// Se limpian los campos ha modificar en el formulario
		// ---------------------------------------------------------------------
		Propuesta.limpiarCamposAModificarEnLaPropuestaDeSaludParaElUsuarioTecnico();
		Propuesta.cerrarNotificacionDeLaModalidad();
		// ---------------------------------------------------------------------
		// Datos del Proyecto
		// ---------------------------------------------------------------------
		Propuesta.ingresarNombreDelPlan("Plan de Salud - ");
		Propuesta.seleccionarCompa�ia("HUMANO");
		Propuesta.seleccionarRamo("SALUD");
		Propuesta.seleccionarSubRamo("INTERNACIONAL");
		Propuesta.cerrarNotificacionDeLaModalidad();
		Propuesta.seleccionarTipoPlan("PRIVADO");
		Propuesta.seleccionarModalidad("INDIVIDUAL");
		Propuesta.cerrarNotificacionDeLaModalidad();
		Propuesta.ingresarComentarioEnElCampoTecnico("Se modifica la propuesta");
		Global.aplicarScroll("1800");
		// ---------------------------------------------------------------------
		// Guardar Propuesta
		// ---------------------------------------------------------------------
		Propuesta.presionarBotonGuardar();
	}

	@Entonces("^deber�a visualizar una notificaci�n solicitando la confirmaci�n de la acci�n$")
	public void deber�a_visualizar_una_notificaci�n_solicitando_la_confirmaci�n_de_la_acci�n() throws Throwable {
		Propuesta.verificarMensajeDeConfirmacionParaLaModificacionDeLaPropuesta();
	}

	@Entonces("^una vez confirme la acci�n deber�a visualizar una notificaci�n indicando la modificaci�n de la propuesta$")
	public void una_vez_confirme_la_acci�n_deber�a_visualizar_una_notificaci�n_indicando_la_modificaci�n_de_la_propuesta()
			throws Throwable {
		Propuesta.presionarBotonGuardarCambios();
		Propuesta.verificarMensajeDeCreacionDeLaPropuesta();
		Propuesta.presionarBotonCerrar();
	}

	@Entonces("^deber�a visualizar la nueva informaci�n en la pantalla de la conceptualizaci�n$")
	public void deber�a_visualizar_la_nueva_informaci�n_en_la_pantalla_de_la_conceptualizaci�n() throws Throwable {
		Propuesta.verificarInformaci�nDeLosCamposModificadosEnLaPropuestaDeSalud();
	}

	@Cuando("^deje vac�o los campos obligatorios al modificar la propuesta de salud$")
	public void deje_vac�o_los_campos_obligatorios_al_modificar_la_propuesta_de_salud() throws Throwable {
		// ---------------------------------------------------------------------
		// CONCEPTUALIZAR PROPUESTA
		// ---------------------------------------------------------------------
		// Datos del Proyecto
		// ---------------------------------------------------------------------
		Propuesta.limpiarCamposObligatoriosDeLaPropuesta();
		Global.aplicarScroll("1730");
		// ---------------------------------------------------------------------
		// Guardar Propuesta
		// ---------------------------------------------------------------------
		Propuesta.presionarBotonGuardar();
	}

	@Entonces("^una vez confirme la acci�n deber�a visualizar una notificaci�n indicando que debo ingresar los campos obligatorios$")
	public void una_vez_confirme_la_acci�n_deber�a_visualizar_una_notificaci�n_indicando_que_debo_ingresar_los_campos_obligatorios()
			throws Throwable {
		Propuesta.presionarBotonGuardarCambios();
		Propuesta.verificarMensajeDeCamposObligatorios();
	}

	@Cuando("^ingrese solo el monto limite y deje vac�o el resto de campos al modificar la propuesta de salud$")
	public void ingrese_solo_el_monto_limite_y_deje_vac�o_el_resto_de_campos_al_modificar_la_propuesta_de_salud()
			throws Throwable {
		// ---------------------------------------------------------------------
		// CONCEPTUALIZAR PROPUESTA
		// ---------------------------------------------------------------------
		Global.aplicarScroll("1730");
		// ---------------------------------------------------------------------
		// Monto Limite
		// ---------------------------------------------------------------------
		Propuesta.limpiarCamposDelMontoLimiteEnLaPropuesta();
		// ---------------------------------------------------------------------
		// Guardar Propuesta
		// ---------------------------------------------------------------------
		Propuesta.presionarBotonGuardar();
	}

	@Cuando("^deje vac�o el rango m�ximo despues de seleccionar un a�o en la unidad de tiempo al modificar la propuesta de salud$")
	public void deje_vac�o_el_rango_m�ximo_despues_de_seleccionar_un_a�o_en_la_unidad_de_tiempo_al_modificar_la_propuesta_de_salud()
			throws Throwable {
		// ---------------------------------------------------------------------
		// CONCEPTUALIZAR PROPUESTA
		// ---------------------------------------------------------------------
		Global.aplicarScroll("1350");
		// ---------------------------------------------------------------------
		// Reembolso Local
		// ---------------------------------------------------------------------
		Propuesta.limpiarCampoRangoMaximoRemmbolsoLocal();
		Global.aplicarScroll("1730");
		// ---------------------------------------------------------------------
		// Guardar Propuesta
		// ---------------------------------------------------------------------
		Propuesta.presionarBotonGuardar();
	}

	@Entonces("^una vez confirme la acci�n deber�a visualizar una notificaci�n indicando que debo seleccionar un rango m�ximo$")
	public void una_vez_confirme_la_acci�n_deber�a_visualizar_una_notificaci�n_indicando_que_debo_seleccionar_un_rango_m�ximo()
			throws Throwable {
		Propuesta.presionarBotonGuardarCambios();
		Propuesta.verificarMensajeDeNoHaSeleccionadoRangoMaximoEnLaPropuesta();
	}

	@Cuando("^ingrese un nombre de proyecto que ya existe al modificar la propuesta de salud$")
	public void ingrese_un_nombre_de_proyecto_que_ya_existe_al_modificar_la_propuesta_de_salud() throws Throwable {
		// ---------------------------------------------------------------------
		// CONCEPTUALIZAR PROPUESTA
		// ---------------------------------------------------------------------
		// Datos del Proyecto
		// ---------------------------------------------------------------------
		Propuesta.limpiarCampoNombreDelProyecto();
		Propuesta.ingresarNombreDelProyectoYaExistente("Prueba Salud");
		Global.aplicarScroll("1730");
		// ---------------------------------------------------------------------
		// Guardar Propuesta
		// ---------------------------------------------------------------------
		Propuesta.presionarBotonGuardar();
	}

	@Entonces("^una vez confirme la acci�n deber�a visualizar una notificaci�n indicando que la propuesta ya existe$")
	public void una_vez_confirme_la_acci�n_deber�a_visualizar_una_notificaci�n_indicando_que_la_propuesta_ya_existe()
			throws Throwable {
		Propuesta.presionarBotonGuardarCambios();
		Propuesta.verificarMensajeDePropuestaYaExistente();
	}

	@Cuando("^ingrese una edad m�nima que supera la edad m�xima al modificar la propuesta de salud$")
	public void ingrese_una_edad_m�nima_que_supera_la_edad_m�xima_al_modificar_la_propuesta_de_salud()
			throws Throwable {
		// ---------------------------------------------------------------------
		// CONCEPTUALIZAR PROPUESTA
		// ---------------------------------------------------------------------
		// Elegibilidad y Permanencia
		// ---------------------------------------------------------------------
		Propuesta.limpiarCamposDeElegibilidadYPermanencia();
		Propuesta.ingresarEdadMinima("100");
		Propuesta.ingresarEdadMaxima("1");
		Propuesta.ingresarEdadDePermanencia("99");
		Global.aplicarScroll("1730");
		// ---------------------------------------------------------------------
		// Guardar Propuesta
		// ---------------------------------------------------------------------
		Propuesta.presionarBotonGuardar();
	}

	@Entonces("^una vez confirme la acci�n deber�a visualizar una notificaci�n indicando que la edad m�nima no puede superar la edad m�xima$")
	public void una_vez_confirme_la_acci�n_deber�a_visualizar_una_notificaci�n_indicando_que_la_edad_m�nima_no_puede_superar_la_edad_m�xima()
			throws Throwable {
		Propuesta.presionarBotonGuardarCambios();
		Propuesta.verificarMensajeDeEdadDePermanencia();
	}
	
	@Dado("^que el usuario de producto crea una propuesta local de Salud sin notificar al �rea t�cnica$")
	public void que_el_usuario_de_producto_crea_una_propuesta_local_de_Salud_sin_notificar_al_�rea_t�cnica() throws Throwable {
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
		// CERRAR SESI�N
		// ---------------------------------------------------------------------
		Global.cerrarSesion();
	}

	@Cuando("^intente modificar la propuesta con el usuario t�cnico$")
	public void intente_modificar_la_propuesta_con_el_usuario_t�cnico() throws Throwable {
		// ---------------------------------------------------------------------
		// CONCEPTUALIZAR PROPUESTA
		// ---------------------------------------------------------------------
		// Se limpian los campos ha modificar en el formulario
		// ---------------------------------------------------------------------
		Propuesta.limpiarCamposAModificarEnLaPropuestaDeSaludParaElUsuarioTecnico();
		Propuesta.cerrarNotificacionDeLaModalidad();
		// ---------------------------------------------------------------------
		// Datos del Proyecto
		// ---------------------------------------------------------------------
		Propuesta.ingresarNombreDelPlan("Plan de Salud - ");
		Propuesta.seleccionarCompa�ia("HUMANO");
		Propuesta.seleccionarRamo("SALUD");
		Propuesta.seleccionarSubRamo("INTERNACIONAL");
		Propuesta.cerrarNotificacionDeLaModalidad();
		Propuesta.seleccionarTipoPlan("PRIVADO");
		Propuesta.seleccionarModalidad("INDIVIDUAL");
		Propuesta.cerrarNotificacionDeLaModalidad();
		Propuesta.ingresarComentarioEnElCampoTecnico("Se modifica la propuesta");
		Global.aplicarScroll("1730");
	}

	@Cuando("^intente modificar la propuesta$")
	public void intente_modificar_la_propuesta() throws Throwable {
		// ---------------------------------------------------------------------
		// CONCEPTUALIZAR PROPUESTA
		// ---------------------------------------------------------------------
		// Se limpian los campos ha modificar en el formulario
		// ---------------------------------------------------------------------
		Propuesta.limpiarCamposAModificarEnLaPropuestaDeSalud();
		// ---------------------------------------------------------------------
		// Datos del Proyecto
		// ---------------------------------------------------------------------
		Propuesta.seleccionarTipoDeVenta("Individual");
		Propuesta.ingresarNombreDelProyecto("Propuesta de Salud - ");
		Propuesta.ingresarNombreDelPlan("Plan de Salud - ");
		Propuesta.seleccionarCompa�ia("HUMANO");
		Propuesta.seleccionarRamo("SALUD");
		Propuesta.seleccionarSubRamo("INTERNACIONAL");
		Propuesta.seleccionarTipoPlan("PRIVADO");
		Propuesta.seleccionarModalidad("INDIVIDUAL");
		Propuesta.ingresarComentarioEnLaConceptualizacion("Se modifica la propuesta");
		Global.aplicarScroll("1730");
	}

	@Entonces("^no deber�a poder guardar los cambios realizados en la propuesta$")
	public void no_deber�a_poder_guardar_los_cambios_realizados_en_la_propuesta() throws Throwable {
		Propuesta.verificarSiElBotonGuardarEsVisible();
	}

}
