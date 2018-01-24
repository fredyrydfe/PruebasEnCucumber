# language: es
# encoding: iso-8859-1
## ININTER-144 Ingresar valor individual de las primas
## ININTER-163 C�lculo Prima �nica
## ININTER-467 Identificar beneficios capitados
## ININTER-471 Primas - Adici�n de Beneficios No Capitados
Caracter�stica: Calcular la prima �nica en una propuesta de Salud
  Como Usuario del �rea T�cnica necesito obtener la prima �nica para completar 
  el an�lisis t�cnico que se enviar� a Productos.

  @SmokeTest @Regresi�n1
  Escenario: el usuario t�cnico local configura la prima �nica para una propuesta de Salud con subramo Local
    Dado que el usuario de producto notifica una propuesta local de Salud al �rea t�cnica
    Y que he iniciado sesi�n con el rol gerente t�cnico local
    Y he ingresado al m�dulo de Planes
    Y he consultado la propuesta notificada por producto
    Y he ingresado a la configuraci�n de primas de la propuesta
    Cuando he ingresado los valores individuales de las primas para beneficios capitados y no capitados
    Entonces deber�a visualizar una notificaci�n indicando el guardado de la prima �nica
    Y deber�a visualizar el resultado del c�lculo de la prima �nica
    Y deber�a visualizar el c�lculo de la prima �nica no capitada
    Y deber�a visualizar el c�lculo de los beneficios capitados
    
  @Regresi�n
  Escenario: el usuario t�cnico local configura un porcentaje de recargo comercial y recardo IPC a la propuesta de Salud
    Dado que el usuario de producto notifica una propuesta local de Salud al �rea t�cnica
    Y que he iniciado sesi�n con el rol gerente t�cnico local
    Y he ingresado al m�dulo de Planes
    Y he consultado la propuesta notificada por producto
    Y he ingresado a la configuraci�n de primas de la propuesta
    Cuando ingrese un porcentaje de recargo comercial y recardo IPC
    Y he ingresado los valores individuales de las primas para beneficios capitados y no capitados
    Entonces deber�a visualizar una notificaci�n indicando el guardado de la prima �nica
    Y deber�a visualizar el resultado del c�lculo de la prima �nica
    
  @Regresi�n
  Escenario: el usuario t�cnico local deja vac�a la informaci�n del valor individual de las primas
    Dado que el usuario de producto notifica una propuesta local de Salud al �rea t�cnica
    Y que he iniciado sesi�n con el rol gerente t�cnico local
    Y he ingresado al m�dulo de Planes
    Y he consultado la propuesta notificada por producto
    Y he ingresado a la configuraci�n de primas de la propuesta
    Cuando deje vac�a la informaci�n del valor individual de las primas
    Entonces deber�a visualizar una notificaci�n indicando que debo ingresar los campos obligatorios
