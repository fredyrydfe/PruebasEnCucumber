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

	@Entonces("^debería visualizar una notificación solicitando la confirmación para la eliminación del tipo de cobertura$")
	public void debería_visualizar_una_notificación_solicitando_la_confirmación_para_la_eliminación_del_tipo_de_cobertura()
			throws Throwable {
		Beneficios.verificarMensajeDeConfirmacionParaLaEliminacionDelBeneficio("tipo de cobertura");
	}

	@Entonces("^una vez confirme la eliminación debería visualizar una notificación indicando la eliminación del tipo de cobertura$")
	public void una_vez_confirme_la_eliminación_debería_visualizar_una_notificación_indicando_la_eliminación_del_tipo_de_cobertura()
			throws Throwable {
		Beneficios.presionarBotonConfirmarEliminacion();
		Beneficios.verificarMensajeDeEliminacionDelBeneficio("Tipo de cobertura");
		Beneficios.presionarBotonCerrar();
	}

}
