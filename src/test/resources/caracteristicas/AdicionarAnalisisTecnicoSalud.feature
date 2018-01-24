# language: es
# encoding: iso-8859-1
## ININTER-11 Adicionar Propuesta/An�lisis T�cnico a la propuesta (Copia)
Caracter�stica: Adicionar un an�lisis t�cnico a la propuesta de Salud
  Como Usuario del �rea T�cnica necesito obtener la prima �nica para completar 
  el an�lisis t�cnico que se enviar� a Productos.

  @SmokeTest @Regresi�n
  Escenario: el usuario gerente t�cnico local adiciona un an�lisis t�cnico a la propuesta
    Dado que el usuario de producto notifica una propuesta local de Salud al �rea t�cnica
    Y que he iniciado sesi�n con el rol gerente t�cnico local
    Y he ingresado al m�dulo de Planes
    Y he consultado la propuesta notificada por producto
    Y he ingresado a la configuraci�n de primas de la propuesta
    Y he ingresado los valores individuales de las primas para beneficios capitados y no capitados
    Cuando adicione un nuevo an�lisis t�cnico a la propuesta
    Entonces deber�a visualizar una notificaci�n indicando la creaci�n del nuevo an�lisis t�cnico
    Y deber�a visualizar una copia del cuadro de beneficios de la propuesta inicial
    Y deber�a poder modificar el cuadro de beneficios
    Y deber�a visualizar el consecutivo del an�lisis t�cnico en el nombre de cada adici�n
    Y deber�a visualizar una copia de la prima �nica de la propuesta inicial
    Y deber�a visualizar una copia de la prima �nica capitada y no capitada

  @Regresi�n
  Escenario: el usuario gerente t�cnico local adiciona un an�lisis t�cnico a una contra-propuesta
    Dado que el usuario de producto notifica una propuesta local de Salud al �rea t�cnica
    Y que el usuario gerente t�cnico local ha evaluado la propuesta para ser pre-aprobada por el �rea de productos
    Y que el usuario de producto ha creado una contra-propuesta para ser evaluada por el �rea t�cnica
    Y que he iniciado sesi�n con el rol gerente t�cnico local
    Y he ingresado al m�dulo de Planes
    Y he consultado la propuesta notificada por producto
    Y he ingresado a la configuraci�n de primas de la segunda propuesta
    Cuando adicione un nuevo an�lisis t�cnico a la propuesta
    Entonces deber�a visualizar una notificaci�n indicando la creaci�n del nuevo an�lisis t�cnico
    Y deber�a visualizar una copia del cuadro de beneficios de la propuesta inicial
    Y deber�a poder modificar el cuadro de beneficios
    Y deber�a visualizar el consecutivo del an�lisis t�cnico en el nombre de cada adici�n para la nueva propuesta
    Y deber�a visualizar una copia de la prima �nica de la propuesta inicial
    Y deber�a visualizar una copia de la prima �nica capitada y no capitada
