$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/caracteristicas/AdicionarCategoriaSalud.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: es"
    },
    {
      "line": 2,
      "value": "# encoding: iso-8859-1"
    },
    {
      "line": 3,
      "value": "## ININTER-1189 Configurar información Categorías asociadas a la propuesta"
    },
    {
      "line": 4,
      "value": "## ININTER-1212 Mejora Grupo de Cobertura"
    },
    {
      "line": 5,
      "value": "## ININTER-1191 Visualizar Beneficios"
    },
    {
      "line": 6,
      "value": "## PLAN-1841 Monto Limite del Plan"
    },
    {
      "line": 7,
      "value": "## PLAN-206 Adicionar Categoría"
    }
  ],
  "line": 8,
  "name": "Adicionar categoría al cuadro de beneficios de Salud",
  "description": "Como Usuario del Área de Productos quiero ingresar la configuración para una Categoría \r\nactiva dentro de la unidad de negocio para construir la estructura de Beneficios de la \r\npropuesta a ser presentada al área técnica.",
  "id": "adicionar-categoría-al-cuadro-de-beneficios-de-salud",
  "keyword": "Característica"
});
formatter.before({
  "duration": 8475640523,
  "status": "passed"
});
formatter.background({
  "line": 13,
  "name": "el usuario inicia sesión con el rol gerente senior de producto",
  "description": "",
  "type": "background",
  "keyword": "Antecedentes"
});
formatter.step({
  "line": 14,
  "name": "que he iniciado sesión con el rol gerente senior de producto",
  "keyword": "Dado "
});
formatter.step({
  "line": 15,
  "name": "ingrese al módulo de Planes",
  "keyword": "Cuando "
});
formatter.step({
  "line": 16,
  "name": "debería visualizar la pantalla de Consultar proyecto",
  "keyword": "Entonces "
});
formatter.match({
  "location": "DefinicionDePasosComunes.que_he_iniciado_sesión_con_el_rol_gerente_senior_de_producto()"
});
formatter.result({
  "duration": 10664653084,
  "status": "passed"
});
formatter.match({
  "location": "DefinicionDePasosComunes.ingrese_al_módulo_de_Planes()"
});
formatter.result({
  "duration": 7934647866,
  "status": "passed"
});
formatter.match({
  "location": "DefinicionDePasosComunes.debería_visualizar_la_pantalla_de_Consultar_proyecto()"
});
formatter.result({
  "duration": 10420058,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "el usuario adiciona una categoría al cuadro de beneficios",
  "description": "",
  "id": "adicionar-categoría-al-cuadro-de-beneficios-de-salud;el-usuario-adiciona-una-categoría-al-cuadro-de-beneficios",
  "type": "scenario",
  "keyword": "Escenario",
  "tags": [
    {
      "line": 18,
      "name": "@SmokeTest"
    },
    {
      "line": 18,
      "name": "@Regresión"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "que he creado una nueva conceptualización de propuesta",
  "keyword": "Dado "
});
formatter.step({
  "line": 21,
  "name": "adicione una categoría al cuadro de beneficios",
  "keyword": "Cuando "
});
formatter.step({
  "line": 22,
  "name": "debería visualizar el beneficio en la pantalla del resumen de beneficios",
  "keyword": "Entonces "
});
formatter.match({
  "location": "AdicionarCategoriaSalud.que_he_creado_una_nueva_conceptualización_de_propuesta()"
});
formatter.result({
  "duration": 10220329907,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d63.0.3239.132)\n  (Driver info: chromedriver\u003d2.33.506120 (e3e53437346286c0bc2d2dc9aa4915ba81d9023f),platform\u003dWindows NT 10.0.16299 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.7.1\u0027, revision: \u00278a0099a\u0027, time: \u00272017-11-06T21:01:39.354Z\u0027\nSystem info: host: \u0027DESKTOP-1E4EREV\u0027, ip: \u002710.110.26.2\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_111\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptSslCerts: true, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.33.506120 (e3e53437346286..., userDataDir: C:\\Users\\Rydfe\\AppData\\Loca...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 63.0.3239.132, webStorageEnabled: true}\nSession ID: b6d2fb9a1e5af6f4cfa96dd55805ba2c\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:600)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.executeScript(RemoteWebDriver.java:536)\r\n\tat mapaDeObjetos.Global.aplicarScroll(Global.java:22)\r\n\tat definicionDePasos.AdicionarCategoriaSalud.que_he_creado_una_nueva_conceptualización_de_propuesta(AdicionarCategoriaSalud.java:34)\r\n\tat ✽.Dado que he creado una nueva conceptualización de propuesta(src/test/resources/caracteristicas/AdicionarCategoriaSalud.feature:20)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "AdicionarCategoriaSalud.adicione_una_categoría_al_cuadro_de_beneficios()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DefinicionDePasosComunes.debería_visualizar_el_beneficio_en_la_pantalla_del_resumen_de_beneficios()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 52727489,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d63.0.3239.132)\n  (Driver info: chromedriver\u003d2.33.506120 (e3e53437346286c0bc2d2dc9aa4915ba81d9023f),platform\u003dWindows NT 10.0.16299 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.7.1\u0027, revision: \u00278a0099a\u0027, time: \u00272017-11-06T21:01:39.354Z\u0027\nSystem info: host: \u0027DESKTOP-1E4EREV\u0027, ip: \u002710.110.26.2\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_111\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptSslCerts: true, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.33.506120 (e3e53437346286..., userDataDir: C:\\Users\\Rydfe\\AppData\\Loca...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 63.0.3239.132, webStorageEnabled: true}\nSession ID: b6d2fb9a1e5af6f4cfa96dd55805ba2c\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:600)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:657)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.getScreenshotAs(RemoteWebDriver.java:342)\r\n\tat mapaDeObjetos.Global.tomarEvidencia(Global.java:31)\r\n\tat definicionDePasos.DefinicionDePasosComunes.finalizar_ejecucion(DefinicionDePasosComunes.java:27)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:224)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:212)\r\n\tat cucumber.runtime.Runtime.runAfterHooks(Runtime.java:206)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:46)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:86)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:459)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:678)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:382)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:192)\r\n",
  "status": "failed"
});
});