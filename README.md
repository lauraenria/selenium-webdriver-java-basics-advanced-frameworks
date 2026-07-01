# Selenium WebDriver with Java — Basics to Advanced + Frameworks

This repository contains my personal learning notes, exercises, Java code examples, and automation framework practice based on the course:

**Selenium WebDriver with Java - Basics to Advanced + Frameworks**

The goal of this repository is to document my learning path from basic Selenium WebDriver concepts to advanced real-world automation framework design using Java.

## How to Set Up the Project on a New PC

This project can be restored on another computer by cloning the GitHub repository and installing the required tools.

## Clone the Repository

```bash
git clone git@github.com:lauraenria/selenium-webdriver-java-basics-advanced-frameworks.git
cd selenium-webdriver-java-basics-advanced-frameworks
```

## Install Requirements

Before cloning and running the project, install the required tools for your operating system.

This project requires:

* Git
* Java JDK 21 or later
* Maven
* Google Chrome
* VS Code or Eclipse


## Install Requirements on Windows

### 1. Install Git

Download and install **Git for Windows**.

After installation, check it from Git Bash or PowerShell:

```bash
git --version
```
---

### 2. Install Java JDK

Install **Java JDK 21** or later.

After installation, check:

```bash
java -version
```

If Java is not recognized, configure the `JAVA_HOME` environment variable and add Java `bin` to the system `PATH`.

Example:

```text
JAVA_HOME=C:\Program Files\Java\jdk-21
```

Add this to `PATH`:

```text
C:\Program Files\Java\jdk-21\bin
```

Then close and reopen the terminal and check again:

```bash
java -version
```

---

### 3. Install Maven

Download and install **Apache Maven**.

After installation, check:

```bash
mvn -version
```

If Maven is not recognized, add Maven `bin` to the system `PATH`.

Example:

```text
C:\apache-maven\bin
```

Then close and reopen the terminal and check again:

```bash
mvn -version
```

---

### 4. Install Google Chrome

Install **Google Chrome** normally on Windows.

Check the browser version from:

```text
Chrome menu → Help → About Google Chrome
```

---

### 5. Install an IDE

Recommended IDEs:

```text
VS Code with Java Extension Pack
Eclipse IDE for Java Developers
```

For VS Code, install:

```text
Extension Pack for Java
```

For Eclipse, use:

```text
Eclipse IDE for Java Developers
```


## Install Requirements on Linux

The following commands are for **Ubuntu/Debian-based Linux distributions**.

### 1. Update Packages

```bash
sudo apt update
sudo apt upgrade -y
```

---

### 2. Install Git

```bash
sudo apt install git -y
```

Check installation:

```bash
git --version
```

---

### 3. Install Java JDK

```bash
sudo apt install openjdk-25-jdk -y
```

Check installation:

```bash
java -version
```

---

### 4. Install Maven

```bash
sudo apt install maven -y
```

Check installation:

```bash
mvn -version
```

---

### 5. Install Google Chrome

Download and install Google Chrome:

```bash
wget https://dl.google.com/linux/direct/google-chrome-stable_current_amd64.deb
sudo apt install ./google-chrome-stable_current_amd64.deb -y
```

Check installation:

```bash
google-chrome --version
```

---

### 6. Install VS Code

Download and install **VS Code** from the official website or install it using your Linux package manager.

After installing VS Code, install:

```text
Extension Pack for Java
```

Optional Selenium-related extensions can also be installed, but they are not required to run Maven tests.



### 7. Optional: Install Eclipse

If you prefer Eclipse, install:

```text
Eclipse IDE for Java Developers
```

When opening the project in Eclipse, import it as a Maven project:

```text
File → Import → Maven → Existing Maven Projects
```

Then select the project folder that contains the `pom.xml` file.

Do not import the entire Eclipse workspace folder.



## How to Run the Project (Prerequisites)

Before getting started, ensure that `JAVA_HOME` is correctly configured on your system.

### Configuration and Downloading Dependencies in Linux

To download all the necessary dependencies using Maven, open your terminal in the root directory of the project and run the following commands:

1. Navigate to the folder containing the `pom.xml` file:
   ```bash
   cd introduction
   mvn clean install
   ```

   ### Windows Instructions

If you are on Windows, open your Command Prompt (cmd) or PowerShell in the project root folder and run:

1. Navigate to the folder containing the `pom.xml` file:
   ```cmd
   cd introduction
   mvn clean install
   ```


## Course Goal

By the end of this learning path, the objective is to gain strong practical knowledge of Selenium WebDriver with Java and to be able to design, build, and maintain automation frameworks from scratch.

This includes:

- Selenium WebDriver fundamentals
- Strong Core Java basics for automation
- Locators and WebElement interaction
- Synchronization and waits
- Handling real-time Selenium challenges
- TestNG framework
- Maven build management
- Page Object Model design pattern
- Data-driven and hybrid automation frameworks
- Cucumber BDD integration
- Selenium Grid and parallel testing
- Jenkins CI/CD integration
- HTML reports and TestNG listeners
- Excel data-driven testing
- Database testing with Selenium test cases
- File upload and download automation
- Selenium 4 Chrome DevTools Protocol integration

---

## Learning Outcomes

After completing this course, I should be able to:

- Automate any website using Selenium WebDriver and Java
- Write optimized automation test scripts
- Handle real-world Selenium automation challenges
- Design Page Object Model frameworks from scratch
- Build Data-Driven and Hybrid Automation Frameworks
- Use TestNG for test execution and assertions
- Use Maven for dependency and build management
- Integrate Selenium tests with Jenkins CI/CD pipelines
- Run tests in parallel using Selenium Grid
- Generate professional-looking HTML test reports
- Validate data integrity between the GUI and database
- Handle web tables, iframes, child windows, alerts, Ajax calls, calendars, uploads, downloads, and dynamic elements
- Improve automation code quality and follow framework design standards
- Prepare for Selenium automation interviews
- Understand how to lead an automation project from design to execution

---

## Technologies and Tools

The repository focuses on the following technologies:

| Area | Tools / Technologies |
|---|---|
| Programming Language | Java |
| Automation Tool | Selenium WebDriver |
| Testing Framework | TestNG |
| Build Tool | Maven |
| BDD | Cucumber |
| Reporting | Extent Reports, TestNG Reports |
| CI/CD | Jenkins, GitHub |
| Version Control | Git, GitHub |
| Browser Automation | ChromeDriver, EdgeDriver, FirefoxDriver |
| Parallel Testing | Selenium Grid |
| Data-Driven Testing | Excel API |
| Database Testing | JDBC / Database connection |
| Advanced Selenium | Selenium 4, Chrome DevTools Protocol |
| File Handling | Upload and Download automation |

---

## Course Sections

This repository follows the course structure below.

### 1. Selenium Introduction

Introduction to Selenium WebDriver, automation testing concepts, browser automation, and the role of Selenium in software testing.

### 2. Install Java & Selenium — Getting Started with Basic Steps of Selenium WebDriver

Setup of Java, IDE, Selenium dependencies, browser drivers, and first Selenium WebDriver scripts.

### 3. Brush Up Java Concepts for Selenium Automation

Revision of basic Java concepts required for Selenium automation.

### 4. Core Java In Depth for Manual Testers and Beginners

Core Java concepts needed to write Selenium automation scripts effectively.

### 5. Locator Techniques and Tools Used to Identify Objects

Learning how to identify web elements using:

- ID
- Name
- Class Name
- Link Text
- Partial Link Text
- CSS Selectors
- XPath

### 6. Advanced Locators Identification and Interview Questions on Parsing Text

Advanced locator strategies and text parsing techniques used in real-world automation and interviews.

### 7. Selenium WebDriver — Techniques to Automate Web Elements

Automation of common web elements such as:

- Text boxes
- Buttons
- Checkboxes
- Radio buttons
- Dropdowns
- Alerts
- Dynamic elements

### 8. Deep Dive into Functional Testing with Selenium

Functional testing concepts using Selenium WebDriver with practical examples.

### 9. Synchronization Usage in Selenium WebDriver

Handling synchronization problems using waits:

- Implicit wait
- Explicit wait
- WebDriverWait
- ExpectedConditions
- Fluent wait

### 10. Techniques to Automate Ajax Calls, Child Windows and IFrames

Handling dynamic web applications, multiple windows, tabs, and iframe-based content.

### 11. Real-Time Exercises — End-to-End Programming

Practice exercises based on real-time web automation scenarios.

Topics include:

- Counting links on a page
- Limiting WebDriver scope
- Opening links in separate tabs
- Getting page titles from multiple tabs
- Handling calendars in travel/e-commerce websites

### 12. Practical Problems and Methods to Handle Them with Selenium

Solutions for common Selenium challenges, including:

- Scrolling with JavaScriptExecutor
- Handling web tables
- Parsing strings
- Comparing generated values
- Dynamic UI problems

### 13. Miscellaneous Topics in Selenium WebDriver

Additional Selenium WebDriver concepts and practical utilities.

### 14. Selenium Java Streams — Automate Sort, Pagination and Filtering in Web Tables

Using Java Streams with Selenium to automate:

- Sorting
- Pagination
- Filtering
- Web table validations

### 15. Selenium 4.0 — Latest Features

New Selenium 4 features and improvements.

### 16. Framework Part 1 — TestNG

Introduction to TestNG for Selenium test execution.

Topics include:

- Test annotations
- Assertions
- Test suites
- Prioritization
- Groups
- Parameterization
- Dependency methods

### 17. Java Object-Oriented Principles Needed for Framework Development

OOP principles required for automation framework design:

- Classes
- Objects
- Constructors
- Inheritance
- Polymorphism
- Encapsulation
- Interfaces

### 18. Framework Part 1 — Create Maven Project and Prepare Functional End-to-End Test

Creating a Maven-based Selenium framework and preparing end-to-end functional tests.

### 19. Framework Part 2 — Design Pattern: Page Object and Factory Implementation

Implementation of the Page Object Model design pattern.

Topics include:

- Page classes
- Object repositories
- PageFactory
- Reusable methods
- Cleaner test structure

### 20. Framework Part 3 — Test Configuration Methods, Global Properties and Parallel Runs

Managing test configuration using:

- Global properties
- Browser configuration
- TestNG XML files
- Parallel execution

### 21. Framework Part 4 — Test Strategy, Control Test Execution and Run Parallel Tests

Designing a test execution strategy and controlling test runs across multiple browsers and environments.

### 22. Framework Part 5 — Extent HTML Reports, TestNG Listeners and Thread-Safe Execution

Creating advanced test reports and improving framework reliability.

Topics include:

- Extent Reports
- TestNG Listeners
- Screenshot capture on failure
- Thread-safe execution
- Parallel execution stability

### 23. Framework Part 6 — Test Execution from Maven and Jenkins CI/CD Integration

Executing Selenium tests from Maven and integrating them into Jenkins CI/CD pipelines.

### 24. Framework Part 7 — Common Selenium Framework OOP Interview Questions

Review of common interview questions related to Selenium framework design and OOP concepts.

### 25. Framework Part 8 — Integrating Cucumber Wrapper into Selenium Framework

BDD integration using Cucumber.

Topics include:

- Feature files
- Step definitions
- Runner classes
- Cucumber with TestNG
- BDD framework structure

### 26. Git — Version Control Tutorial

Using Git and GitHub for version control.

### 27. CI/CD Integration of Selenium Framework with Jenkins and GitHub

Connecting GitHub repositories with Jenkins pipelines for automated test execution.

### 28. Cross Browser Testing with Selenium Grid

Running Selenium tests across multiple browsers and machines using Selenium Grid.

### 29. Excel Data-Driven Testing

Using external Excel files to drive Selenium test data.

### 30. Upload and Download Functionalities with Selenium Using External Excel Files

Automating file upload and download scenarios.

### 31. Selenium 4 Chrome DevTools Protocol Integration Concepts

Using Chrome DevTools Protocol with Selenium 4 for advanced browser-level automation.

### 32. Database Connection to Selenium Test Cases

Connecting Selenium test cases with databases to verify data integrity.

### 33. GenAI GitHub Copilot Plugin for Selenium Java Framework Code Generation

Using GitHub Copilot and GenAI tools to support Selenium Java framework development.

### 34. File Uploading and Downloading with Selenium

Handling file upload and download workflows in Selenium automation.

### 35. Optional Maven — Build Management Tool In-Depth

Detailed Maven concepts for Selenium projects.

### 36. Java OOP Basics for Selenium — Part 1

Object-Oriented Programming concepts for Selenium automation.

### 37. Core Java Tutorial — Part 2

Intermediate Java concepts useful for automation.

### 38. Core Java Tutorial — Part 3: Collections API

Java Collections used in Selenium projects.

Topics include:

- List
- ArrayList
- Set
- HashSet
- Map
- HashMap

### 39. Bonus Lecture

Final course notes and additional learning resources.

---

## Repository Structure

Suggested repository structure:

```text
selenium-webdriver-java-basics-advanced-frameworks/
│
├── README.md
├── .gitignore
├── pom.xml
│
├── src/
│   ├── main/
│   │   └── java/
│   │       ├── basics/
│   │       ├── locators/
│   │       ├── webdriver/
│   │       ├── waits/
│   │       ├── windows/
│   │       ├── iframes/
│   │       ├── actions/
│   │       ├── javascriptExecutor/
│   │       ├── streams/
│   │       └── utilities/
│   │
│   └── test/
│       └── java/
│           ├── testng/
│           ├── pageObjects/
│           ├── testCases/
│           ├── cucumber/
│           └── framework/
│
├── testng.xml
│
├── notes/
│   ├── selenium-introduction.md
│   ├── java-basics.md
│   ├── locators.md
│   ├── waits.md
│   ├── testng.md
│   ├── maven.md
│   ├── page-object-model.md
│   ├── cucumber.md
│   ├── selenium-grid.md
│   └── jenkins-ci-cd.md
│
├── resources/
│   ├── test-data/
│   ├── excel-files/
│   ├── config.properties
│   └── log4j.properties
│
└── reports/