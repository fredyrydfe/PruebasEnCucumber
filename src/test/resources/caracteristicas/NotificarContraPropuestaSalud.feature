# language: es
# encoding: iso-8859-1
## ININTER-655 Notificación contrapropuesta
Característica: Notificar contrapropuesta al área técnica
  Como usuario de INNOVA debo notificar al Área encargada el ajuste realizado a la propuesta con el fin 
  de realizar una nueva evaluación.

  @SmokeTest @Regresión
  Escenario: el usuario gerente senior de producto notifica una contrapropuesta al área técnica
    Dado que el usuario de producto notifica una propuesta local de Salud al área técnica
    Y que el usuario gerente técnico local ha evaluado la propuesta para ser pre-aprobada por el área de productos
    Y que he iniciado sesión con el rol gerente senior de producto
    Y he ingresado al módulo de Planes
    Y he consultado la propuesta notificada por el área técnica
    Y he adicionado una nueva propuesta
    Y debería visualizar una notificación indicando la creación de la nueva propuesta 
    Cuando notifique la propuesta al área técnica
    Entonces debería visualizar una notificación indicando que la propuesta ha sido notificada
    Y debería visualizar la propuesta en estado Conceptualizado
    Y no debería poder visualizar el botón de notificar al área técnica en la pantalla de la propuesta
    Y no debería poder modificar la propuesta
    Y no debería poder modificar el cuadro de beneficios de la nueva propuesta
    Y no debería poder modificar la información de primas
    
  @SmokeTest @Regresión
  Escenario: el usuario gerente técnico local notifica una contrapropuesta de salud con información de primas
    configuradas al área de productos
    Dado que el usuario de producto notifica una propuesta local de Salud al área técnica
    Y que el usuario gerente técnico local ha evaluado la propuesta para ser pre-aprobada por el área de productos
    Y que el usuario de producto ha creado una contra-propuesta para ser evaluada por el área técnica
   	Y que he iniciado sesión con el rol gerente técnico local
    Y he ingresado al módulo de Planes
    Y he consultado la propuesta notificada por producto
    Cuando notifique la contrapropuesta al área de productos
    Entonces debería visualizar una notificación indicando que la propuesta ha sido notificada
    Y debería visualizar la propuesta en estado Evaluado
    Y no debería poder visualizar el botón de notificar al área de productos en la pantalla de la propuesta
    Y no debería poder modificar la propuesta
    Y no debería poder modificar el cuadro de beneficios de la nueva propuesta con el usuario técnico
    Y no debería poder modificar la información de primas
    