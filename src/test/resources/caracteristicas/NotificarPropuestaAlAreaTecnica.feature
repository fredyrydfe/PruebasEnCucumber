# language: es
# encoding: iso-8859-1
## ININTER-33 Notificar propuesta al �rea t�cnica
Caracter�stica: Notificar propuesta al �rea t�cnica
  Como Gerente de Productos necesito notificar al �rea T�cnica la existencia de una propuesta para que 
  se le realice la respectiva evaluaci�n t�cnica.

  @SmokeTest @Regresi�n
  Escenario: el usuario gerente senior de producto notifica una propuesta de salud completa al �rea t�cnica
    Dado que he iniciado sesi�n con el rol gerente senior de producto
    Y he ingresado al m�dulo de Planes
    Y he creado una conceptualizaci�n de propuesta de salud
    Y he adicionado una categor�a al cuadro de beneficios
    Y he adicionado un grupo de cobertura a la categor�a
    Y he adicionado un servicio al grupo de cobertura
    Y he adicionado un tipo de cobertura al servicio
    Y he adicionado una cobertura al tipo de cobertura
    Cuando notifique la propuesta al �rea t�cnica
    Entonces deber�a visualizar una notificaci�n indicando que la propuesta ha sido notificada
    Y no deber�a poder visualizar el bot�n de notificar al �rea t�cnica en la pantalla de la propuesta
    Y no deber�a poder modificar la propuesta
    Y no deber�a poder modificar el cuadro de beneficios
    Y no deber�a poder modificar la informaci�n de primas

  @Regresi�n
  Escenario: el usuario gerente senior de producto intenta notificar una propuesta de salud con
    un �rbol de beneficios incompleto

    Dado que he iniciado sesi�n con el rol gerente senior de producto
    Y he ingresado al m�dulo de Planes
    Y he creado una conceptualizaci�n de propuesta de salud
    Y he adicionado una categor�a al cuadro de beneficios
    Y he adicionado un grupo de cobertura a la categor�a
    Y he adicionado un servicio al grupo de cobertura
    Y he adicionado un tipo de cobertura al servicio
    Cuando intente notificar la propuesta al �rea t�cnica
    Entonces no deber�a poder visualizar el bot�n de notificar al �rea t�cnica en la pantalla de la propuesta
	
	@Regresi�n
  Escenario: el usuario gerente senior de producto intenta notificar una propuesta de salud con
    informaci�n incompleta en la conceptualizaci�n de la propuesta

    Dado que he iniciado sesi�n con el rol gerente senior de producto
    Y he ingresado al m�dulo de Planes
    Y he creado una conceptualizaci�n de propuesta de salud con informaci�n sin diligenciar
    Y he adicionado una categor�a al cuadro de beneficios
    Y he adicionado un grupo de cobertura a la categor�a
    Y he adicionado un servicio al grupo de cobertura
    Y he adicionado un tipo de cobertura al servicio
    Cuando intente notificar la propuesta al �rea t�cnica
    Entonces no deber�a poder visualizar el bot�n de notificar al �rea t�cnica en la pantalla de la propuesta
