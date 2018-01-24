$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/caracteristicas/ConceptualizarPropuestaSalud.feature");
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
      "value": "## PLAN-1841 Monto Limite del Plan"
    },
    {
      "line": 4,
      "value": "## ININTER-6 Conceptualizar propuesta"
    }
  ],
  "line": 5,
  "name": "Conceptualizar nueva propuesta de Salud",
  "description": "Como Gerente de Productos quiero ingresar la información requerida en la\r\npresentación de una nueva propuesta de planes para que sea evaluada por el\r\nárea técnica.",
  "id": "conceptualizar-nueva-propuesta-de-salud",
  "keyword": "Característica"
});
formatter.before({
  "duration": 8619562077,
  "status": "passed"
});
formatter.background({
  "line": 10,
  "name": "el usuario inicia sesión con el rol gerente senior de producto",
  "description": "",
  "type": "background",
  "keyword": "Antecedentes"
});
formatter.step({
  "line": 11,
  "name": "que he iniciado sesión con el rol gerente senior de producto",
  "keyword": "Dado "
});
formatter.step({
  "line": 12,
  "name": "ingrese al módulo de Planes",
  "keyword": "Cuando "
});
formatter.step({
  "line": 13,
  "name": "debería visualizar la pantalla de Consultar proyecto",
  "keyword": "Entonces "
});
formatter.match({
  "location": "DefinicionDePasosComunes.que_he_iniciado_sesión_con_el_rol_gerente_senior_de_producto()"
});
formatter.result({
  "duration": 8972986441,
  "status": "passed"
});
formatter.match({
  "location": "DefinicionDePasosComunes.ingrese_al_módulo_de_Planes()"
});
formatter.result({
  "duration": 6158190574,
  "status": "passed"
});
formatter.match({
  "location": "DefinicionDePasosComunes.debería_visualizar_la_pantalla_de_Consultar_proyecto()"
});
formatter.result({
  "duration": 9600857,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "el usuario crea una propuesta basica de salud",
  "description": "",
  "id": "conceptualizar-nueva-propuesta-de-salud;el-usuario-crea-una-propuesta-basica-de-salud",
  "type": "scenario",
  "keyword": "Escenario",
  "tags": [
    {
      "line": 15,
      "name": "@SmokeTest"
    },
    {
      "line": 15,
      "name": "@Regresión"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "que estoy en la página de Conceptualizar propuesta de salud",
  "keyword": "Dado "
});
formatter.step({
  "line": 18,
  "name": "cree la propuesta",
  "keyword": "Cuando "
});
formatter.step({
  "line": 19,
  "name": "debería visualizar una notificación indicando la creación de la propuesta",
  "keyword": "Entonces "
});
formatter.match({
  "location": "ConceptualizarPropuestaSalud.que_estoy_en_la_página_de_Conceptualizar_propuesta_de_salud()"
});
formatter.result({
  "duration": 35434546532,
  "status": "passed"
});
formatter.match({
  "location": "ConceptualizarPropuestaSalud.cree_la_propuesta()"
});
formatter.result({
  "duration": 24452412354,
  "status": "passed"
});
formatter.match({
  "location": "ConceptualizarPropuestaSalud.debería_visualizar_una_notificación_indicando_la_creación_de_la_propuesta()"
});
formatter.result({
  "duration": 126509707,
  "status": "passed"
});
formatter.after({
  "duration": 1085911077,
  "status": "passed"
});
});