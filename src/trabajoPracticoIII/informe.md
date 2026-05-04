# Programación II – 3° Trabajo Práctico
## INFORME 

# Sistema  de Flota Logística


## Problemas Encontrados y Soluciones

### 1. Problema de Agrupación
**Desafío:** El requerimiento exigía agrupar "toda la flota" en un solo lugar. El uso de arreglos separados para cada tipo de vehículo generaba código redundante y difícil de mantener.

**Solución:** Se implementó el concepto de **Herencia**.
- Se creó una superclase abstracta `Vehiculo`.
- Esto permitió utilizar una estructura de datos `List<Vehiculo>` (mediante `ArrayList`) capaz de almacenar cualquier objeto que herede de la clase padre, unificando la gestión de la flota.

### 2. Problema de Impresión Específica
**Desafío:** Al iterar sobre una lista de tipo genérico (`Vehiculo`), el programa inicialmente solo reconoce los atributos de la superclase. Acceder a la capacidad de carga o cilindrada sin usar validaciones inseguras (como múltiples `instanceof`) representaba un reto de diseño.

**Solución:** Se aplicó **Polimorfismo**.
- Se declaró un método abstracto `mostrarInformacion()` en la clase padre.
- Se obligó a `Furgoneta` y `Motocicleta` a sobrescribir (`@Override`) dicho método con su propio comportamiento.
- Gracias a esto, la Máquina Virtual de Java (JVM) decide dinámicamente qué método ejecutar en tiempo de ejecución.

---

## Observaciones Adicionales

### Encapsulamiento
Se utilizó el modificador de acceso `protected` en la superclase. Esto permite que las clases hijas accedan directamente a las variables heredadas, simplificando el código en este contexto, mientras se mantiene la ocultación de datos frente a clases externas al paquete o jerarquía.

### Escalabilidad
La arquitectura basada en clases abstractas garantiza una alta escalabilidad. Si la empresa decide incorporar nuevos tipos de transporte (por ejemplo, **Camiones**), solo es necesario:
1. Crear la clase `Camion extends Vehiculo`.
2. Implementar el método `mostrarInformacion()`.

El motor del reporte principal (`SistemaFlota.main`) **no requerirá ninguna modificación** en su lógica de iteración, cumpliendo con principios de diseño de software sólido.