# language: es
# encoding: iso-8859-1
## PLAN-217 Adicionar Cobertura
## PLAN-1841 Monto Limite del Plan
Característica: Adicionar una cobertura al cuadro de beneficios de Salud
  Como Usuario del Área de Productos quiero ingresar la configuración para una Cobertura activa 
  dentro de la unidad de negocio para construir la estructura de Beneficios de la propuesta a ser 
  presentada al área técnica.

  Antecedentes: el usuario inicia sesión con el rol gerente senior de producto
    Dado que he iniciado sesión con el rol gerente senior de producto
    Cuando ingrese al módulo de Planes
    Entonces debería visualizar la pantalla de Consultar proyecto

  @SmokeTest @Regresión1
  Escenario: el usuario adiciona una cobertura al cuadro de beneficios
    Dado que he creado una nueva conceptualización de propuesta
    Y he adicionado una categoría al cuadro de beneficios
    Y he adicionado un grupo de cobertura a la categoría
    Y he adicionado un servicio al grupo de cobertura
    Y he adicionado un tipo de cobertura al servicio
    Cuando adicione una cobertura al cuadro de beneficios
    Entonces debería visualizar el beneficio en la pantalla de coberturas

  @Regresión
  Escenario: el usuario deja vacío los campos obligatorios
    Dado que he creado una nueva conceptualización de propuesta
    Y he adicionado una categoría al cuadro de beneficios
    Y he adicionado un grupo de cobertura a la categoría
    Y he adicionado un servicio al grupo de cobertura
    Y he adicionado un tipo de cobertura al servicio
    Cuando deje vacio los campos obligatorios en la configuración de la cobertura
    Entonces debería visualizar una notificación indicando que debo ingresar los campos obligatorios
    
  @Regresión
  Escenario: el usuario deja incompleta la información del monto beneficio
    Dado que he creado una nueva conceptualización de propuesta
    Y he adicionado una categoría al cuadro de beneficios
    Y he adicionado un grupo de cobertura a la categoría
    Y he adicionado un servicio al grupo de cobertura
    Y he adicionado un tipo de cobertura al servicio
    Cuando ingrese solo el monto limite y deje vacío el resto de campos en la configuración de la cobertura
    Entonces debería visualizar una notificación indicando que debo ingresar los campos obligatorios
    
  @Regresión
  Escenario: el usuario no diligencia el rango máximo al seleccionar un año en la unidad de tiempo
    Dado que he creado una nueva conceptualización de propuesta
    Y he adicionado una categoría al cuadro de beneficios
    Y he adicionado un grupo de cobertura a la categoría
    Y he adicionado un servicio al grupo de cobertura
    Y he adicionado un tipo de cobertura al servicio
    Cuando deje vacío el rango máximo despues de seleccionar un año en la unidad de tiempo para la configuración de la cobertura
    Entonces debería visualizar una notificación indicando que debo ingresar los campos obligatorios

  @Regresión
  Escenario: el usuario adiciona una cobertura con un monto limite superior al configurado en la categoría
    Dado que he creado una nueva conceptualización de propuesta
    Y he adicionado una categoría al cuadro de beneficios
    Y he adicionado un grupo de cobertura a la categoría
    Y he adicionado un servicio al grupo de cobertura
    Y he adicionado un tipo de cobertura al servicio
    Cuando ingrese un monto limite superior en la configuración de la cobertura
    Entonces debería visualizar una notificación indicando que debo ingresar un monto limite inferior

	@Regresión
  Escenario: el usuario adiciona varios tipos de cobertura donde la suma del monto limite supera al configurado en la categoría
    Dado que he creado una nueva conceptualización de propuesta
    Y he adicionado una categoría al cuadro de beneficios
    Y he adicionado un grupo de cobertura a la categoría
    Y he adicionado un servicio al grupo de cobertura
    Y he adicionado un tipo de cobertura al servicio
    Cuando adicione varias coberturas con un monto limite superior al configurado en la categoría
    Entonces debería visualizar el beneficio en la pantalla de coberturas
    
  @Regresión
  Escenario: el usuario ingresa una unidad de tiempo de monto limite superior al configurado en la conceptualización de la propuesta
    Dado que he creado una nueva conceptualización de propuesta
    Y he adicionado una categoría al cuadro de beneficios
    Y he adicionado un grupo de cobertura a la categoría
    Y he adicionado un servicio al grupo de cobertura
    Y he adicionado un tipo de cobertura al servicio
    Cuando ingrese una unidad de tiempo limite superior en la configuración de la cobertura
    Entonces debería visualizar el beneficio en la pantalla de coberturas

  @Regresión
  Escenario: el usuario configura una cobertura que previamente ya fue configurada al tipo de cobertura
    Dado que he creado una nueva conceptualización de propuesta
    Y he adicionado una categoría al cuadro de beneficios
    Y he adicionado un grupo de cobertura a la categoría
    Y he adicionado un servicio al grupo de cobertura
    Y he adicionado un tipo de cobertura al servicio
    Cuando adicione una cobertura al cuadro de beneficios que ya haya sido adicionado
    Entonces debería visualizar una notificación indicando que la cobertura ya se encuentra configurada al tipo de cobertura
  

