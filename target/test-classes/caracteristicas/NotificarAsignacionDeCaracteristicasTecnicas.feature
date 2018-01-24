# language: es
# encoding: iso-8859-1
## ININTER-35 Notificar asignaci�n de caracter�sticas t�cnicas
Caracter�stica: Notificar propuesta al �rea de productos
  Como Gerente del �rea T�cnica necesito notificar al �rea de Productos la existencia de una o varias 
  an�lisis t�cnicos para que se le realice la respectiva evaluaci�n.

  @SmokeTest @Regresi�n
  Escenario: el usuario gerente t�cnico local notifica una propuesta de salud con informaci�n de primas
    configuradas al �rea de productos

    Dado que el usuario de producto notifica una propuesta local de Salud al �rea t�cnica
    Y que he iniciado sesi�n con el rol gerente t�cnico local
    Y he ingresado al m�dulo de Planes
    Y he consultado la propuesta notificada por producto
    Y he ingresado a la configuraci�n de primas de la propuesta
    Y he ingresado los valores individuales de las primas para beneficios capitados y no capitados
    Cuando notifique la propuesta al �rea de productos
    Entonces deber�a visualizar una notificaci�n indicando que la propuesta ha sido notificada
    Y deber�a visualizar la propuesta en estado Evaluado
    Y no deber�a poder visualizar el bot�n de notificar al �rea de productos en la pantalla de la propuesta
    Y no deber�a poder modificar la propuesta
    Y no deber�a poder modificar el cuadro de beneficios con el usuario t�cnico
    Y no deber�a poder modificar la informaci�n de primas

  @Regresi�n
  Escenario: el usuario gerente t�cnico local intenta notificar la propuesta de salud al �rea de productos
    sin configurar informaci�n de prima �nica a la propuesta

    Dado que el usuario de producto notifica una propuesta local de Salud al �rea t�cnica
    Y que he iniciado sesi�n con el rol gerente t�cnico local
    Y he ingresado al m�dulo de Planes
    Y he consultado la propuesta notificada por producto
    Cuando intente notificar la propuesta al �rea de productos
    Entonces no deber�a poder visualizar el bot�n de notificar al �rea de productos en la pantalla de la propuesta
