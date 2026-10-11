# Forum REST API

![stack: Java](https://img.shields.io/badge/stack--Java-0d9488?style=flat-square) ![stack: Spring Boot](https://img.shields.io/badge/stack--Spring%20Boot-0d9488?style=flat-square) ![stack: REST](https://img.shields.io/badge/stack--REST-0d9488?style=flat-square) ![IA: asistido](https://img.shields.io/badge/IA--asistido-6366f1?style=flat-square)

API REST en Java con Spring Boot que modela la logica principal de un foro: usuarios, publicaciones y comentarios.

**Tipo:** API REST (Java / Spring Boot) · **Complejidad:** Intermedio

## Problema que resuelve

Exponer las operaciones basicas de un foro como recursos HTTP de forma ordenada, sin mezclar la logica de dominio con la capa de exposicion.

## Solucion implementada

Controladores REST separados por recurso sobre un modelo de dominio simple (Usuario, Publicacion, Comentario), listo para incorporar persistencia.

### Funcionalidades principales

- Endpoints REST por recurso (usuarios, publicaciones, comentarios)
- Separacion entre modelo y controladores
- Estructura de proyecto Spring Boot
- Punto de partida para persistencia y validacion

## Stack

- Java
- Spring Boot
- REST

## Estructura

```
src/main/java/com/foro/
  ForoApiRestApplication.java
  Usuario.java / Publicacion.java / Comentario.java
  UsuarioController.java / PublicacionController.java / ComentarioController.java
src/main/resources/application.properties
```

## Puesta en marcha

```bash
# Requiere JDK 17+ y Maven
cd ForoApiRest
mvn spring-boot:run
```

## Complejidad del proyecto

**Nivel: Intermedio** — Servicio HTTP con varios recursos y capas; sin base de datos todavia.

El nivel describe la complejidad tecnica del proyecto, no el grado de dominio de quien lo escribio.

## Despliegue

Servicio backend; se ejecuta con la JVM, no se despliega como pagina web.  
El codigo fuente esta disponible en este repositorio.

## Transparencia sobre IA

Este proyecto se desarrollo con asistencia de inteligencia artificial (generacion de codigo,
revision y documentacion). El codigo fue leido, ejecutado y probado manualmente. No se declaran
clientes, metricas ni resultados que no puedan verificarse.

## Autor

**Luis Felipe Zuniga Leon** — Desarrollador de software asistido por IA

- GitHub: <https://github.com/Luisf2020>

---

_Proyecto de portafolio. El desarrollo se apoyo en herramientas de IA bajo revision tecnica humana._
