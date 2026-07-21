# ac-sample-sb-coverage

Sample multi-module project reproducing the java-utils JaCoCo coverage setup:
Java 21, Spring Boot 3.4.7, JaCoCo 0.8.11, an aggregate `coverage-report` module,
and a GitHub Actions workflow that publishes a browsable per-PR coverage report to
GitHub Pages under `pr/<number>/` and removes it when the PR closes.
