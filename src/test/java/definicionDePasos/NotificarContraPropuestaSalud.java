package definicionDePasos;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import mapaDeObjetos.Beneficios;
import mapaDeObjetos.Menu;
import mapaDeObjetos.Propuesta;

public class NotificarContraPropuestaSalud {

	@Entonces("^debería visualizar la propuesta en estado Conceptualizado$")
	public void debería_visualizar_la_propuesta_en_estado_Conceptualizado() throws Throwable {
		// ---------------------------------------------------------------------
		// CONCEPTUALIZAR PROPUESTA
		// ---------------------------------------------------------------------
		Propuesta.verificarEstadoDeLaPropuesta("Conceptualizado");
	}

	@Entonces("^no debería poder modificar el cuadro de beneficios de la nueva propuesta$")
	public void no_debería_poder_modificar_el_cuadro_de_beneficios_de_la_nueva_propuesta() throws Throwable {
		// ---------------------------------------------------------------------
		// CONCEPTUALIZAR PROPUESTA
		// ---------------------------------------------------------------------
		// Seleccionar opciones de menú
		// ---------------------------------------------------------------------
		Menu.ingresarALaOpcionDePropuestas();
		Menu.ingresarALaOpcion("Información General");
		Menu.ingresarAlaPropuesta();
		Menu.ingresarALaOpcion("Beneficios");
		Menu.ingresarALaSegundaVersionDeLaPropuesta();
		Menu.ingresarALaOpcion("Ver Detalle");
		// ---------------------------------------------------------------------
		// CONFIGURAR BENEFICIOS
		// ---------------------------------------------------------------------
		Beneficios.verificarSiElBotonAñadirCategoriaEsVisible();
		Beneficios.verificarSiElBotonAñadirBeneficioEsVisible();
	}

	@Cuando("^notifique la contrapropuesta al área de productos$")
	public void notifique_la_contrapropuesta_al_área_de_productos() throws Throwable {
		// ---------------------------------------------------------------------
		// CONCEPTUALIZAR PROPUESTA
		// ---------------------------------------------------------------------
		Propuesta.presionarBotonNotificarAlAreaDeProductos();
	}

	@Entonces("^no debería poder modificar el cuadro de beneficios de la nueva propuesta con el usuario técnico$")
	public void no_debería_poder_modificar_el_cuadro_de_beneficios_de_la_nueva_propuesta_con_el_usuario_técnico()
			throws Throwable {
		// ---------------------------------------------------------------------
		// CONCEPTUALIZAR PROPUESTA
		// ---------------------------------------------------------------------
		// Seleccionar opciones de menú
		// ---------------------------------------------------------------------
		Menu.ingresarALaOpcionDePropuestas();
		Menu.ingresarALaOpcion("Información General");
		Menu.ingresarAlaPropuestaConElUsuarioTecnico();
		Menu.ingresarALaOpcion("Beneficios");
		Menu.ingresarALaSegundaVersionDeLaPropuestaConElUsuarioTecnico();
		Menu.ingresarALaOpcion("Ver Detalle");
		// ---------------------------------------------------------------------
		// CONFIGURAR BENEFICIOS
		// ---------------------------------------------------------------------
		Beneficios.verificarSiElBotonAñadirCategoriaEsVisible();
		Beneficios.verificarSiElBotonAñadirBeneficioEsVisible();
	}

}
