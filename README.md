\# BDD Automation Framework using Selenium, Java, Cucumber, TestNG



\## Project Overview

This project is a Behavior Driven Development (BDD) based automation framework designed to automate functional test scenarios for a web application.

The framework uses Cucumber for readable test scenarios written in Gherkin syntax and Selenium WebDriver for browser automation.



The goal of this project is to demonstrate a scalable, maintainable, and industry standard automation framework suitable for real world QA automation projects.



\## Application Under Test

Demo web application used for automation practice and framework demonstration.



\## Tech Stack

\- Java

\- Selenium WebDriver

\- Cucumber BDD

\- TestNG

\- Maven

\- IntelliJ IDEA



\## Framework Design and Architecture

\- Page Object Model (POM)

\- Feature files written in Gherkin language

\- Step Definitions for test implementation

\- Test Runner for execution control

\- Hooks for setup and teardown

\- Externalized configuration using properties files

\- Screenshot capture on failure

\- HTML execution reports



\## Project Structure

src

&nbsp;├── main/java

&nbsp;│   ├── base

&nbsp;│   ├── pages

&nbsp;│   └── utils

&nbsp;└── test

&nbsp;    ├── java

&nbsp;    │   ├── hooks

&nbsp;    │   ├── runners

&nbsp;    │   └── stepdefinitions

&nbsp;    └── resources

&nbsp;        ├── features

&nbsp;        └── config.properties



\## How to Run the Tests



\### Using Maven

mvn clean test



\### Using Test Runner

\- Open TestRunner class

\- Right click and select Run



\## Reports

\- Cucumber HTML reports are generated after execution

\- Scenario level and step level results available

\- Screenshots captured for failed scenarios



\## Key Highlights

\- BDD approach improves collaboration

\- Reusable and maintainable automation framework

\- Config driven execution

\- Suitable for smoke and regression testing



\## Author

Shilpa



