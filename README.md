# lab02-cvds

## Integrantes
- Santiago Cordoba
- Santiago Coronado

## Profesor
- Oscar Ospina

## ¿Qué es Maven?
Maven es una herramienta de gestión y construcción de proyectos para Java que automatiza el proceso de compilación, empaquetado y gestión de dependencias. Utiliza un archivo de configuración (`pom.xml`) para definir las tareas y las dependencias del proyecto.

## Comandos Maven
- **Generar un proyecto**: `mvn archetype:generate -DgroupId=com.ejemplo -DartifactId=mi-proyecto -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false`
- **Compilar el proyecto**: `mvn compile`
- **Empaquetar el proyecto**: `mvn package`
- **Ejecutar la clase principal**: `mvn exec:java -Dexec.mainClass="com.ejemplo.App"`
- **Limpiar el proyecto**: `mvn clean`

## 1. Mayor utilidad de Maven
Maven es una herramienta de gestión de proyectos y automatización de la construcción que se usa principalmente en proyectos Java, aunque también se puede usar con otros lenguajes de programación. Su mayor utilidad es proporcionar una forma estandarizada y repetible de construir, gestionar y desplegar proyectos. Esto incluye:

- **Gestión de dependencias**: Maven descarga y gestiona las bibliotecas y otras dependencias necesarias para tu proyecto desde repositorios.
- **Automatización de la construcción**: Ejecuta tareas como compilar el código, ejecutar pruebas, empaquetar el código y generar documentación de manera automatizada.
- **Estructura de proyecto**: Ofrece una estructura de proyecto estandarizada, lo que facilita el trabajo en equipo y la integración continua.
- **Configuración y plugins**: Utiliza un sistema de plugins que permite ampliar y personalizar el proceso de construcción según las necesidades del proyecto.

## 2. Fases de Maven

El ciclo de vida de Maven se divide en varias fases, cada una encargada de una parte específica del proceso de construcción. Aquí tienes una visión general de las fases principales:

- **validate**: Valida que el proyecto esté correcto y toda la información esté disponible.
- **compile**: Compila el código fuente del proyecto.
- **test**: Ejecuta las pruebas unitarias.
- **package**: Empaqueta el código compilado en un formato distribuible (por ejemplo, JAR o WAR).
- **verify**: Realiza verificaciones adicionales, como pruebas de integración.
- **install**: Instala el paquete en el repositorio local de Maven para que otros proyectos puedan usarlo.
- **deploy**: Copia el paquete final a un repositorio remoto para compartirlo con otros desarrolladores o equipos.

## 3. Ciclo de vida de la construcción

El ciclo de vida de la construcción de Maven está diseñado para definir una serie de pasos o fases que se deben ejecutar en un orden específico. Cada fase tiene una tarea asociada. Por ejemplo:

- **Default Lifecycle**: Este es el ciclo de vida principal que se encarga de la construcción y el empaquetado del proyecto.
- **Clean Lifecycle**: Este ciclo de vida se ocupa de la limpieza del proyecto (eliminar archivos generados previamente).
- **Site Lifecycle**: Se encarga de la generación de documentación del proyecto.

Cada ciclo de vida está compuesto por una serie de fases que se ejecutan en un orden específico cuando se invoca un objetivo (goal) de Maven.

## 4. Utilidad de los Plugins

Los plugins en Maven son componentes que añaden funcionalidades específicas al proceso de construcción. Cada plugin puede proporcionar uno o más objetivos que se ejecutan durante el ciclo de vida del proyecto. Los plugins permiten:

- **Compilación**: Como el plugin `maven-compiler-plugin` para compilar el código fuente.
- **Pruebas**: Como el plugin `maven-surefire-plugin` para ejecutar pruebas unitarias.
- **Empaquetado**: Como el plugin `maven-jar-plugin` para empaquetar el código compilado en un archivo JAR.
- **Documentación**: Como el plugin `maven-site-plugin` para generar documentación del proyecto.

Los plugins son configurables y extensibles, lo que permite personalizar el proceso de construcción según las necesidades del proyecto.

## 5. Repositorio Central de Maven

El repositorio central de Maven es un repositorio público que aloja bibliotecas y dependencias comunes usadas en proyectos Maven. Su propósito es:

- **Proveer dependencias**: Permitir que los proyectos Maven descarguen librerías y otras dependencias necesarias sin tener que almacenarlas localmente.
- **Facilitar la compartición**: Hacer que los artefactos generados y compartidos por diferentes proyectos estén disponibles para toda la comunidad.



## Evaluación de las Fábricas

### Fábrica Realizada
- **Descripción**: Se creó una fábrica simple.
- **Ventajas**: Eficiente y concisa, con poco código.

### ¿Cuál es Mejor?
- **Respuesta**: La mejor opción depende del contexto y de la situación específica.
  - **En el laboratorio**: La fábrica simple es más adecuada debido a su eficiencia y al menor volumen de código.
  - **En otros contextos**: Puede ser necesario considerar otras fábricas según los requisitos y complejidades del entorno.

No se puede determinar una fábrica como la mejor de manera absoluta sin considerar el contexto en el que se utilizará.


## ¿Cuál(es) de las anteriores instrucciones se ejecutan y funcionan correctamente y por qué?

### Sin Parámetros
- **Descripción**: Si se ejecuta, pero no crea nada debido a la falta de parámetros.
- **Resultado**: No se ejecuta correctamente ya que no se proporciona información suficiente para realizar la acción deseada.

### Parámetro: `qwerty`
- **Descripción**: La ejecución con el parámetro `qwerty` no se lleva a cabo.
- **Razón**: La clase especificada no está inscrita o no existe en el contexto actual.
- **Resultado**: No se ejecuta correctamente.

### Parámetro: `pentagon`
- **Descripción**: La ejecución con el parámetro `pentagon` tampoco se lleva a cabo.
- **Razón**: El nombre de la clase comienza con una letra minúscula, mientras que la convención requiere que comience con una letra mayúscula.
- **Resultado**: No se ejecuta correctamente.

### Parámetro: `Hexagon`
- **Descripción**: La ejecución con el parámetro `Hexagon` se realiza con éxito.
- **Razón**: El nombre de la clase es correcto y sigue la convención de nomenclatura requerida, comenzando con una letra mayúscula.
- **Resultado**: Se ejecuta correctamente.


