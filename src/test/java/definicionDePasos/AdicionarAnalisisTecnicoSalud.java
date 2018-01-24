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

	@Cuando("^adicione un nuevo an�lisis t�cnico a la propuesta$")
	public void adicione_un_nuevo_an�lisis_t�cnico_a_la_propuesta() throws Throwable {
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

	@Entonces("^deber�a visualizar una notificaci�n indicando la creaci�n del nuevo an�lisis t�cnico$")
	public void deber�a_visualizar_una_notificaci�n_indicando_la_creaci�n_del_nuevo_an�lisis_t�cnico()
			throws Throwable {
		Beneficios.verificarMensajeDeCreacionDelAnalisisTecnico();
		Beneficios.presionarBotonCerrar();
	}

	@Entonces("^deber�a visualizar una copia del cuadro de beneficios de la propuesta inicial$")
	public void deber�a_visualizar_una_copia_del_cuadro_de_beneficios_de_la_propuesta_inicial() throws Throwable {
		Beneficios.almacenarInformacionDelCuadroDeBeneficiosCopiado();
		Beneficios.compararInformacionEntreElCuadroDeBeneficiosIncialYLaCopia();
	}

	@Entonces("^deber�a poder modificar el cuadro de beneficios$")
	public void deber�a_poder_modificar_el_cuadro_de_beneficios() throws Throwable {
		Beneficios.verificarSiElBotonA�adirCategoriaEsVisibleEnElNuevoAnalisisTecnico();
		Beneficios.verificarSiElBotonA�adirBeneficioEsVisibleEnElNuevoAnalisisTecnico();
	}

	@Entonces("^deber�a visualizar el consecutivo del an�lisis t�cnico en el nombre de cada adici�n$")
	public void deber�a_visualizar_el_consecutivo_del_an�lisis_t�cnico_en_el_nombre_de_cada_adici�n() throws Throwable {
		Beneficios.verificarNombreDelConsecutivoDelAnalisisTecnico();
	}

	@Entonces("^deber�a visualizar una copia de la prima �nica de la propuesta inicial$")
	public void deber�a_visualizar_una_copia_de_la_prima_�nica_de_la_propuesta_inicial() throws Throwable {
		// ---------------------------------------------------------------------
		// CONFIGURAR BENEFICIOS
		// ---------------------------------------------------------------------
		Beneficios.presionarBotonPrimasDelNuevoAnalisisTecnico();
		// ---------------------------------------------------------------------
		// CONFIGURAR PRIMAS
		// ---------------------------------------------------------------------
		Primas.compararInformacionDeLaPrimaUnicaInicalYLaPrimaUnicaDelNuevoAnalisisTecnico();
	}

	@Entonces("^deber�a visualizar una copia de la prima �nica capitada y no capitada$")
	public void deber�a_visualizar_una_copia_de_la_prima_�nica_capitada_y_no_capitada() throws Throwable {
		// ---------------------------------------------------------------------
		// CONFIGURAR PRIMAS
		// ---------------------------------------------------------------------
		Primas.presionarBotonSiguiente();
		// ---------------------------------------------------------------------
		// PRIMA POR GRUPO ETARIO
		// ---------------------------------------------------------------------
		Primas.compararInformacionDeLaPrimaUnicaCapitadaYNoCapitada();
	}

	@Dado("^que el usuario de producto ha creado una contra-propuesta para ser evaluada por el �rea t�cnica$")
	public void que_el_usuario_de_producto_ha_creado_una_contra_propuesta_para_ser_evaluada_por_el_�rea_t�cnica()
			throws Throwable {
		// ---------------------------------------------------------------------
		// LOGIN
		// ---------------------------------------------------------------------
		Login.ingresarUsuario("intergrupo_user1");
		Login.ingresarContrase�a("Humano..2016");
		Login.presionarBotonIngresar();
		// ---------------------------------------------------------------------
		// M�DULO DE SEGURIDAD
		// ---------------------------------------------------------------------
		Login.ingresarAlModuloDePlanes();
		// ---------------------------------------------------------------------
		// CONSULTA GENERAL
		// ---------------------------------------------------------------------
		// Filtros de B�squeda
		// ---------------------------------------------------------------------
		Consulta.ingresarCodigoDelProyectoOPlan();
		Consulta.presionarBotonBuscar();
		// ---------------------------------------------------------------------
		// Resultado de la B�squeda
		// ---------------------------------------------------------------------
		Consulta.presionarBotonEditar();
		// ---------------------------------------------------------------------
		// CONCEPTUALIZAR PROPUESTA
		// ---------------------------------------------------------------------
		// Seleccionar opciones de men�
		// ---------------------------------------------------------------------
		Menu.ingresarALaOpcionDePropuestas();
		Menu.ingresarALaOpcion("Informaci�n General");
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
		// Seleccionar opciones de men�
		// ---------------------------------------------------------------------
		Menu.ingresarALaOpcionDePropuestas();
		Menu.ingresarALaOpcion("Informaci�n General");
		Menu.ingresarAlaPropuesta();
		Menu.ingresarALaOpcionDeConceptualizacion();
		// ---------------------------------------------------------------------
		// CONCEPTUALIZAR PROPUESTA
		// ---------------------------------------------------------------------
		Propuesta.presionarBotonNotificarAlAreaTecnica();
		Propuesta.verificarMensajeDePropuestaNotificadaAlAreaTecnica();
		Propuesta.presionarBotonCerrar();
		// ---------------------------------------------------------------------
		// CERRAR SESI�N
		// ---------------------------------------------------------------------
		Global.cerrarSesion();
	}

	@Entonces("^deber�a visualizar el consecutivo del an�lisis t�cnico en el nombre de cada adici�n para la nueva propuesta$")
	public void deber�a_visualizar_el_consecutivo_del_an�lisis_t�cnico_en_el_nombre_de_cada_adici�n_para_la_nueva_propuesta()
			throws Throwable {
		Beneficios.verificarNombreDelConsecutivoDelAnalisisTecnicoParaLaNuevaPropuesta();
	}

	@Dado("^he ingresado a la configuraci�n de primas de la segunda propuesta$")
	public void he_ingresado_a_la_configuraci�n_de_primas_de_la_segunda_propuesta() throws Throwable {
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
		Beneficios.presionarBotonPrimasDeLaNuevaPropuesta();
		// ---------------------------------------------------------------------
		// CONFIGURAR PRIMAS
		// ---------------------------------------------------------------------
		Primas.presionarBotonGuardar();
	}

}
