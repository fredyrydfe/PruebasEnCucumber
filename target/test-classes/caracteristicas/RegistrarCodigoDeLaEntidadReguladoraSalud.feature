# language: es
# encoding: iso-8859-1
## ININTER-43 Registrar código de la entidad reguladora
Característica: Registrar código de la entidad reguladora
  Como Gerente Legal necesito ingresar el código de aprobación de la entidad reguladora para 
  completar los requerimientos necesarios para activar el plan.
  
  @SmokeTest1 @Regresión
  Escenario: el usuario gerente legal ingresa el código de aprobación de la entidad reguladora para una propuesta
  marcada con la compañia Primera ARS de Humano
    Dado que el usuario de producto notifica una propuesta local de Salud al área técnica identificada con la compañia Primera ARS de Humano
    Y que el usuario gerente técnico local ha evaluado la propuesta para ser pre-aprobada por el área de productos
    Y que el usuario de producto aprueba la propuesta para ser presentada a la Gerencia de Negocios
    Y que he iniciado sesión con el rol gerente legal
    Y he ingresado al módulo de Planes
    Y he consultado la propuesta notificada por el área técnica
    Cuando he ingresado un código de aprobación valido
    Entonces debería visualizar una notificación solicitando la confirmación del código de aprobación ingresado
    Y debería visualizar una notificación indicando el guardado del código de aprobación
    Y no debería poder modificar la propuesta
    
  @Regresión
  Escenario: el usuario gerente legal ingresa el código de aprobación de la entidad reguladora para una propuesta
  marcada con la compañia Humano Seguros
    Dado que el usuario de producto notifica una propuesta local de Salud al área técnica identificada con la compañia Humano Seguros
    Y que el usuario gerente técnico local ha evaluado la propuesta para ser pre-aprobada por el área de productos
    Y que el usuario de producto aprueba la propuesta para ser presentada a la Gerencia de Negocios
    Y que he iniciado sesión con el rol gerente legal
    Y he ingresado al módulo de Planes
    Y he consultado la propuesta notificada por el área técnica
    Cuando he ingresado un código de aprobación valido
    Entonces debería visualizar una notificación solicitando la confirmación del código de aprobación ingresado
    Y debería visualizar una notificación indicando el guardado del código de aprobación
    Y no debería poder modificar la propuesta
    
  @Regresión
  Escenario: el usuario gerente legal ingresa un código de aprobación con caracteres especiales 
    Dado que el usuario de producto notifica una propuesta local de Salud al área técnica identificada con la compañia Humano Seguros
    Y que el usuario gerente técnico local ha evaluado la propuesta para ser pre-aprobada por el área de productos
    Y que el usuario de producto aprueba la propuesta para ser presentada a la Gerencia de Negocios
    Y que he iniciado sesión con el rol gerente legal
    Y he ingresado al módulo de Planes
    Y he consultado la propuesta notificada por el área técnica
    Cuando he ingresado un código de aprobación con caracteres especiales
    Entonces debería visualizar una notificación solicitando la confirmación del código de aprobación ingresado
    Y debería visualizar una notificación indicando el guardado del código de aprobación
    Y no debería poder modificar la propuesta
    
  @Regresión
  Escenario: el usuario gerente legal ingresa un código de aprobación menor a la cantidad mínima para una propuesta identificada con la compañia Humano Seguros
    Dado que el usuario de producto notifica una propuesta local de Salud al área técnica identificada con la compañia Humano Seguros
    Y que el usuario gerente técnico local ha evaluado la propuesta para ser pre-aprobada por el área de productos
    Y que el usuario de producto aprueba la propuesta para ser presentada a la Gerencia de Negocios
    Y que he iniciado sesión con el rol gerente legal
    Y he ingresado al módulo de Planes
    Y he consultado la propuesta notificada por el área técnica
    Cuando he ingresado un código de aprobación menor a la cantidad mínima para una propuesta identificada con la compañia Humano Seguros
    Entonces debería visualizar una notificación solicitando la confirmación del código de aprobación ingresado
    Y debería visualizar una notificación indicando el guardado del código de aprobación
    Y no debería poder modificar la propuesta
    
  @Regresión
  Escenario: el usuario gerente legal ingresa un código de aprobación menor a la cantidad mínima para una propuesta identificada con la compañia Primera ARS de Humano
    Dado que el usuario de producto notifica una propuesta local de Salud al área técnica identificada con la compañia Humano Seguros
    Y que el usuario gerente técnico local ha evaluado la propuesta para ser pre-aprobada por el área de productos
    Y que el usuario de producto aprueba la propuesta para ser presentada a la Gerencia de Negocios
    Y que he iniciado sesión con el rol gerente legal
    Y he ingresado al módulo de Planes
    Y he consultado la propuesta notificada por el área técnica
    Cuando he ingresado un código de aprobación menor a la cantidad mínima para una propuesta identificada con la compañia Primera ARS de Humano
    Entonces debería visualizar una notificación solicitando la confirmación del código de aprobación ingresado
    Y debería visualizar una notificación indicando el guardado del código de aprobación
    Y no debería poder modificar la propuesta
  
  @Regresión
  Escenario: el usuario gerente legal ingresa un código de aprobación superior a la cantidad máxima para una propuesta identificada con la compañia Primera ARS de Humano
    Dado que el usuario de producto notifica una propuesta local de Salud al área técnica identificada con la compañia Humano Seguros
    Y que el usuario gerente técnico local ha evaluado la propuesta para ser pre-aprobada por el área de productos
    Y que el usuario de producto aprueba la propuesta para ser presentada a la Gerencia de Negocios
    Y que he iniciado sesión con el rol gerente legal
    Y he ingresado al módulo de Planes
    Y he consultado la propuesta notificada por el área técnica
    Cuando he ingresado un código de aprobación con caracteres especiales
    Entonces debería visualizar una notificación solicitando la confirmación del código de aprobación ingresado
    Y debería visualizar una notificación indicando el guardado del código de aprobación
    Y no debería poder modificar la propuesta
    
    