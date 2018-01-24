package definicionDePasos;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import mapaDeObjetos.Menu;
import mapaDeObjetos.Propuesta;

public class AprobarPropuestaSalud {

	@Cuando("^he aprobado la propuesta$")
	public void he_aprobado_la_propuesta() throws Throwable {
		// ---------------------------------------------------------------------
		// CONFIGURAR PRIMAS
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
		Propuesta.seleccionarEstado("Pre-Aprobado");
		Propuesta.presionarBotonGuardar();
		Propuesta.verificarMensajeDeConfirmacionParaLaModificacionDeLaPropuesta();
		Propuesta.presionarBotonGuardarCambios();
	}

	@Entonces("^debería visualizar una notificación indicando que la propuesta ha sido pre-aprobada$")
	public void debería_visualizar_una_notificación_indicando_que_la_propuesta_ha_sido_pre_aprobada() throws Throwable {
		Propuesta.verificarMensajeDeAprobacionDeLaPropuesta();
		Propuesta.presionarBotonCerrar();
	}

}
