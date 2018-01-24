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

	@Entonces("^debería visualizar una notificación solicitando la confirmación para la eliminación del servicio$")
	public void debería_visualizar_una_notificación_solicitando_la_confirmación_para_la_eliminación_del_servicio()
			throws Throwable {
		Beneficios.verificarMensajeDeConfirmacionParaLaEliminacionDelBeneficio("servicio");
	}

	@Entonces("^una vez confirme la eliminación debería visualizar una notificación indicando la eliminación del servicio$")
	public void una_vez_confirme_la_eliminación_debería_visualizar_una_notificación_indicando_la_eliminación_del_servicio()
			throws Throwable {
		Beneficios.presionarBotonConfirmarEliminacion();
		Beneficios.verificarMensajeDeEliminacionDelBeneficio("Servicio");
		Beneficios.presionarBotonCerrar();
	}

}
