The Taborda prototype is based on a JavaScript based front end application and Java based backend set of RESTful API. Data is stored within a PostgreSQL relational database. An overview of the major system components is provided in the diagram and summary below:

![Taborda Prototype Application Architecture](https://github.com/taborda-cws-prototype/cws-parent-portal/blob/master/designs/ADQP-Taborda-ApplicationArchitecture.png)

* User Interface Components - Syntactically Awesome Style Sheets (SASS)
* Front End Application - Angular.js and HTML5
* Front End Web Framework - Bootstrap
* Front End HTTP Server - NGINX
* JavaScript - Java Token - JSON Web Tokens (JWT)
* Backend Programming Language - Java
* Backend RESTful API - Dropwizard
	* JSON Serialization - Jackson
	* REST API Framework - Jersey
	* Web Server and Servlet Container - Jetty
* Object to Relational Mapper - Hibernate ORM
* RDBMS - PostgreSQL
* Deployment Platform - Docker

The solution includes a number of support components such as Guava for code optimization and Flyway for the initial data model deployment.