# language: es
# encoding: iso-8859-1
## ININTER-19 Modificar propuesta
Característica: Modificar propuesta de Salud
  Como Gerente de Productos quiero modificar información en una propuesta de planes elaborada 
  para que sea evaluada por el área técnica.

  @SmokeTest @Regresión
  Escenario: el usuario de producto modifica una propuesta de salud en estado conceptualizado que no haya sido notificada al área técnica
    Dado que he iniciado sesión con el rol gerente senior de producto
    Y he ingresado al módulo de Planes
    Y he creado una conceptualización de propuesta de salud
    Cuando modifique la propuesta
    Entonces debería visualizar una notificación solicitando la confirmación de la acción
    Y una vez confirme la acción debería visualizar una notificación indicando la modificación de la propuesta
    Y debería visualizar la nueva información en la pantalla de la conceptualización

  @Regresión
  Escenario: el usuario deja vacío los campos obligatorios
    Dado que he iniciado sesión con el rol gerente senior de producto
    Y he ingresado al módulo de Planes
    Y he creado una conceptualización de propuesta de salud
    Cuando deje vacío los campos obligatorios al modificar la propuesta de salud
    Entonces debería visualizar una notificación solicitando la confirmación de la acción
    Y una vez confirme la acción debería visualizar una notificación indicando que debo ingresar los campos obligatorios

  @Regresión
  Escenario: el usuario deja incompleta la información del monto beneficio
    Dado que he iniciado sesión con el rol gerente senior de producto
    Y he ingresado al módulo de Planes
    Y he creado una conceptualización de propuesta de salud
    Cuando ingrese solo el monto limite y deje vacío el resto de campos al modificar la propuesta de salud
    Entonces debería visualizar una notificación solicitando la confirmación de la acción
    Y una vez confirme la acción debería visualizar una notificación indicando que debo ingresar los campos obligatorios

  @Regresión
  Escenario: el usuario no diligencia el rango máximo al seleccionar un año en la unidad de tiempo
    Dado que he iniciado sesión con el rol gerente senior de producto
    Y he ingresado al módulo de Planes
    Y he creado una conceptualización de propuesta de salud
    Cuando deje vacío el rango máximo despues de seleccionar un año en la unidad de tiempo al modificar la propuesta de salud
    Entonces debería visualizar una notificación solicitando la confirmación de la acción
    Y una vez confirme la acción debería visualizar una notificación indicando que debo seleccionar un rango máximo

  @Regresión
  Escenario: el usuario ingresa un nombre de proyecto ya existente
    Dado que he iniciado sesión con el rol gerente senior de producto
    Y he ingresado al módulo de Planes
    Y he creado una conceptualización de propuesta de salud
    Cuando ingrese un nombre de proyecto que ya existe al modificar la propuesta de salud
    Entonces debería visualizar una notificación solicitando la confirmación de la acción
    Y una vez confirme la acción debería visualizar una notificación indicando que la propuesta ya existe

  @Regresión
  Escenario: el usuario ingresa una edad mínima superior a la edad máxima
    Dado que he iniciado sesión con el rol gerente senior de producto
    Y he ingresado al módulo de Planes
    Y he creado una conceptualización de propuesta de salud
    Cuando ingrese una edad mínima que supera la edad máxima al modificar la propuesta de salud
    Entonces debería visualizar una notificación solicitando la confirmación de la acción
    Y una vez confirme la acción debería visualizar una notificación indicando que la edad mínima no puede superar la edad máxima
    
  @SmokeTest @Regresión
  Escenario: el usuario técnico de salud modifica una propuesta de salud en estado conceptualizado que ya se encuentra notificada al área técnica
    Dado que el usuario de producto notifica una propuesta local de Salud al área técnica
    Y que he iniciado sesión con el rol gerente técnico local
    Y he ingresado al módulo de Planes
    Y he consultado la propuesta notificada por producto
    Cuando modifique la propuesta con el usuario técnico
    Entonces debería visualizar una notificación solicitando la confirmación de la acción
    Y una vez confirme la acción debería visualizar una notificación indicando la modificación de la propuesta
    
  @Regresión
  Escenario: el usuario técnico de salud modifica una propuesta de salud en estado conceptualizado que no se encuentra notificada al área técnica
    Dado que el usuario de producto crea una propuesta local de Salud sin notificar al área técnica 
    Y que he iniciado sesión con el rol gerente técnico local
    Y he ingresado al módulo de Planes
    Y he consultado la propuesta notificada por producto
    Cuando intente modificar la propuesta con el usuario técnico
    Entonces no debería poder guardar los cambios realizados en la propuesta
    
  @Regresión
  Escenario: el usuario de producto modifica una propuesta de salud en estado conceptualizado que ya se encuentra notificada al área técnica
    Dado que he iniciado sesión con el rol gerente senior de producto
    Y he ingresado al módulo de Planes
    Y he consultado una conceptualización de propuesta de salud que se encuentre notificada al área técnica
    Cuando intente modificar la propuesta
    Entonces no debería poder guardar los cambios realizados en la propuesta
