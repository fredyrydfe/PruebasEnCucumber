# language: es
# encoding: iso-8859-1
## ININTER-57 Eliminar Categorías de la propuesta
Característica: Eliminar una categoría en la propuesta de Salud
  Como Usuario de Innova quiero eliminar una categoría previamente ingresada dentro de la propuesta para 
  ser ajustada y presentada al área de Negocios.

  @Regresión
  Escenario: el usuario de producto elimina la información de una categoría del cuadro de beneficios
    Dado que he iniciado sesión con el rol gerente senior de producto
    Y he ingresado al módulo de Planes
    Y he creado una conceptualización de propuesta de salud
    Y he adicionado una categoría al cuadro de beneficios
    Cuando elimine la categoría asociada a la propuesta de salud
    Entonces debería visualizar una notificación solicitando la confirmación para la eliminación de la categoría
    Y una vez confirme la eliminación debería visualizar una notificación indicando la eliminación de la categoría
    Y no debería visualizar el beneficio en la pantalla de beneficios