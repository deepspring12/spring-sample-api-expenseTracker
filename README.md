# ExpenseTracker - SpringBoot Sample Api

This api persists data to Mysql Database.
To use Postgresql Database, simply modify the application.properties file to the following:

spring.jpa.hibernate.ddl-auto=create
spring.datasource.url=jdbc:postgresql://localhost:5432/Db_Name
spring.datasource.username=springuser
spring.datasource.password=YourPassword
spring.datasource.driverClassName=org.postgresql.Driver