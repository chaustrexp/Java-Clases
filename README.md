# Java Clases

Repositorio de ejercicios y tareas de programación en Java.

## Contenido

### Ejercicio1.java
Lectura de datos por teclado usando `Scanner`. El programa solicita al usuario que ingrese su nombre y lo muestra en pantalla.

### Ejercicio2.java
Conversión de números. Toma un número decimal (255) y lo convierte a su representación en binario usando `Integer.toBinaryString()`.

### Ejercicio3.java
Conversión de tiempo a milisegundos. Contiene un método `aMilisegundos(dias, horas, minutos, segundos)` que calcula el equivalente en milisegundos dado un tiempo compuesto.

### Ejercicio4.java
Cálculo del cuadrado de un número. El usuario ingresa un número decimal y el programa calcula y muestra su cuadrado.

### Ejercicio5.java
Cálculo del perímetro y superficie de un rectángulo. El usuario ingresa la base y la altura, y el programa devuelve ambos valores.

### Ejercicio6.java
Ficha de alumno. El programa solicita nombre, apellido, edad y nota del alumno, y los muestra en un mensaje formateado.

### Ejercicio7.java
Conversión de velocidad. El usuario ingresa una velocidad en km/h y el programa la convierte a metros por segundo (m/s).

### Ejercicio8.java
Separación de cifras. El usuario ingresa un número entero de 3 cifras y el programa separa y muestra las centenas, decenas y unidades.

### Ejercicio9.java
Validación de división. El usuario ingresa un dividendo y un divisor, y el programa determina si la división es exacta o no (mostrando el resto), controlando además que no se intente dividir entre cero.

### Ejercicio10.java
Análisis de números. El usuario ingresa un número decimal y el programa determina si es entero o decimal, si es positivo, negativo o neutro (cero), y en caso de ser entero, si es par o impar.

### Ejercicio11.java
Validación de rango y divisibilidad. El usuario ingresa un número entero y el programa verifica si se encuentra en el rango de 1000 a 10000 (inclusive) y si NO es divisible por 5.

### Ejercicio12.java
Evaluación de residuo con estructura condicional `switch`. El usuario ingresa un número entero, calcula el módulo con 5 y asocia el resultado (de 0 a 4) con una letra de la 'A' a la 'E' (y 'F' por defecto).

### Ejercicio13.java
Impresión de números impares. El programa imprime todos los números impares del 1 al 100 usando un bucle `for`.

### Ejercicio14.java
Suma acumulada. El usuario ingresa un valor límite `x`, y el programa suma números consecutivos (1, 2, 3...) hasta que la suma acumulada supere el límite `x`.

### Ejercicio15.java
Verificación de número primo. El usuario ingresa un número entero y el programa determina si es un número primo o no mediante un método dedicado.

### Ejercicio16.java
Lectura y ordenamiento de números. El usuario ingresa una serie de números enteros hasta ingresar un 0 (que termina la ejecución). El programa guarda los números en una lista, los ordena de menor a mayor y los imprime.

### Ejercicio17.java
Uso de arreglos básicos. El programa pide al usuario 10 números enteros, los almacena en un arreglo unidimensional (vector) y luego los imprime indicando su posición.

### Ejercicio18.java
Arreglos con interrupción condicional. El usuario ingresa números que se guardan en un arreglo (máximo 10). Si se ingresa un número mayor a 20, la lectura se interrumpe inmediatamente mediante `break` y muestra únicamente los elementos registrados hasta el momento.

### Ejercicio19.java
Matrices bidimensionales. El programa genera una matriz de 5 filas por 10 columnas poblada con números aleatorios (entre 1 y 9), la imprime en formato tabular y finalmente calcula la suma total de sus 50 elementos.

### Carpeta `Ciclos/`
Ejemplos enfocados en el uso de ciclos anidados e interactivos:
- **`Ciclo1.java`**: Generación de las tablas de multiplicar (del 1 al 5) usando ciclos `for` anidados.
- **`Ciclo2.java`**: Dibujo de un triángulo rectángulo de asteriscos, demostrando la relación de dependencia entre el ciclo externo (filas) y el interno (columnas).
- **`Ciclo3.java`**: Menú interactivo permanente (con `do-while`) que incluye un sistema de validación de token de seguridad con un máximo de 3 intentos (usando un `while` anidado).

### Carpeta `Tarea/`
- **`Tarea.java`**: Manejo de arreglos con ciclos. Declara un arreglo de 10 enteros, lo inicializa con múltiplos de 100 (100, 200, ..., 1000) y los imprime usando ciclos `for`.

### Carpeta `clase__de_hoy/`
Ejercicios de manipulación de cadenas de texto (Strings):
- **`actividad1.java`**: Inversión del orden de las palabras en una frase ingresada por el usuario, utilizando el método `split()`.
- **`actividad2.java`**: Inversión de todos los caracteres de una frase mediante un bucle `for` invertido y el método `charAt()`.
- **`actividad3.java`**: Análisis de texto dentro de una canción. Convierte el texto a mayúsculas con `toUpperCase()` y cuenta cuántas veces aparece una palabra específica ("TIGRE") y un carácter ('T').

### Carpeta `Mundial/`
Evolución y distintas versiones de la simulación del mundial de fútbol:
- **`mundial.java`**, **`mundial2.java`**, **`mundial3.java`**, **`mundial4.java`**, **`mundial5.java`**: Distintas etapas y versiones de la simulación, incluyendo lógicas para el sorteo de equipos, registro de marcadores y avance en el torneo.

### Carpeta `Proyecto Mundial/`
- **`mundial.java`**: Estructura inicial para un proyecto de simulación del mundial de fútbol. Utiliza arreglos unidimensionales para los grupos y matrices bidimensionales (`String[][]`) para organizar los equipos por grupo.

### Carpeta `matriz/`
Ejercicios enfocados en el uso y manipulación de matrices bidimensionales:
- **`ejercicio1.java`**: Implementación de la multiplicación de tres matrices sucesivas ((A * B) * C). Incluye validación de dimensiones compatibles y un método auxiliar para imprimir las matrices en formato tabular.

### Carpeta `intercambios/`
- **`ejercicio1.java`**: Algoritmo para intercambiar elementos entre dos listas (`ArrayList`). Simula el intercambio de láminas repetidas (Messi y Neymar) usando los métodos `contains()`, `remove()` y `add()`.

## Tecnologías

- Java

## Autor

chaustrexp
