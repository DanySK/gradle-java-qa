# Agent Instructions

- Use the Gradle wrapper for repository tasks. Run `./gradlew`, not a system Gradle binary.
- Format Kotlin sources and Gradle Kotlin DSL files with `./gradlew ktlintFormat` before finishing any change that touches `.kt` or `.kts` files.
- Validate completed changes with `./gradlew build` after formatting. Do not replace this with narrower ad hoc checks unless the user explicitly asks for a partial run.
- If `ktlintFormat` changes files, inspect the result and rerun `./gradlew build` on the formatted tree.
- Treat warning suppressions as a last resort. Fix the underlying issue first.
- Every new suppression must include a short justification near the suppression site. Do not add blanket or unexplained suppressions.
- Prefer existing repository mechanisms for QA configuration. Update the checked-in Checkstyle, PMD, or SpotBugs configuration files only when the change genuinely belongs in shared policy.
- This project already wires broad verification into Gradle, including multi-JVM testing and static analysis. Run individual `testWithJvm*` or checker tasks only when debugging a specific failure.
