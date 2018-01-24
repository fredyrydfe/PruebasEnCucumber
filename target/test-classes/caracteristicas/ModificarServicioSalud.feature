# language: es
# encoding: iso-8859-1
## ININTER-54 Modificar informaci�n de los servicios de la propuesta
Caracter�stica: Modificar informaci�n de los servicios en la propuesta de Salud
  Como Gerente quiero modificar la informaci�n ingresada a un Servicio dentro de la propuesta para 
  ser presentada al �rea de Negocios.

  @SmokeTest @Regresi�n
  Escenario: el usuario de producto modifica la informaci�n de un servicio
    Dado que he iniciado sesi�n con el rol gerente senior de producto
    Y he ingresado al m�dulo de Planes
    Y he creado una conceptualizaci�n de propuesta de salud
    Y he adicionado una categor�a al cuadro de beneficios
    Y he adicionado un grupo de cobertura a la categor�a
    Y he adicionado un servicio al grupo de cobertura
    Cuando modifique la informaci�n del servicio de salud
    Entonces deber�a visualizar el beneficio en la pantalla del resumen de beneficios

  @Regresi�n
  Escenario: el usuario deja incompleta la informaci�n del monto beneficio
    Dado que he iniciado sesi�n con el rol gerente senior de producto
    Y he ingresado al m�dulo de Planes
    Y he creado una conceptualizaci�n de propuesta de salud
    Y he adicionado una categor�a al cuadro de beneficios
    Y he adicionado un grupo de cobertura a la categor�a
    Y he adicionado un servicio al grupo de cobertura
    Cuando ingrese solo el monto limite y deje vac�o el resto de campos al modificar la configuraci�n del servicio
    Entonces deber�a visualizar una notificaci�n indicando que debo ingresar los campos obligatorios

  @Regresi�n
  Escenario: el usuario no diligencia el rango m�ximo al seleccionar un a�o en la unidad de tiempo
    Dado que he iniciado sesi�n con el rol gerente senior de producto
    Y he ingresado al m�dulo de Planes
    Y he creado una conceptualizaci�n de propuesta de salud
    Y he adicionado una categor�a al cuadro de beneficios
    Y he adicionado un grupo de cobertura a la categor�a
    Y he adicionado un servicio al grupo de cobertura
    Cuando deje vac�o el rango m�ximo despues de seleccionar un a�o en la unidad de tiempo al modificar la configuraci�n del servicio
    Entonces deber�a visualizar una notificaci�n indicando que debo ingresar los campos obligatorios

  @Regresi�n
  Escenario: el usuario ingresa un monto limite superior al configurado en la conceptualizaci�n de la propuesta
    Dado que he iniciado sesi�n con el rol gerente senior de producto
    Y he ingresado al m�dulo de Planes
    Y he creado una conceptualizaci�n de propuesta de salud
    Y he adicionado una categor�a al cuadro de beneficios
    Y he adicionado un grupo de cobertura a la categor�a
    Y he adicionado un servicio al grupo de cobertura
    Cuando ingrese un monto limite superior al modificar la configuraci�n del servicio
    Entonces deber�a visualizar una notificaci�n indicando que debo ingresar un monto limite inferior al monto limite predecesor

  @Regresi�n
  Escenario: el usuario ingresa una unidad de tiempo de monto limite superior al configurado en la
    conceptualizaci�n de la propuesta

    Dado que he iniciado sesi�n con el rol gerente senior de producto
    Y he ingresado al m�dulo de Planes
    Y he creado una conceptualizaci�n de propuesta de salud
    Y he adicionado una categor�a al cuadro de beneficios
    Y he adicionado un grupo de cobertura a la categor�a
    Y he adicionado un servicio al grupo de cobertura
    Cuando ingrese una unidad de tiempo limite superior al modificar la configuraci�n del servicio
    Entonces deber�a visualizar una notificaci�n indicando que debo ingresar una unidad de tiempo inferior
