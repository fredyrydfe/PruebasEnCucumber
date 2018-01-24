package definicionDePasos;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import mapaDeObjetos.Beneficios;
import mapaDeObjetos.Consulta;
import mapaDeObjetos.Global;
import mapaDeObjetos.Login;
import mapaDeObjetos.Propuesta;

public class DefinicionDePasosComunes {

	@Before
	public void preparar_ambiente_de_prueba() throws Throwable {
		Login.abrirElNavegador("Chrome");
		Login.ingresarAlaPagina("http://172.24.206.98:8002/SeisServices/login");
		Global.establecerTiempoDeEsperaExplicita(30);
	}

	@After
	public void finalizar_ejecucion(Scenario escenario) throws Throwable {
		Global.reiniciarVariables();
		Global.tomarEvidencia(escenario);
		Global.cerrarNavegador();
	}

	@Dado("^que he iniciado sesi�n con el rol gerente senior de producto$")
	public void que_he_iniciado_sesi�n_con_el_rol_gerente_senior_de_producto() throws Throwable {
		Login.ingresarUsuario("intergrupo_user1");
		Login.ingresarContrase�a("Humano..2016");
		Login.presionarBotonIngresar();
	}

	@Dado("^que he iniciado sesi�n con el rol gerente t�cnico local$")
	public void que_he_iniciado_sesi�n_con_el_rol_gerente_t�cnico_local() throws Throwable {
		Login.ingresarUsuario("FactoriaUser");
		Login.ingresarContrase�a("Humano2016!");
		Login.presionarBotonIngresar();
	}

	@Cuando("^ingrese al m�dulo de Planes$")
	public void ingrese_al_m�dulo_de_Planes() throws Throwable {
		Login.ingresarAlModuloDePlanes();
	}
	
	@Dado("^he ingresado al m�dulo de Planes$")
	public void he_ingresado_al_m�dulo_de_Planes() throws Throwable {
		Login.ingresarAlModuloDePlanes();
	}

	@Entonces("^deber�a visualizar la pantalla de Consultar proyecto$")
	public void deber�a_visualizar_la_pantalla_de_Consultar_proyecto() throws Throwable {
		Login.verificarIngresoAlAplicativo();
	}

	@Entonces("^deber�a visualizar una notificaci�n indicando que debo ingresar los campos obligatorios$")
	public void deber�a_visualizar_una_notificaci�n_indicando_que_debo_ingresar_los_campos_obligatorios()
			throws Throwable {
		Propuesta.verificarMensajeDeCamposObligatorios();
	}

	@Entonces("^deber�a visualizar el beneficio en la pantalla del resumen de beneficios$")
	public void deber�a_visualizar_el_beneficio_en_la_pantalla_del_resumen_de_beneficios() throws Throwable {
		Beneficios.verificarCreacionDelBeneficio();
	}

	@Entonces("^deber�a visualizar una notificaci�n indicando que el beneficio ya se encuentra configurado$")
	public void deber�a_visualizar_una_notificaci�n_indicando_que_el_beneficio_ya_se_encuentra_configurado()
			throws Throwable {
		Beneficios.verificarMensajeDeBeneficioYaExistente();
	}

	@Entonces("^deber�a visualizar una notificaci�n indicando que debo ingresar un monto limite inferior$")
	public void deber�a_visualizar_una_notificaci�n_indicando_que_debo_ingresar_un_monto_limite_inferior()
			throws Throwable {
		Beneficios.verificarMensajeDeMontoLimiteSuperior();
	}

	@Entonces("^deber�a visualizar una notificaci�n indicando que debo ingresar un monto limite inferior al monto limite predecesor$")
	public void deber�a_visualizar_una_notificaci�n_indicando_que_debo_ingresar_un_monto_limite_inferior_al_monto_limite_predecesor()
			throws Throwable {
		Beneficios.verificarMensajeDeMontoLimiteSuperiorAPartirDeLaConfiguracionDelGrupoDeCobertura();
	}

	@Entonces("^deber�a visualizar una notificaci�n indicando que debo ingresar una unidad de tiempo inferior$")
	public void deber�a_visualizar_una_notificaci�n_indicando_que_debo_ingresar_una_unidad_de_tiempo_inferior()
			throws Throwable {
		Beneficios.verificarMensajeDeUnidadDeTiempoSuperior();
	}
	
	@Entonces("^no deber�a visualizar el beneficio en la pantalla de beneficios$")
	public void no_deber�a_visualizar_el_beneficio_en_la_pantalla_de_beneficios() throws Throwable {
		Beneficios.verificarEliminacionDelBeneficio();
	}

}
