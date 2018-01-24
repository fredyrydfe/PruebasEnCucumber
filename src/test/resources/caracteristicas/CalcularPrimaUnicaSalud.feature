# language: es
# encoding: iso-8859-1
## ININTER-144 Ingresar valor individual de las primas
## ININTER-163 Cálculo Prima Única
## ININTER-467 Identificar beneficios capitados
## ININTER-471 Primas - Adición de Beneficios No Capitados
Característica: Calcular la prima única en una propuesta de Salud
  Como Usuario del Área Técnica necesito obtener la prima única para completar 
  el análisis técnico que se enviará a Productos.

  @SmokeTest @Regresión1
  Escenario: el usuario técnico local configura la prima única para una propuesta de Salud con subramo Local
    Dado que el usuario de producto notifica una propuesta local de Salud al área técnica
    Y que he iniciado sesión con el rol gerente técnico local
    Y he ingresado al módulo de Planes
    Y he consultado la propuesta notificada por producto
    Y he ingresado a la configuración de primas de la propuesta
    Cuando he ingresado los valores individuales de las primas para beneficios capitados y no capitados
    Entonces debería visualizar una notificación indicando el guardado de la prima única
    Y debería visualizar el resultado del cálculo de la prima única
    Y debería visualizar el cálculo de la prima única no capitada
    Y debería visualizar el cálculo de los beneficios capitados
    
  @Regresión
  Escenario: el usuario técnico local configura un porcentaje de recargo comercial y recardo IPC a la propuesta de Salud
    Dado que el usuario de producto notifica una propuesta local de Salud al área técnica
    Y que he iniciado sesión con el rol gerente técnico local
    Y he ingresado al módulo de Planes
    Y he consultado la propuesta notificada por producto
    Y he ingresado a la configuración de primas de la propuesta
    Cuando ingrese un porcentaje de recargo comercial y recardo IPC
    Y he ingresado los valores individuales de las primas para beneficios capitados y no capitados
    Entonces debería visualizar una notificación indicando el guardado de la prima única
    Y debería visualizar el resultado del cálculo de la prima única
    
  @Regresión
  Escenario: el usuario técnico local deja vacía la información del valor individual de las primas
    Dado que el usuario de producto notifica una propuesta local de Salud al área técnica
    Y que he iniciado sesión con el rol gerente técnico local
    Y he ingresado al módulo de Planes
    Y he consultado la propuesta notificada por producto
    Y he ingresado a la configuración de primas de la propuesta
    Cuando deje vacía la información del valor individual de las primas
    Entonces debería visualizar una notificación indicando que debo ingresar los campos obligatorios
