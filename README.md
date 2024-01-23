# Classroom Seating Chart

## Overview

The Classroom Seating Chart application is a JavaFX tool designed to help teachers visually organize the seating arrangement of their classrooms. By assigning colors to seats, teachers can create a seating plan that takes into account student needs and preferences.

## Features

- **Interactive Seating Chart**: Click on the seats to assign colors and names, representing students.
- **Color Coding**: Use the color picker to assign a unique color to each student.
- **Simple UI**: A user-friendly interface that requires minimal learning curve.

## Prerequisites

To run this application, you will need:

- Java Development Kit (JDK) - version 11 or higher.
- JavaFX SDK for your operating system.

## Installation

1. Clone the repository or download the source code.
2. Ensure that your IDE is set up with the correct JDK and JavaFX SDK paths.

## Running the Application

To run the application from your IDE, simply import the project and execute the `main` method in the `App.java` class.

To run from the command line, navigate to the project directory and execute:

```shell
javac --module-path /path/to/javafx-sdk/lib --add-modules javafx.controls,javafx.fxml -d out src/main/java/com/example/*.java
java --module-path /path/to/javafx-sdk/lib --add-modules javafx.controls,javafx.fxml -cp out com.example.App
```
Replace /path/to/javafx-sdk/lib with the actual path to the JavaFX SDK libraries on your machine.

Usage
After launching the application, you can:

Click on a seat to select it.
Use the color picker to choose a color.
Enter a student's name in the text field and click 'Add student' to assign them to the selected seat.

Contributing
Contributions to this project are welcome! Please feel free to submit pull requests or create issues for any bugs you discover or enhancements you wish to propose.

License
This project is open source and available under the MIT License.
