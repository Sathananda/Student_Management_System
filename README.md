# Student Management System

A comprehensive Java application for managing undergraduate and postgraduate students, including course enrollment, fees tracking, and marks management.

## Features

✅ **Add Students**
- Add Undergraduate (UG) students with semester information
- Add Postgraduate (PG) students with specialization details

✅ **Student Management**
- Search students by ID
- Remove students from the system
- Update student marks
- Display all students with detailed information

✅ **Fee Calculation**
- Automatic fee calculation based on student type
- UG Student Fees: $50,000
- PG Student Fees: $75,000

✅ **Address Management**
- Store and manage student address (city, state, pincode)

✅ **Sports Participation**
- Track PG student sports participation

## Project Structure

```
Student_Management_System/
├── src/
│   ├── Main.java                    # Entry point of the application
│   ├── StudentManagementSystem.java  # Core management system
│   ├── Person.java                  # Abstract base class
│   ├── Student.java                 # Abstract student class
│   ├── UGStudent.java               # Undergraduate student implementation
│   ├── PGStudent.java               # Postgraduate student implementation
│   ├── Teacher.java                 # Teacher class
│   ├── Address.java                 # Address model
│   └── SportsParticipant.java       # Interface for sports participation
├── StudentManagementSystem.iml      # IntelliJ IDEA module configuration
└── .gitignore                       # Git ignore file
```

## Object-Oriented Concepts Used

- **Inheritance**: Person → Student → UGStudent/PGStudent hierarchy
- **Abstraction**: Abstract classes (Person, Student) and interfaces (SportsParticipant)
- **Polymorphism**: Method overriding in calculateFees() and displayStudent()
- **Encapsulation**: Private attributes with getter/setter methods

## How to Run

1. **Compile the project:**
   ```bash
   javac src/*.java
   ```

2. **Run the application:**
   ```bash
   java -cp src Main
   ```

## Menu Options

1. **Add UG Student** - Add an undergraduate student
2. **Add PG Student** - Add a postgraduate student
3. **Remove Student** - Remove a student by ID
4. **Search Student** - Search for a student by ID
5. **Update Marks** - Update student marks
6. **Display All Students** - View all students in the system
7. **Exit** - Exit the application

## Technologies

- **Language**: Java
- **IDE**: IntelliJ IDEA
- **Build Tool**: Manual compilation (No Maven/Gradle)

## Author

Sathananda

## License

Open Source
