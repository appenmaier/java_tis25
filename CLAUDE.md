# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

This is **"Programmieren mit Java (TIS25)"** — an educational Java course repository containing lecture demos and scripts. The course covers Java fundamentals through OOP, modern Java 21 features (Records), and productivity tools (Lombok, Maven).

- Course documentation: https://jappuccini.github.io/java-docs/production/
- Exercise solutions: https://github.com/appenmaier/java_exercises
- JavaFX exercise solutions: https://github.com/appenmaier/java_apps

## Build & Run

```bash
# Compile
mvn clean compile

# Run a demo class
mvn exec:java -Dexec.mainClass="main.D01_JavaBasics"
mvn exec:java -Dexec.mainClass="main.D02_ObjectOrientedProgramming"

# Run JavaFX app (when App.java exists)
mvn javafx:run

# Run all tests
mvn test
```

Java 21 is required (`maven.compiler.release=21`).

## Code Architecture

```
src/main/java/
├── main/       # Demo entry-point classes (one per lecture topic)
├── model/      # Data model classes used in demos
└── utility/    # Helper utilities
skript/         # Markdown lecture notes (lecture01.md … lecture07.md)
```

**Pattern for new lectures:** Add a `DXX_TopicName.java` in `main/`, supporting model classes in `model/`, and a corresponding `lectureXX.md` in `skript/`.

**Key dependencies:**
- **Lombok** (`@Data`, `@Value`, etc.) — used on model classes to eliminate boilerplate
- **JUnit 5 + Mockito** — test scope, no tests exist yet
- **JavaFX 23** (controls + FXML) — for GUI demos in later lectures

## Java 21 Features in Use

- **Records** (`Person.java`) — immutable data classes with compact syntax
- **Lombok `@Data`** (`Vehicle.java`) — generates getters, setters, `equals`, `hashCode`, `toString`
- When adding new model classes, prefer Records for immutable data and Lombok `@Data` for mutable data
