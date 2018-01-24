# language: es
# encoding: iso-8859-1
## PLAN-1841 Monto Limite del Plan
## ININTER-6 Conceptualizar propuesta
Característica: Conceptualizar nueva propuesta de Salud
  Como Gerente de Productos quiero ingresar la información requerida en la
  presentación de una nueva propuesta de planes para que sea evaluada por el
  área técnica.

  Antecedentes: el usuario inicia sesión con el rol gerente senior de producto
    Dado que he iniciado sesión con el rol gerente senior de producto
    Cuando ingrese al módulo de Planes
    Entonces debería visualizar la pantalla de Consultar proyecto

  @SmokeTest @Regresión
  Escenario: el usuario crea una propuesta basica de salud
    Dado que estoy en la página de Conceptualizar propuesta de salud
    Cuando cree la propuesta
    Entonces debería visualizar una notificación indicando la creación de la propuesta
	
	@Regresión
  Escenario: el usuario deja vacío los campos obligatorios
    Dado que estoy en la página de Conceptualizar propuesta de salud
    Cuando deje vacio los campos obligatorios
    Entonces debería visualizar una notificación indicando que debo ingresar los campos obligatorios
    
  @Regresión
  Escenario: el usuario deja incompleta la información del monto beneficio
    Dado que estoy en la página de Conceptualizar propuesta de salud
    Cuando ingrese solo el monto limite y deje vacío el resto de campos en la conceptualización de la propuesta
    Entonces debería visualizar una notificación indicando que debo ingresar los campos obligatorios
    
  @Regresión
  Escenario: el usuario no diligencia el rango máximo al seleccionar un año en la unidad de tiempo
    Dado que estoy en la página de Conceptualizar propuesta de salud
    Cuando deje vacío el rango máximo despues de seleccionar un año en la unidad de tiempo para la conceptualización de la propuesta
    Entonces debería visualizar una notificación indicando que debo ingresar los campos obligatorios
	
	@Regresión
  Escenario: el usuario ingresa un nombre de proyecto ya existente
    Dado que estoy en la página de Conceptualizar propuesta de salud
    Cuando ingrese un nombre de proyecto que ya existe
    Entonces debería visualizar una notificación indicando que la propuesta ya existe
  
  @Regresión
  Escenario: el usuario ingresa una edad mínima superior a la edad máxima
    Dado que estoy en la página de Conceptualizar propuesta de salud
    Cuando ingrese una edad mínima que supera la edad máxima
    Entonces debería visualizar una notificación indicando que la edad mínima no puede superar la edad máxima
