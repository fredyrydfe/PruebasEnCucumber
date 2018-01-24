# language: es
# encoding: iso-8859-1
## ININTER-11 Adicionar Propuesta/Análisis Técnico a la propuesta (Copia)
Característica: Adicionar un análisis técnico a la propuesta de Salud
  Como Usuario del Área Técnica necesito obtener la prima única para completar 
  el análisis técnico que se enviará a Productos.

  @SmokeTest @Regresión
  Escenario: el usuario gerente técnico local adiciona un análisis técnico a la propuesta
    Dado que el usuario de producto notifica una propuesta local de Salud al área técnica
    Y que he iniciado sesión con el rol gerente técnico local
    Y he ingresado al módulo de Planes
    Y he consultado la propuesta notificada por producto
    Y he ingresado a la configuración de primas de la propuesta
    Y he ingresado los valores individuales de las primas para beneficios capitados y no capitados
    Cuando adicione un nuevo análisis técnico a la propuesta
    Entonces debería visualizar una notificación indicando la creación del nuevo análisis técnico
    Y debería visualizar una copia del cuadro de beneficios de la propuesta inicial
    Y debería poder modificar el cuadro de beneficios
    Y debería visualizar el consecutivo del análisis técnico en el nombre de cada adición
    Y debería visualizar una copia de la prima única de la propuesta inicial
    Y debería visualizar una copia de la prima única capitada y no capitada

  @Regresión
  Escenario: el usuario gerente técnico local adiciona un análisis técnico a una contra-propuesta
    Dado que el usuario de producto notifica una propuesta local de Salud al área técnica
    Y que el usuario gerente técnico local ha evaluado la propuesta para ser pre-aprobada por el área de productos
    Y que el usuario de producto ha creado una contra-propuesta para ser evaluada por el área técnica
    Y que he iniciado sesión con el rol gerente técnico local
    Y he ingresado al módulo de Planes
    Y he consultado la propuesta notificada por producto
    Y he ingresado a la configuración de primas de la segunda propuesta
    Cuando adicione un nuevo análisis técnico a la propuesta
    Entonces debería visualizar una notificación indicando la creación del nuevo análisis técnico
    Y debería visualizar una copia del cuadro de beneficios de la propuesta inicial
    Y debería poder modificar el cuadro de beneficios
    Y debería visualizar el consecutivo del análisis técnico en el nombre de cada adición para la nueva propuesta
    Y debería visualizar una copia de la prima única de la propuesta inicial
    Y debería visualizar una copia de la prima única capitada y no capitada
