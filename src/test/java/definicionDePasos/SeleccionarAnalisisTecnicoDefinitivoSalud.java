package definicionDePasos;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import mapaDeObjetos.Beneficios;
import mapaDeObjetos.Menu;
import mapaDeObjetos.Primas;

public class SeleccionarAnalisisTecnicoDefinitivoSalud {

	@Cuando("^he seleccionado un análisis técnico como definitivo$")
	public void he_seleccionado_un_análisis_técnico_como_definitivo() throws Throwable {
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
		Beneficios.presionarBotonPrimas();
		// ---------------------------------------------------------------------
		// CONFIGURAR PRIMAS
		// ---------------------------------------------------------------------
		Primas.presionarBotonSeleccionarComoDefinitivo();
	}
	
	@Entonces("^debería visualizar una notificación solicitando la confirmación de la selección del ánalisis técnico definitivo$")
	public void debería_visualizar_una_notificación_solicitando_la_confirmación_de_la_selección_del_ánalisis_técnico_definitivo() throws Throwable {
	    Primas.verificarMensajeDeConfirmacionDeLaSeleccionDelAnalisisTecnico();
	}

	@Entonces("^debería visualizar una notificación indicando la selección del análisis técnico definitivo$")
	public void debería_visualizar_una_notificación_indicando_la_selección_del_análisis_técnico_definitivo()
			throws Throwable {
		Primas.presionarBotonConfirmarAnalisisTecnicoDefinitivo();
		Primas.verificarSiElBotonDeseleccionarComoDefinitivoEsVisible();
	}

}
