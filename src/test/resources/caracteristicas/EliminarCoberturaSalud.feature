# language: es
# encoding: iso-8859-1
## ININTER-60 Eliminar Coberturas asociado a la propuesta
Característica: Eliminar una cobertura en la propuesta de Salud
  Como Usuario de Innova quiero eliminar una cobertura previamente ingresada dentro de la propuesta para 
  ser ajustada y presentada al área de Negocios.

  @Regresión
  Escenario: el usuario de producto elimina la información de una cobertura
    Dado que he iniciado sesión con el rol gerente senior de producto
    Y he ingresado al módulo de Planes
    Y he creado una conceptualización de propuesta de salud
    Y he adicionado una categoría al cuadro de beneficios
    Y he adicionado un grupo de cobertura a la categoría
    Y he adicionado un servicio al grupo de cobertura
    Y he adicionado un tipo de cobertura al servicio
    Y he adicionado una cobertura al tipo de cobertura
    Cuando elimine la cobertura asociada al tipo de cobertura de salud
    Entonces debería visualizar una notificación solicitando la confirmación para la eliminación de la cobertura
    Y una vez confirme la eliminación debería visualizar una notificación indicando la eliminación de la cobertura
    Y no debería visualizar el beneficio en la pantalla de coberturas

