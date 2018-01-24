package opcionesCucumber;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		//features = "src/test/resources/caracteristicas",
		features = "src/test/resources/caracteristicas/ConceptualizarPropuestaSalud.feature",
		//features = "src/test/resources/caracteristicas/AdicionarCategoriaSalud.feature",
		//features = "src/test/resources/caracteristicas/AdicionarGrupoDeCoberturaSalud.feature",
		//features = "src/test/resources/caracteristicas/AdicionarServicioSalud.feature",
		//features = "src/test/resources/caracteristicas/AdicionarTipoDeCoberturaSalud.feature",
		//features = "src/test/resources/caracteristicas/AdicionarCoberturaSalud.feature",
		//features = "src/test/resources/caracteristicas/ModificarPropuestaSalud.feature",
		//features = "src/test/resources/caracteristicas/ModificarCategoriaSalud.feature",
		//features = "src/test/resources/caracteristicas/ModificarGrupoDeCoberturaSalud.feature",
		//features = "src/test/resources/caracteristicas/ModificarServicioSalud.feature",
		//features = "src/test/resources/caracteristicas/ModificarTipoDeCoberturaSalud.feature",
		//features = "src/test/resources/caracteristicas/ModificarCoberturaSalud.feature",
		//features = "src/test/resources/caracteristicas/EliminarCategoriaSalud.feature",
		//features = "src/test/resources/caracteristicas/EliminarGrupoDeCoberturaSalud.feature"
		//features = "src/test/resources/caracteristicas/EliminarServicioSalud.feature"
		//features = "src/test/resources/caracteristicas/EliminarTipoDeCoberturaSalud.feature"
		//features = "src/test/resources/caracteristicas/EliminarCoberturaSalud.feature",
		//features = "src/test/resources/caracteristicas/NotificarPropuestaAlAreaTecnica.feature",
		//features = "src/test/resources/caracteristicas/CalcularPrimaUnicaSalud.feature",
		//features = "src/test/resources/caracteristicas/NotificarAsignacionDeCaracteristicasTecnicas.feature"
		//features = "src/test/resources/caracteristicas/AdicionarAnalisisTecnicoSalud.feature",
		//features = "src/test/resources/caracteristicas/AdicionarContraPropuestaSalud.feature",
		//features = "src/test/resources/caracteristicas/NotificarContraPropuestaSalud.feature",
		//features = "src/test/resources/caracteristicas/SeleccionarAnalisisTecnicoDefinitivoSalud.feature",
		//features = "src/test/resources/caracteristicas/AprobarPropuestaSalud.feature",
		glue = "definicionDePasos",
		//tags = "@SmokeTest, @Regresión",
		tags = "@SmokeTest",
		//tags = "@Regresión",
		plugin = { "pretty", "html:target/cucumber-html-report", "json:target/cucumber.json" }
)

public class Ejecutor {
	
}