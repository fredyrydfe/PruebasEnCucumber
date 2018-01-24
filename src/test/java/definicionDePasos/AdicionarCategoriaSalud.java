package definicionDePasos;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import mapaDeObjetos.Beneficios;
import mapaDeObjetos.Global;
import mapaDeObjetos.Menu;
import mapaDeObjetos.Propuesta;

public class AdicionarCategoriaSalud {

	@Dado("^que he creado una nueva conceptualización de propuesta$")
	public void que_he_creado_una_nueva_conceptualización_de_propuesta() throws Throwable {
		// ---------------------------------------------------------------------
		// Opciones de menú
		// ---------------------------------------------------------------------
		Menu.ingresarALaOpcionDePropuestas();
		Menu.ingresarALaOpcionDeNuevaSalud();
		// ---------------------------------------------------------------------
		// CONCEPTUALIZAR PROPUESTA
		// ---------------------------------------------------------------------
		// Datos del Proyecto
		// ---------------------------------------------------------------------
		Propuesta.seleccionarTipoDeVenta("Individual");
		Propuesta.ingresarNombreDelProyecto("Propuesta de Salud - ");
		Propuesta.ingresarNombreDelPlan("Plan de Salud - ");
		Propuesta.seleccionarCompañia("PRIMERA ARS DE HUMANO");
		Propuesta.seleccionarRamo("SALUD");
		Propuesta.seleccionarSubRamo("LOCAL");
		Propuesta.seleccionarTipoPlan("OPCIONAL");
		Propuesta.seleccionarModalidad("COLECTIVO EMPRESAS");
		Propuesta.ingresarComentarioEnLaConceptualizacion("Esto es una prueba de creación de propuesta");
		Global.aplicarScroll("500");
		// ---------------------------------------------------------------------
		// Territorios de Cobertura
		// ---------------------------------------------------------------------
		Propuesta.seleccionarTodosLosTerritoriosDeCobertura();
		Global.aplicarScroll("930");
		// ---------------------------------------------------------------------
		// Coaseguro Local
		// ---------------------------------------------------------------------
		Propuesta.ingresarPorcentajeDeCoaseguroLocal("50");
		Propuesta.ingresarMontoDeCoaseguroLocal("390000");
		Propuesta.seleccionarUnidadDeTiempoCoaseguroLocal("Año");
		Propuesta.seleccionarRangoMaximoDelCoaseguroLocal("Poliza");
		Propuesta.ingresarPorcentajeDefinitivoDelCoaseguroLocal("50");
		// ---------------------------------------------------------------------
		// Coaseguro Internacional
		// ---------------------------------------------------------------------
		Propuesta.ingresarPorcentajeDeCoaseguroInternacional("50");
		Propuesta.ingresarMontoDeCoaseguroInternacional("390000");
		Propuesta.seleccionarUnidadDeTiempoCoaseguroInternacional("Año");
		Propuesta.seleccionarRangoMaximoDelCoaseguroInternacional("Poliza");
		Propuesta.ingresarPorcentajeDefinitivoDelCoaseguroInternacional("50");
		Global.aplicarScroll("1350");
		// ---------------------------------------------------------------------
		// Reembolso Local
		// ---------------------------------------------------------------------
		Propuesta.seleccionarTipoDeReembolsoLocal("Monto Reclamado");
		Propuesta.ingresarPorcentajeDeReembolsoLocal("10");
		Propuesta.ingresarFrecuenciaDeReembolsoLocal("2");
		Propuesta.seleccionarUnidadDeTiempoRemmbolsoLocal("Año");
		Propuesta.seleccionarRangoMaximoRemmbolsoLocal("Poliza");
		Propuesta.ingresarMontoDelRemmbolsoLocal("1000000");
		Propuesta.seleccionarUnidadDeTiempoMontoRemmbolsoLocal("Año");
		Propuesta.seleccionarRangoMaximoMontoRemmbolsoLocal("Poliza");
		// ---------------------------------------------------------------------
		// Reembolso Internacional
		// ---------------------------------------------------------------------
		Propuesta.seleccionarTipoDeReembolsoInternacional("Monto Reclamado");
		Propuesta.ingresarPorcentajeDeReembolsoInternacional("10");
		Propuesta.ingresarFrecuenciaDeReembolsoInternacional("2");
		Propuesta.seleccionarUnidadDeTiempoRemmbolsoInternacional("Año");
		Propuesta.seleccionarRangoMaximoRemmbolsoInternacional("Poliza");
		Propuesta.ingresarMontoDelRemmbolsoInternacional("1000000");
		Propuesta.seleccionarUnidadDeTiempoMontoRemmbolsoInternacional("Año");
		Propuesta.seleccionarRangoMaximoMontoRemmbolsoInternacional("Poliza");
		Global.aplicarScroll("1730");
		// ---------------------------------------------------------------------
		// Elegibilidad y Permanencia
		// ---------------------------------------------------------------------
		Propuesta.ingresarEdadMinima("18");
		Propuesta.ingresarEdadMaxima("66");
		Propuesta.ingresarEdadDePermanencia("99");
		// ---------------------------------------------------------------------
		// Monto Limite
		// ---------------------------------------------------------------------
		Propuesta.ingresarMontoLimite("100000");
		Propuesta.seleccionarUnidadDeTiempoMontoLimite("Año");
		Propuesta.seleccionarRangoMaximoMontoLimite("Poliza");
		// ---------------------------------------------------------------------
		// Alcance de la Cobertura
		// ---------------------------------------------------------------------
		Propuesta.seleccionarPaisDeResidencia("REPUBLICA DOMINICANA");
		Propuesta.ingresarPrimaSugerida("330000000");
		Propuesta.seleccionarCanalDeDistribucion("Banca Seguros");
		Propuesta.seleccionarTipoDeMoneda("Peso Dominicano");
		Propuesta.seleccionarManejoDeImpuestos("Si");
		Propuesta.ingresarComisionSugerida("7");
		// ---------------------------------------------------------------------
		// Guardar Propuesta
		// ---------------------------------------------------------------------
		Propuesta.presionarBotonGuardar();
		Propuesta.presionarBotonCerrar();
	}

	@Cuando("^adicione una categoría al cuadro de beneficios$")
	public void adicione_una_categoría_al_cuadro_de_beneficios() throws Throwable {
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
		Beneficios.presionarBotonAgregarCategoria();
		// ---------------------------------------------------------------------
		// CONFIGURAR CATEGORÍA
		// ---------------------------------------------------------------------
		Beneficios.seleccionarNombreDelBeneficio("ACCIDENTE DE TRANSITO", "Categoría");
		// ---------------------------------------------------------------------
		// Monto Beneficio
		// ---------------------------------------------------------------------
		Beneficios.ingresarMontoLimite("10000");
		Beneficios.seleccionarUnidadDeTiempoMontoBeneficio("Mes");
		Global.aplicarScroll("400");
		// ---------------------------------------------------------------------
		// Coaseguro Local
		// ---------------------------------------------------------------------
		Beneficios.ingresarPorcentajeDeCoaseguroLocal("33");
		Beneficios.ingresarMontoDeCoaseguroLocal("12");
		Beneficios.seleccionarUnidadDeTiempoCoaseguroLocal("Año");
		Beneficios.seleccionarRangoMaximoCoaseguroLocal("Asegurado");
		Beneficios.ingresarPorcentajeDefinitivoCoaseguroLocal("33");
		// ---------------------------------------------------------------------
		// Coaseguro Internacional
		// ---------------------------------------------------------------------
		Beneficios.ingresarPorcentajeDeCoaseguroInternacional("33");
		Beneficios.ingresarMontoDeCoaseguroInternacional("1223");
		Beneficios.seleccionarUnidadDeTiempoCoaseguroInternacional("Año");
		Beneficios.seleccionarRangoMaximoCoaseguroInternacional("Poliza");
		Beneficios.ingresarPorcentajeDefinitivoCoaseguroInternacional("33");
		Global.aplicarScroll("600");
		// ---------------------------------------------------------------------
		// Reembolso Local
		// ---------------------------------------------------------------------
		Beneficios.seleccionarTipoDeReembolsoLocal("Monto Reclamado");
		Beneficios.ingresarPorcentajeDeReembolsoLocal("12");
		Beneficios.ingresarFrecuenciaDeReembolsoLocal("1");
		Beneficios.seleccionarUnidadDeTiempoDeReembolsoLocal("Año");
		Beneficios.seleccionarRangoMaximoDelReembolsoLocal("Poliza");
		Beneficios.ingresarMontoDeReembolsoLocal("3200");
		Beneficios.seleccionarUnidadDeTiempoDeMontoReembolsoLocal("Año");
		Beneficios.seleccionarRangoMaximoDelMontoReembolsoLocal("Poliza");
		// ---------------------------------------------------------------------
		// Reembolso Internacional
		// ---------------------------------------------------------------------
		Beneficios.seleccionarTipoDeReembolsoInternacional("Monto Reclamado");
		Beneficios.ingresarPorcentajeDeReembolsoInternacional("12");
		Beneficios.ingresarFrecuenciaDeReembolsoInternacional("1");
		Beneficios.seleccionarUnidadDeTiempoDeReembolsoInternacional("Año");
		Beneficios.seleccionarRangoMaximoDelReembolsoInternacional("Poliza");
		Beneficios.ingresarMontoDeReembolsoInternacional("3200");
		Beneficios.seleccionarUnidadDeTiempoDeMontoReembolsoInternacional("Año");
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
		Beneficios.seleccionarTipoDeReclamante("Farmacia");
		// ---------------------------------------------------------------------
		// Guardar
		// ---------------------------------------------------------------------
		Beneficios.presionarBotonGuardar();
	}

	@Cuando("^deje vacio los campos obligatorios en la configuración de la categoría$")
	public void deje_vacio_los_campos_obligatorios_en_la_configuración_de_la_categoría() throws Throwable {
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
		Beneficios.presionarBotonAgregarCategoria();
		// ---------------------------------------------------------------------
		// Coaseguro Local
		// ---------------------------------------------------------------------
		Beneficios.ingresarPorcentajeDeCoaseguroLocal("33");
		Beneficios.ingresarMontoDeCoaseguroLocal("12");
		Beneficios.seleccionarUnidadDeTiempoCoaseguroLocal("Año");
		Beneficios.seleccionarRangoMaximoCoaseguroLocal("Poliza");
		Beneficios.ingresarPorcentajeDefinitivoCoaseguroLocal("33");
		Global.aplicarScroll("400");
		// ---------------------------------------------------------------------
		// Coaseguro Internacional
		// ---------------------------------------------------------------------
		Beneficios.ingresarPorcentajeDeCoaseguroInternacional("33");
		Beneficios.ingresarMontoDeCoaseguroInternacional("1223");
		Beneficios.seleccionarUnidadDeTiempoCoaseguroInternacional("Año");
		Beneficios.seleccionarRangoMaximoCoaseguroInternacional("Poliza");
		Beneficios.ingresarPorcentajeDefinitivoCoaseguroInternacional("33");
		Global.aplicarScroll("600");
		// ---------------------------------------------------------------------
		// Reembolso Local
		// ---------------------------------------------------------------------
		Beneficios.seleccionarTipoDeReembolsoLocal("Monto Reclamado");
		Beneficios.ingresarPorcentajeDeReembolsoLocal("12");
		Beneficios.ingresarFrecuenciaDeReembolsoLocal("1");
		Beneficios.seleccionarUnidadDeTiempoDeReembolsoLocal("Año");
		Beneficios.seleccionarRangoMaximoDelReembolsoLocal("Poliza");
		Beneficios.ingresarMontoDeReembolsoLocal("3200");
		Beneficios.seleccionarUnidadDeTiempoDeMontoReembolsoLocal("Año");
		Beneficios.seleccionarRangoMaximoDelMontoReembolsoLocal("Poliza");
		// ---------------------------------------------------------------------
		// Reembolso Internacional
		// ---------------------------------------------------------------------
		Beneficios.seleccionarTipoDeReembolsoInternacional("Monto Reclamado");
		Beneficios.ingresarPorcentajeDeReembolsoInternacional("12");
		Beneficios.ingresarFrecuenciaDeReembolsoInternacional("1");
		Beneficios.seleccionarUnidadDeTiempoDeReembolsoInternacional("Año");
		Beneficios.seleccionarRangoMaximoDelReembolsoInternacional("Poliza");
		Beneficios.ingresarMontoDeReembolsoInternacional("3200");
		Beneficios.seleccionarUnidadDeTiempoDeMontoReembolsoInternacional("Año");
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
		Beneficios.seleccionarTipoDeReclamante("Farmacia");
		// ---------------------------------------------------------------------
		// Guardar
		// ---------------------------------------------------------------------
		Beneficios.presionarBotonGuardar();
	}

	@Cuando("^ingrese solo el monto limite y deje vacío el resto de campos en la configuración de la categoría$")
	public void ingrese_solo_el_monto_limite_y_deje_vacío_el_resto_de_campos_en_la_configuración_de_la_categoría() throws Throwable {
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
		Beneficios.presionarBotonAgregarCategoria();
		// ---------------------------------------------------------------------
		// CONFIGURAR CATEGORÍA
		// ---------------------------------------------------------------------
		Beneficios.seleccionarNombreDelBeneficio("ACCIDENTE DE TRANSITO", "Categoría");
		// ---------------------------------------------------------------------
		// Monto Beneficio
		// ---------------------------------------------------------------------
		Beneficios.ingresarMontoLimite("10000");
		Global.aplicarScroll("400");
		// ---------------------------------------------------------------------
		// Coaseguro Local
		// ---------------------------------------------------------------------
		Beneficios.ingresarPorcentajeDeCoaseguroLocal("33");
		Beneficios.ingresarMontoDeCoaseguroLocal("12");
		Beneficios.seleccionarUnidadDeTiempoCoaseguroLocal("Año");
		Beneficios.seleccionarRangoMaximoCoaseguroLocal("Asegurado");
		Beneficios.ingresarPorcentajeDefinitivoCoaseguroLocal("33");
		// ---------------------------------------------------------------------
		// Coaseguro Internacional
		// ---------------------------------------------------------------------
		Beneficios.ingresarPorcentajeDeCoaseguroInternacional("33");
		Beneficios.ingresarMontoDeCoaseguroInternacional("1223");
		Beneficios.seleccionarUnidadDeTiempoCoaseguroInternacional("Año");
		Beneficios.seleccionarRangoMaximoCoaseguroInternacional("Poliza");
		Beneficios.ingresarPorcentajeDefinitivoCoaseguroInternacional("33");
		Global.aplicarScroll("600");
		// ---------------------------------------------------------------------
		// Reembolso Local
		// ---------------------------------------------------------------------
		Beneficios.seleccionarTipoDeReembolsoLocal("Monto Reclamado");
		Beneficios.ingresarPorcentajeDeReembolsoLocal("12");
		Beneficios.ingresarFrecuenciaDeReembolsoLocal("1");
		Beneficios.seleccionarUnidadDeTiempoDeReembolsoLocal("Año");
		Beneficios.seleccionarRangoMaximoDelReembolsoLocal("Poliza");
		Beneficios.ingresarMontoDeReembolsoLocal("3200");
		Beneficios.seleccionarUnidadDeTiempoDeMontoReembolsoLocal("Año");
		Beneficios.seleccionarRangoMaximoDelMontoReembolsoLocal("Poliza");
		// ---------------------------------------------------------------------
		// Reembolso Internacional
		// ---------------------------------------------------------------------
		Beneficios.seleccionarTipoDeReembolsoInternacional("Monto Reclamado");
		Beneficios.ingresarPorcentajeDeReembolsoInternacional("12");
		Beneficios.ingresarFrecuenciaDeReembolsoInternacional("1");
		Beneficios.seleccionarUnidadDeTiempoDeReembolsoInternacional("Año");
		Beneficios.seleccionarRangoMaximoDelReembolsoInternacional("Poliza");
		Beneficios.ingresarMontoDeReembolsoInternacional("3200");
		Beneficios.seleccionarUnidadDeTiempoDeMontoReembolsoInternacional("Año");
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
		Beneficios.seleccionarTipoDeReclamante("Farmacia");
		// ---------------------------------------------------------------------
		// Guardar
		// ---------------------------------------------------------------------
		Beneficios.presionarBotonGuardar();
	}

	@Cuando("^deje vacío el rango máximo despues de seleccionar un año en la unidad de tiempo para la configuración de la categoría$")
	public void deje_vacío_el_rango_máximo_despues_de_seleccionar_un_año_en_la_unidad_de_tiempo_para_la_configuración_de_la_categoría() throws Throwable {
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
		Beneficios.presionarBotonAgregarCategoria();
		// ---------------------------------------------------------------------
		// CONFIGURAR CATEGORÍA
		// ---------------------------------------------------------------------
		Beneficios.seleccionarNombreDelBeneficio("ACCIDENTE DE TRANSITO", "Categoría");
		// ---------------------------------------------------------------------
		// Monto Beneficio
		// ---------------------------------------------------------------------
		Beneficios.ingresarMontoLimite("10000");
		Beneficios.seleccionarUnidadDeTiempoMontoBeneficio("Mes");
		Global.aplicarScroll("400");
		// ---------------------------------------------------------------------
		// Coaseguro Local
		// ---------------------------------------------------------------------
		Beneficios.ingresarPorcentajeDeCoaseguroLocal("33");
		Beneficios.ingresarMontoDeCoaseguroLocal("12");
		Beneficios.seleccionarUnidadDeTiempoCoaseguroLocal("Año");
		// ---------------------------------------------------------------------
		// Coaseguro Internacional
		// ---------------------------------------------------------------------
		Beneficios.ingresarPorcentajeDeCoaseguroInternacional("33");
		Beneficios.ingresarMontoDeCoaseguroInternacional("1223");
		Beneficios.seleccionarUnidadDeTiempoCoaseguroInternacional("Año");
		Beneficios.seleccionarRangoMaximoCoaseguroInternacional("Poliza");
		Beneficios.ingresarPorcentajeDefinitivoCoaseguroInternacional("33");
		Global.aplicarScroll("600");
		// ---------------------------------------------------------------------
		// Reembolso Local
		// ---------------------------------------------------------------------
		Beneficios.seleccionarTipoDeReembolsoLocal("Monto Reclamado");
		Beneficios.ingresarPorcentajeDeReembolsoLocal("12");
		Beneficios.ingresarFrecuenciaDeReembolsoLocal("1");
		Beneficios.seleccionarUnidadDeTiempoDeReembolsoLocal("Año");
		Beneficios.seleccionarRangoMaximoDelReembolsoLocal("Poliza");
		Beneficios.ingresarMontoDeReembolsoLocal("3200");
		Beneficios.seleccionarUnidadDeTiempoDeMontoReembolsoLocal("Año");
		Beneficios.seleccionarRangoMaximoDelMontoReembolsoLocal("Poliza");
		// ---------------------------------------------------------------------
		// Reembolso Internacional
		// ---------------------------------------------------------------------
		Beneficios.seleccionarTipoDeReembolsoInternacional("Monto Reclamado");
		Beneficios.ingresarPorcentajeDeReembolsoInternacional("12");
		Beneficios.ingresarFrecuenciaDeReembolsoInternacional("1");
		Beneficios.seleccionarUnidadDeTiempoDeReembolsoInternacional("Año");
		Beneficios.seleccionarRangoMaximoDelReembolsoInternacional("Poliza");
		Beneficios.ingresarMontoDeReembolsoInternacional("3200");
		Beneficios.seleccionarUnidadDeTiempoDeMontoReembolsoInternacional("Año");
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
		Beneficios.seleccionarTipoDeReclamante("Farmacia");
		// ---------------------------------------------------------------------
		// Guardar
		// ---------------------------------------------------------------------
		Beneficios.presionarBotonGuardar();
	}

	@Cuando("^ingrese un monto limite superior en la configuración de la categoría$")
	public void ingrese_un_monto_limite_superior_en_la_configuración_de_la_categoría() throws Throwable {
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
		Beneficios.presionarBotonAgregarCategoria();
		// ---------------------------------------------------------------------
		// CONFIGURAR CATEGORÍA
		// ---------------------------------------------------------------------
		Beneficios.seleccionarNombreDelBeneficio("ACCIDENTE DE TRANSITO", "Categoría");
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

	@Cuando("^adicione una categoría al cuadro de beneficios que ya haya sido adicionada$")
	public void adicione_una_categoría_al_cuadro_de_beneficios_que_ya_haya_sido_adicionada() throws Throwable {
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
		Beneficios.presionarBotonAgregarCategoria();
		// ---------------------------------------------------------------------
		// CONFIGURAR CATEGORÍA
		// ---------------------------------------------------------------------
		Beneficios.seleccionarNombreDelBeneficio("ACCIDENTE DE TRANSITO", "Categoría");
		// ---------------------------------------------------------------------
		// Monto Beneficio
		// ---------------------------------------------------------------------
		Beneficios.ingresarMontoLimite("1000");
		Beneficios.seleccionarUnidadDeTiempoMontoBeneficio("Mes");
		Global.aplicarScroll("1200");
		// ---------------------------------------------------------------------
		// Guardar
		// ---------------------------------------------------------------------
		Beneficios.presionarBotonGuardar();
		// ---------------------------------------------------------------------
		// CONFIGURAR BENEFICIOS
		// ---------------------------------------------------------------------
		Beneficios.presionarBotonAgregarCategoria();
		// ---------------------------------------------------------------------
		// CONFIGURAR CATEGORÍA
		// ---------------------------------------------------------------------
		Beneficios.seleccionarNombreDelBeneficio("ACCIDENTE DE TRANSITO", "Categoría");
	}

	@Cuando("^ingrese una unidad de tiempo limite superior en la configuración de la categoría$")
	public void ingrese_una_unidad_de_tiempo_limite_superior_en_la_configuración_de_la_categoría() throws Throwable {
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
		Beneficios.presionarBotonAgregarCategoria();
		// ---------------------------------------------------------------------
		// CONFIGURAR CATEGORÍA
		// ---------------------------------------------------------------------
		Beneficios.seleccionarNombreDelBeneficio("ACCIDENTE DE TRANSITO", "Categoría");
		// ---------------------------------------------------------------------
		// Monto Beneficio
		// ---------------------------------------------------------------------
		Beneficios.ingresarMontoLimite("1000");
		Beneficios.seleccionarUnidadDeTiempoMontoBeneficio("Vida");
	}

}
