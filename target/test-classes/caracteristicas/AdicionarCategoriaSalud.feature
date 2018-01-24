# language: es
# encoding: iso-8859-1
## ININTER-1189 Configurar informaci�n Categor�as asociadas a la propuesta
## ININTER-1212 Mejora Grupo de Cobertura
## ININTER-1191 Visualizar Beneficios
## PLAN-1841 Monto Limite del Plan
## PLAN-206 Adicionar Categor�a
Caracter�stica: Adicionar categor�a al cuadro de beneficios de Salud
  Como Usuario del �rea de Productos quiero ingresar la configuraci�n para una Categor�a 
  activa dentro de la unidad de negocio para construir la estructura de Beneficios de la 
  propuesta a ser presentada al �rea t�cnica.

  Antecedentes: el usuario inicia sesi�n con el rol gerente senior de producto
    Dado que he iniciado sesi�n con el rol gerente senior de producto
    Cuando ingrese al m�dulo de Planes
    Entonces deber�a visualizar la pantalla de Consultar proyecto

  @SmokeTest @Regresi�n
  Escenario: el usuario adiciona una categor�a al cuadro de beneficios
    Dado que he creado una nueva conceptualizaci�n de propuesta
    Cuando adicione una categor�a al cuadro de beneficios
    Entonces deber�a visualizar el beneficio en la pantalla del resumen de beneficios

  @Regresi�n
  Escenario: el usuario deja vac�o los campos obligatorios
    Dado que he creado una nueva conceptualizaci�n de propuesta
    Cuando deje vacio los campos obligatorios en la configuraci�n de la categor�a
    Entonces deber�a visualizar una notificaci�n indicando que debo ingresar los campos obligatorios
  
  @Regresi�n
  Escenario: el usuario deja incompleta la informaci�n del monto beneficio
    Dado que he creado una nueva conceptualizaci�n de propuesta
    Cuando ingrese solo el monto limite y deje vac�o el resto de campos en la configuraci�n de la categor�a
    Entonces deber�a visualizar una notificaci�n indicando que debo ingresar los campos obligatorios
    
  @Regresi�n
  Escenario: el usuario no diligencia el rango m�ximo al seleccionar un a�o en la unidad de tiempo
    Dado que he creado una nueva conceptualizaci�n de propuesta
    Cuando deje vac�o el rango m�ximo despues de seleccionar un a�o en la unidad de tiempo para la configuraci�n de la categor�a
    Entonces deber�a visualizar una notificaci�n indicando que debo ingresar los campos obligatorios

  @Regresi�n
  Escenario: el usuario ingresa un monto limite superior al configurado en la conceptualizaci�n de la propuesta
    Dado que he creado una nueva conceptualizaci�n de propuesta
    Cuando ingrese un monto limite superior en la configuraci�n de la categor�a
    Entonces deber�a visualizar una notificaci�n indicando que debo ingresar un monto limite inferior

  @Regresi�n
  Escenario: el usuario ingresa una unidad de tiempo de monto limite superior al configurado en la
    conceptualizaci�n de la propuesta

    Dado que he creado una nueva conceptualizaci�n de propuesta
    Cuando ingrese una unidad de tiempo limite superior en la configuraci�n de la categor�a
    Entonces deber�a visualizar una notificaci�n indicando que debo ingresar una unidad de tiempo inferior

  @Regresi�n
  Escenario: el usuario configura una categor�a que previamente ya fue configurada
    Dado que he creado una nueva conceptualizaci�n de propuesta
    Cuando adicione una categor�a al cuadro de beneficios que ya haya sido adicionada
    Entonces deber�a visualizar una notificaci�n indicando que el beneficio ya se encuentra configurado
  
