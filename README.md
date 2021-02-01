## Trainings Micro Service
This repository contains functionality for `Training Microservice` developed in line with  the microservices architecture. The code demonstrates the CRUD actions performed on Training resource.

The Microservice uses embedded `H2 database` to cut down the complexity but you can use your own db of choice. The Micro service connects to `Eureka server` on port 8761 and also connects to a [Zipkin server](https://search.maven.org/remote_content?g=io.zipkin&a=zipkin-server&v=LATEST&c=exec) server for logs tracing at port 9411.

The application uses slf4j for logging.

For the service to be registered with Eureka server make sure Eureka server is started.


## Requirements

For building and running the application you need:

- [JDK 1.8 and above](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Maven 3](https://maven.apache.org)



## Building and running microservices locally

We can run the appplication locally in multiple ways on your local machine.

One way is by running the `main` method of `TrainingApplication` as a java application. This will start the server on port 9001.

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn spring-boot:run
```

## Exception Handling
Exception handling is a very essential part of any Project as correct messages need to be deliveered across to the consumer in case anything fails.
This project returns the exception message with the right http code and message to make cionsumer aware of any issues.

## Validation
The code uses javax.validation framework for implementig data vaidation for requests.
The validation failures are thrown back as exceptions back to consumers with reason and occurence

## Security
Following API best practices are implemented in the project.
- [Enable TLS security](https://tools.ietf.org/html/rfc8446)
- [Test Your Dependencies and Find Spring Boot Vulnerabilities]
- [Enable CSRF Protection] 
- [Always have validations on at the server side and use post requests]
- [Use a Content Security Policy for Spring Boot XSS Protection]
- [Use Open ID connect for authentication]
- [Hash your passwords and use char[] rather than strings]
- [Store Secrets Securely]
- [Do penetration testing]
- [Code reviews from security team -- important]

## Code coverage
## Quality Check
## Sonarqube
## AOP






