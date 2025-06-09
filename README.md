## Employee Management System

A comprehensive full-stack application for managing employee records, implemented with Spring Boot, MySQL, and React. This system supports all CRUD operations and is actively utilized by a community sports club for member management.


---

### Introduction

This **Employee Management System** is a robust, full-stack solution designed to facilitate the creation, retrieval, updating, and deletion of employee records. The back end is developed using **Java** with the **Spring Boot** framework and **MySQL**, while the front end is constructed with **React.js** and styled with **Bootstrap**.

---

### Objectives

* Develop a scalable **RESTful API** employing Spring Boot and MySQL.
* Implement a responsive and intuitive user interface utilizing React.js.
* Demonstrate adherence to industry best practices in full-stack development.
* Ensure API reliability and comprehensive error handling through Postman testing.

---

### Technology Stack

| Component   | Technology                         |
| ----------- | ---------------------------------- |
| Back End    | Java, Spring Boot, JPA (Hibernate) |
| Database    | MySQL                              |
| Front End   | React.js, Bootstrap                |
| HTTP Client | Axios                              |
| Routing     | react-router-dom                   |
| API Testing | Postman                            |

---

### System Architecture

#### Back-End

* **Entity Modeling**: Employee entities are defined using JPA annotations (`@Entity`, `@Id`, `@GeneratedValue`).
* **Data Persistence**: Spring Data JPA manages repository operations.
* **Exception Handling**: Custom exceptions address scenarios such as "Employee Not Found".
* **Configuration**: Secure database connectivity via `application.properties`.

#### Front-End

* **Component Structure**: Modular React components for listing, creating, viewing, editing, and deleting employees.
* **State Management**: Utilization of React hooks (`useState`, `useEffect`) for managing component state.
* **HTTP Requests**: Axios handles communication with back-end services.
* **Routing**: Client-side routing configured with `react-router-dom`.

---

### API Endpoints

| Method | Endpoint              | Description                        |
| ------ | --------------------- | ---------------------------------- |
| GET    | `/api/employees`      | Retrieve all employee records      |
| GET    | `/api/employees/{id}` | Retrieve a specific employee       |
| POST   | `/api/employees`      | Create a new employee record       |
| PUT    | `/api/employees/{id}` | Update an existing employee record |
| DELETE | `/api/employees/{id}` | Remove an employee record          |




### Installation & Usage

Follow the steps below to run the application on your local machine:

1. **Clone the repositories**

   ```bash
   # Clone back-end repository
   git clone https://github.com/sohelkureshi/Employee-Management-System.git
   cd Employee-Management-System

   # Clone front-end repository in parent directory
   cd ..
   git clone https://github.com/sohelkureshi/Employee-Management-Frontend.git
   ```

2. **Back-End Setup**

   * Ensure you have **JDK 17+** and **Maven** installed on your system.
   * Open `Employee-Management-System/src/main/resources/application.properties` and configure your MySQL credentials (URL, username, password).
   * Navigate to the back-end directory and start the Spring Boot application:

     ```bash
     cd Employee-Management-System
     mvn clean install
     mvn spring-boot:run
     ```

3. **Front-End Setup**

   * Install **Node.js** (v14+) and **npm** if not already installed.
   * Navigate to the front-end directory:

     ```bash
     cd ../Employee-Management-Frontend
     ```
   * Install dependencies and start the React development server:

     ```bash
     npm install
     npm start
     ```

4. **Access the Application**

   * Back-end API: `http://localhost:8080/api/employees`
   * Front-end Client: `http://localhost:3000`

---

The application can be deployed to cloud platforms such as **Render**, **Heroku**, or **Vercel**. Ensure that environment variables and production database credentials are configured appropriately in the deployment settings.

---

### Contact

For additional information or inquiries, please visit my GitHub profile: [https://github.com/sohelkureshi](https://github.com/sohelkureshi)
