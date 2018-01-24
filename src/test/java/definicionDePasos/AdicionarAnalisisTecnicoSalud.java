package definicionDePasos;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import mapaDeObjetos.Beneficios;
import mapaDeObjetos.Consulta;
import mapaDeObjetos.Global;
import mapaDeObjetos.Login;
import mapaDeObjetos.Menu;
import mapaDeObjetos.Primas;
import mapaDeObjetos.Propuesta;

public class AdicionarAnalisisTecnicoSalud {

	@Cuando("^adicione un nuevo análisis técnico a la propuesta$")
	public void adicione_un_nuevo_análisis_técnico_a_la_propuesta() throws Throwable {
		// ---------------------------------------------------------------------
		// CONFIGURAR PRIMAS
		// ---------------------------------------------------------------------
		Primas.verificarMensajeDeGuardadoDeLaPrimaUnica();
		Primas.presionarBotonCerrar();
		Primas.almacenarElCalculoDeLaPrimaUnica();
		Primas.presionarBotonSiguiente();
		// ---------------------------------------------------------------------
		// PRIMA POR GRUPO ETARIO
		// ---------------------------------------------------------------------
		Primas.almacenarElCalculoDeLaPrimaUnicaCapitadaYNoCapitada();
		Primas.presionarBotonRegresar();
		// ---------------------------------------------------------------------
		// CONFIGURAR BENEFICIOS
		// ---------------------------------------------------------------------
		Beneficios.almacenarInformacionDelCuadroDeBeneficiosInicial();
		Beneficios.presionarBotonAdicionarAnalisisTecnico();
	}

	@Entonces("^debería visualizar una notificación indicando la creación del nuevo análisis técnico$")
	public void debería_visualizar_una_notificación_indicando_la_creación_del_nuevo_análisis_técnico()
			throws Throwable {
		Beneficios.verificarMensajeDeCreacionDelAnalisisTecnico();
		Beneficios.presionarBotonCerrar();
	}

	@Entonces("^debería visualizar una copia del cuadro de beneficios de la propuesta inicial$")
	public void debería_visualizar_una_copia_del_cuadro_de_beneficios_de_la_propuesta_inicial() throws Throwable {
		Beneficios.almacenarInformacionDelCuadroDeBeneficiosCopiado();
		Beneficios.compararInformacionEntreElCuadroDeBeneficiosIncialYLaCopia();
	}

	@Entonces("^debería poder modificar el cuadro de beneficios$")
	public void debería_poder_modificar_el_cuadro_de_beneficios() throws Throwable {
		Beneficios.verificarSiElBotonAñadirCategoriaEsVisibleEnElNuevoAnalisisTecnico();
		Beneficios.verificarSiElBotonAñadirBeneficioEsVisibleEnElNuevoAnalisisTecnico();
	}

	@Entonces("^debería visualizar el consecutivo del análisis técnico en el nombre de cada adición$")
	public void debería_visualizar_el_consecutivo_del_análisis_técnico_en_el_nombre_de_cada_adición() throws Throwable {
		Beneficios.verificarNombreDelConsecutivoDelAnalisisTecnico();
	}

	@Entonces("^debería visualizar una copia de la prima única de la propuesta inicial$")
	public void debería_visualizar_una_copia_de_la_prima_única_de_la_propuesta_inicial() throws Throwable {
		// ---------------------------------------------------------------------
		// CONFIGURAR BENEFICIOS
		// ---------------------------------------------------------------------
		Beneficios.presionarBotonPrimasDelNuevoAnalisisTecnico();
		// ---------------------------------------------------------------------
		// CONFIGURAR PRIMAS
		// ---------------------------------------------------------------------
		Primas.compararInformacionDeLaPrimaUnicaInicalYLaPrimaUnicaDelNuevoAnalisisTecnico();
	}

	@Entonces("^debería visualizar una copia de la prima única capitada y no capitada$")
	public void debería_visualizar_una_copia_de_la_prima_única_capitada_y_no_capitada() throws Throwable {
		// ---------------------------------------------------------------------
		// CONFIGURAR PRIMAS
		// ---------------------------------------------------------------------
		Primas.presionarBotonSiguiente();
		// ---------------------------------------------------------------------
		// PRIMA POR GRUPO ETARIO
		// ---------------------------------------------------------------------
		Primas.compararInformacionDeLaPrimaUnicaCapitadaYNoCapitada();
	}

	@Dado("^que el usuario de producto ha creado una contra-propuesta para ser evaluada por el área técnica$")
	public void que_el_usuario_de_producto_ha_creado_una_contra_propuesta_para_ser_evaluada_por_el_área_técnica()
			throws Throwable {
		// ---------------------------------------------------------------------
		// LOGIN
		// ---------------------------------------------------------------------
		Login.ingresarUsuario("intergrupo_user1");
		Login.ingresarContraseña("Humano..2016");
		Login.presionarBotonIngresar();
		// ---------------------------------------------------------------------
		// MÓDULO DE SEGURIDAD
		// ---------------------------------------------------------------------
		Login.ingresarAlModuloDePlanes();
		// ---------------------------------------------------------------------
		// CONSULTA GENERAL
		// ---------------------------------------------------------------------
		// Filtros de Búsqueda
		// ---------------------------------------------------------------------
		Consulta.ingresarCodigoDelProyectoOPlan();
		Consulta.presionarBotonBuscar();
		// ---------------------------------------------------------------------
		// Resultado de la Búsqueda
		// ---------------------------------------------------------------------
		Consulta.presionarBotonEditar();
		// ---------------------------------------------------------------------
		// CONCEPTUALIZAR PROPUESTA
		// ---------------------------------------------------------------------
		// Seleccionar opciones de menú
		// ---------------------------------------------------------------------
		Menu.ingresarALaOpcionDePropuestas();
		Menu.ingresarALaOpcion("Información General");
		Menu.ingresarAlaPropuesta();
		Menu.ingresarALaOpcion("Beneficios");
		Menu.ingresarALaPrimeraVersionDeLaPropuesta();
		Menu.ingresarALaOpcion("Ver Detalle");
		// ---------------------------------------------------------------------
		// CONFIGURAR BENEFICIOS
		// ---------------------------------------------------------------------
		Beneficios.almacenarInformacionDelCuadroDeBeneficiosInicialParaElUsuarioDeProducto();
		Beneficios.presionarBotonAdicionarPropuesta();
		Beneficios.verificarMensajeDeCreacionDeLaNuevaPropuesta();
		Beneficios.presionarBotonCerrar();
		// ---------------------------------------------------------------------
		// CONFIGURAR BENEFICIOS
		// ---------------------------------------------------------------------
		// Seleccionar opciones de menú
		// ---------------------------------------------------------------------
		Menu.ingresarALaOpcionDePropuestas();
		Menu.ingresarALaOpcion("Información General");
		Menu.ingresarAlaPropuesta();
		Menu.ingresarALaOpcionDeConceptualizacion();
		// ---------------------------------------------------------------------
		// CONCEPTUALIZAR PROPUESTA
		// ---------------------------------------------------------------------
		Propuesta.presionarBotonNotificarAlAreaTecnica();
		Propuesta.verificarMensajeDePropuestaNotificadaAlAreaTecnica();
		Propuesta.presionarBotonCerrar();
		// ---------------------------------------------------------------------
		// CERRAR SESIÓN
		// ---------------------------------------------------------------------
		Global.cerrarSesion();
	}

	@Entonces("^debería visualizar el consecutivo del análisis técnico en el nombre de cada adición para la nueva propuesta$")
	public void debería_visualizar_el_consecutivo_del_análisis_técnico_en_el_nombre_de_cada_adición_para_la_nueva_propuesta()
			throws Throwable {
		Beneficios.verificarNombreDelConsecutivoDelAnalisisTecnicoParaLaNuevaPropuesta();
	}

	@Dado("^he ingresado a la configuración de primas de la segunda propuesta$")
	public void he_ingresado_a_la_configuración_de_primas_de_la_segunda_propuesta() throws Throwable {
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
		Beneficios.presionarBotonPrimasDeLaNuevaPropuesta();
		// ---------------------------------------------------------------------
		// CONFIGURAR PRIMAS
		// ---------------------------------------------------------------------
		Primas.presionarBotonGuardar();
	}

}
