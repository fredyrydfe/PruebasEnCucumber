package definicionDePasos;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import mapaDeObjetos.Beneficios;
import mapaDeObjetos.Menu;
import mapaDeObjetos.Propuesta;

public class NotificarContraPropuestaSalud {

	@Entonces("^deber�a visualizar la propuesta en estado Conceptualizado$")
	public void deber�a_visualizar_la_propuesta_en_estado_Conceptualizado() throws Throwable {
		// ---------------------------------------------------------------------
		// CONCEPTUALIZAR PROPUESTA
		// ---------------------------------------------------------------------
		Propuesta.verificarEstadoDeLaPropuesta("Conceptualizado");
	}

	@Entonces("^no deber�a poder modificar el cuadro de beneficios de la nueva propuesta$")
	public void no_deber�a_poder_modificar_el_cuadro_de_beneficios_de_la_nueva_propuesta() throws Throwable {
		// ---------------------------------------------------------------------
		// CONCEPTUALIZAR PROPUESTA
		// ---------------------------------------------------------------------
		// Seleccionar opciones de men�
		// ---------------------------------------------------------------------
		Menu.ingresarALaOpcionDePropuestas();
		Menu.ingresarALaOpcion("Informaci�n General");
		Menu.ingresarAlaPropuesta();
		Menu.ingresarALaOpcion("Beneficios");
		Menu.ingresarALaSegundaVersionDeLaPropuesta();
		Menu.ingresarALaOpcion("Ver Detalle");
		// ---------------------------------------------------------------------
		// CONFIGURAR BENEFICIOS
		// ---------------------------------------------------------------------
		Beneficios.verificarSiElBotonA�adirCategoriaEsVisible();
		Beneficios.verificarSiElBotonA�adirBeneficioEsVisible();
	}

	@Cuando("^notifique la contrapropuesta al �rea de productos$")
	public void notifique_la_contrapropuesta_al_�rea_de_productos() throws Throwable {
		// ---------------------------------------------------------------------
		// CONCEPTUALIZAR PROPUESTA
		// ---------------------------------------------------------------------
		Propuesta.presionarBotonNotificarAlAreaDeProductos();
	}

	@Entonces("^no deber�a poder modificar el cuadro de beneficios de la nueva propuesta con el usuario t�cnico$")
	public void no_deber�a_poder_modificar_el_cuadro_de_beneficios_de_la_nueva_propuesta_con_el_usuario_t�cnico()
			throws Throwable {
		// ---------------------------------------------------------------------
		// CONCEPTUALIZAR PROPUESTA
		// ---------------------------------------------------------------------
		// Seleccionar opciones de men�
		// ---------------------------------------------------------------------
		Menu.ingresarALaOpcionDePropuestas();
		Menu.ingresarALaOpcion("Informaci�n General");
		Menu.ingresarAlaPropuestaConElUsuarioTecnico();
		Menu.ingresarALaOpcion("Beneficios");
		Menu.ingresarALaSegundaVersionDeLaPropuestaConElUsuarioTecnico();
		Menu.ingresarALaOpcion("Ver Detalle");
		// ---------------------------------------------------------------------
		// CONFIGURAR BENEFICIOS
		// ---------------------------------------------------------------------
		Beneficios.verificarSiElBotonA�adirCategoriaEsVisible();
		Beneficios.verificarSiElBotonA�adirBeneficioEsVisible();
	}

}
