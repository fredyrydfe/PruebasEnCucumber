# language: es
# encoding: iso-8859-1
## ININTER-27 Eliminar Servicios de la propuesta
Característica: Eliminar un servicio en la propuesta de Salud
  Como Usuario de Innova quiero eliminar un Servicio previamente ingresado dentro de la propuesta para 
  ser ajustada y presentada al área de Negocios.

  @Regresión
  Escenario: el usuario de producto elimina la información de un servicio del cuadro de beneficios
    Dado que he iniciado sesión con el rol gerente senior de producto
    Y he ingresado al módulo de Planes
    Y he creado una conceptualización de propuesta de salud
    Y he adicionado una categoría al cuadro de beneficios
    Y he adicionado un grupo de cobertura a la categoría
    Y he adicionado un servicio al grupo de cobertura
    Cuando elimine el servicio asociado al grupo de cobertura de salud
    Entonces debería visualizar una notificación solicitando la confirmación para la eliminación del servicio
    Y una vez confirme la eliminación debería visualizar una notificación indicando la eliminación del servicio
    Y no debería visualizar el beneficio en la pantalla de beneficios