# language: es
# encoding: iso-8859-1
## ININTER-59 Eliminar Tipos de Cobertura asociado a la propuesta
Característica: Eliminar un tipo de cobertura en la propuesta de Salud
  Como Usuario de Innova quiero eliminar un tipo de cobertura previamente ingresado dentro de la propuesta para 
  ser ajustada y presentada al área de Negocios.

  @Regresión
  Escenario: el usuario de producto elimina la información de un tipo de cobertura
    Dado que he iniciado sesión con el rol gerente senior de producto
    Y he ingresado al módulo de Planes
    Y he creado una conceptualización de propuesta de salud
    Y he adicionado una categoría al cuadro de beneficios
    Y he adicionado un grupo de cobertura a la categoría
    Y he adicionado un servicio al grupo de cobertura
    Y he adicionado un tipo de cobertura al servicio
    Cuando elimine el tipo de cobertura asociado al servicio de salud
    Entonces debería visualizar una notificación solicitando la confirmación para la eliminación del tipo de cobertura
    Y una vez confirme la eliminación debería visualizar una notificación indicando la eliminación del tipo de cobertura
    Y no debería visualizar el beneficio en la pantalla de beneficios