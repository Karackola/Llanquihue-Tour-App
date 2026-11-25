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

Semana 6 - Herencia Simple

Objetivo

Implementar una jerarquía de clases mediante herencia simple, reutilizando atributos y métodos comunes para representar diferentes tipos de servicios turísticos.

Clases implementadas

- ServicioTuristico: clase base que contiene el nombre y la duración del servicio.
- RutaGastronomica: subclase que incorpora el número de paradas.
- PaseoLacustre: subclase que incorpora el tipo de embarcación.
- ExcursionCultural: subclase que incorpora el lugar histórico.
- GestorServicios: clase encargada de crear seis instancias de prueba.
- Main: clase actualizada para mostrar los servicios turísticos en consola.

Conceptos aplicados

- Herencia simple mediante extends.
- Encapsulamiento de atributos.
- Uso de super() en los constructores.
- Sobreescritura del método toString().
- Polimorfismo mediante un arreglo de la superclase.

Instrucciones de ejecución

1. Abrir el proyecto Llanquihue Tour App en NetBeans.
2. Verificar que el archivo src/resources/Tours.txt esté disponible.
3. Ejecutar la clase ui.Main o presionar F6 si está configurada como clase principal.
4. Revisar en consola los tours disponibles y los seis servicios turísticos creados.

Se mantienen las funcionalidades desarrolladas en las semanas anteriores.