
### https://github.com/in28minutes/spring-boot-master-class
### https://github.com/ckgauro/Spring-Microservices/tree/main/in28Minutes/springExampleinIn28minutes

Lect 9 
https://github.com/in28minutes/spring-boot-master-class/blob/master/02.Spring-Boot-Web-Application/Step01.md

start.spring.io
add dependencies 
dev and web

----------------

Lect 10
--Nothing to do


---------------
Lect 11  ----Done
https://github.com/in28minutes/spring-boot-master-class/blob/master/02.Spring-Boot-Web-Application/Step02.md


LoginController --- (controller)
application.properties--- modify

********
@Controller
public class LoginController {

    @RequestMapping(value = "/login")
    @ResponseBody
    public String sayHello() {
        return "Hello World dummy";
    }

}
***************

---------------
Lect 13

Check in browser network

----------

Lect 14
click on parent of POM of 

[Revise video ]

----------

Lect 15   ---done

https://github.com/in28minutes/spring-boot-master-class/blob/master/02.Spring-Boot-Web-Application/Step04.md
Create folder
/src/main/webapp/WEB-INF/jsp/login.jsp
create login.jsp

src/main/resources/application.properties --->modify

add in pom file
********
<dependency>
            <groupId>org.apache.tomcat.embed</groupId>
            <artifactId>tomcat-embed-jasper</artifactId>
            <scope>provided</scope>
        </dependency>		
    *****
    and restart and run
    
    localhost:8080/login
    
    -------------------
    
Lect     16 --done

https://github.com/in28minutes/spring-boot-master-class/blob/master/02.Spring-Boot-Web-Application/Step05.md

 localhost:8080/login?name=Ram
 
 src/main/java/com/in28minutes/springboot/web/controller/LoginController.java
 src/main/webapp/WEB-INF/jsp/login.jsp

------------

Lect 17  --done
https://github.com/in28minutes/spring-boot-master-class/blob/master/02.Spring-Boot-Web-Application/Step06.md
DispatcherServlet receives HTTP Request.

---------

Lect 18 ---DONE

https://github.com/in28minutes/spring-boot-master-class/blob/master/02.Spring-Boot-Web-Application/Step07.md

https://github.com/in28minutes/spring-boot-master-class/blob/master/02.Spring-Boot-Web-Application/Step07.zip

 localhost:8080/login
 
src/main/java/com/in28minutes/springboot/web/controller/LoginController.java
src/main/webapp/WEB-INF/jsp/login.jsp
src/main/webapp/WEB-INF/jsp/welcome.jsp


check in network > Params values

---------

Lect 19   --done
https://github.com/in28minutes/spring-boot-master-class/blob/master/02.Spring-Boot-Web-Application/Step08.zip
https://github.com/in28minutes/spring-boot-master-class/blob/master/02.Spring-Boot-Web-Application/Step08.md

src/main/java/com/in28minutes/springboot/web/controller/LoginController.java
src/main/java/com/in28minutes/springboot/web/service/LoginService.java
src/main/webapp/WEB-INF/jsp/login.jsp



-------------------------------------------
Lect 20  --done

https://github.com/in28minutes/spring-boot-master-class/blob/master/02.Spring-Boot-Web-Application/Step09.md
Autowired, @Component, @Service, @Repository, @Controller, @componenetScan



-----------

Lect 21  ---done
https://github.com/in28minutes/spring-boot-master-class/blob/master/02.Spring-Boot-Web-Application/Step10.md

 /src/main/java/com/in28minutes/springboot/web/model/Todo.java
 
  /src/main/java/com/in28minutes/springboot/web/service/TodoService.java
  
https://github.com/in28minutes/spring-boot-master-class/blob/master/02.Spring-Boot-Web-Application/src/main/java/com/in28minutes/springboot/web/controller/TodoController.java
https://github.com/in28minutes/spring-boot-master-class/blob/master/02.Spring-Boot-Web-Application/src/main/webapp/WEB-INF/jsp/todo.jsp
https://github.com/in28minutes/spring-boot-master-class/blob/master/02.Spring-Boot-Web-Application/src/main/webapp/WEB-INF/jsp/welcome.jsp


Localhost:8080/login

*******
@RequestMapping(value = "/list-todos", method = RequestMethod.GET)
	public String showTodos(ModelMap model) {
		String name = getLoggedInUserName(model);
		model.put("todos", repository.findByUser(name));
		//model.put("todos", service.retrieveTodos(name));
		return "list-todos";
	}
    ***********
    
    if error view video follows following
  https://github.com/in28minutes/spring-boot-master-class/blob/master/02.Spring-Boot-Web-Application/Step12.md  
 
 -------------------
Lect 23  --done

https://github.com/in28minutes/spring-boot-master-class/blob/master/02.Spring-Boot-Web-Application/Step12.md
https://github.com/in28minutes/spring-boot-master-class/blob/master/02.Spring-Boot-Web-Application/Step12.zip

revise video

src/main/java/com/in28minutes/springboot/web/controller/LoginController.java

src/main/java/com/in28minutes/springboot/web/controller/TodoController.java


----------------
Lect 24  ---done

https://github.com/in28minutes/spring-boot-master-class/blob/master/02.Spring-Boot-Web-Application/Step13.md

<dependency>
			<groupId>javax.servlet</groupId>
			<artifactId>jstl</artifactId>
		</dependency>

-------------



Lect 25  done

https://github.com/in28minutes/spring-boot-master-class/blob/master/02.Spring-Boot-Web-Application/Step15.md

src/main/webapp/WEB-INF/jsp/list-todos.jsp

  <dependency>
            <groupId>org.webjars</groupId>
            <artifactId>bootstrap</artifactId>
            <version>3.3.6</version>
        </dependency>
        <dependency>
            <groupId>org.webjars</groupId>
            <artifactId>jquery</artifactId>
            <version>1.9.1</version>
        </dependency>
        



---------
Lect 26 --done


https://github.com/in28minutes/spring-boot-master-class/blob/master/02.Spring-Boot-Web-Application/Step15.md
src/main/webapp/WEB-INF/jsp/list-todos.jsp

-------
Lect 27  --done
https://github.com/in28minutes/spring-boot-master-class/blob/master/02.Spring-Boot-Web-Application/Step16.md
src/main/webapp/WEB-INF/jsp/list-todos.jsp
src/main/java/com/in28minutes/springboot/web/controller/TodoController.java

delete the item
------------

Lect 28 --done
<form:form method="post" modelAttribute="todo">

-----

Lect 29 --done

https://github.com/in28minutes/spring-boot-master-class/blob/master/02.Spring-Boot-Web-Application/Step17.md

src/main/webapp/WEB-INF/jsp/todo.jsp

src/main/webapp/WEB-INF/jsp/list-todos.jsp

--------
Lect 31  --Done 
https://github.com/in28minutes/spring-boot-master-class/blob/master/02.Spring-Boot-Web-Application/Step18.md

<dependency>    
    <groupId>org.springframework.boot</groupId>    
    <artifactId>spring-boot-starter-validation</artifactId>
</dependency>

src/main/java/com/in28minutes/springboot/web/model/Todo.java
src/main/java/com/in28minutes/springboot/web/controller/TodoController.java
src/main/webapp/WEB-INF/jsp/todo.jsp ---form library
src/main/java/com/in28minutes/springboot/web/model/Todo.java
src/main/webapp/WEB-INF/jsp/todo.jsp

default contructor

--------
Lect 32 & 33 ---Done

https://github.com/in28minutes/spring-boot-master-class/blob/master/02.Spring-Boot-Web-Application/Step19.md

src/main/java/com/in28minutes/springboot/web/controller/TodoController.java
showupdateTodo
updateTodo
User
src/main/webapp/WEB-INF/jsp/list-todos.jsp
            <td><a type="button" class="btn btn-success"
							href="/update-todo?id=${todo.id}">Update</a></td>
src/main/java/com/in28minutes/springboot/web/service/TodoService.java
    retrive
    updateTodo
    
src/main/webapp/WEB-INF/jsp/todo.jsp
  hidden

-------------------

Lect 34 --done

https://github.com/in28minutes/spring-boot-master-class/blob/master/02.Spring-Boot-Web-Application/Step20.md

src/main/webapp/WEB-INF/jsp/todo.jsp
 add target date
src/main/java/com/in28minutes/springboot/web/controller/TodoController.java
    initBindier
    add target date
    
    ---Test it 
    src/main/webapp/WEB-INF/jsp/list-todos.jsp    
    
update POM add bootstrap


------------

Lect 35 --Done

https://github.com/in28minutes/spring-boot-master-class/blob/master/02.Spring-Boot-Web-Application/Step21.md

src/main/webapp/WEB-INF/jsp/list-todos.jsp
src/main/webapp/WEB-INF/jsp/common/navigation.jspf
src/main/webapp/WEB-INF/jsp/common/footer.jspf
src/main/webapp/WEB-INF/jsp/common/header.jspf

update each jsp
src/main/webapp/WEB-INF/jsp/login.jsp
src/main/webapp/WEB-INF/jsp/todo.jsp
src/main/webapp/WEB-INF/jsp/welcome.jsp



----------------

Lect 36 --done

https://github.com/in28minutes/spring-boot-master-class/blob/master/02.Spring-Boot-Web-Application/Step22.md
src/main/java/com/in28minutes/springboot/web/controller/LoginController.java
getLogging 

remove login page login.jsp
src/main/webapp/WEB-INF/jsp/common/navigation.jspf
src/main/webapp/WEB-INF/jsp/common/navigation.jspf


Use refractor method

src/main/java/com/in28minutes/springboot/web/controller/TodoController.java

private String getLoggedInUserName(ModelMap model) {
		return (String) model.get("name");
	}
----------

Lect 37

auth.inMemoryAuthentication()
            .passwordEncoder(NoOpPasswordEncoder.getInstance())
        		.withUser("in28Minutes").password("dummy")
                
--------------

Lect 38  --Done
https://github.com/in28minutes/spring-boot-master-class/blob/master/02.Spring-Boot-Web-Application/Step23.md

add to POM

src/main/java/com/in28minutes/springboot/web/security/SecurityConfiguration.java

defult user
pwd

using default security
----------------------


Lect 39  --Done

LoginController --->
https://github.com/in28minutes/spring-boot-master-class/blob/master/02.Spring-Boot-Web-Application/Step24.md




-----  

Lect 40 --Done

https://github.com/in28minutes/spring-boot-master-class/blob/master/02.Spring-Boot-Web-Application/Step25.md


==============

Section 5

Lect 56  ---DOne
https://github.com/ckgauro/Spring-Microservices/tree/main/in28Minutes/first-springboot-project

https://github.com/in28minutes/SpringBootForBeginners/tree/master/05.Spring-Boot-Advanced

https://github.com/in28minutes/SpringBootForBeginners/blob/master/05.Spring-Boot-Advanced/Step01.md

------------

Lect 57 & 58 --Done
https://github.com/in28minutes/SpringBootForBeginners/blob/master/05.Spring-Boot-Advanced/Step02.md

src/main/java/com/in28minutes/service/WelcomeService.java
src/main/java/com/in28minutes/springboot/WelcomeController.java



---------------------
Lect 59   ---Done

https://github.com/in28minutes/SpringBootForBeginners/blob/master/05.Spring-Boot-Advanced/Step03.md

/src/main/resources/application.properties

Open POM files

spring boot auto configuration

---------
Lect 60 --done


https://github.com/in28minutes/SpringBootForBeginners/blob/master/05.Spring-Boot-Advanced/Step04.md

check version
click in each POM files of spring 

click parent>depencies

------------------

Lect 61 --done

https://github.com/in28minutes/SpringBootForBeginners/blob/master/05.Spring-Boot-Advanced/Step05.md


Spring Boot vs Spring

-----------

Lect 62  --done

https://github.com/in28minutes/SpringBootForBeginners/blob/master/05.Spring-Boot-Advanced/Step06.md
src/main/java/com/in28minutes/springboot/model/Question.java
src/main/java/com/in28minutes/springboot/model/Survey.java
src/main/java/com/in28minutes/springboot/service/SurveyService.java

------

Lect 63 & 64  --Done

https://github.com/in28minutes/SpringBootForBeginners/blob/master/05.Spring-Boot-Advanced/Step07.md


src/main/java/com/in28minutes/springboot/controller/SurveyController.java

--run application
  right click in inscpect
  
  
  debug it debug tool
  ---CHeck in log
  JacksonHttpmessageConverters  --Message converter
  
------------------

Lect 65  --Done
https://github.com/in28minutes/SpringBootForBeginners/blob/master/05.Spring-Boot-Advanced/Step08.md
src/main/java/com/in28minutes/springboot/controller/SurveyController.java


-------------

Lect 66  --Done

https://github.com/in28minutes/SpringBootForBeginners/blob/master/05.Spring-Boot-Advanced/Step09.md

update POM

----------------

Lect 67  ---Done

https://github.com/in28minutes/SpringBootForBeginners/blob/master/05.Spring-Boot-Advanced/Step10.md

src/main/java/com/in28minutes/springboot/controller/SurveyController.java
        --@PostMapping("/surveys/{surveyId}/questions")


Send data hrough POSTMAN
send wrong server1 values

----------
Lect 68  --Done

https://github.com/in28minutes/SpringBootForBeginners/blob/master/05.Spring-Boot-Advanced/Step11.md


Check in video

in header change accept   application/xml

Now update 
Update POM

-----------

Lect 69 --done

https://github.com/in28minutes/SpringBootForBeginners/blob/master/05.Spring-Boot-Advanced/Step12.md


------------

Lect 70  --Done

[[Revise it]]

https://github.com/in28minutes/SpringBootForBeginners/blob/master/05.Spring-Boot-Advanced/Step13.md

update POM 
update properties


  http://localhost:8080/actuator/
  
  click on bean
  
  HAL broswer?


-----------------

Lect 71  --done
https://github.com/in28minutes/SpringBootForBeginners/blob/master/05.Spring-Boot-Advanced/Step14.md

Update POM
server.port

------------

Lect 72  --done

https://github.com/in28minutes/SpringBootForBeginners/blob/master/05.Spring-Boot-Advanced/Step15.md

update properties
src/main/resources/application.properties
src/main/resources/application.yaml
src/main/java/com/in28minutes/springboot/WelcomeService.java

Check run configuration

video

http:localhost:8080/acutor/env
  check env

-----------------

Lect 73  --done
https://github.com/in28minutes/SpringBootForBeginners/blob/master/05.Spring-Boot-Advanced/Step16.md
src/main/resources/application.properties
src/main/resources/application-dev.properties
src/main/resources/application-prod.properties



Using -Dspring.profiles.active=prod in VM Arguments
update main application
Bean

check in acutor bean

-------------
Lect 74  --done

https://github.com/in28minutes/SpringBootForBeginners/blob/master/05.Spring-Boot-Advanced/Step17.md

src/main/java/com/in28minutes/springboot/configuration/BasicConfiguration.java
src/main/java/com/in28minutes/springboot/WelcomeController.java
src/main/resources/application.properties

Mapped "{[/]}


http://localhost:8080/dynamic-configuration

Also look at http://localhost:8080/actuator/#http://localhost:8080/configprops






----------------

Lect 75 & 76  --Done
https://github.com/in28minutes/SpringBootForBeginners/blob/master/05.Spring-Boot-Advanced/Step18.md

Update POM
src/main/java/com/in28minutes/springboot/jpa/User.java
src/main/java/com/in28minutes/springboot/jpa/UserCommandLineRunner.java
src/main/java/com/in28minutes/springboot/jpa/UserRepository.java


--------------

Lect 77  --Done

Make the database URL a constant by configuring this in application.properties.

spring.datasource.url=jdbc:h2:mem:testdb
spring.data.jpa.repositories.bootstrap-mode=default

-------
Lect 78  --Done

http://localhost:8080/h2-console
Look at H2 Console : http://localhost:8080/h2-console
Use db url jdbc:h2:mem:testdb

src/main/java/com/in28minutes/springboot/jpa/UserRepository.java
src/main/java/com/in28minutes/springboot/jpa/UserCommandLineRunner.java

------------

Lect 79  --DOne
https://github.com/in28minutes/SpringBootForBeginners/blob/master/05.Spring-Boot-Advanced/Step20.md


Update POM

src/main/java/com/in28minutes/springboot/jpa/UserRestRepository.java
GET POST
Introduction to Spring Data Rest
Hit http://localhost:8080/users in POSTMAN
http://localhost:8080/users/1
http://localhost:8080/users/?size=4
http://localhost:8080/users/?sort=name,desc
@Param("role")
http://localhost:8080/users/search/findByRole?role=Admin
Good for quick prototype! Be cautious about using this in Big applications!


-----------------
Lect 80 & 81 __ongoing

https://github.com/in28minutes/SpringBootForBeginners/blob/master/05.Spring-Boot-Advanced/Step21.md

Update POM

TDD test

/src/test/java/com/in28minutes/springboot/controller/SurveyControllerIT.java

TestRestTemplate   .getForObject(url, String.class); 
check in video 82 2nd 


-----------


Lect 82
https://github.com/in28minutes/SpringBootForBeginners/blob/master/05.Spring-Boot-Advanced/Step22.md
src/test/java/com/in28minutes/springboot/controller/SurveyControllerIT.java

---------

Lect 83

https://github.com/in28minutes/SpringBootForBeginners/blob/master/05.Spring-Boot-Advanced/Step23.md
src/test/java/com/in28minutes/springboot/controller/SurveyControllerIT.java

check videos

-----------

Lect 84 & 85

https://github.com/in28minutes/SpringBootForBeginners/blob/master/05.Spring-Boot-Advanced/Step24.md
src/test/java/com/in28minutes/springboot/controller/SurveyControllerIT.java
src/test/java/com/in28minutes/springboot/controller/SurveyControllerTest.java


------

Lect 86
https://github.com/in28minutes/SpringBootForBeginners/blob/master/05.Spring-Boot-Advanced/Step25.md
src/test/java/com/in28minutes/springboot/controller/SurveyControllerTest.java

-------
Lect 87
https://github.com/in28minutes/SpringBootForBeginners/blob/master/05.Spring-Boot-Advanced/Step26.md

POM

Check in POST man got through video

-------------------------

Lect 88

auth.inMemoryAuthentication().passwordEncoder(org.springframework.security.crypto.password.NoOpPasswordEncoder.getInstance()).withUser("user1").password("secret1")			.roles("USER").and().withUser("admin1").password("secret1")
				.roles("USER", "ADMIN");
                
---------------

Lect 89

https://github.com/in28minutes/SpringBootForBeginners/blob/master/05.Spring-Boot-Advanced/Step27.md

src/main/java/com/in28minutes/springboot/security/SecurityConfig.java
-------

Lect 90
https://www.udemy.com/course/spring-boot-tutorial-for-beginners/learn/lecture/17061578#questions
src/main/java/com/in28minutes/springboot/controller/SurveyController.java




=======================

Section 7


Lect 105

https://github.com/in28minutes/spring-boot-master-class/blob/master/02.Spring-Boot-Web-Application/step32.md

<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		
		<dependency>
			<groupId>com.h2database</groupId>
			<artifactId>h2</artifactId>
			<scope>runtime</scope>
		</dependency>


                            






















        







