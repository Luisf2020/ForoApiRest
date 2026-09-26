# Forum REST API

![Java](https://img.shields.io/badge/Java-Backend-ED8B00?logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-REST_API-6DB33F?logo=springboot&logoColor=white)
![REST](https://img.shields.io/badge/Architecture-REST-2563eb)

API REST desarrollada en **Java con Spring Boot** para modelar la lógica principal de un foro mediante recursos de usuarios, publicaciones y comentarios.

## Funcionalidades

- Gestión de usuarios.
- Gestión de publicaciones.
- Gestión de comentarios.
- Endpoints HTTP organizados por controladores.
- Separación entre modelos y capa de exposición REST.
- Estructura preparada para evolución hacia persistencia, autenticación y validación.

## Arquitectura

```text
ForoApiRest/
└── src/main/java/com/foro/
    ├── ForoApiRestApplication.java
    ├── Usuario.java
    ├── UsuarioController.java
    ├── Publicacion.java
    ├── PublicacionController.java
    ├── Comentario.java
    └── ComentarioController.java
```

## Stack

- Java
- Spring Boot
- REST
- Maven / configuración Spring

## Objetivo técnico

Este proyecto demuestra fundamentos de desarrollo backend con Spring Boot: modelado de recursos, controladores REST, separación de responsabilidades y diseño de endpoints.

## Ejecución

Clona el repositorio y abre el proyecto Java dentro de la carpeta `ForoApiRest` en IntelliJ IDEA, VS Code o tu IDE preferido. Ejecuta `ForoApiRestApplication` como aplicación Spring Boot.

## Evolución recomendada

- Spring Data JPA.
- PostgreSQL o MySQL.
- DTOs y validación con Bean Validation.
- Manejo global de excepciones.
- Autenticación JWT y autorización por roles.
- OpenAPI / Swagger.
- Pruebas unitarias y de integración.

## Autor

**Luis Felipe Zuniga León**  
Ingeniería de Sistemas · Desarrollo de Software · Backend

---

Proyecto de portafolio enfocado en diseño de APIs REST con Java y Spring Boot.