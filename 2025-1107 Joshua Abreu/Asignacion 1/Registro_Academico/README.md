# Sistema de Registro Académico en Java Swing

## Descripción

Este proyecto consiste en una aplicación de escritorio desarrollada en Java utilizando Swing.
El sistema permite registrar los datos personales de un estudiante, ingresar sus calificaciones parciales y calcular automáticamente su nota final, determinando si el estudiante aprueba o reprueba la materia.

---

## ⚙️ Funcionalidades

### Registro de Estudiante

* Captura de nombre completo
* Captura de matrícula
* Captura de carrera
* Validación de campos obligatorios

### Registro de Calificaciones

* Prácticas
* Parciales
* Asignaciones
* Examen final

### Cálculo Automático

* Suma total de las calificaciones
* Determinación de estado:

  * ✅ **APROBADO** (≥ 60 puntos)
  * ❌ **REPROBADO** (< 60 puntos)

### Navegación

* Interfaz dividida en secciones (datos personales y calificaciones)
* Cambio de pestañas mediante botón "Siguiente"

---

## Estructura de Calificación

* Prácticas: 40 puntos
* Parciales: 20 puntos
* Asignaciones: 20 puntos
* Examen final: 20 puntos

**Condición de aprobación:**
El estudiante aprueba con una nota final mayor o igual a **60 puntos**.

---

## Validaciones Implementadas

* Campos obligatorios (no vacíos)
* Nombre y carrera solo permiten letras
* Matrícula solo permite números y guiones
* Validación de valores numéricos en calificaciones
* Restricción de rangos:

  * Prácticas: 0–40
  * Parciales: 0–20
  * Asignaciones: 0–20
  * Examen final: 0–20
* Manejo de errores con mensajes claros

---

## Tecnologías Utilizadas

* Java
* Java Swing
* NetBeans IDE

---

## Cómo Ejecutar el Proyecto

1. Abrir el proyecto en NetBeans
2. Ejecutar la clase principal (JFrame)
3. Ingresar los datos del estudiante
4. Presionar el botón **Siguiente**
5. Ingresar las calificaciones
6. Presionar **Calcular Resultado**

---

## Autor

**Joshua Abreu**

---

## Notas

Este proyecto fue desarrollado como parte de una asignación académica para practicar el desarrollo de interfaces gráficas en Java, validación de datos y lógica de programación.
