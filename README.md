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

- **validate**: Valida que el proyecto esté correcto y...
