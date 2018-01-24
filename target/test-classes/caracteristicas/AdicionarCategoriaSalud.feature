# language: es
# encoding: iso-8859-1
## ININTER-1189 Configurar información Categorías asociadas a la propuesta
## ININTER-1212 Mejora Grupo de Cobertura
## ININTER-1191 Visualizar Beneficios
## PLAN-1841 Monto Limite del Plan
## PLAN-206 Adicionar Categoría
Característica: Adicionar categoría al cuadro de beneficios de Salud
  Como Usuario del Área de Productos quiero ingresar la configuración para una Categoría 
  activa dentro de la unidad de negocio para construir la estructura de Beneficios de la 
  propuesta a ser presentada al área técnica.

  Antecedentes: el usuario inicia sesión con el rol gerente senior de producto
    Dado que he iniciado sesión con el rol gerente senior de producto
    Cuando ingrese al módulo de Planes
    Entonces debería visualizar la pantalla de Consultar proyecto

  @SmokeTest @Regresión
  Escenario: el usuario adiciona una categoría al cuadro de beneficios
    Dado que he creado una nueva conceptualización de propuesta
    Cuando adicione una categoría al cuadro de beneficios
    Entonces debería visualizar el beneficio en la pantalla del resumen de beneficios

  @Regresión
  Escenario: el usuario deja vacío los campos obligatorios
    Dado que he creado una nueva conceptualización de propuesta
    Cuando deje vacio los campos obligatorios en la configuración de la categoría
    Entonces debería visualizar una notificación indicando que debo ingresar los campos obligatorios
  
  @Regresión
  Escenario: el usuario deja incompleta la información del monto beneficio
    Dado que he creado una nueva conceptualización de propuesta
    Cuando ingrese solo el monto limite y deje vacío el resto de campos en la configuración de la categoría
    Entonces debería visualizar una notificación indicando que debo ingresar los campos obligatorios
    
  @Regresión
  Escenario: el usuario no diligencia el rango máximo al seleccionar un año en la unidad de tiempo
    Dado que he creado una nueva conceptualización de propuesta
    Cuando deje vacío el rango máximo despues de seleccionar un año en la unidad de tiempo para la configuración de la categoría
    Entonces debería visualizar una notificación indicando que debo ingresar los campos obligatorios

  @Regresión
  Escenario: el usuario ingresa un monto limite superior al configurado en la conceptualización de la propuesta
    Dado que he creado una nueva conceptualización de propuesta
    Cuando ingrese un monto limite superior en la configuración de la categoría
    Entonces debería visualizar una notificación indicando que debo ingresar un monto limite inferior

  @Regresión
  Escenario: el usuario ingresa una unidad de tiempo de monto limite superior al configurado en la
    conceptualización de la propuesta

    Dado que he creado una nueva conceptualización de propuesta
    Cuando ingrese una unidad de tiempo limite superior en la configuración de la categoría
    Entonces debería visualizar una notificación indicando que debo ingresar una unidad de tiempo inferior

  @Regresión
  Escenario: el usuario configura una categoría que previamente ya fue configurada
    Dado que he creado una nueva conceptualización de propuesta
    Cuando adicione una categoría al cuadro de beneficios que ya haya sido adicionada
    Entonces debería visualizar una notificación indicando que el beneficio ya se encuentra configurado
  
