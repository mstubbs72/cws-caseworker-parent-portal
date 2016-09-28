The Taborda CWS-NS ADQP prototype is hosted within Amazon AWS. We utilize the FedRAMP certified Amazon AWS US-WEST-2 environment located in a data center in Oregon. We have deployed the prototype across two AWS availabilty Zones. Availability Zones are isolated regions within the same data center connected by a low latency network fabric. Availability Zones create the ability to continue system operations even in the event of major infrastructure event. Depending on the availability requirements of our production systems, Taborda also has the experience to deploy infrastructure across mulitple regions (data centers).

The diagram below provides and overview of the infrastructure utilized to support the working prototype. In addition to the application environment, we also have deployed a continuous integration server to support automated build, test and deployments.

![Taborda Infrastructure Architecture](https://github.com/taborda-cws-prototype/cws-parent-portal/blob/master/designs/ADQP-InfrastructureArchitecture.png))

A high level description of the application deployment is provided below:

* The AWS Internet Gateway receives and HTTP/HTTPS requests. The Gateway provides security functions and also acts a load balancer between the application deployments across the AWS Availability Zones.
* Requests are received by NGINX (HTTP Server) supporting the front end JavaScript based application and RESTful based API calls to the backend (server side) application.
* The application servers (Dropwizard) receive API calls and provide business and data access services. The API layer is integrated with our PostgreSQL database and the CHHSA Open Data Portal (Socrata Open Data API - SODA)
* Data stored witin a PostgreSQL RDBMS backend.

Our infrastructure is supported by continuous monitoring supplied by Amazon AWS. In the event a server component fails, AWS will route traffic to the available path and restart the failed component. Due to our use of a RESTful based architecture server component restart is rapid and its stateless architecture promotes continued operations. 