package definicionDePasos;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import mapaDeObjetos.Beneficios;
import mapaDeObjetos.Global;
import mapaDeObjetos.Menu;
import mapaDeObjetos.Primas;
import mapaDeObjetos.Propuesta;

public class NotificarPropuestaAlAreaTecnica {

	@Cuando("^notifique la propuesta al área técnica$")
	public void notifique_la_propuesta_al_área_técnica() throws Throwable {
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
	}

	@Entonces("^debería visualizar una notificación indicando que la propuesta ha sido notificada$")
	public void debería_visualizar_una_notificación_indicando_que_la_propuesta_ha_sido_notificada() throws Throwable {
		Propuesta.verificarMensajeDePropuestaNotificadaAlAreaTecnica();
		Propuesta.presionarBotonCerrar();
	}

	@Entonces("^no debería poder visualizar el botón de notificar al área técnica en la pantalla de la propuesta$")
	public void no_debería_poder_visualizar_el_botón_de_notificar_al_área_técnica_en_la_pantalla_de_la_propuesta() throws Throwable {
		Propuesta.verificarSiElBotonNotificarAlAreaTecnicaEsVisible();
	}

	@Entonces("^no debería poder modificar la propuesta$")
	public void no_debería_poder_modificar_la_propuesta() throws Throwable {
		Propuesta.verificarSiElBotonGuardarEsVisible();
	}

	@Entonces("^no debería poder modificar el cuadro de beneficios$")
	public void no_debería_poder_modificar_el_cuadro_de_beneficios() throws Throwable {
		// ---------------------------------------------------------------------
		// CONCEPTUALIZAR PROPUESTA
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
		Beneficios.verificarSiElBotonAñadirCategoriaEsVisible();
		Beneficios.verificarSiElBotonAñadirBeneficioEsVisible();
	}

	@Entonces("^no debería poder modificar la información de primas$")
	public void no_debería_poder_modificar_la_información_de_primas() throws Throwable {
		// ---------------------------------------------------------------------
		// CONFIGURAR BENEFICIOS
		// ---------------------------------------------------------------------
		Beneficios.presionarBotonPrimas();
		// ---------------------------------------------------------------------
		// CONFIGURAR PRIMAS
		// ---------------------------------------------------------------------
		Primas.verificarSiElBotonGuardarEsVisible();
	}

	@Cuando("^intente notificar la propuesta al área técnica$")
	public void intente_notificar_la_propuesta_al_área_técnica() throws Throwable {
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
		Global.aplicarScroll("1800");
		Propuesta.verificarSiElBotonNotificarAlAreaTecnicaEsVisible();
	}

	@Dado("^he creado una conceptualización de propuesta de salud con información sin diligenciar$")
	public void he_creado_una_conceptualización_de_propuesta_de_salud_con_información_sin_diligenciar()
			throws Throwable {
		// ---------------------------------------------------------------------
		// Opciones de menú
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
		Propuesta.seleccionarCompañia("PRIMERA ARS DE HUMANO");
		Propuesta.seleccionarRamo("SALUD");
		Propuesta.seleccionarSubRamo("LOCAL");
		Propuesta.seleccionarTipoPlan("OPCIONAL");
		Propuesta.seleccionarModalidad("COLECTIVO EMPRESAS");
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
		Propuesta.seleccionarUnidadDeTiempoCoaseguroLocal("Año");
		Propuesta.seleccionarRangoMaximoDelCoaseguroLocal("Poliza");
		Propuesta.ingresarPorcentajeDefinitivoDelCoaseguroLocal("50");
		// ---------------------------------------------------------------------
		// Coaseguro Internacional
		// ---------------------------------------------------------------------
		Propuesta.ingresarPorcentajeDeCoaseguroInternacional("50");
		Propuesta.ingresarMontoDeCoaseguroInternacional("390000");
		Propuesta.seleccionarUnidadDeTiempoCoaseguroInternacional("Año");
		Propuesta.seleccionarRangoMaximoDelCoaseguroInternacional("Poliza");
		Propuesta.ingresarPorcentajeDefinitivoDelCoaseguroInternacional("50");
		Global.aplicarScroll("1350");
		// ---------------------------------------------------------------------
		// Reembolso Local
		// ---------------------------------------------------------------------
		Propuesta.seleccionarTipoDeReembolsoLocal("Monto Reclamado");
		Propuesta.ingresarPorcentajeDeReembolsoLocal("10");
		Propuesta.ingresarFrecuenciaDeReembolsoLocal("2");
		Propuesta.seleccionarUnidadDeTiempoRemmbolsoLocal("Año");
		Propuesta.seleccionarRangoMaximoRemmbolsoLocal("Poliza");
		Propuesta.ingresarMontoDelRemmbolsoLocal("1000000");
		Propuesta.seleccionarUnidadDeTiempoMontoRemmbolsoLocal("Año");
		Propuesta.seleccionarRangoMaximoMontoRemmbolsoLocal("Poliza");
		// ---------------------------------------------------------------------
		// Reembolso Internacional
		// ---------------------------------------------------------------------
		Propuesta.seleccionarTipoDeReembolsoInternacional("Monto Reclamado");
		Propuesta.ingresarPorcentajeDeReembolsoInternacional("10");
		Propuesta.ingresarFrecuenciaDeReembolsoInternacional("2");
		Propuesta.seleccionarUnidadDeTiempoRemmbolsoInternacional("Año");
		Propuesta.seleccionarRangoMaximoRemmbolsoInternacional("Poliza");
		Propuesta.ingresarMontoDelRemmbolsoInternacional("1000000");
		Propuesta.seleccionarUnidadDeTiempoMontoRemmbolsoInternacional("Año");
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
		Propuesta.ingresarMontoLimite("100000");
		Propuesta.seleccionarUnidadDeTiempoMontoLimite("Año");
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
		Propuesta.presionarBotonCerrar();
	}

}
