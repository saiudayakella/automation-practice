## Introduction
This project uses Selenium WebDriver java binding and tests te flow of adding a new user to automatin practice website.

## Design patterns followed
Page object model

## Project Management
Maven is used for managing this project. Hence, Maven should be setup on machine.
For steps to setup maven on your machine, refer:
- https://mkyong.com/maven/how-to-install-maven-in-windows/
- https://www.baeldung.com/install-maven-on-windows-linux-mac

Note: Java is a pre-requisite for setting up maven. Used JDK 14 for setting up this project. Recommend using any of the versions above 9.

## IDE
Used Eclipse IDE for building this project. Any other compatible IDEs can be used Eg: IntelliJ, Visual Studio code.

Recommend installing Eclipse IDE for simplicity purposes.

## Project dependencies
* Frmework: TestNG
* Reporting library: ExtentReports
* WebDriver binding: Selenium-Java
* WebDriver Management: WebDriverManager

Refer pom.xml for specific versions of these dependencies

## Setup
If maven is setup on your machine, all you have to do is clone this project in your machine and import this as maven project in your IDE


## How to run the tests
### via cmd
- Navigate to the project root folder
- Run the command `mvn clean test` ( As the testng.xml is specified in pom.xml, this command will pick testng.xml under the project directly)

### via Eclipse
- Install TestNG-Eclipse plugin ( Refer `Eclipse plug-in` section in https://testng.org/doc/download.html)
- Right click testng.xml and select the option `Run as TestnG Suite`


## Considerations
- For simpilcity purposes, values are hard coded in tests but config.properties under `Resources` folder will be used for storing properties
