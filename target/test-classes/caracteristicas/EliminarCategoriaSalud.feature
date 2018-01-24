# language: es
# encoding: iso-8859-1
## ININTER-57 Eliminar Categor�as de la propuesta
Caracter�stica: Eliminar una categor�a en la propuesta de Salud
  Como Usuario de Innova quiero eliminar una categor�a previamente ingresada dentro de la propuesta para 
  ser ajustada y presentada al �rea de Negocios.

  @Regresi�n
  Escenario: el usuario de producto elimina la informaci�n de una categor�a del cuadro de beneficios
    Dado que he iniciado sesi�n con el rol gerente senior de producto
    Y he ingresado al m�dulo de Planes
    Y he creado una conceptualizaci�n de propuesta de salud
    Y he adicionado una categor�a al cuadro de beneficios
    Cuando elimine la categor�a asociada a la propuesta de salud
    Entonces deber�a visualizar una notificaci�n solicitando la confirmaci�n para la eliminaci�n de la categor�a
    Y una vez confirme la eliminaci�n deber�a visualizar una notificaci�n indicando la eliminaci�n de la categor�a
    Y no deber�a visualizar el beneficio en la pantalla de beneficios