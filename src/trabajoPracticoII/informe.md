#  TRABAJO PRACTICO N2

---

## 
* Omar Leiva
* Universidad del Norte Santo Tomás de Aquino (UNSTA)
*  Programación II
* Ing. Tulio Ruesjas Martín

---

### Calculadora
Se implementó una clase con métodos básicos de aritmética (sumar, restar, multiplicar y dividir)
Al principio, por la costumbre de ejercicios anteriores, tiré toda la lógica con un Scanner directamente en el main
 Tuve que "limpiar" el código para separar la interfaz de usuario de la lógica de la clase, creando los métodos que retornan valores como pedía la consigna.

### El Reloj
Una clase para gestionar horas, minutos y segundos, con capacidad de avanzar el tiempo segundo a segundo 
El mayor lío fue la cascada de los 60 segundos. Al principio, el reloj pasaba de 10:30:59 a 10:30:60 en vez de resetearse.
Implementé validaciones anidadas para que al llegar a 60, los segundos vuelvan a 0 e incrementen los minutos, repitiendo la lógica para las horas hasta las 24 
También usé printf con %02d para que el formato sea siempre HH:MM:SS.

### Cuenta Bancaria
Modelado de una cuenta con depósitos, retiros y consulta de saldo 
 Tuve un error de sintaxis bastante básico: terminé declarando la clase cuentaBancaria dentro de otra clase por error de llaves, lo que rompía la visibilidad de los métodos
Reorganicé la estructura del archivo y renombré los métodos para que coincidan exactamente con lo solicitado en la guía.

### El Libro
Gestión de préstamos y devoluciones de libros de una biblioteca 
No quería que al mostrar la información apareciera un aburrido true o false para la disponibilidad.
 Usé un operador ternario para que el método mostrarInformacion() imprima directamente "Disponible" o "Prestado" según el estado de la variable booleana.

### Gestor de Empleados
Uso de atributos estáticos para contar instancias y métodos sobrecargados para aumentos salariales 
Me mareé con las instancias en el main. Por un error de copiado, estaba intentando instanciar la clase main en vez de gestorEmpleado, lo que me tiraba errores de constructor inexistente 
 Corregí las llamadas al constructor y aseguré que la variable static cantidadEmpleados se incremente correctamente en el constructor de la clase

---
La mayor dificultad no fue la lógica de los objetos, sino la organización de los packages. Al separar cada ejercicio en su propia carpeta, tuve que estar muy atento a las declaraciones de package al principio de cada archivo para que el compilador no se quejara

