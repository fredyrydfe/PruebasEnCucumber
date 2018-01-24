package definicionDePasos;

import cucumber.api.java.es.Cuando;
import mapaDeObjetos.Beneficios;
import mapaDeObjetos.Global;

public class ModificarGrupoDeCoberturaSalud {

	@Cuando("^modifique la información del grupo de cobertura de salud$")
	public void modifique_la_información_del_grupo_de_cobertura_de_salud() throws Throwable {
		// ---------------------------------------------------------------------
		// CONFIGURAR BENEFICIOS
		// ---------------------------------------------------------------------
		Beneficios.presionarBotonEditar("Grupo");
		// ---------------------------------------------------------------------
		// CONFIGURAR GRUPO DE COBERTURA
		// ---------------------------------------------------------------------
		// Se limpian los campos ha modificar en el formulario
		// ---------------------------------------------------------------------
		Beneficios.limpiarCamposAModificarEnElBeneficioDeSalud();
		// ---------------------------------------------------------------------
		// Monto Beneficio
		// ---------------------------------------------------------------------
		Beneficios.ingresarMontoLimite("10200");
		Beneficios.seleccionarUnidadDeTiempoMontoBeneficio("Dia");
		Global.aplicarScroll("400");
		// ---------------------------------------------------------------------
		// Coaseguro Local
		// ---------------------------------------------------------------------
		Beneficios.ingresarPorcentajeDeCoaseguroLocal("10");
		// ---------------------------------------------------------------------
		// Coaseguro Internacional
		// ---------------------------------------------------------------------
		Beneficios.ingresarPorcentajeDeCoaseguroInternacional("40");
		Global.aplicarScroll("1200");
		// ---------------------------------------------------------------------
		// Frecuencia de uso
		// ---------------------------------------------------------------------
		Beneficios.ingresarFrecuenciaDeUso("4");
		Beneficios.seleccionarUnidadDeTiempoFrecuenciaDeUso("Dia");
		// ---------------------------------------------------------------------
		// Guardar
		// ---------------------------------------------------------------------
		Beneficios.presionarBotonGuardar();
	}

	@Cuando("^ingrese solo el monto limite y deje vacío el resto de campos al modificar la configuración del grupo de cobertura$")
	public void ingrese_solo_el_monto_limite_y_deje_vacío_el_resto_de_campos_al_modificar_la_configuración_del_grupo_de_cobertura()
			throws Throwable {
		// ---------------------------------------------------------------------
		// CONFIGURAR BENEFICIOS
		// ---------------------------------------------------------------------
		Beneficios.presionarBotonEditar("Grupo");
		// ---------------------------------------------------------------------
		// CONFIGURAR GRUPO DE COBERTURA
		// ---------------------------------------------------------------------
		// Se limpian los campos ha modificar en el formulario
		// ---------------------------------------------------------------------
		Beneficios.limpiarCamposAModificarEnElBeneficioDeSalud();
		// ---------------------------------------------------------------------
		// Monto Beneficio
		// ---------------------------------------------------------------------
		Beneficios.ingresarMontoLimite("100");
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

	@Cuando("^deje vacío el rango máximo despues de seleccionar un año en la unidad de tiempo al modificar la configuración del grupo de cobertura$")
	public void deje_vacío_el_rango_máximo_despues_de_seleccionar_un_año_en_la_unidad_de_tiempo_al_modificar_la_configuración_del_grupo_de_cobertura()
			throws Throwable {
		// ---------------------------------------------------------------------
		// CONFIGURAR BENEFICIOS
		// ---------------------------------------------------------------------
		Beneficios.presionarBotonEditar("Grupo");
		// ---------------------------------------------------------------------
		// CONFIGURAR GRUPO DE COBERTURA
		// ---------------------------------------------------------------------
		// Se limpian los campos ha modificar en el formulario
		// ---------------------------------------------------------------------
		Beneficios.limpiarCamposAModificarEnElBeneficioDeSalud();
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

	@Cuando("^ingrese un monto limite superior al modificar la configuración del grupo de cobertura$")
	public void ingrese_un_monto_limite_superior_al_modificar_la_configuración_del_grupo_de_cobertura()
			throws Throwable {
		// ---------------------------------------------------------------------
		// CONFIGURAR BENEFICIOS
		// ---------------------------------------------------------------------
		Beneficios.presionarBotonEditar("Grupo");
		// ---------------------------------------------------------------------
		// CONFIGURAR GRUPO DE COBERTURA
		// ---------------------------------------------------------------------
		// Se limpian los campos ha modificar en el formulario
		// ---------------------------------------------------------------------
		Beneficios.limpiarCamposAModificarEnElBeneficioDeSalud();
		// ---------------------------------------------------------------------
		// Monto Beneficio
		// ---------------------------------------------------------------------
		Beneficios.ingresarMontoLimite("210000");
	}

	@Cuando("^ingrese una unidad de tiempo limite superior al modificar la configuración del grupo de cobertura$")
	public void ingrese_una_unidad_de_tiempo_limite_superior_al_modificar_la_configuración_del_grupo_de_cobertura()
			throws Throwable {
		// ---------------------------------------------------------------------
		// CONFIGURAR BENEFICIOS
		// ---------------------------------------------------------------------
		Beneficios.presionarBotonEditar("Grupo");
		// ---------------------------------------------------------------------
		// CONFIGURAR GRUPO DE COBERTURA
		// ---------------------------------------------------------------------
		// Se limpian los campos ha modificar en el formulario
		// ---------------------------------------------------------------------
		Beneficios.limpiarCamposAModificarEnElBeneficioDeSalud();
		// ---------------------------------------------------------------------
		// Monto Beneficio
		// ---------------------------------------------------------------------
		Beneficios.ingresarMontoLimite("1000");
		Beneficios.seleccionarUnidadDeTiempoMontoBeneficio("Vida");
	}

}
