package definicionDePasos;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import mapaDeObjetos.Beneficios;
import mapaDeObjetos.Global;
import mapaDeObjetos.Menu;
import mapaDeObjetos.Primas;
import mapaDeObjetos.Propuesta;

public class NotificarAsignacionDeCaracteristicasTecnicas {

	@Cuando("^notifique la propuesta al área de productos$")
	public void notifique_la_propuesta_al_área_de_productos() throws Throwable {
		// ---------------------------------------------------------------------
		// CONFIGURAR PRIMAS
		// ---------------------------------------------------------------------
		Primas.verificarMensajeDeGuardadoDeLaPrimaUnica();
		Primas.presionarBotonCerrar();
		// ---------------------------------------------------------------------
		// Seleccionar opciones de menú
		// ---------------------------------------------------------------------
		Menu.ingresarALaOpcionDePropuestas();
		Menu.ingresarALaOpcion("Información General");
		Menu.ingresarAlaPropuestaConElUsuarioTecnico();
		Menu.ingresarALaOpcionDeConceptualizacion();
		// ---------------------------------------------------------------------
		// CONCEPTUALIZAR PROPUESTA
		// ---------------------------------------------------------------------
		Propuesta.presionarBotonNotificarAlAreaDeProductos();
	}

	@Entonces("^no debería poder visualizar el botón de notificar al área de productos en la pantalla de la propuesta$")
	public void no_debería_poder_visualizar_el_botón_de_notificar_al_área_de_productos_en_la_pantalla_de_la_propuesta()
			throws Throwable {
		Propuesta.verificarSiElBotonNotificarAlAreaDeProductosEsVisible();
	}

	@Cuando("^intente notificar la propuesta al área de productos$")
	public void intente_notificar_la_propuesta_al_área_de_productos() throws Throwable {
		// ---------------------------------------------------------------------
		// CONCEPTUALIZAR PROPUESTA
		// ---------------------------------------------------------------------
		Global.aplicarScroll("1800");
		Propuesta.verificarSiElBotonNotificarAlAreaDeProductosEsVisible();
	}

	@Entonces("^no debería poder modificar el cuadro de beneficios con el usuario técnico$")
	public void no_debería_poder_modificar_el_cuadro_de_beneficios_con_el_usuario_técnico() throws Throwable {
		// ---------------------------------------------------------------------
		// CONCEPTUALIZAR PROPUESTA
		// ---------------------------------------------------------------------
		// Seleccionar opciones de menú
		// ---------------------------------------------------------------------
		Menu.ingresarALaOpcionDePropuestas();
		Menu.ingresarALaOpcion("Información General");
		Menu.ingresarAlaPropuestaConElUsuarioTecnico();
		Menu.ingresarALaOpcion("Beneficios");
		Menu.ingresarALaPrimeraVersionDeLaPropuestaConElUsuarioTecnico();
		Menu.ingresarALaOpcion("Ver Detalle");
		// ---------------------------------------------------------------------
		// CONFIGURAR BENEFICIOS
		// ---------------------------------------------------------------------
		Beneficios.verificarSiElBotonAñadirCategoriaEsVisible();
		Beneficios.verificarSiElBotonAñadirBeneficioEsVisible();
	}

	@Entonces("^debería visualizar la propuesta en estado Evaluado$")
	public void debería_visualizar_la_propuesta_en_estado_Evaluado() throws Throwable {
		// ---------------------------------------------------------------------
		// CONCEPTUALIZAR PROPUESTA
		// ---------------------------------------------------------------------
		Propuesta.verificarEstadoDeLaPropuesta("Evaluado");
	}

}
