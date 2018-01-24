package definicionDePasos;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import mapaDeObjetos.Beneficios;

public class EliminarCategoriaSalud {

	@Cuando("^elimine la categor�a asociada a la propuesta de salud$")
	public void elimine_la_categor�a_asociada_a_la_propuesta_de_salud() throws Throwable {
		// ---------------------------------------------------------------------
		// CONFIGURAR BENEFICIOS
		// ---------------------------------------------------------------------
		Beneficios.presionarBotonEliminar("Categor�a");
	}

	@Entonces("^deber�a visualizar una notificaci�n solicitando la confirmaci�n para la eliminaci�n de la categor�a$")
	public void deber�a_visualizar_una_notificaci�n_solicitando_la_confirmaci�n_para_la_eliminaci�n_de_la_categor�a()
			throws Throwable {
		Beneficios.verificarMensajeDeConfirmacionParaLaEliminacionDelBeneficio("categor�a");
	}

	@Entonces("^una vez confirme la eliminaci�n deber�a visualizar una notificaci�n indicando la eliminaci�n de la categor�a$")
	public void una_vez_confirme_la_eliminaci�n_deber�a_visualizar_una_notificaci�n_indicando_la_eliminaci�n_de_la_categor�a()
			throws Throwable {
		Beneficios.presionarBotonConfirmarEliminacion();
		Beneficios.verificarMensajeDeEliminacionDelBeneficio("Categor�a");
		Beneficios.presionarBotonCerrar();
	}

}
