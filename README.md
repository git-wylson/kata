# Project FooBarQix

This project contains two modules. A module of the profession layer (foobarqix-business) and a module of the web layer (foobarqix-web)

Require  
- JDK 1.7+
- Eclipse 4+
- Tomcat 7+
- Maven 3
- Spring framework(WebMVC) version 4
- AngularJs 1.4
- Bootstrap 3.3.5+


Here the project structure:
foobarqix
    |- foobarqix-business
	|	   | pom.xml
	|	   | (folders and files)
	|
	|- foobarqix-web
	|	   | pom.xml
	|	   | (folders and files)
	| pom.xml (parent)

#1. Module foobarqix-business
1.1. Definition
- This module contains the business service application and validator business rules. FoobarqixServiceImpl.java implements the service that calculates the operation foobarqix.
- The FoobarqixServiceImplTest.java class is the test class service.
- The ValidatorBusinessRules.java class implements the customer needs management rules.
- The validatorBusinessRulesTest.java class is the unit test ValidatorBusinessRules.

1.2. Execution
- Console Mode: execute the class AppConsole.java


#2. Module foobarqix-web
2.1. Definition :
This module contains
- The rest Service application. Here uri of this service : http://yourdomain/foobarqix-web/foobarqix
- The front end layer in AngularJS in order to display the results in the table

2.2. Execution
- Import foobarqix parent project in eclipse as maven project
- Make a clean install to generate the jar and war of the application.
- Start tomcat from the startup.bat file in TOMCAT_HOME / bin
- Deployer foobarqix-web.war
- Typing on the browser : http://localhost:8080/foobarqix-web/kata 