# Programación II – 3° Trabajo Práctico
## Herencia, clases abstractas e interfaces

**Profesor:** Ing. Tulio Ruesjas Martín  
**Fecha de Entrega:** 04 de mayo de 2026  
**Alumno:** Omar Alejandro Leiva  
**Institución:** Facultad de Ingeniería – Ingeniería Informática - UNSTA

---

### Objetivos
* **Aplicar** el concepto de Herencia para la reutilización de código.
* **Diseñar e implementar** jerarquías utilizando Clases Abstractas e Interfaces para definir contratos y comportamientos comunes sin acoplar las implementaciones.
* **Resolver** la necesidad de "herencia múltiple" de comportamientos en Java a través del uso de interfaces.
* **Aplicar** el concepto de Polimorfismo para procesar colecciones de objetos heterogéneos de forma unificada.

---

### Temario

#### 1. Sistema de Flota de Transporte
Una empresa de logística necesita un sistema para administrar su flota de vehículos. Todos los vehículos de la empresa registran una marca, un modelo y una tarifa base de alquiler. Sin embargo, la flota está compuesta actualmente por furgonetas y motocicletas de reparto.
* **Furgonetas:** Es vital registrar la capacidad de carga en kilogramos.
* **Motocicletas:** Es necesario registrar la cilindrada.

El sistema debe ser capaz de agrupar toda la flota y emitir un reporte detallado, donde cada vehículo imprima su información completa de forma automática según su tipo.

#### 2. Gestor de Suscripciones de Streaming
Una plataforma de entretenimiento digital necesita calcular los ingresos mensuales generados por sus usuarios. Todos los usuarios tienen asociada una suscripción que registra el correo electrónico del titular, el número de cliente y un costo base del servicio. Existen diferentes tipos de planes:
* **Plan Básico:** Simplemente cobra el costo base.
* **Plan Familiar:** Añade un recargo por cada perfil adicional que el usuario haya creado.
* **Plan Premium:** Aplica un cargo fijo extra por habilitar la resolución 4K y descargas offline.

El motor de facturación debe poder recorrer la lista de todas las suscripciones activas y solicitar a cada una su "costo de facturación mensual" para calcular las ganancias totales. El concepto de "Suscripción" general debe existir para agrupar los datos comunes, pero no puede calcular un costo real sin saber de qué plan específico se trata.

#### 3. Pasarela de Pagos E-commerce
Una tienda virtual en expansión necesita procesar los cobros de las compras de sus clientes. Actualmente, la tienda acepta cobros a través de:
* Tarjeta de Crédito.
* Transferencias vía PayPal.
* Pagos con Criptomonedas.

Cada una de estas plataformas tiene una lógica de conexión, validación y procesamiento de dinero completamente distinta. El motor del carrito de compras necesita una forma estándar de disparar la orden de "procesar un monto X", sin importar qué servicio de terceros haya seleccionado el cliente para pagar.

#### 4. Ecosistema de Dispositivos Inteligentes
En una casa domótica, un controlador central administra múltiples dispositivos electrónicos. Existen funcionalidades específicas que se repiten en dispositivos de naturalezas muy distintas: "Tomar una Fotografía" y "Conectarse a una red WiFi".
* **Cámara de Seguridad Básica:** Solo toma fotos.
* **Termostato Inteligente:** Solo se conecta a WiFi.
* **Smartphone:** Puede tomar fotos y conectarse a WiFi.

El controlador central debe poder iterar sobre los dispositivos y solicitar que se conecten a la red solo aquellos que posean dicha capacidad, modelando este comportamiento dual en el Smartphone.

#### 5. Motor de Videojuego de Rol
Se está desarrollando el núcleo de un videojuego.
* **Entidad Espacial:** Todo lo que existe en el mundo virtual tiene coordenadas (X, Y) y puede ser dibujada en pantalla.
* **Seres Vivos:** Entidades que poseen puntos de vida y pueden recibir daño. Se distinguen entre:
    * **Personajes Jugables:** Guerrero Humano y Mago Elfo.
    * **Monstruos Hostiles:** Orco y Dragón.
* **Habilidad "Lanzar Hechizos":** Capacidad mágica que cruza las fronteras de la alineación. El Mago Elfo y el Dragón pueden lanzar hechizos, pero el Guerrero y el Orco no.

Diseñe la arquitectura completa de este ecosistema garantizando que el motor principal pueda: actualizar coordenadas de todo, calcular la supervivencia de los seres vivos, y permitir lanzar ataques mágicos solo a aquellos que dominen la magia.