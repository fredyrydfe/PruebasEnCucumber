package definicionDePasos;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import mapaDeObjetos.Beneficios;

public class EliminarCoberturaSalud {

	@Cuando("^elimine la cobertura asociada al tipo de cobertura de salud$")
	public void elimine_la_cobertura_asociada_al_tipo_de_cobertura_de_salud() throws Throwable {
		// ---------------------------------------------------------------------
		// CONFIGURAR BENEFICIOS
		// ---------------------------------------------------------------------
		Beneficios.ingresarAlTipoDeCoberturaQueContieneLasCoberturasAsociadas();
		// ---------------------------------------------------------------------
		// CONFIGURAR COBERTURA
		// ---------------------------------------------------------------------
		Beneficios.presionarBotonEliminar("Cobertura");
	}

	@Entonces("^deber�a visualizar una notificaci�n solicitando la confirmaci�n para la eliminaci�n de la cobertura$")
	public void deber�a_visualizar_una_notificaci�n_solicitando_la_confirmaci�n_para_la_eliminaci�n_de_la_cobertura()
			throws Throwable {
		Beneficios.verificarMensajeDeConfirmacionParaLaEliminacionDelBeneficio("cobertura");
	}

	@Entonces("^una vez confirme la eliminaci�n deber�a visualizar una notificaci�n indicando la eliminaci�n de la cobertura$")
	public void una_vez_confirme_la_eliminaci�n_deber�a_visualizar_una_notificaci�n_indicando_la_eliminaci�n_de_la_cobertura()
			throws Throwable {
		Beneficios.presionarBotonConfirmarEliminacion();
		Beneficios.verificarMensajeDeEliminacionDelBeneficio("Cobertura");
		Beneficios.presionarBotonCerrar();
	}
	
	@Entonces("^no deber�a visualizar el beneficio en la pantalla de coberturas$")
	public void no_deber�a_visualizar_el_beneficio_en_la_pantalla_de_coberturas() throws Throwable {
		Beneficios.verificarEliminacionDeLaCobertura();
	}

}
