# language: es
# encoding: iso-8859-1
## ININTER-655 Notificaci�n contrapropuesta
Caracter�stica: Notificar contrapropuesta al �rea t�cnica
  Como usuario de INNOVA debo notificar al �rea encargada el ajuste realizado a la propuesta con el fin 
  de realizar una nueva evaluaci�n.

  @SmokeTest @Regresi�n
  Escenario: el usuario gerente senior de producto notifica una contrapropuesta al �rea t�cnica
    Dado que el usuario de producto notifica una propuesta local de Salud al �rea t�cnica
    Y que el usuario gerente t�cnico local ha evaluado la propuesta para ser pre-aprobada por el �rea de productos
    Y que he iniciado sesi�n con el rol gerente senior de producto
    Y he ingresado al m�dulo de Planes
    Y he consultado la propuesta notificada por el �rea t�cnica
    Y he adicionado una nueva propuesta
    Y deber�a visualizar una notificaci�n indicando la creaci�n de la nueva propuesta 
    Cuando notifique la propuesta al �rea t�cnica
    Entonces deber�a visualizar una notificaci�n indicando que la propuesta ha sido notificada
    Y deber�a visualizar la propuesta en estado Conceptualizado
    Y no deber�a poder visualizar el bot�n de notificar al �rea t�cnica en la pantalla de la propuesta
    Y no deber�a poder modificar la propuesta
    Y no deber�a poder modificar el cuadro de beneficios de la nueva propuesta
    Y no deber�a poder modificar la informaci�n de primas
    
  @SmokeTest @Regresi�n
  Escenario: el usuario gerente t�cnico local notifica una contrapropuesta de salud con informaci�n de primas
    configuradas al �rea de productos
    Dado que el usuario de producto notifica una propuesta local de Salud al �rea t�cnica
    Y que el usuario gerente t�cnico local ha evaluado la propuesta para ser pre-aprobada por el �rea de productos
    Y que el usuario de producto ha creado una contra-propuesta para ser evaluada por el �rea t�cnica
   	Y que he iniciado sesi�n con el rol gerente t�cnico local
    Y he ingresado al m�dulo de Planes
    Y he consultado la propuesta notificada por producto
    Cuando notifique la contrapropuesta al �rea de productos
    Entonces deber�a visualizar una notificaci�n indicando que la propuesta ha sido notificada
    Y deber�a visualizar la propuesta en estado Evaluado
    Y no deber�a poder visualizar el bot�n de notificar al �rea de productos en la pantalla de la propuesta
    Y no deber�a poder modificar la propuesta
    Y no deber�a poder modificar el cuadro de beneficios de la nueva propuesta con el usuario t�cnico
    Y no deber�a poder modificar la informaci�n de primas
    