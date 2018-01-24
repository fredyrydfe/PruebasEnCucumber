package definicionDePasos;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import mapaDeObjetos.Beneficios;

public class EliminarCategoriaSalud {

	@Cuando("^elimine la categoría asociada a la propuesta de salud$")
	public void elimine_la_categoría_asociada_a_la_propuesta_de_salud() throws Throwable {
		// ---------------------------------------------------------------------
		// CONFIGURAR BENEFICIOS
		// ---------------------------------------------------------------------
		Beneficios.presionarBotonEliminar("Categoría");
	}

	@Entonces("^debería visualizar una notificación solicitando la confirmación para la eliminación de la categoría$")
	public void debería_visualizar_una_notificación_solicitando_la_confirmación_para_la_eliminación_de_la_categoría()
			throws Throwable {
		Beneficios.verificarMensajeDeConfirmacionParaLaEliminacionDelBeneficio("categoría");
	}

	@Entonces("^una vez confirme la eliminación debería visualizar una notificación indicando la eliminación de la categoría$")
	public void una_vez_confirme_la_eliminación_debería_visualizar_una_notificación_indicando_la_eliminación_de_la_categoría()
			throws Throwable {
		Beneficios.presionarBotonConfirmarEliminacion();
		Beneficios.verificarMensajeDeEliminacionDelBeneficio("Categoría");
		Beneficios.presionarBotonCerrar();
	}

}
