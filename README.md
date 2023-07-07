# API CLINICA

El proyecto de API se modificará para utilizar Java, Spring Boot y MySQL en lugar de Node.js, Express, TypeScript y MongoDB. A continuación se muestra una descripción del proyecto modificado:

La API es un proyecto desarrollado en Java con Spring Boot, diseñado como un conjunto de endpoints para realizar operaciones CRUD (crear, leer, actualizar y eliminar) relacionadas con pacientes, doctores y citas. Además, incluye funcionalidades como la creación de usuarios y autenticación, que validan el rol del usuario para acceder a los diferentes endpoints.

Para almacenar y gestionar los datos de manera eficiente, se utiliza MySQL como base de datos relacional. La API se conecta a la base de datos utilizando la biblioteca de Spring Data JPA, que proporciona un mapeo de objetos a entidades de base de datos y simplifica las operaciones de persistencia.

Este proyecto fue creado específicamente para el curso de la Universidad Distrital y se encuentra bajo la iniciativa "Todos A la U". La API proporciona una interfaz eficiente y segura para interactuar con los datos relacionados con pacientes, doctores y citas, permitiendo a los usuarios realizar operaciones básicas de gestión.

## Tecnologías empleadas

El proyecto ha sido desarrollado utilizando las siguientes tecnologías:

- Lenguaje:  Java
- Framework: Spring Boot
- Base de datos: MySQL

### Bibliotecas utilizadas

A lo largo del proyecto, se han utilizado varias bibliotecas para mejorar la funcionalidad y la eficiencia del código. A continuación, se detallan las bibliotecas utilizadas y una breve descripción de cada una:

Spring Boot Starter Data JPA: Proporciona soporte para la capa de acceso a datos utilizando el framework Java Persistence API (JPA). Permite la interacción con la base de datos MySQL de manera sencilla y eficiente.

Spring Boot Starter Validation: Proporciona funcionalidades de validación de datos en Spring Boot, lo que facilita la validación de entrada y la garantía de la integridad de los datos.

Spring Boot Starter Web: Ofrece un conjunto de dependencias para desarrollar aplicaciones web en Spring Boot. Proporciona un servidor web integrado y funcionalidades para la creación de endpoints RESTful.

mysql-connector-java: Un controlador JDBC para la conexión y la interacción con la base de datos MySQL. Se utiliza para establecer la conexión con la base de datos y ejecutar consultas y actualizaciones.

Lombok: Una biblioteca que simplifica la creación de clases Java eliminando la necesidad de escribir código repetitivo, como los métodos getter y setter. Se utiliza para reducir el código boilerplate y mejorar la legibilidad del código.

## Desarrollador

- [David Puerto Guerrero](https://github.com/Dsp5502)


## Instalación

### Requisitos previos:

- Asegúrate de tener Java JDK 17 o una versión compatible instalada en tu sistema.
- Verifica que tienes MySQL instalado y configurado en tu máquina.
  
### Pasos:

1. **Clonar el repositorio:** Abre tu terminal y ejecuta el siguiente comando para clonar el repositorio desde el servicio de alojamiento:

   ```bash
   git clone https://github.com/Dsp5502/APIClinicaSpringBoot.git

   ```
2. **Configurar la base de datos:** Abre el archivo application.properties ubicado en la carpeta src/main/resources.
Actualiza las propiedades spring.datasource.url, spring.datasource.username y spring.datasource.password con la información de tu base de datos MySQL local.

3. **Compilar y construir el proyecto:**: Abre una terminal o línea de comandos y navega hasta la carpeta raíz del proyecto clonado y ejecuta el siguiente comando para compilar y construir el proyecto:

```bash
  ./mvnw clean package
```
- Esto creará un archivo JAR ejecutable en la carpeta target

4. **Ejecutar la aplicación:**:

```bash
  ./mvnw spring-boot:run
```
- Esto iniciará la aplicación Spring Boot y se conectará a la base de datos MySQL.
- 
5. **Verificar la aplicación:** Abre un navegador web y visita la siguiente URL: http://localhost:8080.
- Deberías ver la página de inicio de la aplicación, lo que indica que la aplicación se ha levantado correctamente.

# Capturas de Pantalla

## Crear Paciente 
<img width="952" alt="image" src="https://github.com/Dsp5502/APIClinicaSpringBoot/assets/90290626/01b661c8-1307-4ae7-8524-54ef8a60fd80">

## Obtener Pacientes
<img width="957" alt="image" src="https://github.com/Dsp5502/APIClinicaSpringBoot/assets/90290626/8d27a551-c3d0-4aee-b72e-f1425cccad36">

## Obtener Paciente por ID
<img width="960" alt="image" src="https://github.com/Dsp5502/APIClinicaSpringBoot/assets/90290626/a85ddd81-bf39-4177-b8b9-aa4809b33c61">

## Editar Paciente por ID
<img width="959" alt="image" src="https://github.com/Dsp5502/APIClinicaSpringBoot/assets/90290626/7d52514d-6897-40da-bb8a-42e758820726">

## Eliminar Paciente por ID
<img width="953" alt="image" src="https://github.com/Dsp5502/APIClinicaSpringBoot/assets/90290626/6030fdad-80c7-4a47-869c-a94159a4810c">



## Crear Doctor 
<img width="959" alt="image" src="https://github.com/Dsp5502/APIClinicaSpringBoot/assets/90290626/5cb0398e-16b1-43f6-bcf3-4d70644d52de">

## Obtener Doctores
<img width="955" alt="image" src="https://github.com/Dsp5502/APIClinicaSpringBoot/assets/90290626/3adda4cf-89a9-4676-ae28-b91059656c80">

## Obtener Doctor por ID
<img width="960" alt="image" src="https://github.com/Dsp5502/APIClinicaSpringBoot/assets/90290626/7e40eda3-ea7e-454d-93f4-ee41820eb885">

## Editar Doctor por ID
<img width="960" alt="image" src="https://github.com/Dsp5502/APIClinicaSpringBoot/assets/90290626/adacb087-f0ae-40db-a97a-cd468862b4f1">

## Eliminar Doctor por ID
<img width="959" alt="image" src="https://github.com/Dsp5502/APIClinicaSpringBoot/assets/90290626/0f1f472a-6b8f-445a-b917-c7e14563aa6c">



## Crear Cita Medica 
<img width="962" alt="image" src="https://github.com/Dsp5502/APIClinicaSpringBoot/assets/90290626/2422d1d7-90aa-49bb-8615-735ea6347e33">

## Obtener Citas Medicas
<img width="958" alt="image" src="https://github.com/Dsp5502/APIClinicaSpringBoot/assets/90290626/fa0026f5-9a8c-430c-b196-21d13881ba49">

## Obtener Doctor por ID
<img width="958" alt="image" src="https://github.com/Dsp5502/APIClinicaSpringBoot/assets/90290626/9801bef9-c879-4201-9a39-24eb41f5fd2e">

## Editar Paciente por ID
<img width="957" alt="image" src="https://github.com/Dsp5502/APIClinicaSpringBoot/assets/90290626/1fd1d6a2-bd8b-4846-bcbf-a1d02063bf7e">

## Eliminar Doctor por ID
<img width="893" alt="image" src="https://github.com/Dsp5502/APIClinicaSpringBoot/assets/90290626/b46e78b1-cfae-4ae2-b042-d47e9159ceea">



## Obtener Especialidades
<img width="958" alt="image" src="https://github.com/Dsp5502/APIClinicaSpringBoot/assets/90290626/8ade4134-1ab2-4e41-b492-3e7df3d22823">






