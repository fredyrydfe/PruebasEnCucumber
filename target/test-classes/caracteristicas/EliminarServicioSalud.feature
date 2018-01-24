# language: es
# encoding: iso-8859-1
## ININTER-27 Eliminar Servicios de la propuesta
Caracter�stica: Eliminar un servicio en la propuesta de Salud
  Como Usuario de Innova quiero eliminar un Servicio previamente ingresado dentro de la propuesta para 
  ser ajustada y presentada al �rea de Negocios.

  @Regresi�n
  Escenario: el usuario de producto elimina la informaci�n de un servicio del cuadro de beneficios
    Dado que he iniciado sesi�n con el rol gerente senior de producto
    Y he ingresado al m�dulo de Planes
    Y he creado una conceptualizaci�n de propuesta de salud
    Y he adicionado una categor�a al cuadro de beneficios
    Y he adicionado un grupo de cobertura a la categor�a
    Y he adicionado un servicio al grupo de cobertura
    Cuando elimine el servicio asociado al grupo de cobertura de salud
    Entonces deber�a visualizar una notificaci�n solicitando la confirmaci�n para la eliminaci�n del servicio
    Y una vez confirme la eliminaci�n deber�a visualizar una notificaci�n indicando la eliminaci�n del servicio
    Y no deber�a visualizar el beneficio en la pantalla de beneficios