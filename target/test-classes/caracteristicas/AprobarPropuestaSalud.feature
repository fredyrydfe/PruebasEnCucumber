# language: es
# encoding: iso-8859-1
## ININTER-40 Aprobar propuesta - "Pre-Aprobado"
Característica: Aprobar propuesta de Salud
  Como Gerente Senior de Productos necesito modificar el estado de la propuesta entregada por las Áreas 
  Producto, Técnico para ser presentada a la Gerencia de Negocios y posteriormente a la entidad reguladora 
  para su respectiva aprobación.
  
  @SmokeTest @Regresión
  Escenario: el usuario gerente senior de producto aprueba la propuesta para ser presentada a la Gerencia de Negocios
    Dado que el usuario de producto notifica una propuesta local de Salud al área técnica
    Y que el usuario gerente técnico local ha evaluado la propuesta para ser pre-aprobada por el área de productos
    Y que he iniciado sesión con el rol gerente senior de producto
    Y he ingresado al módulo de Planes
    Y he consultado la propuesta notificada por el área técnica
    Y he seleccionado un análisis técnico como definitivo
    Y debería visualizar una notificación solicitando la confirmación de la selección del ánalisis técnico definitivo
    Y debería visualizar una notificación indicando la selección del análisis técnico definitivo
    Cuando he aprobado la propuesta
    Entonces debería visualizar una notificación indicando que la propuesta ha sido pre-aprobada
    Y no debería poder modificar la propuesta
    Y no debería poder modificar el cuadro de beneficios
    Y no debería poder modificar la información de primas 
    
