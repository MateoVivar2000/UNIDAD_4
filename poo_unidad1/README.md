# Sistema de Gestión de Contenidos Audiovisuales (POO)

Este proyecto es una aplicación de consola desarrollada en Java que permite gestionar un catálogo de contenidos audiovisuales (Películas y Series de TV).

El proyecto es el resultado de la refactorización de un código base inicial, transformándolo en una arquitectura robusta basada en **MVC (Modelo-Vista-Controlador)**, aplicando principios de **Código Limpio (Clean Code)**, **SOLID** y **Persistencia de Datos** mediante archivos CSV.

---

## 📋 Tabla de Contenidos
1. [Características del Sistema](#-características-del-sistema)
2. [Arquitectura y Diseño](#-arquitectura-y-diseño)
3. [Estructura del Proyecto](#-estructura-del-proyecto)
4. [Principios Aplicados (SOLID & Clean Code)](#-principios-aplicados-solid--clean-code)
5. [Requisitos Previos](#-requisitos-previos)
6. [Instalación y Ejecución](#-instalación-y-ejecución)
7. [Pruebas Unitarias](#-pruebas-unitarias)
8. [Autor](#-autor)

---

## 🚀 Características del Sistema

* **Gestión de Películas:** Permite agregar nuevas películas con atributos como título, director, género, duración y estudio.
* **Gestión de Series:** Soporte para series de TV, incluyendo el número de temporadas.
* **Persistencia de Datos:** Los datos no se pierden al cerrar el programa. Se guardan automáticamente en archivos CSV (`peliculas.csv`, `series.csv`) y se cargan al iniciar.
* **Interfaz de Consola:** Menú interactivo fácil de usar para navegar por las opciones.
* **Validación de Datos:** Manejo de excepciones para evitar cierres inesperados por datos incorrectos.

---

## 🏗 Arquitectura y Diseño

El sistema sigue el patrón de diseño **MVC (Modelo-Vista-Controlador)** para desacoplar la lógica de negocio de la interfaz de usuario.

### 1. Modelo (`model`)
Contiene la lógica de negocio y la representación de los datos. No sabe nada de la interfaz gráfica.
* **Clases:** `Pelicula`, `SerieDeTV`, `Actor`, `Temporada`.
* **Herencia:** Ambas clases principales heredan de la clase abstracta `ContenidoAudiovisual` para reutilizar código.
* **Persistencia:** La clase `GestorArchivos` se encarga exclusivamente de leer y escribir en los archivos CSV.

### 2. Vista (`view`)
Se encarga de la interacción con el usuario.
* **Clase `Menu`:** Muestra las opciones en consola y captura la entrada del teclado. No realiza cálculos ni lógica compleja.

### 3. Controlador (`controller`)
Actúa como intermediario.
* **Clase `SistemaControlador`:** Recibe las órdenes de la Vista (ej. "Usuario quiere agregar película"), procesa la información y la envía al Modelo para ser guardada.

---

## 📂 Estructura del Proyecto

```text
poo_unidad1/
├── src/
│   ├── controller/
│   │   └── SistemaControlador.java   # Orquestador del sistema
│   ├── model/
│   │   ├── Actor.java
│   │   ├── ContenidoAudiovisual.java # Clase Padre Abstracta
│   │   ├── GestorArchivos.java       # Manejo de CSV (Persistencia)
│   │   ├── Pelicula.java
│   │   └── SerieDeTV.java
│   └── view/
│       ├── Menu.java                 # Interfaz de usuario
│       └── PruebaAudioVisual.java    # Clase Main (Punto de entrada)
├── test/
│   └── poo_unidad1/
│       ├── PeliculaTest.java         # Pruebas JUnit 5
│       └── SerieTest.java            # Pruebas JUnit 5
├── peliculas.csv                     # Base de datos de películas
├── series.csv                        # Base de datos de series
└── README.md

💎 Principios Aplicados (SOLID & Clean Code)
Para cumplir con los estándares de calidad de software (Unidad 4), se han aplicado los siguientes conceptos:

Single Responsibility Principle (SRP)
Cada clase tiene una única responsabilidad.

Ejemplo: La clase Pelicula solo guarda datos de la película. La lógica de guardar en disco se movió a GestorArchivos. La lógica de preguntar al usuario se movió a Menu.

Open/Closed Principle (OCP)
El software está abierto a extensión pero cerrado a modificación.

Ejemplo: Si queremos agregar un nuevo tipo de contenido (ej. "Documental"), solo debemos crear una nueva clase que herede de ContenidoAudiovisual sin necesidad de romper el código existente de Pelicula.

Código Limpio (Clean Code)
Nombres Significativos: Variables y métodos tienen nombres descriptivos (guardarPeliculas, duracionEnMinutos) en lugar de abreviaturas confusas (gP, d).

Manejo de Excepciones: Uso de bloques try-catch y try-with-resources en la lectura de archivos para garantizar que los recursos se cierren correctamente y el programa sea estable.

⚙️ Requisitos Previos
Java Development Kit (JDK): Versión 8 o superior (recomendado Java 17 o 21).

IDE: Eclipse, IntelliJ IDEA o NetBeans.

Librerías: JUnit 5 (para ejecutar los tests).

💻 Instalación y Ejecución
Clonar o Descargar: Descarga el proyecto en tu equipo.

Importar en Eclipse:

File -> Import -> General -> Projects from Folder or Archive.

Configurar Build Path (Si es necesario):

Si ves errores en los @Test, asegúrate de añadir la librería JUnit 5 al Build Path (Clic derecho en el proyecto -> Build Path -> Add Libraries -> JUnit).

Ejecutar:

Navega a src/view/PruebaAudioVisual.java.

Clic derecho -> Run As -> Java Application.

🧪 Pruebas Unitarias
El proyecto incluye pruebas automatizadas para verificar la integridad de los datos.

Ve a la carpeta test.

Haz clic derecho sobre PeliculaTest.java.

Selecciona Run As -> JUnit Test.

Verifica que la barra de resultados aparezca en verde.