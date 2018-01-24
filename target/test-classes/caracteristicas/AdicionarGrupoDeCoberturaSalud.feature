# language: es
# encoding: iso-8859-1
## PLAN-1841 Monto Limite del Plan
## PLAN-207 Adicionar Grupo de Cobertura
Característica: Adicionar grupo de cobertura al cuadro de beneficios de Salud
  Como Usuario del Área de Productos quiero ingresar la configuración para un Grupo de Cobertura activo 
  dentro de la unidad de negocio para construir la estructura de Beneficios de la propuesta a ser presentada 
  al área técnica.

  Antecedentes: el usuario inicia sesión con el rol gerente senior de producto
    Dado que he iniciado sesión con el rol gerente senior de producto
    Cuando ingrese al módulo de Planes
    Entonces debería visualizar la pantalla de Consultar proyecto

  @SmokeTest @Regresión
  Escenario: el usuario adiciona un grupo de cobertura al cuadro de beneficios
    Dado que he creado una nueva conceptualización de propuesta
    Y he adicionado una categoría al cuadro de beneficios
    Cuando adicione un grupo de cobertura al cuadro de beneficios
    Entonces debería visualizar el beneficio en la pantalla del resumen de beneficios

  @Regresión
  Escenario: el usuario deja vacio los campos obligatorios
    Dado que he creado una nueva conceptualización de propuesta
    Y he adicionado una categoría al cuadro de beneficios
    Cuando deje vacio los campos obligatorios en la configuración del grupo de cobertura
    Entonces debería visualizar una notificación indicando que debo ingresar los campos obligatorios

  @Regresión
  Escenario: el usuario deja incompleta la información del monto beneficio
    Dado que he creado una nueva conceptualización de propuesta
    Y he adicionado una categoría al cuadro de beneficios
    Cuando ingrese solo el monto limite y deje vacío el resto de campos en la configuración del grupo de cobertura
    Entonces debería visualizar una notificación indicando que debo ingresar los campos obligatorios

  @Regresión
  Escenario: el usuario no diligencia el rango máximo al seleccionar un año en la unidad de tiempo
    Dado que he creado una nueva conceptualización de propuesta
    Y he adicionado una categoría al cuadro de beneficios
    Cuando deje vacío el rango máximo despues de seleccionar un año en la unidad de tiempo para la configuración del grupo de cobertura
    Entonces debería visualizar una notificación indicando que debo ingresar los campos obligatorios

  @Regresión
  Escenario: el usuario adiciona un grupo de cobertura con un monto limite superior al configurado en la categoría
    Dado que he creado una nueva conceptualización de propuesta
    Y he adicionado una categoría al cuadro de beneficios
    Cuando ingrese un monto limite superior en la configuración del grupo de cobertura
    Entonces debería visualizar una notificación indicando que debo ingresar un monto limite inferior al monto limite predecesor

  @Regresión
  Escenario: el usuario adiciona varios grupos de cobertura donde la suma del monto limite supera al configurado en la categoría
    Dado que he creado una nueva conceptualización de propuesta
    Y he adicionado una categoría al cuadro de beneficios
    Cuando adicione varios grupos de cobertura con un monto limite superior al configurado en la categoría
    Entonces debería visualizar el beneficio en la pantalla del resumen de beneficios

  @Regresión
  Escenario: el usuario ingresa una unidad de tiempo de monto limite superior al configurado en la
    conceptualización de la propuesta

    Dado que he creado una nueva conceptualización de propuesta
    Y he adicionado una categoría al cuadro de beneficios
    Cuando ingrese una unidad de tiempo limite superior en la configuración del grupo de cobertura
    Entonces debería visualizar el beneficio en la pantalla del resumen de beneficios

  @Regresión
  Escenario: el usuario configura un grupo de cobertura que previamente ya fue configurado a la categoría
    Dado que he creado una nueva conceptualización de propuesta
    Y he adicionado una categoría al cuadro de beneficios
    Cuando adicione un grupo de cobertura al cuadro de beneficios que ya haya sido adicionado
    Entonces debería visualizar una notificación indicando que el beneficio ya se encuentra configurado
