# language: es
# encoding: iso-8859-1
## PLAN-1841 Monto Limite del Plan
## PLAN-208 Adicionar Servicio
Caracter�stica: Adicionar servicio al cuadro de beneficios de Salud
  Como Usuario del �rea de Productos quiero ingresar la configuraci�n para un Servicio activo
  dentro de la unidad de negocio para construir la estructura de Beneficios de la propuesta a ser 
  presentada al �rea t�cnica.

  Antecedentes: el usuario inicia sesi�n con el rol gerente senior de producto
    Dado que he iniciado sesi�n con el rol gerente senior de producto
    Cuando ingrese al m�dulo de Planes
    Entonces deber�a visualizar la pantalla de Consultar proyecto

  @SmokeTest @Regresi�n
  Escenario: el usuario adiciona un servicio al cuadro de beneficios
    Dado que he creado una nueva conceptualizaci�n de propuesta
    Y he adicionado una categor�a al cuadro de beneficios
    Y he adicionado un grupo de cobertura a la categor�a
    Cuando adicione un servicio al cuadro de beneficios
    Entonces deber�a visualizar el beneficio en la pantalla del resumen de beneficios

  @Regresi�n
  Escenario: el usuario deja vacio los campos obligatorios
    Dado que he creado una nueva conceptualizaci�n de propuesta
    Y he adicionado una categor�a al cuadro de beneficios
    Y he adicionado un grupo de cobertura a la categor�a
    Cuando deje vacio los campos obligatorios en la configuraci�n del servicio
    Entonces deber�a visualizar una notificaci�n indicando que debo ingresar los campos obligatorios
    
  @Regresi�n
  Escenario: el usuario deja incompleta la informaci�n del monto beneficio
    Dado que he creado una nueva conceptualizaci�n de propuesta
    Y he adicionado una categor�a al cuadro de beneficios
    Y he adicionado un grupo de cobertura a la categor�a
    Cuando ingrese solo el monto limite y deje vac�o el resto de campos en la configuraci�n del servicio
    Entonces deber�a visualizar una notificaci�n indicando que debo ingresar los campos obligatorios
    
  @Regresi�n
  Escenario: el usuario no diligencia el rango m�ximo al seleccionar un a�o en la unidad de tiempo
    Dado que he creado una nueva conceptualizaci�n de propuesta
    Y he adicionado una categor�a al cuadro de beneficios
    Y he adicionado un grupo de cobertura a la categor�a
    Cuando deje vac�o el rango m�ximo despues de seleccionar un a�o en la unidad de tiempo para la configuraci�n del servicio
    Entonces deber�a visualizar una notificaci�n indicando que debo ingresar los campos obligatorios

  @Regresi�n
  Escenario: el usuario adiciona un servicio con un monto limite superior al configurado en la categor�a
    Dado que he creado una nueva conceptualizaci�n de propuesta
    Y he adicionado una categor�a al cuadro de beneficios
    Y he adicionado un grupo de cobertura a la categor�a
    Cuando ingrese un monto limite superior en la configuraci�n del servicio
    Entonces deber�a visualizar una notificaci�n indicando que debo ingresar un monto limite inferior al monto limite predecesor

	@Regresi�n
  Escenario: el usuario adiciona varios servicios donde la suma del monto limite supera al configurado en la categor�a
    Dado que he creado una nueva conceptualizaci�n de propuesta
    Y he adicionado una categor�a al cuadro de beneficios
    Y he adicionado un grupo de cobertura a la categor�a
    Cuando adicione varios servicios con un monto limite superior al configurado en la categor�a
    Entonces deber�a visualizar el beneficio en la pantalla del resumen de beneficios
    
  @Regresi�n
  Escenario: el usuario ingresa una unidad de tiempo de monto limite superior al configurado en la
    conceptualizaci�n de la propuesta

    Dado que he creado una nueva conceptualizaci�n de propuesta
    Y he adicionado una categor�a al cuadro de beneficios
    Y he adicionado un grupo de cobertura a la categor�a
    Cuando ingrese una unidad de tiempo limite superior en la configuraci�n del servicio
    Entonces deber�a visualizar el beneficio en la pantalla del resumen de beneficios

  @Regresi�n
  Escenario: el usuario configura un servicio que previamente ya fue configurado al grupo de cobertura
    Dado que he creado una nueva conceptualizaci�n de propuesta
    Y he adicionado una categor�a al cuadro de beneficios
    Y he adicionado un grupo de cobertura a la categor�a
    Cuando adicione un servicio al cuadro de beneficios que ya haya sido adicionado
    Entonces deber�a visualizar una notificaci�n indicando que el beneficio ya se encuentra configurado
  
