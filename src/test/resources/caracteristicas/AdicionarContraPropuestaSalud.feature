# language: es
# encoding: iso-8859-1
## ININTER-11 Adicionar Propuesta/Análisis Técnico a la propuesta (Copia)
Característica: Adicionar una contra-propuesta a la propuesta de Salud
  Como Usuario de producto necesito poder adicionar una nueva propuesta a la propuesta 
  base de salud.

  @SmokeTest @Regresión
  Escenario: el usuario gerente senior de producto adiciona una nueva propuesta una vez el área técnica
    a notificado al área de productos

    Dado que el usuario de producto notifica una propuesta local de Salud al área técnica
    Y que el usuario gerente técnico local ha evaluado la propuesta para ser pre-aprobada por el área de productos
    Y que he iniciado sesión con el rol gerente senior de producto
    Y he ingresado al módulo de Planes
    Y he consultado la propuesta notificada por el área técnica
    Cuando he adicionado una nueva propuesta
    Entonces debería visualizar una notificación indicando la creación de la nueva propuesta
    Y debería visualizar una copia del cuadro de beneficios de la propuesta inicial para el usuario de producto
    Y debería poder modificar el cuadro de beneficios
    Y debería visualizar el consecutivo de la nueva propuesta en el nombre de cada adición
    Y debería visualizar una copia de la prima única de la propuesta inicial
