package definicionDePasos;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import mapaDeObjetos.Beneficios;
import mapaDeObjetos.Global;

public class AdicionarCoberturaSalud {

	@Dado("^he adicionado un tipo de cobertura al servicio$")
	public void he_adicionado_un_tipo_de_cobertura_al_servicio() throws Throwable {
		// ---------------------------------------------------------------------
		// CONFIGURAR BENEFICIOS
		// ---------------------------------------------------------------------
		Beneficios.presionarBotonA�adir("Tipo de cobertura");
		// ---------------------------------------------------------------------
		// CONFIGURAR TIPO DE COBERTURA
		// ---------------------------------------------------------------------
		Beneficios.seleccionarNombreDelBeneficio("ANATOMIA PATOLOGICA", "Tipo Cobertura");
		// ---------------------------------------------------------------------
		// Monto Beneficio
		// ---------------------------------------------------------------------
		Beneficios.ingresarMontoLimite("80000");
		Beneficios.seleccionarUnidadDeTiempoMontoBeneficio("Mes");
		Global.aplicarScroll("1200");
		// ---------------------------------------------------------------------
		// Guardar
		// ---------------------------------------------------------------------
		Beneficios.presionarBotonGuardar();
	}

	@Cuando("^adicione una cobertura al cuadro de beneficios$")
	public void adicione_una_cobertura_al_cuadro_de_beneficios() throws Throwable {
		// ---------------------------------------------------------------------
		// CONFIGURAR BENEFICIOS
		// ---------------------------------------------------------------------
		Beneficios.presionarBotonA�adir("Cobertura");
		// ---------------------------------------------------------------------
		// CONFIGURAR COBERTURA
		// ---------------------------------------------------------------------
		Beneficios.seleccionarNombreDeLaCobertura("199-RADIOGRAFIA DE ARTICULACIONES ESTERNOCLAVICULARES", "Cobertura");
		// ---------------------------------------------------------------------
		// Monto Beneficio
		// ---------------------------------------------------------------------
		Beneficios.ingresarMontoLimite("1525");
		Beneficios.seleccionarUnidadDeTiempoMontoBeneficio("Mes");
		Global.aplicarScroll("400");
		// ---------------------------------------------------------------------
		// Coaseguro Local
		// ---------------------------------------------------------------------
		Beneficios.ingresarPorcentajeDeCoaseguroLocal("33");
		Beneficios.ingresarMontoDeCoaseguroLocal("12");
		Beneficios.seleccionarUnidadDeTiempoCoaseguroLocal("A�o");
		Beneficios.seleccionarRangoMaximoCoaseguroLocal("Asegurado");
		Beneficios.ingresarPorcentajeDefinitivoCoaseguroLocal("33");
		// ---------------------------------------------------------------------
		// Coaseguro Internacional
		// ---------------------------------------------------------------------
		Beneficios.ingresarPorcentajeDeCoaseguroInternacional("33");
		Beneficios.ingresarMontoDeCoaseguroInternacional("1223");
		Beneficios.seleccionarUnidadDeTiempoCoaseguroInternacional("A�o");
		Beneficios.seleccionarRangoMaximoCoaseguroInternacional("Poliza");
		Beneficios.ingresarPorcentajeDefinitivoCoaseguroInternacional("33");
		Global.aplicarScroll("600");
		// ---------------------------------------------------------------------
		// Reembolso Local
		// ---------------------------------------------------------------------
		Beneficios.seleccionarTipoDeReembolsoLocal("Monto Reclamado");
		Beneficios.ingresarPorcentajeDeReembolsoLocal("12");
		Beneficios.ingresarFrecuenciaDeReembolsoLocal("1");
		Beneficios.seleccionarUnidadDeTiempoDeReembolsoLocal("A�o");
		Beneficios.seleccionarRangoMaximoDelReembolsoLocal("Poliza");
		Beneficios.ingresarMontoDeReembolsoLocal("3200");
		Beneficios.seleccionarUnidadDeTiempoDeMontoReembolsoLocal("A�o");
		Beneficios.seleccionarRangoMaximoDelMontoReembolsoLocal("Poliza");
		// ---------------------------------------------------------------------
		// Reembolso Internacional
		// ---------------------------------------------------------------------
		Beneficios.seleccionarTipoDeReembolsoInternacional("Monto Reclamado");
		Beneficios.ingresarPorcentajeDeReembolsoInternacional("12");
		Beneficios.ingresarFrecuenciaDeReembolsoInternacional("1");
		Beneficios.seleccionarUnidadDeTiempoDeReembolsoInternacional("A�o");
		Beneficios.seleccionarRangoMaximoDelReembolsoInternacional("Poliza");
		Beneficios.ingresarMontoDeReembolsoInternacional("3200");
		Beneficios.seleccionarUnidadDeTiempoDeMontoReembolsoInternacional("A�o");
		Beneficios.seleccionarRangoMaximoDelMontoReembolsoInternacional("Poliza");
		Global.aplicarScroll("1200");
		// ---------------------------------------------------------------------
		// Copago
		// ---------------------------------------------------------------------
		Beneficios.seleccionarTipoDeCopago("Monto");
		Beneficios.ingresarCopago("1020");
		// ---------------------------------------------------------------------
		// Tiempo de Espera
		// ---------------------------------------------------------------------
		Beneficios.ingresarTiempoDeEspera("1");
		Beneficios.seleccionarUnidadDeTiempoDeEspera("Dia");
		// ---------------------------------------------------------------------
		// Frecuencia de uso
		// ---------------------------------------------------------------------
		Beneficios.ingresarFrecuenciaDeUso("2");
		Beneficios.seleccionarUnidadDeTiempoFrecuenciaDeUso("Semana");
		// ---------------------------------------------------------------------
		// Elegibilidad
		// ---------------------------------------------------------------------
		Beneficios.ingresarEdadMinimaElegibilidad("18");
		Beneficios.ingresarEdadMaximaElegibilidad("100");
		Beneficios.seleccionarTipoDeAfiliado("Dependiente");
		Beneficios.seleccionarParentesco("Padre");
		Beneficios.seleccionarGenero("MASCULINO");
		Beneficios.seleccionarEstadoCivil("Soltero(a)");
		Beneficios.seleccionarTipoDeReclamante("Farmacia");
		// ---------------------------------------------------------------------
		// Guardar
		// ---------------------------------------------------------------------
		Beneficios.presionarBotonGuardar();
	}

	@Entonces("^deber�a visualizar el beneficio en la pantalla de coberturas$")
	public void deber�a_visualizar_el_beneficio_en_la_pantalla_de_coberturas() throws Throwable {
		Beneficios.ingresarAlTipoDeCoberturaQueContieneLasCoberturasAsociadas();
		Beneficios.verificarCreacionDeLaCobertura();
	}

	@Cuando("^deje vacio los campos obligatorios en la configuraci�n de la cobertura$")
	public void deje_vacio_los_campos_obligatorios_en_la_configuraci�n_de_la_cobertura() throws Throwable {
		// ---------------------------------------------------------------------
		// CONFIGURAR BENEFICIOS
		// ---------------------------------------------------------------------
		Beneficios.presionarBotonA�adir("Cobertura");
		// ---------------------------------------------------------------------
		// CONFIGURAR COBERTURA
		// ---------------------------------------------------------------------
		// Coaseguro Local
		// ---------------------------------------------------------------------
		Beneficios.ingresarPorcentajeDeCoaseguroLocal("33");
		Beneficios.ingresarMontoDeCoaseguroLocal("12");
		Beneficios.seleccionarUnidadDeTiempoCoaseguroLocal("A�o");
		Beneficios.seleccionarRangoMaximoCoaseguroLocal("Asegurado");
		Beneficios.ingresarPorcentajeDefinitivoCoaseguroLocal("33");
		// ---------------------------------------------------------------------
		// Coaseguro Internacional
		// ---------------------------------------------------------------------
		Beneficios.ingresarPorcentajeDeCoaseguroInternacional("33");
		Beneficios.ingresarMontoDeCoaseguroInternacional("1223");
		Beneficios.seleccionarUnidadDeTiempoCoaseguroInternacional("A�o");
		Beneficios.seleccionarRangoMaximoCoaseguroInternacional("Poliza");
		Beneficios.ingresarPorcentajeDefinitivoCoaseguroInternacional("33");
		Global.aplicarScroll("600");
		// ---------------------------------------------------------------------
		// Reembolso Local
		// ---------------------------------------------------------------------
		Beneficios.seleccionarTipoDeReembolsoLocal("Monto Reclamado");
		Beneficios.ingresarPorcentajeDeReembolsoLocal("12");
		Beneficios.ingresarFrecuenciaDeReembolsoLocal("1");
		Beneficios.seleccionarUnidadDeTiempoDeReembolsoLocal("A�o");
		Beneficios.seleccionarRangoMaximoDelReembolsoLocal("Poliza");
		Beneficios.ingresarMontoDeReembolsoLocal("3200");
		Beneficios.seleccionarUnidadDeTiempoDeMontoReembolsoLocal("A�o");
		Beneficios.seleccionarRangoMaximoDelMontoReembolsoLocal("Poliza");
		// ---------------------------------------------------------------------
		// Reembolso Internacional
		// ---------------------------------------------------------------------
		Beneficios.seleccionarTipoDeReembolsoInternacional("Monto Reclamado");
		Beneficios.ingresarPorcentajeDeReembolsoInternacional("12");
		Beneficios.ingresarFrecuenciaDeReembolsoInternacional("1");
		Beneficios.seleccionarUnidadDeTiempoDeReembolsoInternacional("A�o");
		Beneficios.seleccionarRangoMaximoDelReembolsoInternacional("Poliza");
		Beneficios.ingresarMontoDeReembolsoInternacional("3200");
		Beneficios.seleccionarUnidadDeTiempoDeMontoReembolsoInternacional("A�o");
		Beneficios.seleccionarRangoMaximoDelMontoReembolsoInternacional("Poliza");
		Global.aplicarScroll("1200");
		// ---------------------------------------------------------------------
		// Copago
		// ---------------------------------------------------------------------
		Beneficios.seleccionarTipoDeCopago("Monto");
		Beneficios.ingresarCopago("1020");
		// ---------------------------------------------------------------------
		// Tiempo de Espera
		// ---------------------------------------------------------------------
		Beneficios.ingresarTiempoDeEspera("1");
		Beneficios.seleccionarUnidadDeTiempoDeEspera("Dia");
		// ---------------------------------------------------------------------
		// Frecuencia de uso
		// ---------------------------------------------------------------------
		Beneficios.ingresarFrecuenciaDeUso("2");
		Beneficios.seleccionarUnidadDeTiempoFrecuenciaDeUso("Semana");
		// ---------------------------------------------------------------------
		// Elegibilidad
		// ---------------------------------------------------------------------
		Beneficios.ingresarEdadMinimaElegibilidad("18");
		Beneficios.ingresarEdadMaximaElegibilidad("100");
		Beneficios.seleccionarTipoDeAfiliado("Dependiente");
		Beneficios.seleccionarParentesco("Padre");
		Beneficios.seleccionarGenero("MASCULINO");
		Beneficios.seleccionarEstadoCivil("Soltero(a)");
		Beneficios.seleccionarTipoDeReclamante("Farmacia");
		// ---------------------------------------------------------------------
		// Guardar
		// ---------------------------------------------------------------------
		Beneficios.presionarBotonGuardar();
	}

	@Cuando("^ingrese solo el monto limite y deje vac�o el resto de campos en la configuraci�n de la cobertura$")
	public void ingrese_solo_el_monto_limite_y_deje_vac�o_el_resto_de_campos_en_la_configuraci�n_de_la_cobertura()
			throws Throwable {
		// ---------------------------------------------------------------------
		// CONFIGURAR BENEFICIOS
		// ---------------------------------------------------------------------
		Beneficios.presionarBotonA�adir("Cobertura");
		// ---------------------------------------------------------------------
		// CONFIGURAR COBERTURA
		// ---------------------------------------------------------------------
		Beneficios.seleccionarNombreDeLaCobertura("199-RADIOGRAFIA DE ARTICULACIONES ESTERNOCLAVICULARES", "Cobertura");
		// ---------------------------------------------------------------------
		// Monto Beneficio
		// ---------------------------------------------------------------------
		Beneficios.ingresarMontoLimite("1525");
		Global.aplicarScroll("1200");
		// ---------------------------------------------------------------------
		// Coaseguro Local
		// ---------------------------------------------------------------------
		Beneficios.ingresarPorcentajeDeCoaseguroLocal("33");
		Beneficios.ingresarMontoDeCoaseguroLocal("12");
		Beneficios.seleccionarUnidadDeTiempoCoaseguroLocal("A�o");
		Beneficios.seleccionarRangoMaximoCoaseguroLocal("Asegurado");
		Beneficios.ingresarPorcentajeDefinitivoCoaseguroLocal("33");
		// ---------------------------------------------------------------------
		// Coaseguro Internacional
		// ---------------------------------------------------------------------
		Beneficios.ingresarPorcentajeDeCoaseguroInternacional("33");
		Beneficios.ingresarMontoDeCoaseguroInternacional("1223");
		Beneficios.seleccionarUnidadDeTiempoCoaseguroInternacional("A�o");
		Beneficios.seleccionarRangoMaximoCoaseguroInternacional("Poliza");
		Beneficios.ingresarPorcentajeDefinitivoCoaseguroInternacional("33");
		Global.aplicarScroll("600");
		// ---------------------------------------------------------------------
		// Reembolso Local
		// ---------------------------------------------------------------------
		Beneficios.seleccionarTipoDeReembolsoLocal("Monto Reclamado");
		Beneficios.ingresarPorcentajeDeReembolsoLocal("12");
		Beneficios.ingresarFrecuenciaDeReembolsoLocal("1");
		Beneficios.seleccionarUnidadDeTiempoDeReembolsoLocal("A�o");
		Beneficios.seleccionarRangoMaximoDelReembolsoLocal("Poliza");
		Beneficios.ingresarMontoDeReembolsoLocal("3200");
		Beneficios.seleccionarUnidadDeTiempoDeMontoReembolsoLocal("A�o");
		Beneficios.seleccionarRangoMaximoDelMontoReembolsoLocal("Poliza");
		// ---------------------------------------------------------------------
		// Reembolso Internacional
		// ---------------------------------------------------------------------
		Beneficios.seleccionarTipoDeReembolsoInternacional("Monto Reclamado");
		Beneficios.ingresarPorcentajeDeReembolsoInternacional("12");
		Beneficios.ingresarFrecuenciaDeReembolsoInternacional("1");
		Beneficios.seleccionarUnidadDeTiempoDeReembolsoInternacional("A�o");
		Beneficios.seleccionarRangoMaximoDelReembolsoInternacional("Poliza");
		Beneficios.ingresarMontoDeReembolsoInternacional("3200");
		Beneficios.seleccionarUnidadDeTiempoDeMontoReembolsoInternacional("A�o");
		Beneficios.seleccionarRangoMaximoDelMontoReembolsoInternacional("Poliza");
		Global.aplicarScroll("1200");
		// ---------------------------------------------------------------------
		// Copago
		// ---------------------------------------------------------------------
		Beneficios.seleccionarTipoDeCopago("Monto");
		Beneficios.ingresarCopago("1020");
		// ---------------------------------------------------------------------
		// Tiempo de Espera
		// ---------------------------------------------------------------------
		Beneficios.ingresarTiempoDeEspera("1");
		Beneficios.seleccionarUnidadDeTiempoDeEspera("Dia");
		// ---------------------------------------------------------------------
		// Frecuencia de uso
		// ---------------------------------------------------------------------
		Beneficios.ingresarFrecuenciaDeUso("2");
		Beneficios.seleccionarUnidadDeTiempoFrecuenciaDeUso("Semana");
		// ---------------------------------------------------------------------
		// Elegibilidad
		// ---------------------------------------------------------------------
		Beneficios.ingresarEdadMinimaElegibilidad("18");
		Beneficios.ingresarEdadMaximaElegibilidad("100");
		Beneficios.seleccionarTipoDeAfiliado("Dependiente");
		Beneficios.seleccionarParentesco("Padre");
		Beneficios.seleccionarGenero("MASCULINO");
		Beneficios.seleccionarEstadoCivil("Soltero(a)");
		Beneficios.seleccionarTipoDeReclamante("Farmacia");
		// ---------------------------------------------------------------------
		// Guardar
		// ---------------------------------------------------------------------
		Beneficios.presionarBotonGuardar();
	}

	@Cuando("^deje vac�o el rango m�ximo despues de seleccionar un a�o en la unidad de tiempo para la configuraci�n de la cobertura$")
	public void deje_vac�o_el_rango_m�ximo_despues_de_seleccionar_un_a�o_en_la_unidad_de_tiempo_para_la_configuraci�n_de_la_cobertura()
			throws Throwable {
		// ---------------------------------------------------------------------
		// CONFIGURAR BENEFICIOS
		// ---------------------------------------------------------------------
		Beneficios.presionarBotonA�adir("Cobertura");
		// ---------------------------------------------------------------------
		// CONFIGURAR COBERTURA
		// ---------------------------------------------------------------------
		Beneficios.seleccionarNombreDeLaCobertura("199-RADIOGRAFIA DE ARTICULACIONES ESTERNOCLAVICULARES", "Cobertura");
		// ---------------------------------------------------------------------
		// Monto Beneficio
		// ---------------------------------------------------------------------
		Beneficios.ingresarMontoLimite("1525");
		Beneficios.seleccionarUnidadDeTiempoMontoBeneficio("Mes");
		Global.aplicarScroll("1200");
		// ---------------------------------------------------------------------
		// Coaseguro Local
		// ---------------------------------------------------------------------
		Beneficios.ingresarPorcentajeDeCoaseguroLocal("33");
		Beneficios.ingresarMontoDeCoaseguroLocal("12");
		Beneficios.seleccionarUnidadDeTiempoCoaseguroLocal("A�o");
		// ---------------------------------------------------------------------
		// Coaseguro Internacional
		// ---------------------------------------------------------------------
		Beneficios.ingresarPorcentajeDeCoaseguroInternacional("33");
		Beneficios.ingresarMontoDeCoaseguroInternacional("1223");
		Beneficios.seleccionarUnidadDeTiempoCoaseguroInternacional("A�o");
		Beneficios.seleccionarRangoMaximoCoaseguroInternacional("Poliza");
		Beneficios.ingresarPorcentajeDefinitivoCoaseguroInternacional("33");
		Global.aplicarScroll("600");
		// ---------------------------------------------------------------------
		// Reembolso Local
		// ---------------------------------------------------------------------
		Beneficios.seleccionarTipoDeReembolsoLocal("Monto Reclamado");
		Beneficios.ingresarPorcentajeDeReembolsoLocal("12");
		Beneficios.ingresarFrecuenciaDeReembolsoLocal("1");
		Beneficios.seleccionarUnidadDeTiempoDeReembolsoLocal("A�o");
		Beneficios.seleccionarRangoMaximoDelReembolsoLocal("Poliza");
		Beneficios.ingresarMontoDeReembolsoLocal("3200");
		Beneficios.seleccionarUnidadDeTiempoDeMontoReembolsoLocal("A�o");
		Beneficios.seleccionarRangoMaximoDelMontoReembolsoLocal("Poliza");
		// ---------------------------------------------------------------------
		// Reembolso Internacional
		// ---------------------------------------------------------------------
		Beneficios.seleccionarTipoDeReembolsoInternacional("Monto Reclamado");
		Beneficios.ingresarPorcentajeDeReembolsoInternacional("12");
		Beneficios.ingresarFrecuenciaDeReembolsoInternacional("1");
		Beneficios.seleccionarUnidadDeTiempoDeReembolsoInternacional("A�o");
		Beneficios.seleccionarRangoMaximoDelReembolsoInternacional("Poliza");
		Beneficios.ingresarMontoDeReembolsoInternacional("3200");
		Beneficios.seleccionarUnidadDeTiempoDeMontoReembolsoInternacional("A�o");
		Beneficios.seleccionarRangoMaximoDelMontoReembolsoInternacional("Poliza");
		Global.aplicarScroll("1200");
		// ---------------------------------------------------------------------
		// Copago
		// ---------------------------------------------------------------------
		Beneficios.seleccionarTipoDeCopago("Monto");
		Beneficios.ingresarCopago("1020");
		// ---------------------------------------------------------------------
		// Tiempo de Espera
		// ---------------------------------------------------------------------
		Beneficios.ingresarTiempoDeEspera("1");
		Beneficios.seleccionarUnidadDeTiempoDeEspera("Dia");
		// ---------------------------------------------------------------------
		// Frecuencia de uso
		// ---------------------------------------------------------------------
		Beneficios.ingresarFrecuenciaDeUso("2");
		Beneficios.seleccionarUnidadDeTiempoFrecuenciaDeUso("Semana");
		// ---------------------------------------------------------------------
		// Elegibilidad
		// ---------------------------------------------------------------------
		Beneficios.ingresarEdadMinimaElegibilidad("18");
		Beneficios.ingresarEdadMaximaElegibilidad("100");
		Beneficios.seleccionarTipoDeAfiliado("Dependiente");
		Beneficios.seleccionarParentesco("Padre");
		Beneficios.seleccionarGenero("MASCULINO");
		Beneficios.seleccionarEstadoCivil("Soltero(a)");
		Beneficios.seleccionarTipoDeReclamante("Farmacia");
		// ---------------------------------------------------------------------
		// Guardar
		// ---------------------------------------------------------------------
		Beneficios.presionarBotonGuardar();
	}

	@Cuando("^ingrese un monto limite superior en la configuraci�n de la cobertura$")
	public void ingrese_un_monto_limite_superior_en_la_configuraci�n_de_la_cobertura() throws Throwable {
		// ---------------------------------------------------------------------
		// CONFIGURAR BENEFICIOS
		// ---------------------------------------------------------------------
		Beneficios.presionarBotonA�adir("Cobertura");
		// ---------------------------------------------------------------------
		// CONFIGURAR COBERTURA
		// ---------------------------------------------------------------------
		Beneficios.seleccionarNombreDeLaCobertura("199-RADIOGRAFIA DE ARTICULACIONES ESTERNOCLAVICULARES", "Cobertura");
		// ---------------------------------------------------------------------
		// Monto Beneficio
		// ---------------------------------------------------------------------
		Beneficios.ingresarMontoLimite("210000");
		Beneficios.seleccionarUnidadDeTiempoMontoBeneficio("Mes");
		Global.aplicarScroll("1200");
		// ---------------------------------------------------------------------
		// Guardar
		// ---------------------------------------------------------------------
		Beneficios.presionarBotonGuardar();
	}

	@Cuando("^adicione varias coberturas con un monto limite superior al configurado en la categor�a$")
	public void adicione_varias_coberturas_con_un_monto_limite_superior_al_configurado_en_la_categor�a()
			throws Throwable {
		// ---------------------------------------------------------------------
		// CONFIGURAR BENEFICIOS
		// ---------------------------------------------------------------------
		Beneficios.presionarBotonA�adir("Cobertura");
		// ---------------------------------------------------------------------
		// CONFIGURAR COBERTURA
		// ---------------------------------------------------------------------
		Beneficios.seleccionarNombreDeLaCobertura("199-RADIOGRAFIA DE ARTICULACIONES ESTERNOCLAVICULARES", "Cobertura");
		// ---------------------------------------------------------------------
		// Monto Beneficio
		// ---------------------------------------------------------------------
		Beneficios.ingresarMontoLimite("50000");
		Beneficios.seleccionarUnidadDeTiempoMontoBeneficio("Mes");
		Global.aplicarScroll("1200");
		// ---------------------------------------------------------------------
		// Guardar
		// ---------------------------------------------------------------------
		Beneficios.presionarBotonGuardar();
		// ---------------------------------------------------------------------
		// CONFIGURAR BENEFICIOS
		// ---------------------------------------------------------------------
		Beneficios.presionarBotonA�adir("Cobertura");
		// ---------------------------------------------------------------------
		// CONFIGURAR COBERTURA
		// ---------------------------------------------------------------------
		Beneficios.seleccionarNombreDeLaCobertura("140-POTASIO +", "Cobertura");
		// ---------------------------------------------------------------------
		// Monto Beneficio
		// ---------------------------------------------------------------------
		Beneficios.ingresarMontoLimite("70100");
		Beneficios.seleccionarUnidadDeTiempoMontoBeneficio("Mes");
		Global.aplicarScroll("1200");
		// ---------------------------------------------------------------------
		// Guardar
		// ---------------------------------------------------------------------
		Beneficios.presionarBotonGuardar();
	}

	@Cuando("^ingrese una unidad de tiempo limite superior en la configuraci�n de la cobertura$")
	public void ingrese_una_unidad_de_tiempo_limite_superior_en_la_configuraci�n_de_la_cobertura() throws Throwable {
		// ---------------------------------------------------------------------
		// CONFIGURAR BENEFICIOS
		// ---------------------------------------------------------------------
		Beneficios.presionarBotonA�adir("Cobertura");
		// ---------------------------------------------------------------------
		// CONFIGURAR COBERTURA
		// ---------------------------------------------------------------------
		Beneficios.seleccionarNombreDeLaCobertura("199-RADIOGRAFIA DE ARTICULACIONES ESTERNOCLAVICULARES", "Cobertura");
		// ---------------------------------------------------------------------
		// Monto Beneficio
		// ---------------------------------------------------------------------
		Beneficios.ingresarMontoLimite("50000");
		Beneficios.seleccionarUnidadDeTiempoMontoBeneficio("Vida");
		Global.aplicarScroll("1200");
		// ---------------------------------------------------------------------
		// Guardar
		// ---------------------------------------------------------------------
		Beneficios.presionarBotonGuardar();
	}

	@Cuando("^adicione una cobertura al cuadro de beneficios que ya haya sido adicionado$")
	public void adicione_una_cobertura_al_cuadro_de_beneficios_que_ya_haya_sido_adicionado() throws Throwable {
		// ---------------------------------------------------------------------
		// CONFIGURAR BENEFICIOS
		// ---------------------------------------------------------------------
		Beneficios.presionarBotonA�adir("Cobertura");
		// ---------------------------------------------------------------------
		// CONFIGURAR COBERTURA
		// ---------------------------------------------------------------------
		Beneficios.seleccionarNombreDeLaCobertura("199-RADIOGRAFIA DE ARTICULACIONES ESTERNOCLAVICULARES", "Cobertura");
		// ---------------------------------------------------------------------
		// Monto Beneficio
		// ---------------------------------------------------------------------
		Beneficios.ingresarMontoLimite("50000");
		Beneficios.seleccionarUnidadDeTiempoMontoBeneficio("Mes");
		Global.aplicarScroll("1200");
		// ---------------------------------------------------------------------
		// Guardar
		// ---------------------------------------------------------------------
		Beneficios.presionarBotonGuardar();
		// ---------------------------------------------------------------------
		// CONFIGURAR BENEFICIOS
		// ---------------------------------------------------------------------
		Beneficios.presionarBotonA�adir("Cobertura");
		// ---------------------------------------------------------------------
		// CONFIGURAR COBERTURA
		// ---------------------------------------------------------------------
		Beneficios.seleccionarNombreDeLaCobertura("199-RADIOGRAFIA DE ARTICULACIONES ESTERNOCLAVICULARES", "Cobertura");
		Beneficios.ingresarMontoLimite("50000");
		Beneficios.seleccionarUnidadDeTiempoMontoBeneficio("Mes");
		Global.aplicarScroll("1200");
		// ---------------------------------------------------------------------
		// Guardar
		// ---------------------------------------------------------------------
		Beneficios.presionarBotonGuardar();
	}
	
	@Entonces("^deber�a visualizar una notificaci�n indicando que la cobertura ya se encuentra configurada al tipo de cobertura$")
	public void deber�a_visualizar_una_notificaci�n_indicando_que_la_cobertura_ya_se_encuentra_configurada_al_tipo_de_cobertura() throws Throwable {
		Beneficios.verificarMensajeDeCoberturaYaExistente();
	}

}
