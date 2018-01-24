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

public class AdicionarContraPropuestaSalud {

	@Dado("^que el usuario gerente t�cnico local ha evaluado la propuesta para ser pre-aprobada por el �rea de productos$")
	public void que_el_usuario_gerente_t�cnico_local_ha_evaluado_la_propuesta_para_ser_pre_aprobada_por_el_�rea_de_productos()
			throws Throwable {
		// ---------------------------------------------------------------------
		// LOGIN
		// ---------------------------------------------------------------------
		Login.ingresarUsuario("FactoriaUser");
		Login.ingresarContrase�a("Humano2016!");
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
		Menu.ingresarAlaPropuestaConElUsuarioTecnico();
		Menu.ingresarALaOpcion("Beneficios");
		Menu.ingresarALaPrimeraVersionDeLaPropuestaConElUsuarioTecnico();
		Menu.ingresarALaOpcion("Ver Detalle");
		// ---------------------------------------------------------------------
		// CONFIGURAR BENEFICIOS
		// ---------------------------------------------------------------------
		Beneficios.presionarBotonPrimas();
		// ---------------------------------------------------------------------
		// CONFIGURAR PRIMAS
		// ---------------------------------------------------------------------
		Primas.ingresarValorIndividualDeLasPrimas();
		// ---------------------------------------------------------------------
		// Guardar
		// ---------------------------------------------------------------------
		Primas.presionarBotonGuardar();
		// ---------------------------------------------------------------------
		// CONFIGURAR PRIMAS
		// ---------------------------------------------------------------------
		Primas.verificarMensajeDeGuardadoDeLaPrimaUnica();
		Primas.presionarBotonCerrar();
		Primas.almacenarElCalculoDeLaPrimaUnica();
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
		Propuesta.verificarMensajeDePropuestaNotificadaAlAreaTecnica();
		Propuesta.presionarBotonCerrar();
		// ---------------------------------------------------------------------
		// CERRAR SESI�N
		// ---------------------------------------------------------------------
		Global.cerrarSesion();
	}

	@Dado("^he consultado la propuesta notificada por el �rea t�cnica$")
	public void he_consultado_la_propuesta_notificada_por_el_�rea_t�cnica() throws Throwable {
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
	}

	@Cuando("^he adicionado una nueva propuesta$")
	public void he_adicionado_una_nueva_propuesta() throws Throwable {
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
	}

	@Entonces("^deber�a visualizar una notificaci�n indicando la creaci�n de la nueva propuesta$")
	public void deber�a_visualizar_una_notificaci�n_indicando_la_creaci�n_de_la_nueva_propuesta() throws Throwable {
		Beneficios.verificarMensajeDeCreacionDeLaNuevaPropuesta();
		Beneficios.presionarBotonCerrar();
	}

	@Entonces("^deber�a visualizar el consecutivo de la nueva propuesta en el nombre de cada adici�n$")
	public void deber�a_visualizar_el_consecutivo_de_la_nueva_propuesta_en_el_nombre_de_cada_adici�n()
			throws Throwable {
		Beneficios.verificarNombreDelConsecutivoDeLaNuevaPropuesta();
	}
	
	@Entonces("^deber�a visualizar una copia del cuadro de beneficios de la propuesta inicial para el usuario de producto$")
	public void deber�a_visualizar_una_copia_del_cuadro_de_beneficios_de_la_propuesta_inicial_para_el_usuario_de_producto() throws Throwable {
		Beneficios.almacenarInformacionDelCuadroDeBeneficiosCopiadoParaElUsuarioDeProducto();
		Beneficios.compararInformacionEntreElCuadroDeBeneficiosIncialYLaCopia();
	}

}
