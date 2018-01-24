# language: es
# encoding: iso-8859-1
## ININTER-25 Seleccionar el análisis técnico definitivo
Característica: Seleccionar el análisis técnico definitivo
  Como Usuario del área de Productos necesito seleccionar el análisis técnico definitivo que será presentado al área de negocios
  para su aprobación.

  @SmokeTest @Regresión
  Escenario: el usuario gerente senior de producto selecciona un análisis técnico como definitivo
    Dado que el usuario de producto notifica una propuesta local de Salud al área técnica
    Y que el usuario gerente técnico local ha evaluado la propuesta para ser pre-aprobada por el área de productos
    Y que he iniciado sesión con el rol gerente senior de producto
    Y he ingresado al módulo de Planes
    Y he consultado la propuesta notificada por el área técnica
    Cuando he seleccionado un análisis técnico como definitivo
    Entonces debería visualizar una notificación solicitando la confirmación de la selección del ánalisis técnico definitivo
    Y debería visualizar una notificación indicando la selección del análisis técnico definitivo