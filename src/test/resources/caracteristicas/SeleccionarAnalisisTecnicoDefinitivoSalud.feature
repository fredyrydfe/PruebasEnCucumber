# language: es
# encoding: iso-8859-1
## ININTER-25 Seleccionar el an�lisis t�cnico definitivo
Caracter�stica: Seleccionar el an�lisis t�cnico definitivo
  Como Usuario del �rea de Productos necesito seleccionar el an�lisis t�cnico definitivo que ser� presentado al �rea de negocios
  para su aprobaci�n.

  @SmokeTest @Regresi�n
  Escenario: el usuario gerente senior de producto selecciona un an�lisis t�cnico como definitivo
    Dado que el usuario de producto notifica una propuesta local de Salud al �rea t�cnica
    Y que el usuario gerente t�cnico local ha evaluado la propuesta para ser pre-aprobada por el �rea de productos
    Y que he iniciado sesi�n con el rol gerente senior de producto
    Y he ingresado al m�dulo de Planes
    Y he consultado la propuesta notificada por el �rea t�cnica
    Cuando he seleccionado un an�lisis t�cnico como definitivo
    Entonces deber�a visualizar una notificaci�n solicitando la confirmaci�n de la selecci�n del �nalisis t�cnico definitivo
    Y deber�a visualizar una notificaci�n indicando la selecci�n del an�lisis t�cnico definitivo