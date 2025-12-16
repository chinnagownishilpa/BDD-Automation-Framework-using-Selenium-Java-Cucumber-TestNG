\# BDD Automation Framework using Selenium, Java, Cucumber \& TestNG



\## Overview

This repository contains an enterprise-ready BDD automation framework designed to automate web application testing using Selenium WebDriver and Cucumber BDD.



The framework demonstrates real-world QA automation practices such as clean architecture, separation of concerns, reusable components, centralized reporting, and CI/CD readiness. It reflects production-level automation frameworks used in insurance and financial domain applications.



---



\## Technology Stack

\- Java

\- Selenium WebDriver

\- Cucumber BDD

\- TestNG

\- Maven

\- Extent Reports

\- GitHub

\- Jenkins (CI-ready design)



---



\## Framework Architecture

The framework follows a layered architecture to ensure maintainability, scalability, and reusability.



\### Key Design Principles

\- \*\*BDD Separation\*\*: Feature files define behavior, step definitions implement logic, and page objects handle UI interactions.

\- \*\*Centralized Driver Management\*\*: WebDriver lifecycle handled using DriverFactory and BaseTest.

\- \*\*Configuration Driven Execution\*\*: Browser and environment values externalized using properties files.

\- \*\*Reusable Utilities\*\*: Reporting, screenshots, waits, and configuration handled via utility classes.

\- \*\*CI/CD Ready\*\*: Maven-based execution suitable for Jenkins pipelines.



---



\## Project Structure

src

├── main/java

│ ├── base

│ │ ├── BaseTest.java

│ │ └── DriverFactory.java

│ ├── config

│ │ └── ConfigReader.java

│ ├── pages

│ └── utils

│ ├── ExtentManager.java

│ ├── ScreenshotUtil.java

│

├── test/java

│ ├── hooks

│ │ └── Hooks.java

│ ├── runners

│ │ └── TestRunner.java

│ └── stepdefinitions

│

└── test/resources

├── features

└── config.properties



---



\## Reporting and Failure Handling

\- Extent Reports configured centrally using `ExtentManager`

\- Scenario-level reporting via Cucumber Hooks

\- Automatic screenshot capture on failure

\- HTML reports generated under `target/`



---



\## How to Execute Tests



\### Using Maven



mvn clean test





\### Using Test Runner

\- Open `TestRunner.java`

\- Right click → Run



---



\## CI/CD Integration

This framework is designed for CI execution:

\- Maven-based execution

\- Compatible with Jenkins pipelines

\- Supports nightly regression execution

\- Generates HTML reports for build validation



---



\## Real-World Use Case Alignment

This framework mirrors automation practices used in enterprise insurance and financial domain applications, supporting:

\- Regression testing

\- Smoke testing

\- CI-driven execution

\- Maintainable long-term automation



---



\## Author

Shilpa



