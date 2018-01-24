# language: es
# encoding: iso-8859-1
## ININTER-19 Modificar propuesta
Caracter�stica: Modificar propuesta de Salud
  Como Gerente de Productos quiero modificar informaci�n en una propuesta de planes elaborada 
  para que sea evaluada por el �rea t�cnica.

  @SmokeTest @Regresi�n
  Escenario: el usuario de producto modifica una propuesta de salud en estado conceptualizado que no haya sido notificada al �rea t�cnica
    Dado que he iniciado sesi�n con el rol gerente senior de producto
    Y he ingresado al m�dulo de Planes
    Y he creado una conceptualizaci�n de propuesta de salud
    Cuando modifique la propuesta
    Entonces deber�a visualizar una notificaci�n solicitando la confirmaci�n de la acci�n
    Y una vez confirme la acci�n deber�a visualizar una notificaci�n indicando la modificaci�n de la propuesta
    Y deber�a visualizar la nueva informaci�n en la pantalla de la conceptualizaci�n

  @Regresi�n
  Escenario: el usuario deja vac�o los campos obligatorios
    Dado que he iniciado sesi�n con el rol gerente senior de producto
    Y he ingresado al m�dulo de Planes
    Y he creado una conceptualizaci�n de propuesta de salud
    Cuando deje vac�o los campos obligatorios al modificar la propuesta de salud
    Entonces deber�a visualizar una notificaci�n solicitando la confirmaci�n de la acci�n
    Y una vez confirme la acci�n deber�a visualizar una notificaci�n indicando que debo ingresar los campos obligatorios

  @Regresi�n
  Escenario: el usuario deja incompleta la informaci�n del monto beneficio
    Dado que he iniciado sesi�n con el rol gerente senior de producto
    Y he ingresado al m�dulo de Planes
    Y he creado una conceptualizaci�n de propuesta de salud
    Cuando ingrese solo el monto limite y deje vac�o el resto de campos al modificar la propuesta de salud
    Entonces deber�a visualizar una notificaci�n solicitando la confirmaci�n de la acci�n
    Y una vez confirme la acci�n deber�a visualizar una notificaci�n indicando que debo ingresar los campos obligatorios

  @Regresi�n
  Escenario: el usuario no diligencia el rango m�ximo al seleccionar un a�o en la unidad de tiempo
    Dado que he iniciado sesi�n con el rol gerente senior de producto
    Y he ingresado al m�dulo de Planes
    Y he creado una conceptualizaci�n de propuesta de salud
    Cuando deje vac�o el rango m�ximo despues de seleccionar un a�o en la unidad de tiempo al modificar la propuesta de salud
    Entonces deber�a visualizar una notificaci�n solicitando la confirmaci�n de la acci�n
    Y una vez confirme la acci�n deber�a visualizar una notificaci�n indicando que debo seleccionar un rango m�ximo

  @Regresi�n
  Escenario: el usuario ingresa un nombre de proyecto ya existente
    Dado que he iniciado sesi�n con el rol gerente senior de producto
    Y he ingresado al m�dulo de Planes
    Y he creado una conceptualizaci�n de propuesta de salud
    Cuando ingrese un nombre de proyecto que ya existe al modificar la propuesta de salud
    Entonces deber�a visualizar una notificaci�n solicitando la confirmaci�n de la acci�n
    Y una vez confirme la acci�n deber�a visualizar una notificaci�n indicando que la propuesta ya existe

  @Regresi�n
  Escenario: el usuario ingresa una edad m�nima superior a la edad m�xima
    Dado que he iniciado sesi�n con el rol gerente senior de producto
    Y he ingresado al m�dulo de Planes
    Y he creado una conceptualizaci�n de propuesta de salud
    Cuando ingrese una edad m�nima que supera la edad m�xima al modificar la propuesta de salud
    Entonces deber�a visualizar una notificaci�n solicitando la confirmaci�n de la acci�n
    Y una vez confirme la acci�n deber�a visualizar una notificaci�n indicando que la edad m�nima no puede superar la edad m�xima
    
  @SmokeTest @Regresi�n
  Escenario: el usuario t�cnico de salud modifica una propuesta de salud en estado conceptualizado que ya se encuentra notificada al �rea t�cnica
    Dado que el usuario de producto notifica una propuesta local de Salud al �rea t�cnica
    Y que he iniciado sesi�n con el rol gerente t�cnico local
    Y he ingresado al m�dulo de Planes
    Y he consultado la propuesta notificada por producto
    Cuando modifique la propuesta con el usuario t�cnico
    Entonces deber�a visualizar una notificaci�n solicitando la confirmaci�n de la acci�n
    Y una vez confirme la acci�n deber�a visualizar una notificaci�n indicando la modificaci�n de la propuesta
    
  @Regresi�n
  Escenario: el usuario t�cnico de salud modifica una propuesta de salud en estado conceptualizado que no se encuentra notificada al �rea t�cnica
    Dado que el usuario de producto crea una propuesta local de Salud sin notificar al �rea t�cnica 
    Y que he iniciado sesi�n con el rol gerente t�cnico local
    Y he ingresado al m�dulo de Planes
    Y he consultado la propuesta notificada por producto
    Cuando intente modificar la propuesta con el usuario t�cnico
    Entonces no deber�a poder guardar los cambios realizados en la propuesta
    
  @Regresi�n
  Escenario: el usuario de producto modifica una propuesta de salud en estado conceptualizado que ya se encuentra notificada al �rea t�cnica
    Dado que he iniciado sesi�n con el rol gerente senior de producto
    Y he ingresado al m�dulo de Planes
    Y he consultado una conceptualizaci�n de propuesta de salud que se encuentre notificada al �rea t�cnica
    Cuando intente modificar la propuesta
    Entonces no deber�a poder guardar los cambios realizados en la propuesta
