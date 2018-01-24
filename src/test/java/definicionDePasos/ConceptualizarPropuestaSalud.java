package definicionDePasos;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import mapaDeObjetos.Global;
import mapaDeObjetos.Menu;
import mapaDeObjetos.Propuesta;

public class ConceptualizarPropuestaSalud {

	@Dado("^que estoy en la p�gina de Conceptualizar propuesta de salud$")
	public void que_estoy_en_la_p�gina_de_Conceptualizar_propuesta_de_salud() throws Throwable {
		Menu.ingresarALaOpcionDePropuestas();
		Menu.ingresarALaOpcionDeNuevaSalud();
	}

	@Cuando("^cree la propuesta$")
	public void cree_la_propuesta() throws Throwable {
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
		Propuesta.ingresarEdadDePermanencia("99");
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
	}

	@Entonces("^deber�a visualizar una notificaci�n indicando la creaci�n de la propuesta$")
	public void deber�a_visualizar_una_notificaci�n_indicando_la_creaci�n_de_la_propuesta() throws Throwable {
		Propuesta.verificarMensajeDeCreacionDeLaPropuesta();
	}

	@Cuando("^deje vacio los campos obligatorios$")
	public void deje_vacio_los_campos_obligatorios() throws Throwable {
		// ---------------------------------------------------------------------
        // CONCEPTUALIZAR PROPUESTA
        // ---------------------------------------------------------------------
        // Datos del Proyecto
        // ---------------------------------------------------------------------
		Propuesta.ingresarNombreDelPlan("Plan de Salud - ");
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
		Propuesta.ingresarEdadDePermanencia("99");
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
	}
	
	@Cuando("^ingrese solo el monto limite y deje vac�o el resto de campos en la conceptualizaci�n de la propuesta$")
	public void ingrese_solo_el_monto_limite_y_deje_vac�o_el_resto_de_campos_en_la_conceptualizaci�n_de_la_propuesta() throws Throwable {
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
		Propuesta.ingresarEdadDePermanencia("99");
		// ---------------------------------------------------------------------
        // Monto Limite
        // ---------------------------------------------------------------------
		Propuesta.ingresarMontoLimite("93102");
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
	}

	@Cuando("^deje vac�o el rango m�ximo despues de seleccionar un a�o en la unidad de tiempo para la conceptualizaci�n de la propuesta$")
	public void deje_vac�o_el_rango_m�ximo_despues_de_seleccionar_un_a�o_en_la_unidad_de_tiempo_para_la_conceptualizaci�n_de_la_propuesta() throws Throwable {
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
		Global.aplicarScroll("1730");
		// ---------------------------------------------------------------------
        // Elegibilidad y Permanencia
        // ---------------------------------------------------------------------
		Propuesta.ingresarEdadMinima("18");
		Propuesta.ingresarEdadMaxima("66");
		Propuesta.ingresarEdadDePermanencia("99");
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
	}

	@Cuando("^ingrese un nombre de proyecto que ya existe$")
	public void ingrese_un_nombre_de_proyecto_que_ya_existe() throws Throwable {
		// ---------------------------------------------------------------------
        // CONCEPTUALIZAR PROPUESTA
        // ---------------------------------------------------------------------
        // Datos del Proyecto
        // ---------------------------------------------------------------------
		Propuesta.seleccionarTipoDeVenta("Opcional");
		Propuesta.ingresarNombreDelProyectoYaExistente("Prueba Salud");
		Propuesta.seleccionarCompa�ia("PRIMERA ARS DE HUMANO");
		Propuesta.seleccionarRamo("SALUD");
		Propuesta.seleccionarSubRamo("LOCAL");
		Propuesta.seleccionarTipoPlan("OPCIONAL");
		Propuesta.seleccionarModalidad("COLECTIVO EMPRESAS");
		Global.aplicarScroll("500");
		// ---------------------------------------------------------------------
        // Monto Limite
        // ---------------------------------------------------------------------
		Propuesta.ingresarMontoLimite("93102");
		Propuesta.seleccionarUnidadDeTiempoMontoLimite("A�o");
		Propuesta.seleccionarRangoMaximoMontoLimite("Poliza");
		Global.aplicarScroll("1730");
		// ---------------------------------------------------------------------
        // Guardar Propuesta
        // ---------------------------------------------------------------------
		Propuesta.presionarBotonGuardar();
	}

	@Entonces("^deber�a visualizar una notificaci�n indicando que la propuesta ya existe$")
	public void deber�a_visualizar_una_notificaci�n_indicando_que_la_propuesta_ya_existe() throws Throwable {
	    Propuesta.verificarMensajeDePropuestaYaExistente();
	}
	
	@Cuando("^ingrese una edad m�nima que supera la edad m�xima$")
	public void ingrese_una_edad_m�mina_que_supera_la_edad_m�xima() throws Throwable {
		// ---------------------------------------------------------------------
        // CONCEPTUALIZAR PROPUESTA
        // ---------------------------------------------------------------------
        // Datos del Proyecto
        // ---------------------------------------------------------------------
		Propuesta.seleccionarTipoDeVenta("Opcional");
		Propuesta.ingresarNombreDelProyectoYaExistente("Prueba Salud");
		Propuesta.seleccionarCompa�ia("PRIMERA ARS DE HUMANO");
		Propuesta.seleccionarRamo("SALUD");
		Propuesta.seleccionarSubRamo("LOCAL");
		Propuesta.seleccionarTipoPlan("OPCIONAL");
		Propuesta.seleccionarModalidad("COLECTIVO EMPRESAS");
		Global.aplicarScroll("500");
		// ---------------------------------------------------------------------
        // Elegibilidad y Permanencia
        // ---------------------------------------------------------------------
		Propuesta.ingresarEdadMinima("100");
		Propuesta.ingresarEdadMaxima("1");
		Propuesta.ingresarEdadDePermanencia("99");
		// ---------------------------------------------------------------------
        // Monto Limite
        // ---------------------------------------------------------------------
		Propuesta.ingresarMontoLimite("93102");
		Propuesta.seleccionarUnidadDeTiempoMontoLimite("A�o");
		Propuesta.seleccionarRangoMaximoMontoLimite("Poliza");
		Global.aplicarScroll("1730");
		// ---------------------------------------------------------------------
        // Guardar Propuesta
        // ---------------------------------------------------------------------
		Propuesta.presionarBotonGuardar();
	}
	
	@Entonces("^deber�a visualizar una notificaci�n indicando que la edad m�nima no puede superar la edad m�xima$")
	public void deber�a_visualizar_una_notificaci�n_indicando_que_la_edad_m�nima_no_puede_superar_la_edad_m�xima() throws Throwable {
	    Propuesta.verificarMensajeDeEdadDePermanencia();
	}
}
