# 🧸 API de Funkos - Proyecto Simple con NestJS

Este es un proyecto backend sencillo desarrollado con **NestJS** que ofrece una **API REST** para gestionar productos de tipo **Funko Pop!**. Ideal para aprender o practicar la creación de APIs con Nest y TypeScript.

La API permite registrar nuevos funkos, actualizarlos, eliminarlos y listarlos por categorías o disponibilidad.

---

## 📦 Funcionalidades principales

- CRUD completo de Funkos
- Filtros por categoría, disponibilidad o nombre
- Validaciones con DTOs y Pipes
- Documentación con Swagger
- Estructura modular (estilo NestJS)

---

## 🛠️ Tecnologías utilizadas

- **Lenguaje**: TypeScript
- **Framework**: NestJS
- **ORM**: TypeORM o Prisma (dependiendo del setup)
- **Base de datos**: PostgreSQL / SQLite
- **Documentación**: Swagger (OpenAPI)

---

## ⚙️ Cómo ejecutar

### Requisitos

- Node.js
- npm o yarn
- Base de datos (PostgreSQL o SQLite)

### Pasos

```bash
git clone https://github.com/tuusuario/api-funkos.git
cd api-funkos
npm install
npm run start:dev
```

Accede a la documentación Swagger:  
[http://localhost:3000/api](http://localhost:3000/api)

---

## 🧪 Endpoints principales

| Método | Endpoint         | Descripción                |
|--------|------------------|----------------------------|
| GET    | /funkos          | Lista todos los funkos     |
| GET    | /funkos/:id      | Detalle de un funko        |
| POST   | /funkos          | Crear nuevo funko          |
| PUT    | /funkos/:id      | Actualizar funko existente |
| DELETE | /funkos/:id      | Eliminar funko             |

---

## 🎯 Objetivo

Este proyecto fue creado como ejercicio para practicar la construcción de una API sencilla con buenas prácticas, modularización y documentación automática.

---

## 🤝 Autor

**Kevin Bermúdez**  
_Técnico Superior en Desarrollo de Aplicaciones Web_

---

## 📄 Licencia

Este proyecto está disponible bajo la licencia MIT. Puedes usarlo como base para tu propio ecommerce o práctica de APIs.
