# Appium Automation Framework for wdiodemoapp

## Prerequisites
1. Install Java (JDK 11+).
2. Install Maven.
3. Install Appium and Android SDK.
•	  Check if node.js is installed and setup .                     
•	If not , download and install 
•	Check if appium is available on the system 
•	Install Appium.
•	Verify that Appium is available on system 
•	Run the command Appium to get information on our installed Appium
•	Check and install required appium drivers as per the our testing needs .
o	Run command to see available drivers 
o	Install Appium driver and its dependencies (UiAutomator2 driver)
4. Connect Android device or emulator by installing android studio.

## Dependencies
- Appium 
- Selenium 
- Gson for data-driven approach.
-tstng

## How to Run
1. Clone this repository.
2. Run `mvn clean install` to build the project.
3. Start Appium server: `appium` .
4. Run tests: `mvn test`.

## Test Data
Test data is located in `src/test/resources/testData/data.json`.


Structure 
## Structure to eclipse 
src/main/java
  - base
    - BaseTest.java
  - pages
    - LoginPage.java
    - SignUpPage.java
    - FormsPage.java
    - SwipePage.java
src/test/java
  - tests
    - LoginTest.java
    - FormsTest.java
    - SwipeTest.java
    -SignupTest.java
Utils
     -json reader
src/test/resources
  - testData
    - data.json


