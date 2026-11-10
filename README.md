# Kotlin Boilerplate Template

A minimal Kotlin project template with testing and code quality tools configured.

## Features

- **Kotlin 2.4** with JVM toolchain 25 (auto-provisioned via foojay)
- **Gradle 9** with version catalog, configuration cache and build cache
- **kotlin-test** for testing with JUnit Platform
- **ktlint** configured with official code style
- **GitHub Actions** CI and Dependabot
- **EditorConfig** for consistent formatting
- **AI-free coding zone** - see [AGENTS.md](./AGENTS.md)

## Prerequisites

- A JDK to run Gradle (17+); the JDK 25 toolchain is downloaded if missing

## Building

```bash
./gradlew build
```

## Running Tests

```bash
./gradlew test
```

## Code Quality

Run ktlint to check code style:

```bash
./gradlew ktlintCheck
```

Auto-format code with ktlint:

```bash
./gradlew ktlintFormat
```

## Project Structure

```
src/
├── main/kotlin/org/cserby/aoc/
│   └── Day0.kt          # One object per day: part1/part2 take the raw input
└── test/
    ├── kotlin/org/cserby/aoc/test/
    │   ├── Day0Test.kt
    │   └── Utils.kt     # readFile("/dayN.example.txt")
    └── resources/       # dayN.example.txt, dayN.input.txt
```

Run a single day: `./gradlew test --tests '*Day0Test'`

## AI Assistance Policy

This repository is designated as an **AI-free coding zone**. Please see [AGENTS.md](./AGENTS.md) for details.

## License

This is a template repository - use it however you like!
