## Deploying the Parent Portal Application

The Parent Portal Application consists of 3 mandatory components and an optional 4th component. The application requires

1. At least one instance of The CWS Parent Portal UI
1. At least one instance of the CWS Parent Portal API
1. A PostgreSQL database, version 9.4

A deployer may optionally choose to integrate a hardware or software load balancer to balance traffic between multiple
instances of the API and UI components and provide HTTP Transport Layer Security (TLS).

This guide documents the process to run the mandatory components as a series of [Docker][docker] containers based on
images published to the Parent Portal Container Registry.

### Prerequisites

1. [Docker Compose][dockercompose]
1. [AWS Command Line Interface][awscli]

### Deployment Procedures

Because Docker is a Linux-centric tool, instructions provided assume a Bash-compatible shell environment. The '%'
character represents a shell prompt in the provided instructions.

#### Create Deployment Directory

Make a new, empty directory for files related to the deployment and change to the directory:

	% mkdir -p ~/docker-compose/taborda-parent-portal && cd ~/docker-compose/taborda-parent-portal
	
#### Authenticate Docker to Parent Portal Container Registry

Use the aws ecr get-login command to authenticate Docker to the Parent Portal Container Registry:

	

Please use the exact credentials specified above. These correspond to a read-only user created specifically for
deployment.

Note: this process creates an authentication token that expires after 12 hours. Please execute these procedures again
if you experience authentication failures when pulling images with Docker Compose.

#### Create Docker Compose File

Docker Compose, a tool for defining and running multi-container Docker applications provides a simple mechanism for
defining and running multi-container applications.

Use your favorite editor to create a file called docker-compose.yml with the following content.



This configuration instantiates

* A database container, called db, based on the office PostgreSQL 9.4 Docker container
* An API container, called api, based on the latest version of the Parent Portal API container
* A UI container, called ui,  based on the latest version of the Parent Portal UI container

This configuration links the db and api containers, supplies database credentials to the db and api containers, and
configures the ui container environment and web server.

Lastly, this configuration binds the UI container web server to port 8080 and the API container web server to port 8081.

#### Create UI Environment File

The UI component requires configuration of the env.js file prior to deployment. Create a folder called ui, then use your favorite editor to create the ui/env.js file with the content below.

```Javascript
(function (window) {
    window.__env = window.__env || {};
    window.__env.baseurl = "http://dockerhost:8081/";
}(window));
```

Note that the path to this file is ui/env.js, relative to the deployment directory.

Also note that the UI is a Javascript application, contacting the API from a web browser at the host and port specified
in the ui/env.js file. The ```baseurl``` variable must be accessible to web browsers running the application. Insert
your own URL as the value of the ```baseurl``` variable.

#### Create the NGINX Configuration File

The UI component packages the open source [NGINX][nginx] web server. Use your favorite text editor to create the
ui/nginx.conf file with the content below.

```Nginx
user nginx;
daemon off;
worker_processes auto;
error_log /var/log/cws-parent-portal-ui/error.log;
pid /var/run/cws-parent-portal-ui.pid;

events {
  worker_connections 1024;
}

http {
  log_format  main  '$remote_addr - $remote_user [$time_local] "$request" '
    '$status $body_bytes_sent "$http_referer" '
    '"$http_user_agent" "$http_x_forwarded_for"';

  access_log  /var/log/cws-parent-portal-ui/access.log  main;

  sendfile            on;
  tcp_nopush          on;
  tcp_nodelay         on;
  keepalive_timeout   65;
  types_hash_max_size 2048;

  include             /etc/nginx/mime.types;
  default_type        application/octet-stream;

  server {
    listen       8080 default_server;
    server_name  _;
    root         /usr/local/share/cws-parent-portal-ui;

    location / {
    }
  }
}
```

Note that the path to this file is ui/nginx.conf, relative to the deployment directory.

#### Run Application

Start the Database container.

    % docker-compose start db

Stop the Database container.

    % docker-compose stop db

Use the docker-compose up command to run the system.

    % docker-compose up

Upon completion, the application will be running on port 8080 of the Docker host. Proceed to the user interface to
register a new user and begin using the application. (baseurl:8080)

[docker]: https://www.docker.com
[dockercompose]: https://docs.docker.com/compose/
[awscli]: https://aws.amazon.com/cli/
[nginx]: https://nginx.org/en/
