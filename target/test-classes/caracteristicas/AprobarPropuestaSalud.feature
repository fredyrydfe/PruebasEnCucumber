# language: es
# encoding: iso-8859-1
## ININTER-40 Aprobar propuesta - "Pre-Aprobado"
Caracter�stica: Aprobar propuesta de Salud
  Como Gerente Senior de Productos necesito modificar el estado de la propuesta entregada por las �reas 
  Producto, T�cnico para ser presentada a la Gerencia de Negocios y posteriormente a la entidad reguladora 
  para su respectiva aprobaci�n.
  
  @SmokeTest @Regresi�n
  Escenario: el usuario gerente senior de producto aprueba la propuesta para ser presentada a la Gerencia de Negocios
    Dado que el usuario de producto notifica una propuesta local de Salud al �rea t�cnica
    Y que el usuario gerente t�cnico local ha evaluado la propuesta para ser pre-aprobada por el �rea de productos
    Y que he iniciado sesi�n con el rol gerente senior de producto
    Y he ingresado al m�dulo de Planes
    Y he consultado la propuesta notificada por el �rea t�cnica
    Y he seleccionado un an�lisis t�cnico como definitivo
    Y deber�a visualizar una notificaci�n solicitando la confirmaci�n de la selecci�n del �nalisis t�cnico definitivo
    Y deber�a visualizar una notificaci�n indicando la selecci�n del an�lisis t�cnico definitivo
    Cuando he aprobado la propuesta
    Entonces deber�a visualizar una notificaci�n indicando que la propuesta ha sido pre-aprobada
    Y no deber�a poder modificar la propuesta
    Y no deber�a poder modificar el cuadro de beneficios
    Y no deber�a poder modificar la informaci�n de primas 
    
