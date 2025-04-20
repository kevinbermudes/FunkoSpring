# 🧸 API de Funkos - Spring Boot

Este es un proyecto backend sencillo desarrollado con **Java y Spring Boot**, que proporciona una **API REST** para la gestión de productos Funko Pop. La aplicación permite registrar, listar, actualizar y eliminar funkos desde una base de datos relacional.

---

## 🎯 Objetivo del Proyecto

El propósito de esta API es practicar la construcción de servicios REST usando Spring Boot, incluyendo controladores, servicios, repositorios y entidades bien estructuradas. Es ideal como base para un ecommerce, sistema de inventario o aplicación educativa.

---

## 📦 Funcionalidades

- CRUD completo de funkos
- Filtros por nombre, categoría y disponibilidad (si aplica)
- Validaciones con Bean Validation
- Uso de capas: Controller, Service, Repository
- Documentación con Swagger (opcional)
- Estructura basada en buenas prácticas de Spring Boot

---

## 🛠️ Tecnologías utilizadas

- **Lenguaje**: Java 17+
- **Framework**: Spring Boot
- **Persistencia**: Spring Data JPA
- **Base de datos**: H2 (modo desarrollo) o PostgreSQL/MySQL
- **Documentación**: SpringDoc / Swagger UI (si está habilitado)

---

## ⚙️ Cómo ejecutar

### Requisitos

- Java JDK 17+
- Maven o Gradle
- IDE (IntelliJ IDEA, Eclipse, etc.)

### Pasos

1. Clonar el repositorio:
```bash
git clone https://github.com/tuusuario/funkos-api-spring.git
cd funkos-api-spring
```

2. Configurar `application.properties` o `application.yml` con tu base de datos.

3. Ejecutar el proyecto:
```bash
./mvnw spring-boot:run
```

4. Accede a la API en:
```
http://localhost:8080/api/funkos
```

5. Si usas Swagger:
```
http://localhost:8080/swagger-ui.html
```

---

## 🔗 Endpoints principales

| Método | Ruta              | Descripción                |
|--------|-------------------|----------------------------|
| GET    | /api/funkos       | Lista todos los funkos     |
| GET    | /api/funkos/{id}  | Detalle de un funko        |
| POST   | /api/funkos       | Crear nuevo funko          |
| PUT    | /api/funkos/{id}  | Actualizar funko existente |
| DELETE | /api/funkos/{id}  | Eliminar funko             |

---

## 🤝 Autor

**Kevin Bermúdez**  
_Técnico Superior en Desarrollo de Aplicaciones Web_  
💡 Proyecto backend educativo con Spring Boot

---

## 📄 Licencia

Este proyecto está bajo licencia MIT. Libre para usar, modificar y compartir.
