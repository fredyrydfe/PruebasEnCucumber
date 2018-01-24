package definicionDePasos;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import mapaDeObjetos.Beneficios;

public class EliminarGrupoDeCoberturaSalud {

	@Cuando("^elimine el grupo de cobertura asociado a la categoría de salud$")
	public void elimine_el_grupo_de_cobertura_asociado_a_la_categoría_de_salud() throws Throwable {
		// ---------------------------------------------------------------------
		// CONFIGURAR BENEFICIOS
		// ---------------------------------------------------------------------
		Beneficios.presionarBotonEliminar("Grupo");
	}

	@Entonces("^debería visualizar una notificación solicitando la confirmación para la eliminación del grupo de cobertura$")
	public void debería_visualizar_una_notificación_solicitando_la_confirmación_para_la_eliminación_del_grupo_de_cobertura()
			throws Throwable {
		Beneficios.verificarMensajeDeConfirmacionParaLaEliminacionDelBeneficio("grupo de cobertura");
	}

	@Entonces("^una vez confirme la eliminación debería visualizar una notificación indicando la eliminación del grupo de cobertura$")
	public void una_vez_confirme_la_eliminación_debería_visualizar_una_notificación_indicando_la_eliminación_del_grupo_de_cobertura()
			throws Throwable {
		Beneficios.presionarBotonConfirmarEliminacion();
		Beneficios.verificarMensajeDeEliminacionDelBeneficio("Grupo");
		Beneficios.presionarBotonCerrar();
	}

}
