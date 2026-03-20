Autor: Gilber Vido    Matricula: 2025-2008

=== Sistema de notas ===

Aplicación de escritorio desarrollada en Java utilizando Swing, que permite capturar las calificaciones de un estudiante, 
calcular su nota final y determinar si ha aprobado o reprobado la asignatura según los criterios establecidos.

El sistema implementa validaciones de entrada y separación entre la interfaz gráfica y la lógica del programa.


--Captura de datos personales:

- Nombre
- Matrícula
- Carrera

-- Entrada de calificaciones:

- Prácticas (máx. 40)
- Parciales (máx. 20)
- Asignaciones (máx. 20)
- Examen Final (máx. 20)

-- Validaciones:

- Campos obligatorios
- Entrada numérica válida
- Rangos permitidos por cada tipo de evaluación

-- Procesamiento:

- Cálculo automático de la nota final
- Evaluación de aprobación (≥ 60 puntos)

-- Salida:

- Visualización de la nota final
- Estado: Aprobado o Reprobado

=== COMO SE UTILIZA ===

Primeramente ingresamos los datos personales que nos pide, en este caso el nombre, matricula y carrera.

Despues de eso tenemos que ingresar las notas en las diferentes casillas mencionada (practicas, parciales, asignaturas y
examenes).

Despues de todo eso le damos al boton de calcular, y en la casilla del medio te dira si estas reprobado o no.

=== PUNTOS A TENER EN CUENTA ===

- Hace una validacion de campos, asi que si se queda un campo sin datos, te saltara un mensaje diciendote que ingreses datos
(Ya sea de los personales o las notas).

- Hay un boton de resetear, que hace que las casillas vuelvan en blanco para poder escribir de nuevo, util para seguir verificadon
 notas sin tener que cerrar la ventana.
