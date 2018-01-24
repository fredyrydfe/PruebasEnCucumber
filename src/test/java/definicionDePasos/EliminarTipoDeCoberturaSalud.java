package definicionDePasos;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import mapaDeObjetos.Beneficios;

public class EliminarTipoDeCoberturaSalud {

	@Cuando("^elimine el tipo de cobertura asociado al servicio de salud$")
	public void elimine_el_tipo_de_cobertura_asociado_al_servicio_de_salud() throws Throwable {
		// ---------------------------------------------------------------------
		// CONFIGURAR BENEFICIOS
		// ---------------------------------------------------------------------
		Beneficios.presionarBotonEliminar("Tipo de cobertura");
	}

	@Entonces("^deber�a visualizar una notificaci�n solicitando la confirmaci�n para la eliminaci�n del tipo de cobertura$")
	public void deber�a_visualizar_una_notificaci�n_solicitando_la_confirmaci�n_para_la_eliminaci�n_del_tipo_de_cobertura()
			throws Throwable {
		Beneficios.verificarMensajeDeConfirmacionParaLaEliminacionDelBeneficio("tipo de cobertura");
	}

	@Entonces("^una vez confirme la eliminaci�n deber�a visualizar una notificaci�n indicando la eliminaci�n del tipo de cobertura$")
	public void una_vez_confirme_la_eliminaci�n_deber�a_visualizar_una_notificaci�n_indicando_la_eliminaci�n_del_tipo_de_cobertura()
			throws Throwable {
		Beneficios.presionarBotonConfirmarEliminacion();
		Beneficios.verificarMensajeDeEliminacionDelBeneficio("Tipo de cobertura");
		Beneficios.presionarBotonCerrar();
	}

}
