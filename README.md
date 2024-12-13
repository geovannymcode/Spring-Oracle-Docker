# Spring-Oracle-Docker

Aplicación de **Spring Boot** con **Docker** y **Base de Datos Oracle**.

Este proyecto está diseñado para demostrar cómo integrar una aplicación construida con Spring Boot con una base de datos Oracle, utilizando contenedores Docker para la implementación. La solución incluye configuraciones optimizadas para entornos de desarrollo y pruebas.

## Características principales

- **Spring Boot**: Framework para aplicaciones Java.
- **JPA**: Manejo de la persistencia de datos con Oracle.
- **Docker**: Contenedores para la base de datos Oracle y la aplicación Spring Boot.
- **Colección Postman**: Incluye una colección de Postman (`Blog.postman_collection.json`) para probar los endpoints.

## Requisitos previos

- **Docker**: Asegúrate de tener Docker instalado.
- **JDK 11 o superior**: Compatible con la versión de Spring Boot utilizada.
- **Maven**: Para la compilación y gestión de dependencias.

## Instalación y ejecución

1. Clona el repositorio:
```bash
   git clone https://github.com/tuusuario/Spring-Oracle-Docker.git
   cd Spring-Oracle-Docker
```

2. Construye el proyecto con Maven:

```bash
mvn clean install
```

3. Ejecuta los contenedores Docker:

```bash
docker-compose up
```

4. Accede a la aplicación en tu navegador:

```arduino
http://localhost:8080
```

## Documentación adicional
Para más información sobre la configuración y el uso de este proyecto, consulta la documentación del archivo ```Blog.postman_collection.json``` incluida en el repositorio.

## Licencia
Este proyecto está licenciado bajo la Licencia Apache 2.0. Consulta el archivo LICENSE para más detalles.
