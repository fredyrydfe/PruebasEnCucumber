# language: es
# encoding: iso-8859-1
## PLAN-1841 Monto Limite del Plan
## ININTER-6 Conceptualizar propuesta
Caracter�stica: Conceptualizar nueva propuesta de Salud
  Como Gerente de Productos quiero ingresar la informaci�n requerida en la
  presentaci�n de una nueva propuesta de planes para que sea evaluada por el
  �rea t�cnica.

  Antecedentes: el usuario inicia sesi�n con el rol gerente senior de producto
    Dado que he iniciado sesi�n con el rol gerente senior de producto
    Cuando ingrese al m�dulo de Planes
    Entonces deber�a visualizar la pantalla de Consultar proyecto

  @SmokeTest @Regresi�n
  Escenario: el usuario crea una propuesta basica de salud
    Dado que estoy en la p�gina de Conceptualizar propuesta de salud
    Cuando cree la propuesta
    Entonces deber�a visualizar una notificaci�n indicando la creaci�n de la propuesta
	
	@Regresi�n
  Escenario: el usuario deja vac�o los campos obligatorios
    Dado que estoy en la p�gina de Conceptualizar propuesta de salud
    Cuando deje vacio los campos obligatorios
    Entonces deber�a visualizar una notificaci�n indicando que debo ingresar los campos obligatorios
    
  @Regresi�n
  Escenario: el usuario deja incompleta la informaci�n del monto beneficio
    Dado que estoy en la p�gina de Conceptualizar propuesta de salud
    Cuando ingrese solo el monto limite y deje vac�o el resto de campos en la conceptualizaci�n de la propuesta
    Entonces deber�a visualizar una notificaci�n indicando que debo ingresar los campos obligatorios
    
  @Regresi�n
  Escenario: el usuario no diligencia el rango m�ximo al seleccionar un a�o en la unidad de tiempo
    Dado que estoy en la p�gina de Conceptualizar propuesta de salud
    Cuando deje vac�o el rango m�ximo despues de seleccionar un a�o en la unidad de tiempo para la conceptualizaci�n de la propuesta
    Entonces deber�a visualizar una notificaci�n indicando que debo ingresar los campos obligatorios
	
	@Regresi�n
  Escenario: el usuario ingresa un nombre de proyecto ya existente
    Dado que estoy en la p�gina de Conceptualizar propuesta de salud
    Cuando ingrese un nombre de proyecto que ya existe
    Entonces deber�a visualizar una notificaci�n indicando que la propuesta ya existe
  
  @Regresi�n
  Escenario: el usuario ingresa una edad m�nima superior a la edad m�xima
    Dado que estoy en la p�gina de Conceptualizar propuesta de salud
    Cuando ingrese una edad m�nima que supera la edad m�xima
    Entonces deber�a visualizar una notificaci�n indicando que la edad m�nima no puede superar la edad m�xima
