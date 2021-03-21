# Data Table
A reference project with Spring Boot, Primefaces, PostgreSQL

# Spring-Boot-Primefaces-Postgre-SQL
A project that implements Spring Boot + CDI + Mojarra 2.2.8 + Primefaces 6.
There is a context of example with classes (ManagedBean, Service, Bean) and JSF view with fake data in Primefaces datatable.
In orders Spring Boot allows WEB-INF folder with resources and libs to run with Tomcat 8.5.4, needs to be package as war.

# Building
To build the application, runs mvn clean install 

# Running
chmod +x target/spring-boot-primefaces-postgre-sql-0.0.1-SNAPSHOT.jar
java -jar target/spring-boot-primefaces-postgre-sql-0.0.1-SNAPSHOT.jar

In browser, execute the link: http://localhost:9000/data-table/index.jsf