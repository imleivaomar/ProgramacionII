Facultad de Ingeniería – Ingeniería Informática - UNSTA

Materia: Programación II – 2° Trabajo Práctico. Clases y Objetos en Java.
Profesor: Ing. Tulio Ruesjas Martín.
Fecha de Entrega : 20 de abril de 2026
Nombre y Apellido del Alumno:
Objetivo:
Aplicar los conceptos fundamentales de la Programación Orientada a Objetos (POO) en
Java.
Diseñar e implementar clases con atributos y métodos que modelen entidades del mundo
real.
Utilizar constructores para inicializar objetos de manera adecuada.
Practicar la encapsulación mediante el control de la visibilidad de los atributos.
Desarrollar habilidades para resolver problemas de programación utilizando un enfoque
orientado a objetos.
Temario:
1. Calculadora: Crea una clase Calculadora que tenga métodos para realizar operaciones
   aritméticas básicas: sumar(), restar(), multiplicar() y dividir(). Cada método debe tomar dos
   números como parámetros y devolver el resultado de la operación.
   Ejemplo:

Calculadora calculadora = new Calculadora();
double resultadoSuma = calculadora.sumar(5, 3); // Resultado: 8.0
double resultadoDivision = calculadora.dividir(10, 2); // Resultado: 5.0
2. El Reloj: Crea una clase Reloj que tenga atributos para la hora, los minutos y los segundos.
   La clase debe tener métodos para:
   establecerHora(): Permite establecer la hora, los minutos y los segundos.
   mostrarHora(): Muestra la hora en formato "HH:MM:SS".
   avanzarSegundo(): Incrementa los segundos en uno, actualizando los minutos y la
   hora si es necesario.
   Ejemplo:
   Reloj miReloj = new Reloj();
   miReloj.establecerHora(10, 30, 45);
   miReloj.mostrarHora(); // Muestra: 10:30:45
   miReloj.avanzarSegundo();
   miReloj.mostrarHora(); // Muestra: 10:30:46

3. Cuenta Bancaria: Crea una clase CuentaBancaria que tenga atributos para el número de
   cuenta, el nombre del titular y el saldo. La clase debe tener métodos para:
   depositar(): Permite añadir una cantidad al saldo.
   retirar(): Permite retirar una cantidad del saldo (verificando que haya suficiente
   saldo).
   consultarSaldo(): Devuelve el saldo actual.
   Ejemplo:
   CuentaBancaria miCuenta = new CuentaBancaria("12345", "Juan Pérez", 1000);
   miCuenta.depositar(500);
   miCuenta.retirar(200);
   double saldoActual = miCuenta.consultarSaldo(); // Saldo: 1300.0
   miCuenta.retirar(2000); // Muestra un mensaje de error Saldo Insuficiente
4. El Libro: Crea una clase Libro que tenga atributos para el título, el autor, el ISBN y el estado
   (disponible o prestado). La clase debe tener métodos para:
   prestar(): Marca el libro como prestado, si está disponible.
   devolver(): Marca el libro como disponible.
   mostrarInformacion(): Muestra el título, el autor, el ISBN y el estado del libro.
   Ejemplo:
   Libro miLibro = new Libro("El Señor de los Anillos", "J.R.R. Tolkien", "978-
   0345339683");
   miLibro.mostrarInformacion(); // Muestra la información del libro
   miLibro.prestar();
   miLibro.mostrarInformacion(); // Muestra que el libro está prestado
   miLibro.devolver();
   miLibro.mostrarInformacion(); // Muestra que el libro está disponible

5. Gestor de empleados: Crea una clase Empleado que tenga los siguientes atributos: legajo,
   nombre, salario y cantidad de empleados. La clase debe permitir:
   Cada empleado debe tener un numero único de legajo.
   Debe permitir aumentar el salario del empleado a través de un porcentaje y por medio
   de un monto fijo, registrando el motivo del aumento.
   Se debe obtener la cantidad total de empleados.


Formato del Trabajo:
1. Para la presentación del TP, se debe mostrar al repositorio personal de cada alumno en
   GitHub o BitBuket.
2. El alumno debe incluir un breve informe que describa cada ejercicio, los problemas
   encontrados y cómo fueron resueltos, así como cualquier observación adicional que
   considere relevante.
3. El trabajo debe ser enviado a: tulio.ruesjas@unsta.edu.ar hasta las 14 horas del día 20 de
   abril del 2026. TP enviado después de esa hora será rechazado.
