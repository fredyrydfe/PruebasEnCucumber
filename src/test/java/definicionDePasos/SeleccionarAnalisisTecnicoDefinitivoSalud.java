package definicionDePasos;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import mapaDeObjetos.Beneficios;
import mapaDeObjetos.Menu;
import mapaDeObjetos.Primas;

public class SeleccionarAnalisisTecnicoDefinitivoSalud {

	@Cuando("^he seleccionado un an�lisis t�cnico como definitivo$")
	public void he_seleccionado_un_an�lisis_t�cnico_como_definitivo() throws Throwable {
		// ---------------------------------------------------------------------
		// CONCEPTUALIZAR PROPUESTA
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
		Beneficios.presionarBotonPrimas();
		// ---------------------------------------------------------------------
		// CONFIGURAR PRIMAS
		// ---------------------------------------------------------------------
		Primas.presionarBotonSeleccionarComoDefinitivo();
	}
	
	@Entonces("^deber�a visualizar una notificaci�n solicitando la confirmaci�n de la selecci�n del �nalisis t�cnico definitivo$")
	public void deber�a_visualizar_una_notificaci�n_solicitando_la_confirmaci�n_de_la_selecci�n_del_�nalisis_t�cnico_definitivo() throws Throwable {
	    Primas.verificarMensajeDeConfirmacionDeLaSeleccionDelAnalisisTecnico();
	}

	@Entonces("^deber�a visualizar una notificaci�n indicando la selecci�n del an�lisis t�cnico definitivo$")
	public void deber�a_visualizar_una_notificaci�n_indicando_la_selecci�n_del_an�lisis_t�cnico_definitivo()
			throws Throwable {
		Primas.presionarBotonConfirmarAnalisisTecnicoDefinitivo();
		Primas.verificarSiElBotonDeseleccionarComoDefinitivoEsVisible();
	}

}
