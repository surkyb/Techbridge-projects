# Proyectos de Programación en Java

Este repositorio contiene tres proyectos desarrollados en **Java**, enfocados en aplicar los principios de **Programación Orientada a Objetos (POO)** como encapsulamiento, constructores, sobrecarga de métodos y relaciones entre clases.

---

## 1️⃣ Sistema de Biblioteca

Este proyecto modela un sistema básico de gestión de una biblioteca.

### Clases principales:
- **Libro**: almacena información del libro (título, autor, ISBN y disponibilidad).
- **Usuario**: representa a un usuario con un ID único y una lista de libros prestados.
- **Préstamo**: registra la fecha del préstamo y relaciona un usuario con un libro.

### Funcionalidades:
- Prestar y devolver libros.
- Consultar si un libro está disponible.
- Uso de encapsulamiento (atributos privados).
- Constructores en cada clase.

---

## 2️⃣ Sistema de Vehículos

Proyecto que representa vehículos y calcula el costo de mantenimiento.

### Clase principal:
- **Vehiculo**: contiene placa, marca y modelo.

### Características:
- Tres constructores sobrecargados (básico, completo y por defecto).
- Métodos sobrecargados `calcularMantenimiento()` que calculan el costo según:
  - Kilómetros recorridos.
  - Tipo de servicio.
  - Nivel de suciedad.
- Retorna un costo estimado de mantenimiento.

---

## 3️⃣ Empresa de Telefonía

Sistema de facturación para una empresa de telecomunicaciones.

### Clases principales:
- **Cliente**: contiene nombre, número telefónico y un plan asignado.
- **Plan**: define minutos incluidos, datos en GB y precio mensual.
- **Factura**: calcula el total a pagar según el consumo real.

### Funcionalidades:
- Cálculo automático del monto total (precio base + cargos por exceso).
- Generación de una factura detallada.
- Uso de relaciones entre objetos (Cliente–Plan–Factura).

---

## Tecnologías utilizadas
- Java
- Programación Orientada a Objetos
- JavaDoc para documentación

---

## Autor
**Joshua Abreu**
