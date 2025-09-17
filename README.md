# Spring Core Practice

This is a simple project created to practice **Spring Core concepts** as part of my Java Full Stack learning journey.  
It demonstrates how to use **XML-based configuration** for dependency injection (DI) in Spring.

---

## 📌 Features
- **Employee POJO** with fields, constructors, getters/setters, and `toString()`.
- **XML-based configuration** using `beans.xml`.
- **Setter-based Dependency Injection** with `<property>` tags.
- **Bean Management** using `ApplicationContext`.

---

## 🛠️ Project Structure
spring-core-practice
├── pom.xml
├── README.md
├── .gitignore
└── src
└── main
├── java
│ └── com
│ ├── Employee.java
│ └── TestEmp.java
└── resources
└── beans.xml

---

## ⚡ How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/spring-core-practice.git
Navigate into the project:

cd spring-core-practice


Build and run using Maven:

mvn clean compile
mvn exec:java -Dexec.mainClass="com.TestEmp"

✅ Example Output
Employee [empId=101, empName=Tejanya, salary=50000.0]
Employee [empId=102, empName=Kumar, salary=60000.0]
