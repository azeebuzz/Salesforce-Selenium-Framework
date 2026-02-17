# Salesforce Selenium Framework

> [!TIP]
> **Quick Start**: Run `mvn clean test` in your terminal to execute the test suite immediately.

## Overview
This is an enterprise-level Selenium framework for testing the Salesforce login functionality. It is built using:
- **Java** (JDK 17)
- **Selenium WebDriver** (4.x)
- **TestNG** (Test Runner)
- **Maven** (Build Management)
- **Page Object Model (POM)** Design Pattern

## 🚀 How to Run Tests

### Option 1: Command Line (Recommended)
1. Open your terminal (Command Prompt or PowerShell).
2. Navigate to the project folder:
   ```bash
   cd c:\Users\auzam\github\chapter_02_prompts\SeleniumFramework
   ```
3. Run the tests:
   ```bash
   mvn clean test
   ```

### Option 2: From IDE (IntelliJ / Eclipse)
1. Open the project as a Maven project.
2. Allow dependencies to download.
3. Right-click on `testng.xml`.
4. Select **Run 'testng.xml'**.

## 📊 Test Results & Status
- **Current Status**: Framework is functional.
- **Known Failures**:
    - **ValidLoginTest**: Fails (Expected) - uses dummy credentials.
    - **InvalidLoginTest**: Fails - XPath for error message needs update.

## Project Structure
- `src/main/java`: 
    - `BasePage.java`: Common WebDriver actions and initialization.
    - `LoginPage.java`: Page elements (XPath only) and login actions.
- `src/test/java`: 
    - `BaseTest.java`: WebDriver setup and teardown.
    - `ValidLoginTest.java`: Test valid login scenario.
    - `InvalidLoginTest.java`: Test invalid login scenario (error validation).
- `pom.xml`: Project dependencies.
- `testng.xml`: Test suite configuration.

## Prerequisites
- Java JDK 17 or higher
- Maven installed and configured in system PATH
- Chrome Browser

## Troubleshooting
- **Maven not recognized**: Ensure Maven `bin` directory is added to your system PATH.
- **Login Failed**: `ValidLoginTest` will fail with dummy credentials. Update correctly in `ValidLoginTest.java`.
- **Element Not Found**: Check if Salesforce UI has changed and update XPaths in `LoginPage.java`.
