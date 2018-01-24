# language: es
# encoding: iso-8859-1
## ININTER-43 Registrar c�digo de la entidad reguladora
Caracter�stica: Registrar c�digo de la entidad reguladora
  Como Gerente Legal necesito ingresar el c�digo de aprobaci�n de la entidad reguladora para 
  completar los requerimientos necesarios para activar el plan.
  
  @SmokeTest1 @Regresi�n
  Escenario: el usuario gerente legal ingresa el c�digo de aprobaci�n de la entidad reguladora para una propuesta
  marcada con la compa�ia Primera ARS de Humano
    Dado que el usuario de producto notifica una propuesta local de Salud al �rea t�cnica identificada con la compa�ia Primera ARS de Humano
    Y que el usuario gerente t�cnico local ha evaluado la propuesta para ser pre-aprobada por el �rea de productos
    Y que el usuario de producto aprueba la propuesta para ser presentada a la Gerencia de Negocios
    Y que he iniciado sesi�n con el rol gerente legal
    Y he ingresado al m�dulo de Planes
    Y he consultado la propuesta notificada por el �rea t�cnica
    Cuando he ingresado un c�digo de aprobaci�n valido
    Entonces deber�a visualizar una notificaci�n solicitando la confirmaci�n del c�digo de aprobaci�n ingresado
    Y deber�a visualizar una notificaci�n indicando el guardado del c�digo de aprobaci�n
    Y no deber�a poder modificar la propuesta
    
  @Regresi�n
  Escenario: el usuario gerente legal ingresa el c�digo de aprobaci�n de la entidad reguladora para una propuesta
  marcada con la compa�ia Humano Seguros
    Dado que el usuario de producto notifica una propuesta local de Salud al �rea t�cnica identificada con la compa�ia Humano Seguros
    Y que el usuario gerente t�cnico local ha evaluado la propuesta para ser pre-aprobada por el �rea de productos
    Y que el usuario de producto aprueba la propuesta para ser presentada a la Gerencia de Negocios
    Y que he iniciado sesi�n con el rol gerente legal
    Y he ingresado al m�dulo de Planes
    Y he consultado la propuesta notificada por el �rea t�cnica
    Cuando he ingresado un c�digo de aprobaci�n valido
    Entonces deber�a visualizar una notificaci�n solicitando la confirmaci�n del c�digo de aprobaci�n ingresado
    Y deber�a visualizar una notificaci�n indicando el guardado del c�digo de aprobaci�n
    Y no deber�a poder modificar la propuesta
    
  @Regresi�n
  Escenario: el usuario gerente legal ingresa un c�digo de aprobaci�n con caracteres especiales 
    Dado que el usuario de producto notifica una propuesta local de Salud al �rea t�cnica identificada con la compa�ia Humano Seguros
    Y que el usuario gerente t�cnico local ha evaluado la propuesta para ser pre-aprobada por el �rea de productos
    Y que el usuario de producto aprueba la propuesta para ser presentada a la Gerencia de Negocios
    Y que he iniciado sesi�n con el rol gerente legal
    Y he ingresado al m�dulo de Planes
    Y he consultado la propuesta notificada por el �rea t�cnica
    Cuando he ingresado un c�digo de aprobaci�n con caracteres especiales
    Entonces deber�a visualizar una notificaci�n solicitando la confirmaci�n del c�digo de aprobaci�n ingresado
    Y deber�a visualizar una notificaci�n indicando el guardado del c�digo de aprobaci�n
    Y no deber�a poder modificar la propuesta
    
  @Regresi�n
  Escenario: el usuario gerente legal ingresa un c�digo de aprobaci�n menor a la cantidad m�nima para una propuesta identificada con la compa�ia Humano Seguros
    Dado que el usuario de producto notifica una propuesta local de Salud al �rea t�cnica identificada con la compa�ia Humano Seguros
    Y que el usuario gerente t�cnico local ha evaluado la propuesta para ser pre-aprobada por el �rea de productos
    Y que el usuario de producto aprueba la propuesta para ser presentada a la Gerencia de Negocios
    Y que he iniciado sesi�n con el rol gerente legal
    Y he ingresado al m�dulo de Planes
    Y he consultado la propuesta notificada por el �rea t�cnica
    Cuando he ingresado un c�digo de aprobaci�n menor a la cantidad m�nima para una propuesta identificada con la compa�ia Humano Seguros
    Entonces deber�a visualizar una notificaci�n solicitando la confirmaci�n del c�digo de aprobaci�n ingresado
    Y deber�a visualizar una notificaci�n indicando el guardado del c�digo de aprobaci�n
    Y no deber�a poder modificar la propuesta
    
  @Regresi�n
  Escenario: el usuario gerente legal ingresa un c�digo de aprobaci�n menor a la cantidad m�nima para una propuesta identificada con la compa�ia Primera ARS de Humano
    Dado que el usuario de producto notifica una propuesta local de Salud al �rea t�cnica identificada con la compa�ia Humano Seguros
    Y que el usuario gerente t�cnico local ha evaluado la propuesta para ser pre-aprobada por el �rea de productos
    Y que el usuario de producto aprueba la propuesta para ser presentada a la Gerencia de Negocios
    Y que he iniciado sesi�n con el rol gerente legal
    Y he ingresado al m�dulo de Planes
    Y he consultado la propuesta notificada por el �rea t�cnica
    Cuando he ingresado un c�digo de aprobaci�n menor a la cantidad m�nima para una propuesta identificada con la compa�ia Primera ARS de Humano
    Entonces deber�a visualizar una notificaci�n solicitando la confirmaci�n del c�digo de aprobaci�n ingresado
    Y deber�a visualizar una notificaci�n indicando el guardado del c�digo de aprobaci�n
    Y no deber�a poder modificar la propuesta
  
  @Regresi�n
  Escenario: el usuario gerente legal ingresa un c�digo de aprobaci�n superior a la cantidad m�xima para una propuesta identificada con la compa�ia Primera ARS de Humano
    Dado que el usuario de producto notifica una propuesta local de Salud al �rea t�cnica identificada con la compa�ia Humano Seguros
    Y que el usuario gerente t�cnico local ha evaluado la propuesta para ser pre-aprobada por el �rea de productos
    Y que el usuario de producto aprueba la propuesta para ser presentada a la Gerencia de Negocios
    Y que he iniciado sesi�n con el rol gerente legal
    Y he ingresado al m�dulo de Planes
    Y he consultado la propuesta notificada por el �rea t�cnica
    Cuando he ingresado un c�digo de aprobaci�n con caracteres especiales
    Entonces deber�a visualizar una notificaci�n solicitando la confirmaci�n del c�digo de aprobaci�n ingresado
    Y deber�a visualizar una notificaci�n indicando el guardado del c�digo de aprobaci�n
    Y no deber�a poder modificar la propuesta
    
    