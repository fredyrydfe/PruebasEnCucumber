package definicionDePasos;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import mapaDeObjetos.Beneficios;
import mapaDeObjetos.Global;
import mapaDeObjetos.Menu;
import mapaDeObjetos.Primas;
import mapaDeObjetos.Propuesta;

public class NotificarAsignacionDeCaracteristicasTecnicas {

	@Cuando("^notifique la propuesta al �rea de productos$")
	public void notifique_la_propuesta_al_�rea_de_productos() throws Throwable {
		// ---------------------------------------------------------------------
		// CONFIGURAR PRIMAS
		// ---------------------------------------------------------------------
		Primas.verificarMensajeDeGuardadoDeLaPrimaUnica();
		Primas.presionarBotonCerrar();
		// ---------------------------------------------------------------------
		// Seleccionar opciones de men�
		// ---------------------------------------------------------------------
		Menu.ingresarALaOpcionDePropuestas();
		Menu.ingresarALaOpcion("Informaci�n General");
		Menu.ingresarAlaPropuestaConElUsuarioTecnico();
		Menu.ingresarALaOpcionDeConceptualizacion();
		// ---------------------------------------------------------------------
		// CONCEPTUALIZAR PROPUESTA
		// ---------------------------------------------------------------------
		Propuesta.presionarBotonNotificarAlAreaDeProductos();
	}

	@Entonces("^no deber�a poder visualizar el bot�n de notificar al �rea de productos en la pantalla de la propuesta$")
	public void no_deber�a_poder_visualizar_el_bot�n_de_notificar_al_�rea_de_productos_en_la_pantalla_de_la_propuesta()
			throws Throwable {
		Propuesta.verificarSiElBotonNotificarAlAreaDeProductosEsVisible();
	}

	@Cuando("^intente notificar la propuesta al �rea de productos$")
	public void intente_notificar_la_propuesta_al_�rea_de_productos() throws Throwable {
		// ---------------------------------------------------------------------
		// CONCEPTUALIZAR PROPUESTA
		// ---------------------------------------------------------------------
		Global.aplicarScroll("1800");
		Propuesta.verificarSiElBotonNotificarAlAreaDeProductosEsVisible();
	}

	@Entonces("^no deber�a poder modificar el cuadro de beneficios con el usuario t�cnico$")
	public void no_deber�a_poder_modificar_el_cuadro_de_beneficios_con_el_usuario_t�cnico() throws Throwable {
		// ---------------------------------------------------------------------
		// CONCEPTUALIZAR PROPUESTA
		// ---------------------------------------------------------------------
		// Seleccionar opciones de men�
		// ---------------------------------------------------------------------
		Menu.ingresarALaOpcionDePropuestas();
		Menu.ingresarALaOpcion("Informaci�n General");
		Menu.ingresarAlaPropuestaConElUsuarioTecnico();
		Menu.ingresarALaOpcion("Beneficios");
		Menu.ingresarALaPrimeraVersionDeLaPropuestaConElUsuarioTecnico();
		Menu.ingresarALaOpcion("Ver Detalle");
		// ---------------------------------------------------------------------
		// CONFIGURAR BENEFICIOS
		// ---------------------------------------------------------------------
		Beneficios.verificarSiElBotonA�adirCategoriaEsVisible();
		Beneficios.verificarSiElBotonA�adirBeneficioEsVisible();
	}

	@Entonces("^deber�a visualizar la propuesta en estado Evaluado$")
	public void deber�a_visualizar_la_propuesta_en_estado_Evaluado() throws Throwable {
		// ---------------------------------------------------------------------
		// CONCEPTUALIZAR PROPUESTA
		// ---------------------------------------------------------------------
		Propuesta.verificarEstadoDeLaPropuesta("Evaluado");
	}

}
