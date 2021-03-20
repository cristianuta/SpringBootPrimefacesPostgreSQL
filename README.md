# spring-boot-jsf-primefaces
Project minimal that implements spring-boot + CDI + Mojarra 2.2.8 + Primefaces 6.
There is a context of example with classes (ManagedBean, Service, Bean) and JSF view with fake data in Primefaces datatable.
In orders spring-boot allows WEB-INF folder with resources and libs to run with Tomcat 8.5.4, needs to be package as war.

# Packaging
To package the application, runs mvn clean package 

# Running
java -jar target/spring-boot-application-jsf-0.0.1-SNAPSHOT.war

In browser, execute the link: http://localhost:9000/springjsf/index.jsf 