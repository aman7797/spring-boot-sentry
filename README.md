# Spring Boot Sentry

Project to integrate Sentry with Spring Boot Application

## Sentry

Sentry is an open-source platform for workflow productivity, aggregating errors from across the stack in real time. 500K developers use Sentry to get the code-level context they need to resolve issues at every stage of the app lifecycle. Sentry is a tool in the Exception Monitoring category of a tech stack.
s

## Maven Dependency

```xml
<dependency>
    <groupId>io.sentry</groupId>
    <artifactId>sentry-log4j2</artifactId>
    <version>1.7.5</version>
</dependency>
```
## Anotations

**@CrossOrigin** - This annotation marks the annotated method or type as permitting cross origin requests.Standard protocol that defines the interaction between a browser and a server for safely handling cross-origin HTTP requests.

**@EnableAutoConfiguration** - automatically configures the Spring application based on its included jar files, it sets up defaults or helper based on dependencies in pom.xml

## Configuration

Create a log4j2.xml file to configure the Log level to be warned.Refer to the project [log4j2.xml](https://github.com/aman7797/spring-boot-sentry/blob/master/src/main/resources/log4j2.xml)
## Test Endpoints

    http://localhost:8004/test

For Arithmetic Exception

    http://localhost:8004/handled

## Sentry Dashboard

![Sentry Dashboard](https://github.com/aman7797/spring-boot-sentry/blob/master/img/dashboard.png)