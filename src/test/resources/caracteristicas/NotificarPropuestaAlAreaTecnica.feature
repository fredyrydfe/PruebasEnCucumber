# language: es
# encoding: iso-8859-1
## ININTER-33 Notificar propuesta al área técnica
Característica: Notificar propuesta al área técnica
  Como Gerente de Productos necesito notificar al Área Técnica la existencia de una propuesta para que 
  se le realice la respectiva evaluación técnica.

  @SmokeTest @Regresión
  Escenario: el usuario gerente senior de producto notifica una propuesta de salud completa al área técnica
    Dado que he iniciado sesión con el rol gerente senior de producto
    Y he ingresado al módulo de Planes
    Y he creado una conceptualización de propuesta de salud
    Y he adicionado una categoría al cuadro de beneficios
    Y he adicionado un grupo de cobertura a la categoría
    Y he adicionado un servicio al grupo de cobertura
    Y he adicionado un tipo de cobertura al servicio
    Y he adicionado una cobertura al tipo de cobertura
    Cuando notifique la propuesta al área técnica
    Entonces debería visualizar una notificación indicando que la propuesta ha sido notificada
    Y no debería poder visualizar el botón de notificar al área técnica en la pantalla de la propuesta
    Y no debería poder modificar la propuesta
    Y no debería poder modificar el cuadro de beneficios
    Y no debería poder modificar la información de primas

  @Regresión
  Escenario: el usuario gerente senior de producto intenta notificar una propuesta de salud con
    un árbol de beneficios incompleto

    Dado que he iniciado sesión con el rol gerente senior de producto
    Y he ingresado al módulo de Planes
    Y he creado una conceptualización de propuesta de salud
    Y he adicionado una categoría al cuadro de beneficios
    Y he adicionado un grupo de cobertura a la categoría
    Y he adicionado un servicio al grupo de cobertura
    Y he adicionado un tipo de cobertura al servicio
    Cuando intente notificar la propuesta al área técnica
    Entonces no debería poder visualizar el botón de notificar al área técnica en la pantalla de la propuesta
	
	@Regresión
  Escenario: el usuario gerente senior de producto intenta notificar una propuesta de salud con
    información incompleta en la conceptualización de la propuesta

    Dado que he iniciado sesión con el rol gerente senior de producto
    Y he ingresado al módulo de Planes
    Y he creado una conceptualización de propuesta de salud con información sin diligenciar
    Y he adicionado una categoría al cuadro de beneficios
    Y he adicionado un grupo de cobertura a la categoría
    Y he adicionado un servicio al grupo de cobertura
    Y he adicionado un tipo de cobertura al servicio
    Cuando intente notificar la propuesta al área técnica
    Entonces no debería poder visualizar el botón de notificar al área técnica en la pantalla de la propuesta
