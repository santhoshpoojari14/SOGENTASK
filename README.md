# SOGENTASK
Required Software :
Eclipse IDE, MySql Server ,Java 1.8
Step 1: src/main/java/com/portal/sql/db.sql 
Run the db.sql for creating Data base and Table in Mysql Server.
for connceting db used MySql workbench.
Database Details which is mentioned in src/main/resources/application.properties
UserName:root
Password:root


Step2: download and Import the project to Eclipse 
From Eclipse
i)Run as clean.
ii)Run as Maven install

Step3:Run as  Spring boot standalone application using 

src/main/java/com/portal/EmployeePortalApplication.java
i) From Eclipse IDE Run as Java EmployeePortalApplication.java 
Once server Started .
We can test the following API's using Post Man
i)Create Employee details 
HTTP Method :   POST
EndPoint Url:  http://localhost:8080/api/v1/employees
Input Details :
type:Application/Json

{
"firstName":"Santhosh",
"lastName":"Poojari",
"gender":"Male",
"dateOfBirth":"12-03-2014",
"department":"ECE"
}


ii)GetEmployee First Name by Ascending ordring 

HTTP Method :  GET
EndPoint Url:  http://localhost:8080/api/v1/employeesFirstNameByAsc


Below steps are Optional 
step 4:  Running Application in external Tomcat 
Need to enalbe below dependency in pom.xml which is currently commented

<dependency>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-starter-tomcat</artifactId
 <scope>provided</scope>
</dependency> 
     
 Step 5: Generate the War file from Eclipse 
 After Generating warFile .Deploy the warFile in External Tomcat
 We can test the  API's which is mentioned in Step 3:
i)Create Employee details 
ii)GetEmployee First Name by Ascending order.


