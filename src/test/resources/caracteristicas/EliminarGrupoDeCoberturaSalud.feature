# language: es
# encoding: iso-8859-1
## ININTER-57 Eliminar Grupos de coberturas de la propuesta
Característica: Eliminar un grupo de cobertura en la propuesta de Salud
  Como Usuario de Innova quiero eliminar un grupo de cobertura previamente ingresado dentro de la propuesta para 
  ser ajustada y presentada al área de Negocios.

  @Regresión
  Escenario: el usuario de producto elimina la información de un grupo de cobertura del cuadro de beneficios
    Dado que he iniciado sesión con el rol gerente senior de producto
    Y he ingresado al módulo de Planes
    Y he creado una conceptualización de propuesta de salud
    Y he adicionado una categoría al cuadro de beneficios
    Y he adicionado un grupo de cobertura a la categoría
    Cuando elimine el grupo de cobertura asociado a la categoría de salud
    Entonces debería visualizar una notificación solicitando la confirmación para la eliminación del grupo de cobertura
    Y una vez confirme la eliminación debería visualizar una notificación indicando la eliminación del grupo de cobertura
    Y no debería visualizar el beneficio en la pantalla de beneficios