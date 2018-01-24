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

	@Entonces("^debería visualizar una notificación solicitando la confirmación para la eliminación de la cobertura$")
	public void debería_visualizar_una_notificación_solicitando_la_confirmación_para_la_eliminación_de_la_cobertura()
			throws Throwable {
		Beneficios.verificarMensajeDeConfirmacionParaLaEliminacionDelBeneficio("cobertura");
	}

	@Entonces("^una vez confirme la eliminación debería visualizar una notificación indicando la eliminación de la cobertura$")
	public void una_vez_confirme_la_eliminación_debería_visualizar_una_notificación_indicando_la_eliminación_de_la_cobertura()
			throws Throwable {
		Beneficios.presionarBotonConfirmarEliminacion();
		Beneficios.verificarMensajeDeEliminacionDelBeneficio("Cobertura");
		Beneficios.presionarBotonCerrar();
	}
	
	@Entonces("^no debería visualizar el beneficio en la pantalla de coberturas$")
	public void no_debería_visualizar_el_beneficio_en_la_pantalla_de_coberturas() throws Throwable {
		Beneficios.verificarEliminacionDeLaCobertura();
	}

}
