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

- `Person` *(Abstract Class)*: Base class for all people.
- `Student` *(extends Person)*: Represents a student enrolled in courses.
- `Profesor` *(extends Person)*: Represents a professor managing courses and grades.
- `Materie`: Represents a subject/course.
- `Departament`: Represents a university department.
- `Department` *(Enum)*: Enumerates department types (e.g. ASC, PAOJ, etc.).
- `An`: Represents the study year.
- `Grupa`: Represents a group within a study year.
- `Serie`: Represents a series of groups.
- `Meniu` *(Singleton)*: The main menu and control panel for user interaction.



## 🛠️ Features

- Modular class design with inheritance and encapsulation.
- Enum for department classification.
- Singleton `Meniu` class for application control flow.
- Interface-driven design for contact methods.
- CLI-based interaction for viewing and managing grades.

## 🏗️ Example Structure
```text
src/
├── Catalog/
│   ├── An.java
│   ├── Grupa.java
│   ├── Serie.java
│   ├── Materie.java
│   ├── Departament.java
│   └── TipOra.java      # Enum
├── Persoane/
│   ├── Persoana.java
│   ├── Profesor.java
│   ├── Student.java
│   └── Contact.java         # Interface for contact info
├── Meniu.java               # Singleton menu class (outside the packages)
