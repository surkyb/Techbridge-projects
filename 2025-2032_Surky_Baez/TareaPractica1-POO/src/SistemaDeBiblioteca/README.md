# Sistema simple de Biblioteca

Este programa es una simulación básica de un sistema de biblioteca desarrollado en Java. Fue creado con el objetivo de practicar programación orientada a objetos (POO), manejo de clases, encapsulación, listas dinámicas y relaciones entre objetos.

## ¿Qué hace el programa?

El sistema permite:

* Crear libros con título, autor, ISBN y disponibilidad.
* Crear usuarios con un identificador único.
* Registrar préstamos de libros.
* Verificar si un libro está disponible.
* Cambiar el estado del libro cuando se presta o se devuelve.
* Simular una interacción real dentro de una biblioteca.

## Estructura del programa

El proyecto está dividido en varias clases:

**Libro**
Representa un libro dentro de la biblioteca. Contiene:

* Título
* Autor
* ISBN
* Estado de disponibilidad

Permite consultar si el libro está disponible y cambiar su estado cuando se presta o se devuelve.

**Usuario**
Representa una persona registrada en la biblioteca. Contiene:

* Nombre
* ID único
* Lista de libros prestados

Puede:

* Recibir libros prestados
* Devolver libros
* Actualizar la disponibilidad del libro

**Prestamo**
Representa la acción de prestar un libro a un usuario en una fecha específica.

Se encarga de:

* Verificar si el libro está disponible
* Registrar el préstamo
* Cambiar el estado del libro
* Asociar el libro al usuario

**SistemaDeBiblioteca (Main)**
Clase principal donde se prueba el funcionamiento del sistema:

* Se crea un libro
* Se crea un usuario
* Se consulta la disponibilidad
* Se realiza un préstamo
* Se devuelve el libro
* Se vuelve a consultar la disponibilidad

## Ejecución

Para ejecutar el programa solo hay que correr:

```
SistemaDeBiblioteca.java
```

El sistema mostrará en consola el proceso completo del préstamo y devolución.

## Ejemplo de funcionamiento

El programa realiza la siguiente secuencia:

1. El libro inicia como disponible.
2. El usuario toma el libro prestado.
3. El libro cambia a no disponible.
4. El usuario devuelve el libro.
5. El libro vuelve a estar disponible.

## Objetivo académico

Este proyecto fue realizado como práctica de:

* Programación Orientada a Objetos
* Encapsulación
* Uso de ArrayList
* Relaciones entre clases
* Manejo de estados (disponible / no disponible)
* Simulación de un sistema real

## Autor

Surky Báez
