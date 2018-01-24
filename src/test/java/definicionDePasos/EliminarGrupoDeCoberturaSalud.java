package definicionDePasos;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import mapaDeObjetos.Beneficios;

public class EliminarGrupoDeCoberturaSalud {

	@Cuando("^elimine el grupo de cobertura asociado a la categor�a de salud$")
	public void elimine_el_grupo_de_cobertura_asociado_a_la_categor�a_de_salud() throws Throwable {
		// ---------------------------------------------------------------------
		// CONFIGURAR BENEFICIOS
		// ---------------------------------------------------------------------
		Beneficios.presionarBotonEliminar("Grupo");
	}

	@Entonces("^deber�a visualizar una notificaci�n solicitando la confirmaci�n para la eliminaci�n del grupo de cobertura$")
	public void deber�a_visualizar_una_notificaci�n_solicitando_la_confirmaci�n_para_la_eliminaci�n_del_grupo_de_cobertura()
			throws Throwable {
		Beneficios.verificarMensajeDeConfirmacionParaLaEliminacionDelBeneficio("grupo de cobertura");
	}

	@Entonces("^una vez confirme la eliminaci�n deber�a visualizar una notificaci�n indicando la eliminaci�n del grupo de cobertura$")
	public void una_vez_confirme_la_eliminaci�n_deber�a_visualizar_una_notificaci�n_indicando_la_eliminaci�n_del_grupo_de_cobertura()
			throws Throwable {
		Beneficios.presionarBotonConfirmarEliminacion();
		Beneficios.verificarMensajeDeEliminacionDelBeneficio("Grupo");
		Beneficios.presionarBotonCerrar();
	}

}
