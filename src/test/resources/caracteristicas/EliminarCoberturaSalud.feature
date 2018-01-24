# language: es
# encoding: iso-8859-1
## ININTER-60 Eliminar Coberturas asociado a la propuesta
Caracter�stica: Eliminar una cobertura en la propuesta de Salud
  Como Usuario de Innova quiero eliminar una cobertura previamente ingresada dentro de la propuesta para 
  ser ajustada y presentada al �rea de Negocios.

  @Regresi�n
  Escenario: el usuario de producto elimina la informaci�n de una cobertura
    Dado que he iniciado sesi�n con el rol gerente senior de producto
    Y he ingresado al m�dulo de Planes
    Y he creado una conceptualizaci�n de propuesta de salud
    Y he adicionado una categor�a al cuadro de beneficios
    Y he adicionado un grupo de cobertura a la categor�a
    Y he adicionado un servicio al grupo de cobertura
    Y he adicionado un tipo de cobertura al servicio
    Y he adicionado una cobertura al tipo de cobertura
    Cuando elimine la cobertura asociada al tipo de cobertura de salud
    Entonces deber�a visualizar una notificaci�n solicitando la confirmaci�n para la eliminaci�n de la cobertura
    Y una vez confirme la eliminaci�n deber�a visualizar una notificaci�n indicando la eliminaci�n de la cobertura
    Y no deber�a visualizar el beneficio en la pantalla de coberturas

