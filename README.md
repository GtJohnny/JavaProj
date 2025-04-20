# 🎓 College Catalogue Java App

A simple Java application that simulates a college catalogue of grades, providing both students and professors with interactive functionality.

## 📚 Overview

This project models a basic college system where:

- **Students** can:
  - View their grades.
  - Review each course's grading method.
  - View professor contact information.

- **Professors** can:
  - View and edit grades for their students.
  - Change the grading method for their courses.

## 🧩 Main Classes & Structure

- `Person` *(Abstract Class)*: Base class for all people in the system.
- `Student` *(extends Person)*: Represents a student enrolled in courses.
- `Profesor` *(extends Person)*: Represents a professor managing courses and grades.
- `Materie`: Represents a subject/course.
- `Departament`: Represents a university department.
- `Department` *(Enum)*: Enumerates department types (e.g., CS, Math, Physics).
- `An`: Represents the study year.
- `Grupa`: Represents a group within a study year.
- `Serie`: Represents a series of groups.
- `Meniu` *(Singleton)*: The main menu and control panel for user interaction.

### 🧩 Interface

- `Contactable`: Common interface implemented by `Person` to provide contact info functionality.

## 🛠️ Features

- Modular class design with inheritance and encapsulation.
- Enum for department classification.
- Singleton `Meniu` class for application control flow.
- Interface-driven design for contact methods.
- CLI-based interaction for viewing and managing grades.

## 🏗️ Example Structure

```text
src/
├── main/
│   ├── java/
│   │   ├── model/
│   │   │   ├── Person.java
│   │   │   ├── Student.java
│   │   │   ├── Profesor.java
│   │   │   ├── Materie.java
│   │   │   ├── Departament.java
│   │   │   ├── enums/
│   │   │   │   └── Department.java
│   │   │   ├── structure/
│   │   │   │   ├── An.java
│   │   │   │   ├── Grupa.java
│   │   │   │   └── Serie.java
│   │   │   └── Meniu.java
│   │   └── interfaces/
│   │       └── Contactable.java
