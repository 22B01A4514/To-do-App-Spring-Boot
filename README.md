# 📝 To-do App - Spring Boot

A simple and responsive To-do List application built using **Spring Boot**, **Thymeleaf**, **Bootstrap 5**, and **MySQL**. This app allows users to add, view, and toggle the status of tasks.

---

## 🚀 Features

- ✅ Add new tasks
- ✅ Mark tasks as completed or incomplete
- ✅ Responsive UI with Bootstrap 5
- ✅ Persistent storage using MySQL and Spring Data JPA
- ✅ Thymeleaf template engine for dynamic HTML rendering

---

## 🛠️ Technologies Used

- **Java 21**
- **Spring Boot 3.5.3**
- **Spring Data JPA**
- **Spring MVC**
- **Thymeleaf**
- **Bootstrap 5.3.7**
- **MySQL**
- **HikariCP (Connection Pooling)**

---

## 📁 Project Structure

<pre lang="md"> ``` src/ ├── main/ │ ├── java/com/app/todoApp/ │ │ ├── controller/ # Controller classes (e.g., TaskController) │ │ ├── model/ # JPA entities (e.g., Task.java) │ │ ├── repository/ # Spring Data JPA Repositories │ │ ├── service/ # Business logic │ │ └── TodoAppApplication.java │ └── resources/ │ ├── templates/ # Thymeleaf HTML files │ │ └── index.html │ └── application.properties ``` </pre>
