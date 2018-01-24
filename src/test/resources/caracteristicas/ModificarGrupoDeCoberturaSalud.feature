# language: es
# encoding: iso-8859-1
## ININTER-53 Modificar información de los grupos de coberturas de la propuesta
Característica: Modificar información de los grupos de coberturas en la propuesta de Salud
  Como Gerente quiero modificar la información ingresada a un grupo de cobertura dentro de la propuesta 
  para ser presentada al área de Negocios.

  @SmokeTest @Regresión
  Escenario: el usuario de producto modifica la información de un grupo de cobertura
    Dado que he iniciado sesión con el rol gerente senior de producto
    Y he ingresado al módulo de Planes
    Y he creado una conceptualización de propuesta de salud
    Y he adicionado una categoría al cuadro de beneficios
    Y he adicionado un grupo de cobertura a la categoría
    Cuando modifique la información del grupo de cobertura de salud
    Entonces debería visualizar el beneficio en la pantalla del resumen de beneficios

  @Regresión
  Escenario: el usuario deja incompleta la información del monto beneficio
    Dado que he iniciado sesión con el rol gerente senior de producto
    Y he ingresado al módulo de Planes
    Y he creado una conceptualización de propuesta de salud
    Y he adicionado una categoría al cuadro de beneficios
    Y he adicionado un grupo de cobertura a la categoría
    Cuando ingrese solo el monto limite y deje vacío el resto de campos al modificar la configuración del grupo de cobertura
    Entonces debería visualizar una notificación indicando que debo ingresar los campos obligatorios

  @Regresión
  Escenario: el usuario no diligencia el rango máximo al seleccionar un año en la unidad de tiempo
    Dado que he iniciado sesión con el rol gerente senior de producto
    Y he ingresado al módulo de Planes
    Y he creado una conceptualización de propuesta de salud
    Y he adicionado una categoría al cuadro de beneficios
    Y he adicionado un grupo de cobertura a la categoría
    Cuando deje vacío el rango máximo despues de seleccionar un año en la unidad de tiempo al modificar la configuración del grupo de cobertura
    Entonces debería visualizar una notificación indicando que debo ingresar los campos obligatorios

  @Regresión
  Escenario: el usuario ingresa un monto limite superior al configurado en la conceptualización de la propuesta
    Dado que he iniciado sesión con el rol gerente senior de producto
    Y he ingresado al módulo de Planes
    Y he creado una conceptualización de propuesta de salud
    Y he adicionado una categoría al cuadro de beneficios
    Y he adicionado un grupo de cobertura a la categoría
    Cuando ingrese un monto limite superior al modificar la configuración del grupo de cobertura
    Entonces debería visualizar una notificación indicando que debo ingresar un monto limite inferior al monto limite predecesor

  @Regresión
  Escenario: el usuario ingresa una unidad de tiempo de monto limite superior al configurado en la
    conceptualización de la propuesta

    Dado que he iniciado sesión con el rol gerente senior de producto
    Y he ingresado al módulo de Planes
    Y he creado una conceptualización de propuesta de salud
    Y he adicionado una categoría al cuadro de beneficios
    Y he adicionado un grupo de cobertura a la categoría
    Cuando ingrese una unidad de tiempo limite superior al modificar la configuración del grupo de cobertura
    Entonces debería visualizar una notificación indicando que debo ingresar una unidad de tiempo inferior
