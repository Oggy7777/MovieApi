# 🎬 Movie Management System (Spring Boot)

A REST API built using **Spring Boot** to manage movie records with full CRUD operations and validation.

---

## 🚀 Features

* Add Movie
* Get All Movies
* Get Movie by ID
* Update Movie
* Delete Movie
* Input Validation (Jakarta Validation)
* Exception Handling

---

## 🛠️ Tech Stack

* Java 17+
* Spring Boot
* Spring Web
* Spring Data JPA
* Hibernate
* MySQL / H2 Database
* Maven
* Postman (Testing)

---

## 📂 Project Structure

```
com.example.movie
 ┣ controller
 ┣ service
 ┣ repository
 ┣ entity
 ┣ exception
 ┗ MovieApplication.java
```

---

## ⚙️ How to Run Project

1. Clone the repository

```
git clone https://github.com/yourusername/movie-api.git
```

2. Open in IntelliJ / VS Code

3. Configure database in `application.properties`

4. Run

```
mvn spring-boot:run
```

Server starts at:

```
http://localhost:8080
```

---

## 📮 API Endpoints

### Add Movie

POST `/movies/add`

```
{
  "name": "Avengers",
  "rating": 9,
  "hero": "Iron Man"
}
```

### Get All Movies

GET `/movies/all`

### Get Movie By Id

GET `/movies/{id}`

### Update Movie

PUT `/movies/update/{id}`

### Delete Movie

DELETE `/movies/delete/{id}`

---

## ❗ Validation Example (Bad Request)

If invalid data sent → returns **400 Bad Request**

---

## 👨‍💻 Author

Karan Upadhyay
Aspiring Java Backend Developer
