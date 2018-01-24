# language: es
# encoding: iso-8859-1
## ININTER-11 Adicionar Propuesta/An�lisis T�cnico a la propuesta (Copia)
Caracter�stica: Adicionar una contra-propuesta a la propuesta de Salud
  Como Usuario de producto necesito poder adicionar una nueva propuesta a la propuesta 
  base de salud.

  @SmokeTest @Regresi�n
  Escenario: el usuario gerente senior de producto adiciona una nueva propuesta una vez el �rea t�cnica
    a notificado al �rea de productos

    Dado que el usuario de producto notifica una propuesta local de Salud al �rea t�cnica
    Y que el usuario gerente t�cnico local ha evaluado la propuesta para ser pre-aprobada por el �rea de productos
    Y que he iniciado sesi�n con el rol gerente senior de producto
    Y he ingresado al m�dulo de Planes
    Y he consultado la propuesta notificada por el �rea t�cnica
    Cuando he adicionado una nueva propuesta
    Entonces deber�a visualizar una notificaci�n indicando la creaci�n de la nueva propuesta
    Y deber�a visualizar una copia del cuadro de beneficios de la propuesta inicial para el usuario de producto
    Y deber�a poder modificar el cuadro de beneficios
    Y deber�a visualizar el consecutivo de la nueva propuesta en el nombre de cada adici�n
    Y deber�a visualizar una copia de la prima �nica de la propuesta inicial
