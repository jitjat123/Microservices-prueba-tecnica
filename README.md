# Microservicio de Procesamiento de Texto

Este es un microservicio de procesamiento de texto desarrollado en Java usando Spring Boot. El microservicio recibe un texto, lo procesa para verificar el número de palabras, y devuelve un resultado indicando si el número de palabras coincide con el número esperado.

## Tecnologías Utilizadas

- **Java 22**: Lenguaje de programación.
- **Spring Boot**: Framework para crear microservicios.
- **Spring Boot Actuator**: Para monitoreo y Health Checks.
- **Swagger/OpenAPI**: Para documentación de la API.
- **Maven**: Herramienta de gestión de dependencias y construcción.


## Requisitos Previos

- **Java 22**: Java 22 o una versión más reciente.
- **Maven**: Herramienta de construcción y gestión de dependencias.

## Instalación

1. **Clona el repositorio**: https://github.com/jitjat123/Microservices-prueba-tecnica
2. **Navega al directorio del proyecto**: cd Microservices-prueba-tecnica
3. **Construye el proyecto usando Maven**: mvn clean install

## Ejecución del Microservicio

Para ejecutar el microservicio localmente, usa el siguiente comando: **mvn spring-boot:run**

## Documentación de la API
La documentación de la API está disponible a través de Swagger. Una vez que el microservicio esté en ejecución, puedes acceder a la documentación en: http://localhost:8080/swagger-ui/index.html

## Health Checks

- **Liveness Check**: http://localhost:8080/health/liveness
- **Readiness Check**: http://localhost:8080/health/readiness

## Pruebas
Para ejecutar las pruebas unitarias, usa el siguiente comando: **mvn test**

## Uso de la API
- **Endpoint**: http://localhost:8080/api/texto
- **Metodo HTTP**: `POST`
- **Ejemplo**: {
   "requestTexto":[
        "3\\the force is strong in this one",
        "7\\take what you can give nothing back",
        "5\\Here’s looking at you kid."
        ]}
  


