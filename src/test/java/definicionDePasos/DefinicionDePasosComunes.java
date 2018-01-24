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

	@Dado("^que he iniciado sesión con el rol gerente senior de producto$")
	public void que_he_iniciado_sesión_con_el_rol_gerente_senior_de_producto() throws Throwable {
		Login.ingresarUsuario("intergrupo_user1");
		Login.ingresarContraseña("Humano..2016");
		Login.presionarBotonIngresar();
	}

	@Dado("^que he iniciado sesión con el rol gerente técnico local$")
	public void que_he_iniciado_sesión_con_el_rol_gerente_técnico_local() throws Throwable {
		Login.ingresarUsuario("FactoriaUser");
		Login.ingresarContraseña("Humano2016!");
		Login.presionarBotonIngresar();
	}

	@Cuando("^ingrese al módulo de Planes$")
	public void ingrese_al_módulo_de_Planes() throws Throwable {
		Login.ingresarAlModuloDePlanes();
	}
	
	@Dado("^he ingresado al módulo de Planes$")
	public void he_ingresado_al_módulo_de_Planes() throws Throwable {
		Login.ingresarAlModuloDePlanes();
	}

	@Entonces("^debería visualizar la pantalla de Consultar proyecto$")
	public void debería_visualizar_la_pantalla_de_Consultar_proyecto() throws Throwable {
		Login.verificarIngresoAlAplicativo();
	}

	@Entonces("^debería visualizar una notificación indicando que debo ingresar los campos obligatorios$")
	public void debería_visualizar_una_notificación_indicando_que_debo_ingresar_los_campos_obligatorios()
			throws Throwable {
		Propuesta.verificarMensajeDeCamposObligatorios();
	}

	@Entonces("^debería visualizar el beneficio en la pantalla del resumen de beneficios$")
	public void debería_visualizar_el_beneficio_en_la_pantalla_del_resumen_de_beneficios() throws Throwable {
		Beneficios.verificarCreacionDelBeneficio();
	}

	@Entonces("^debería visualizar una notificación indicando que el beneficio ya se encuentra configurado$")
	public void debería_visualizar_una_notificación_indicando_que_el_beneficio_ya_se_encuentra_configurado()
			throws Throwable {
		Beneficios.verificarMensajeDeBeneficioYaExistente();
	}

	@Entonces("^debería visualizar una notificación indicando que debo ingresar un monto limite inferior$")
	public void debería_visualizar_una_notificación_indicando_que_debo_ingresar_un_monto_limite_inferior()
			throws Throwable {
		Beneficios.verificarMensajeDeMontoLimiteSuperior();
	}

	@Entonces("^debería visualizar una notificación indicando que debo ingresar un monto limite inferior al monto limite predecesor$")
	public void debería_visualizar_una_notificación_indicando_que_debo_ingresar_un_monto_limite_inferior_al_monto_limite_predecesor()
			throws Throwable {
		Beneficios.verificarMensajeDeMontoLimiteSuperiorAPartirDeLaConfiguracionDelGrupoDeCobertura();
	}

	@Entonces("^debería visualizar una notificación indicando que debo ingresar una unidad de tiempo inferior$")
	public void debería_visualizar_una_notificación_indicando_que_debo_ingresar_una_unidad_de_tiempo_inferior()
			throws Throwable {
		Beneficios.verificarMensajeDeUnidadDeTiempoSuperior();
	}
	
	@Entonces("^no debería visualizar el beneficio en la pantalla de beneficios$")
	public void no_debería_visualizar_el_beneficio_en_la_pantalla_de_beneficios() throws Throwable {
		Beneficios.verificarEliminacionDelBeneficio();
	}

}
