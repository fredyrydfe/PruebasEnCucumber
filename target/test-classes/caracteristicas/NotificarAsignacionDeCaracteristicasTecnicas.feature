# language: es
# encoding: iso-8859-1
## ININTER-35 Notificar asignación de características técnicas
Característica: Notificar propuesta al área de productos
  Como Gerente del Área Técnica necesito notificar al Área de Productos la existencia de una o varias 
  análisis técnicos para que se le realice la respectiva evaluación.

  @SmokeTest @Regresión
  Escenario: el usuario gerente técnico local notifica una propuesta de salud con información de primas
    configuradas al área de productos

    Dado que el usuario de producto notifica una propuesta local de Salud al área técnica
    Y que he iniciado sesión con el rol gerente técnico local
    Y he ingresado al módulo de Planes
    Y he consultado la propuesta notificada por producto
    Y he ingresado a la configuración de primas de la propuesta
    Y he ingresado los valores individuales de las primas para beneficios capitados y no capitados
    Cuando notifique la propuesta al área de productos
    Entonces debería visualizar una notificación indicando que la propuesta ha sido notificada
    Y debería visualizar la propuesta en estado Evaluado
    Y no debería poder visualizar el botón de notificar al área de productos en la pantalla de la propuesta
    Y no debería poder modificar la propuesta
    Y no debería poder modificar el cuadro de beneficios con el usuario técnico
    Y no debería poder modificar la información de primas

  @Regresión
  Escenario: el usuario gerente técnico local intenta notificar la propuesta de salud al área de productos
    sin configurar información de prima única a la propuesta

    Dado que el usuario de producto notifica una propuesta local de Salud al área técnica
    Y que he iniciado sesión con el rol gerente técnico local
    Y he ingresado al módulo de Planes
    Y he consultado la propuesta notificada por producto
    Cuando intente notificar la propuesta al área de productos
    Entonces no debería poder visualizar el botón de notificar al área de productos en la pantalla de la propuesta
