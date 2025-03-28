# Toll Station System

## 📋 Description

This project implements a simple **toll station system** in Java. The system models how different types of vehicles are processed at a toll station, calculating toll amounts and maintaining a summary of vehicles and total revenue collected.

---

## 🚧 Requirements

- Each **toll station** has:
  - A name
  - A region
  - A total amount collected

- Each **vehicle** has:
  - A license plate
  - A toll fee based on its type:
    - **Car**: $100
    - **Motorcycle**: $50
    - **Truck**: $50 per axle

- The system must:
  - Calculate and add the toll fee when a vehicle is processed
  - Store the list of vehicles that arrived at the station
  - At the end, print a summary with:
    - All vehicles (type and license plate)
    - The total amount collected

---

# 💻 Technologies Used

- Java 21
- JUnit 5
- Maven

---
## ▶️ Running the Project

1. Compile the project with Maven:
   ```bash
   mvn clean install
2. Run the tests:
  ```bash
mvn test
