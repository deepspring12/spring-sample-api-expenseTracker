# ExpenseTracker - SpringBoot Sample Api

### Description: Api to track of items purchased by tags.

This api persists data to Mysql Database.
To use Postgresql Database, simply modify the application.properties file to the following:

	spring.jpa.hibernate.ddl-auto=create

	spring.datasource.url=jdbc:postgresql://localhost:5432/Db_Name

	spring.datasource.username=springuser

	spring.datasource.password=YourPassword

	spring.datasource.driverClassName=org.postgresql.Driver

And edit pom.xml: 

1) Remove the mysql dependency:
	
	<dependency>
		<groupId>mysql</groupId>
		<artifactId>mysql-connector-java</artifactId>
		<scope>runtime</scope>
	</dependency> add the following dlines to pom.xml

2) Add postgresql dependency:

	<dependency>
		<groupId>org.postgresql</groupId>
		<artifactId>postgresql</artifactId>
		<scope>runtime</scope>
	</dependency>