# Sistema de Gestión de Contenidos Audiovisuales

## Descripción del Proyecto
Este repositorio contiene el código fuente correspondiente al trabajo final de la Unidad 4: "Programación Limpia y Refactorización" de la asignatura Programación Orientada a Objetos.

El proyecto consiste en la implementación de un sistema de gestión para un catálogo de contenidos audiovisuales (películas y series de televisión). El objetivo principal del desarrollo fue la refactorización de un sistema base para cumplir con estándares de calidad de software, implementando el patrón de arquitectura **MVC (Modelo-Vista-Controlador)**, principios **SOLID**, persistencia de datos y pruebas unitarias.

## Características Técnicas
El sistema ha sido diseñado bajo los siguientes lineamientos técnicos:

* **Arquitectura MVC:** Se ha desacoplado la lógica de negocio, la interfaz de usuario y el control de flujo en tres paquetes diferenciados (`model`, `view`, `controller`).
* **Persistencia de Datos:** Implementación de lectura y escritura en archivos de texto plano con formato CSV (`peliculas.csv` y `series.csv`), garantizando la conservación de la información entre ejecuciones.
* **Código Limpio y SOLID:** Aplicación del Principio de Responsabilidad Única (SRP) y encapsulamiento correcto para asegurar la mantenibilidad y escalabilidad del código.
* **Pruebas Unitarias:** Inclusión de una suite de pruebas automatizadas utilizando el framework JUnit 5 para verificar la integridad de las clases de entidad.

## Estructura del Repositorio
La organización de los directorios y archivos fuente es la siguiente:

```text
UNIDAD_4/
├── src/
│   ├── controller/         # Contiene la clase SistemaControlador (Orquestador)
│   ├── model/              # Contiene las Entidades y la lógica de GestorArchivos
│   └── view/               # Contiene la clase Menu y el punto de entrada (Main)
├── test/                   # Contiene las clases de prueba JUnit (PeliculaTest, SerieTest)
├── peliculas.csv           # Base de datos de películas (Archivo plano)
├── series.csv              # Base de datos de series (Archivo plano)
└── README.md               # Documentación técnica del proyecto

Requisitos Previos de Instalación
Para replicar y ejecutar este proyecto en un entorno local, se requiere el siguiente software:

Java Development Kit (JDK): Versión 8 o superior.

Entorno de Desarrollo Integrado (IDE): Eclipse IDE for Java Developers (recomendado), IntelliJ IDEA o NetBeans.

Sistema de Control de Versiones: Git.

Librerías: JUnit 5 (incluido generalmente en el IDE, pero puede requerir configuración en el Build Path).

Guía de Instalación y Replicación
Siga los siguientes pasos para configurar el proyecto en su equipo:

1. Clonación del Repositorio
Abra su terminal o línea de comandos y ejecute la siguiente instrucción para descargar el código fuente:
Bash

git clone [https://github.com/MateoVivar2000/UNIDAD_4.git](https://github.com/MateoVivar2000/UNIDAD_4.git)
2. Importación en Eclipse IDE
Abra la aplicación Eclipse.

Diríjase al menú File > Import...

Seleccione la opción General > Projects from Folder or Archive y presione Next.

Haga clic en Directory..., localice la carpeta UNIDAD_4 descargada anteriormente y presione Finish.

3. Configuración de Dependencias (JUnit)
Si tras la importación observa errores de compilación en la carpeta test, deberá agregar la librería JUnit al proyecto:

Haga clic derecho sobre el proyecto en el explorador de paquetes.

Seleccione Build Path > Add Libraries...

Seleccione JUnit y presione Next.

Asegúrese de seleccionar JUnit 5 en el menú desplegable y presione Finish.

Manual de Ejecución
Ejecución de la Aplicación Principal
Para iniciar el sistema y acceder al menú de gestión:

En Eclipse, navegue a la carpeta src/view.

Localice el archivo PruebaAudioVisual.java.

Haga clic derecho sobre el archivo y seleccione Run As > Java Application.

La interfaz de usuario se desplegará en la consola integrada del IDE.

Ejecución de Pruebas Unitarias
Para verificar la validación técnica del código:

En Eclipse, navegue a la carpeta test.

Haga clic derecho sobre PeliculaTest.java o SerieTest.java.

Seleccione Run As > JUnit Test.

Verifique que la barra de resultados de JUnit se muestre en color verde, indicando que todas las pruebas han sido superadas satisfactoriamente.
