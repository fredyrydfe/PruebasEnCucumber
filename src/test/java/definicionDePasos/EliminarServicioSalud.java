package definicionDePasos;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import mapaDeObjetos.Beneficios;

public class EliminarServicioSalud {

	@Cuando("^elimine el servicio asociado al grupo de cobertura de salud$")
	public void elimine_el_servicio_asociado_al_grupo_de_cobertura_de_salud() throws Throwable {
		// ---------------------------------------------------------------------
		// CONFIGURAR BENEFICIOS
		// ---------------------------------------------------------------------
		Beneficios.presionarBotonEliminar("Servicio");
	}

	@Entonces("^deber�a visualizar una notificaci�n solicitando la confirmaci�n para la eliminaci�n del servicio$")
	public void deber�a_visualizar_una_notificaci�n_solicitando_la_confirmaci�n_para_la_eliminaci�n_del_servicio()
			throws Throwable {
		Beneficios.verificarMensajeDeConfirmacionParaLaEliminacionDelBeneficio("servicio");
	}

	@Entonces("^una vez confirme la eliminaci�n deber�a visualizar una notificaci�n indicando la eliminaci�n del servicio$")
	public void una_vez_confirme_la_eliminaci�n_deber�a_visualizar_una_notificaci�n_indicando_la_eliminaci�n_del_servicio()
			throws Throwable {
		Beneficios.presionarBotonConfirmarEliminacion();
		Beneficios.verificarMensajeDeEliminacionDelBeneficio("Servicio");
		Beneficios.presionarBotonCerrar();
	}

}
