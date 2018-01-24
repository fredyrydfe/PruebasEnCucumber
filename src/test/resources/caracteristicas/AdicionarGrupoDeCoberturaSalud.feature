# language: es
# encoding: iso-8859-1
## PLAN-1841 Monto Limite del Plan
## PLAN-207 Adicionar Grupo de Cobertura
Caracter�stica: Adicionar grupo de cobertura al cuadro de beneficios de Salud
  Como Usuario del �rea de Productos quiero ingresar la configuraci�n para un Grupo de Cobertura activo 
  dentro de la unidad de negocio para construir la estructura de Beneficios de la propuesta a ser presentada 
  al �rea t�cnica.

  Antecedentes: el usuario inicia sesi�n con el rol gerente senior de producto
    Dado que he iniciado sesi�n con el rol gerente senior de producto
    Cuando ingrese al m�dulo de Planes
    Entonces deber�a visualizar la pantalla de Consultar proyecto

  @SmokeTest @Regresi�n
  Escenario: el usuario adiciona un grupo de cobertura al cuadro de beneficios
    Dado que he creado una nueva conceptualizaci�n de propuesta
    Y he adicionado una categor�a al cuadro de beneficios
    Cuando adicione un grupo de cobertura al cuadro de beneficios
    Entonces deber�a visualizar el beneficio en la pantalla del resumen de beneficios

  @Regresi�n
  Escenario: el usuario deja vacio los campos obligatorios
    Dado que he creado una nueva conceptualizaci�n de propuesta
    Y he adicionado una categor�a al cuadro de beneficios
    Cuando deje vacio los campos obligatorios en la configuraci�n del grupo de cobertura
    Entonces deber�a visualizar una notificaci�n indicando que debo ingresar los campos obligatorios

  @Regresi�n
  Escenario: el usuario deja incompleta la informaci�n del monto beneficio
    Dado que he creado una nueva conceptualizaci�n de propuesta
    Y he adicionado una categor�a al cuadro de beneficios
    Cuando ingrese solo el monto limite y deje vac�o el resto de campos en la configuraci�n del grupo de cobertura
    Entonces deber�a visualizar una notificaci�n indicando que debo ingresar los campos obligatorios

  @Regresi�n
  Escenario: el usuario no diligencia el rango m�ximo al seleccionar un a�o en la unidad de tiempo
    Dado que he creado una nueva conceptualizaci�n de propuesta
    Y he adicionado una categor�a al cuadro de beneficios
    Cuando deje vac�o el rango m�ximo despues de seleccionar un a�o en la unidad de tiempo para la configuraci�n del grupo de cobertura
    Entonces deber�a visualizar una notificaci�n indicando que debo ingresar los campos obligatorios

  @Regresi�n
  Escenario: el usuario adiciona un grupo de cobertura con un monto limite superior al configurado en la categor�a
    Dado que he creado una nueva conceptualizaci�n de propuesta
    Y he adicionado una categor�a al cuadro de beneficios
    Cuando ingrese un monto limite superior en la configuraci�n del grupo de cobertura
    Entonces deber�a visualizar una notificaci�n indicando que debo ingresar un monto limite inferior al monto limite predecesor

  @Regresi�n
  Escenario: el usuario adiciona varios grupos de cobertura donde la suma del monto limite supera al configurado en la categor�a
    Dado que he creado una nueva conceptualizaci�n de propuesta
    Y he adicionado una categor�a al cuadro de beneficios
    Cuando adicione varios grupos de cobertura con un monto limite superior al configurado en la categor�a
    Entonces deber�a visualizar el beneficio en la pantalla del resumen de beneficios

  @Regresi�n
  Escenario: el usuario ingresa una unidad de tiempo de monto limite superior al configurado en la
    conceptualizaci�n de la propuesta

    Dado que he creado una nueva conceptualizaci�n de propuesta
    Y he adicionado una categor�a al cuadro de beneficios
    Cuando ingrese una unidad de tiempo limite superior en la configuraci�n del grupo de cobertura
    Entonces deber�a visualizar el beneficio en la pantalla del resumen de beneficios

  @Regresi�n
  Escenario: el usuario configura un grupo de cobertura que previamente ya fue configurado a la categor�a
    Dado que he creado una nueva conceptualizaci�n de propuesta
    Y he adicionado una categor�a al cuadro de beneficios
    Cuando adicione un grupo de cobertura al cuadro de beneficios que ya haya sido adicionado
    Entonces deber�a visualizar una notificaci�n indicando que el beneficio ya se encuentra configurado
