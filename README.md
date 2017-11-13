# demoapp

Basic useful feature list:
This is a demoa web mvc application with the following things
 * provides rest services
 * integrated with spring security
 * uses log4j and slg4j as logging framework
 * integrated with swagger


### Stuff used to make this:

 * [spring rest](https://spring.io/guides/gs/rest-service/) as rest implementation
 * [spring-security](https://projects.spring.io/spring-security/)as security implementation
 * [log4j](https://logging.apache.org/log4j/2.x/)as backend logging framework
 * [slf4j](https://www.slf4j.org/) as facede logging framework
 * [swagger](https://swagger.io/) integrated swagger


### How to build:

<b>using default profile in windows</b>
* mvnw.cmd clean install	:	will build and install in local repository
* mvnw.cmd tomcat7:run	:	will deploy the application in embaded tomcat at port 8086 with application context <b>demoapp</b>,  [http://localhost:8086/demoapp/home](http://localhost:8086/demoapp/home)

<b>using 'packageit' profile in windows</b>
* mvn clean install -Ppackageit	: will install the zip artifact 
</br>group id 		: online.smartcompute.demo
</br>artifact id 	: demoapp-web
</br>version		: 0.0.1-SNAPSHOT
</br>classifier 	: bin

unzip the zip and run 'demoapp.bat' the in the bin folder, this will start tomcat at port 8086 , deploy the application with context root <b>demoapp</b>, [http://localhost:8086/demoapp](http://localhost:8086/demoapp/home)

<b>using default profile in unix</b>
* ./mvnw clean install	:	will build and install in local repository
* ./mvnw tomcat7:run	:	will deploy the application in embaded tomcat at port 8086 with application context demoapp,  [http://localhost:8086/demoapp/home](http://localhost:8086/demoapp/home)

<b>using 'packageit' profile in unix</b>
* mvn clean install -Ppackageit	: will install the zip artifact 
</br>group id 		: online.smartcompute.demo
</br>artifact id 	: demoapp-web
</br>version		: 0.0.1-SNAPSHOT
</br>classifier 	: bin


extract the tar.gz and the run demoapp(./demoapp) the in the bin folder, this will start tomcat at port 8086 , deploy the application with context root <b>demoapp</b>, [http://localhost:8086/demoapp/home](http://localhost:8086/demoapp/home)
