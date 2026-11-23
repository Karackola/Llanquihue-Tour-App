Llanquihue Tour App

Descripción

Aplicación desarrollada en Java para gestionar tours turísticos de la agencia
Llanquihue Tour.

Permite cargar tours desde un archivo de texto, almacenarlos en una colección
ArrayList, asignar guías turísticos y mostrar o filtrar los tours por tipo de actividad.

Estructura del proyecto

model: Contiene las clases Tour y GuiaTuristico, con sus atributos, métodos
y validaciones.

data: Contiene GestorDatos, encargada de leer el archivo y cargar los tours.

ui: Contiene Main, clase principal que ejecuta el programa.

resources: Contiene Tours.txt, archivo con los datos de los tours.


Ejecución

1. Abrir el proyecto en Apache NetBeans.
2. Verificar que Tours.txt esté en src/resources.
3. Ejecutar la clase ui.Main.
4. Revisar en consola la lista de tours, los guías asignados y los resultados filtrados por   actividad.

Tecnologías utilizadas

* Java
* Programación orientada a objetos
* Composición entre clases
* ArrayList
* Lectura de archivos de texto
* Manejo de excepciones con try-catch
* Apache NetBeans