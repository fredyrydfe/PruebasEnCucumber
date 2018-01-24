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

	@Dado("^que el usuario gerente técnico local ha evaluado la propuesta para ser pre-aprobada por el área de productos$")
	public void que_el_usuario_gerente_técnico_local_ha_evaluado_la_propuesta_para_ser_pre_aprobada_por_el_área_de_productos()
			throws Throwable {
		// ---------------------------------------------------------------------
		// LOGIN
		// ---------------------------------------------------------------------
		Login.ingresarUsuario("FactoriaUser");
		Login.ingresarContraseña("Humano2016!");
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
		Propuesta.verificarMensajeDePropuestaNotificadaAlAreaTecnica();
		Propuesta.presionarBotonCerrar();
		// ---------------------------------------------------------------------
		// CERRAR SESIÓN
		// ---------------------------------------------------------------------
		Global.cerrarSesion();
	}

	@Dado("^he consultado la propuesta notificada por el área técnica$")
	public void he_consultado_la_propuesta_notificada_por_el_área_técnica() throws Throwable {
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
	}

	@Cuando("^he adicionado una nueva propuesta$")
	public void he_adicionado_una_nueva_propuesta() throws Throwable {
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
	}

	@Entonces("^debería visualizar una notificación indicando la creación de la nueva propuesta$")
	public void debería_visualizar_una_notificación_indicando_la_creación_de_la_nueva_propuesta() throws Throwable {
		Beneficios.verificarMensajeDeCreacionDeLaNuevaPropuesta();
		Beneficios.presionarBotonCerrar();
	}

	@Entonces("^debería visualizar el consecutivo de la nueva propuesta en el nombre de cada adición$")
	public void debería_visualizar_el_consecutivo_de_la_nueva_propuesta_en_el_nombre_de_cada_adición()
			throws Throwable {
		Beneficios.verificarNombreDelConsecutivoDeLaNuevaPropuesta();
	}
	
	@Entonces("^debería visualizar una copia del cuadro de beneficios de la propuesta inicial para el usuario de producto$")
	public void debería_visualizar_una_copia_del_cuadro_de_beneficios_de_la_propuesta_inicial_para_el_usuario_de_producto() throws Throwable {
		Beneficios.almacenarInformacionDelCuadroDeBeneficiosCopiadoParaElUsuarioDeProducto();
		Beneficios.compararInformacionEntreElCuadroDeBeneficiosIncialYLaCopia();
	}

}
