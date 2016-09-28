#U.S. Digital Services Playbook 
Per the RFI, we followed all of the applicable playbook plays for the prototype. 

## Play 1: Understand what people need
**Checklist** |**What we did**
:------------- |:-------------
Early in the project, spend time with current and prospective users of the service  | We met with users that represented the initial anticipated audience types based on the high level requirements in the RFI, including Taborda staff that are not involved with the project (as simulated users), and one actual Child Protective Services case worker.
Use a range of qualitative and quantitative research methods to determine people’s goals, needs, and behaviors; be thoughtful about the time spent |	Our user researcher met with our user groups and elicited information about their preferences, habits, expectations for easy-to-use systems, and their preconceptions about the processes related to child protective cases. The user researcher used this information to identify target audiences and their goals/needs/behaviors. *(2c)*
Test prototypes of solutions with real people, in the field if possible |	Our user researcher facilitated a walkthrough of an early wireframe prototype to get feedback 
Document the findings about user goals, needs, behaviors, and preferences |	During our human centered design phase for ideation, we conducted 1:1 and group workshops with target user groups and gathered feedback on their goals, needs, preferences and behaviors.
Share findings with the team and agency leadership |	Feedback was captured and posted to the GitHub repository.
Create a prioritized list of tasks the user is trying to accomplish, also known as "user stories"	| The product owner developed user stories from the feedback gathered during ideation. These were used to form the prioritized product backlog. *(2c)*
As the digital service is being built, regularly test it with potential users to ensure it meets people’s needs |	Periodic user testing of wireframes, early functioning prototypes, and iteration increments was conducted. We used low and high fidelity prototypes iteratively, with user testing between iterations. *(2f)*
**Key Questions** |**Answers**
Who are your primary users?	| Parents interacting with Child Protective Services (CPS). We added a "test harness" to create CPS worker accounts in the system to demonstrate the abilty to send and recieve messages within the prototype.
What user needs will this service address? |	Provide tools for parents to communicate with case workers and easily access resources.
Why does the user want or need this service? |	Parents are understandably anxious about interacting with CPS and this application provides a less-intimidating interaction with case workers and the CPS process.
Which people will have the most difficulty with the service? | People with little or no computer experience
Which research methods were used?	 | 1:1 and group interviews, focus groups, card sorting
What were the key findings?	 | Functionality was more important than flair. Users wanted the application to follow well-known paradigms.
How were the findings documented?  | Where can future team members access the documentation?	 | Users were given the ability to provide comments directly in the prototype tool (InVision); User researcher compiled feedback and published to the project's GitHub repository.
How often are you testing with real people? | Every 2 or 3 days on this engagement.


## Play 2: Address the whole experience, from start to finish
**Checklist** |**What we did**
:------------- |:-------------
Understand the different points at which people will interact with the service – both online and in person |	We received input from our user test group, primarily the actual case worker, regarding how parents interact with CPS -- both online and in person. *(2c)*
Identify pain points in the current way users interact with the service, and prioritize these according to user needs | Currently there is no online interaction between parents and case workers, which causes unnecessary delays in communication. *(2c)*
Design the digital parts of the service so that they are integrated with the offline touch points people use to interact with the service | One example is our inclusion of print functionality for messages and agency locations so users can take printed copies with them to the agency facility (if they don't have a mobile device).
**Key Questions** |**Answers**
What are the different ways (both online and offline) that people currently accomplish the task the digital service is designed to help with? | We conducted in person user interviews with an actual CPS worker and staff that were not participating in the prototype develop effort to represent Parent users of the system.
Where are user pain points in the current way people accomplish the task? | Time delays in communications; lack of records relating to communications
Where does this specific project fit into the larger way people currently obtain the service being offered?	| It modernizes a communication channel between parents and case workers
What metrics will best indicate how well the service is working for its users? | User feedback; user satisfaction; adoption rates

## Play 3: Make it simple and intuitive
**Checklist** |**What we did**
:------------- |:-------------
Use a simple and flexible design style guide for the service. Use the U.S. Web Design Standards as a default | 	We implemented a simple, responsive and accessible online Design Style Guide (DSG) using bootstrap, html, sass and css. As the style and layouts evolved through the iterations and feedback loops with users, the guide was automatically updated. *(2e)*
Use the design style guide consistently for related digital services | 	The style guide html and css are intended to be utilized by other related applications.
Give users clear information about where they are in each step of the process | Our application does not have multi-step processes,  but all submissions result in a response to notify the user of the outcome of the activity being performed.
Follow accessibility best practices to ensure all people can use the service | We continuously utilized WAVE (from WebAIM) to ensure WCAG 2 (AA) compliance. On a longer term engagement, we would implement automated accessibility testing as part of the continuous integration process, likely with Pa11y.
Provide users with a way to exit and return later to complete the process | Our application does not have multi-step processes, but the application shows the current status each time the user logs back in.
Use language that is familiar to the user and easy to understand | Our user testing pointed out words that we initially used that were unclear to non-technical users. This feedback was used to change the wording in subsequent iterations.
Use language and design consistently throughout the service, including online and offline touch points | 	As the CPS agency letterhead consistently displays their logo, we prominently displayed the CWS-DS logo on the application.
**Key Questions** |**Answers**
What primary tasks are the user trying to accomplish? | Create and manage their profile; View residential facilities in their ZIP code; Communicate with case workers via secure messaging system (inbox,outbox)
Is the language as plain and universal as possible? | Our user testing verified that we employed plain language.
What languages is your service offered in? | Our prototype is currently implemented in English, but our framework can easily leverage online translation services and tools to meet the requirement of the 22 threshold languages as identified by the State of California 
If a user needs help while using the service, how do they go about getting it? | Our prototype includes tooltips for design choices and features that were envisioned but not implemented in the current release.
How does the service’s design visually relate to other government services? | We incorporated the CWS-DS logo and color theme to provide brand continuity.


## Play 4: Build the service using agile and iterative practices
**Checklist** |**What we did**
:------------- |:-------------
Ship a functioning “minimum viable product” (MVP) that solves a core user need as soon as possible, no longer than three months from the beginning of the project, using a “beta” or “test” period if needed	 | We focused on the MVP and placed the remaining stories in the icebox (low-priority backlog)
Run usability tests frequently to see how well the service works and identify improvements that should be made	| We incorporated usability tests frequently at each sprint review and often mid-sprint with users. *(2f)*
Ensure the individuals building the service communicate closely using techniques such as launch meetings, war rooms, daily standups, and team chat tools | Our team collaborated in a large meeting room and via Slack. Our daily scrum meetings were facilitated both in person and via dial-in and were kept to 15 minutes. Many team hack sessions were conducted to collaboratively develop pieces of working software.
Keep delivery teams small and focused; limit organizational layers that separate these teams from the business owners | Our team comprised 4 developers (including one UX designer/developer), one Scrum Master, one User Researcher/Usability Tester, and the Product Manager
Create a prioritized list of features and bugs, also known as the “feature backlog” and “bug backlog”	| Our Product Manager developed and prioritized user stories in the product backlog. 
Use a source code version control system | We utilized GitHub for our source code repository. *(2m)*
Give the entire project team access to the issue tracker and version control system | All team members had access to PivotalTracker and GitHub.
Use code reviews to ensure quality | Frequent code reviews were conducted amongst development team members.
**Key Questions** |**Answers**
How long does it take for a production deployment? | Our automated continuous integration pipeline (Jenkins / Docker) completes a build/deploy cycle within minutes.
Which version control system is being used? | GitHub
How are bugs tracked and tickets issued? What tool is used? | PivotalTracker
How is the feature backlog managed? What tool is used? | PivotalTracker
How often do you review and reprioritize the feature and bug backlog? | 	At least once per sprint, typically 2-3 times per sprint
How do you collect user feedback during development? How is that feedback used to improve the service?	| Notes taken during focus group sessions and via the feedback feature in the InVision prototyping tool.
At each stage of usability testing, which gaps were identified in addressing user needs?	| Users identified inefficiencies and confusing paths in the early workflow design. Subsequent iterations improved that flow, and user testing verified the changes were effective.

## Play 5: Structure budgets and contracts to support delivery
**Key Questions** |**Answers**
:------------- |:-------------
What is the scope of the project? What are the key deliverables? | 3 weeks; Working prototype meeting feature requirements; Follow RFI technical approach requirements
What are the performance metrics defined in the contract (e.g., response time, system uptime, time period to address priority issues)? | Repository will be available for 6 months; Prototype and artifacts will be preserved without modification until at least 30 days after vendor pool selection. 

## Play 6: Assign one leader and hold that person accountable
**Checklist** |**What we did**
:------------- |:-------------
A product owner has been identified | Brendan McGuire was identified as the product owner
All stakeholders agree that the product owner has the authority to assign tasks and make decisions about features and technical implementation details | Brendan was assigned as leader and given authority, responsibility, and accountability for the quality of the prototype. *(2a)*
The product owner has a product management background with technical experience to assess alternatives and weigh tradeoffs | Brendan has over 16 years of technical and product management experience implementing and managing product development engagements.
**Key Questions** |**Answers**
Who is the product owner?	| Brendan McGuire
What does it take for the product owner to add or remove a feature from the service? | Brendan prioritized work through product backlog grooming and sprint planning. 

## Play 7: Bring in experienced teams *(2b)*
**Checklist** |**What we did**
:------------- |:-------------
Member(s) of the team have experience building popular, high-traffic digital services | Most of our team members have been implementing high-traffic and mission-critical digital services
Member(s) of the team have experience designing mobile and web applications | Our Visual Designer and Front End Web Developers have experience designing and implementing modern, responsive mobile and web applications.
Member(s) of the team have experience using automated testing frameworks | Our team members have implemented many projects using automated testing frameworks.
Member(s) of the team have experience with modern development and operations (DevOps) techniques like continuous integration and continuous deployment | Our team members have implemented many projects using modern development and DevOps techniques including continuous integration and continuous deployment.
Member(s) of the team have experience securing digital services | Our team members have implemented many projects implementing modern security frameworks, such as SAML and OAuth.

## Play 8: Choose a modern technology stack
**Checklist** |**What we did**
:------------- |:-------------
Choose software frameworks that are commonly used by private-sector companies creating similar services | We selected modern open source frameworks and tools (Angular.js, Bootstrap, Java, Jersey, Jackson, Hibernate ORM, PostreSQL).  *(2i)* 
Whenever possible, ensure that software can be deployed on a variety of commodity hardware types| Our prototype is deployed in Linux/Docker - it will deploy the same on a variety of hardware platforms. The UI was developed and tested to work on multipe devices using a responsive design. *(2h)* 
Ensure that each project has clear, understandable instructions for setting up a local development environment, and that team members can be quickly added or removed from projects | We developed clear and understandable setup and deployment instructions. The deployment process is simplified using Docker Composer.
Consider open source software solutions at every layer of the stack | Our entire application stack is open source. *(2i)* 
**Key Questions** |**Answers**
What is your development stack and why did you choose it? | Our stack is: Bootstrap, Javascript, Angular, jQuery, SASS, Font-awesome, JAWT, Guava, Gulp, WAVE, NGINX, Java, Dropwizard, Jetty, Jersey, Jackson, Hibernate ORM, Gradle, Flyway, PostgreSQL, GitHub, Jenkins, Docker, Protractor, Jasmine, Junit 4, and Mockito.
Which databases are you using and why did you choose them? | We selected PostgreSQL due its large feature base and open source licensing. We elected to utilize a RDBMS as this data structure is conducive for both application functions and reporting needs typically encountered within HHS based applications.
How long does it take for a new team member to start developing? | Less than an hour.

## Play 9: Deploy in a flexible hosting environment
We deployed to Amazon Web Services (AWS), which supports all of these aspects.  *(2j)*

**Checklist** |**What we did**
:------------- |:-------------
Resources are provisioned on demand | Resources are provisioned in our IaaS through a console and API.
Resources scale based on real-time user demand |  Through the use of the AWS load balancer auto-scaling to meet real-time user demand can be configured. 
Resources are provisioned through an API | Our continuous integration automation integrates with AWS API for provisioning and configuration.
Resources are available in multiple regions| Our prototype application is deployed in an AWS environment in Oregon. The data center has access points in numerous locations across the United States for WAN performance. In an actual production deployment resources can be deployed to multiple regions (data center) depending on availability requirements.
We only pay for resources we use | Our environment costs are based on per minute metering. Resources can be quickly scaled up or down depending on operating and development environment needs.
Static assets are served through a content delivery network | We did not configure a content delivery network (CDN) for the prototype due to the low user load. Amazon AWS provides for the deployment of a CDN through its numerous edge network points.
Application is hosted on commodity hardware| AWS utilizes an underlying commodity hardware based infrastructure. Our Linux and Docker based deployment allows deployment on commodity hardware and desktop platorms.
**Key Questions** |**Answers**
Where is your service hosted? | The prototype is hosted in Amazon Web Services (AWS) US-EST-2 (Oregon) data center.
What hardware does your service use to run? | As an IaaS consumers are abstracted from the underlying hardware. AWS utilizes engineered infrastructure based on commodity servers.
What is the demand or usage pattern for your service? | TBD in future sprint(s)
What happens to your service when it experiences a surge in traffic or load? | In an actual production environment, we would configure auto-scaling to add server during a surge and remove them as workload is reduced.
How much capacity is available in your hosting environment? | AWS provides an extremely large capacity within reach Region (data center). Large scale applications (e.g. NetFlix) utilize AWS. Amazon also provides for scalability by deploying application across Regions.
How long does it take you to provision a new resource, like an application server? | Minutes
How have you designed your service to scale based on demand? | Datadog monitoring triggers autoscaling when predertimined thresholds are reached
How are you paying for your hosting infrastructure (e.g., by the minute, hourly, daily, monthly, fixed)? | Metered by minute
Is your service hosted in multiple regions, availability zones, or data centers? | Multiple availability zones: US-WEST-2B & US-WEST-2C
In the event of a catastrophic disaster to a datacenter, how long will it take to have the service operational? | A single datacenter outage will not affect the operation of the application
What data redundancy do you have built into the system, and what would be the impact of a catastrophic data loss? | Our PostgreSQL database is replicated across AWS Availability Zones via the Relational Database Services. Failure of a single Availability Zone does not affect system availabilty or create data loss.
How often do you need to contact a person from your hosting provider to get resources or to fix an issue? | Resources are provisioned through a self-service portal and autoscaling. Fix support support is available as needed, but has not been necessary in our experience.

## Play 10: Automate testing and deployments 
**Checklist** |**What we did**
:------------- |:-------------
Create automated tests that verify all user-facing functionality | We used Test Driven Development (TDD) techniques that include unit tests in the automated build process. *(2k)*
Create unit and integration tests to verify modules and components | Both automated unit and integration tests are included in our continuous integration process (Jenkins). *(2l)*
Run tests automatically as part of the build process | Jenkins automatically executes unit and integration tests as part of the build process  *(2l)*
Perform deployments automatically with deployment scripts, continuous delivery services, or similar techniques	| Jenkins automatically deploys successful builds
Conduct load and performance tests at regular intervals, including before public launch	| In an actual production project, we would incorporpate performance/load testing in our continuous integration pipeline.
**Key Questions** |**Answers**
What percentage of the code base is covered by automated tests? | Automated testing covers major features and business processes within the application. In an actual production effort, we would create additional automated tests to address more complex testing scenarios. Our TDD based practice used on projects incrementally expands our library of tests over time.
How long does it take to build, test, and deploy a typical bug fix? | Minutes
How long does it take to build, test, and deploy a new feature into production?| 1 sprint
How frequently are builds created?	Each commit; Many times each day | Many times each day. Over our 15 day development cycle we completed over 120 builds.
What test tools are used?	| Protractor; Jasmine; Junit 4; Mockito; WAVE
Which deployment automation or continuous integration tools are used? | Jenkins; Docker
What is the estimated maximum number of concurrent users who will want to use the system| Targeting 200 for prototype purposes
How many simultaneous users could the system handle, according to the most recent capacity test? | Due to limited time we did not conduct performance/load testing. In an actual production project we incorporate performance/load testing into our continuous integration pipelines. Our application is deployed over mulitple virtual servers and will scale beyond the anticipated load generated during the prototype evaluation.
How does the service perform when you exceed the expected target usage volume? Does it degrade gracefully or catastrophically?	| Our infrastructure architecture supports auto-scaling of the underlying servers. Additionally, thresholds are in place to preserve a percentage of capacity during rolling deployments of the application.
What is your scaling strategy when demand increases suddenly| When Datadog monitoring detects demand has hit predetermined threshold, triggers AWS to scale up more capacity

## Play 11: Manage security and privacy through reusable processes
**Checklist** |**What we did**
:------------- |:-------------
“Pre-certify” the hosting infrastructure used for the project using FedRAMP | AWS is FedRAMP certified. Our prototype also implemented application security using JSON Web Tokens. In an actual production application additional security measures would be taken including additional application security controls, data encryption and security event monitoring. *(2j)*
**Key Questions** |**Answers**
Does the service collect personal information from the user? How is the user notified of this collection? |	Yes: Name and Email for registration purposes via a web form. In an actual production system a statement regarding the collection and safeguarding that is approved by the State of California would be included in the Profile page. 
Does it collect more information than necessary? Could the data be used in ways an average user wouldn't expect?	| No; No
How does a user access, correct, delete, or remove personal information? | Users have the ability to create and update PII. In actual production system a feature would be created allowing users to request purge of their account.
Will any of the personal information stored in the system be shared with other services, people, or partners? | No

## Play 12: Use data to drive decisions 
**Checklist** |**What we did**
:------------- |:-------------
Monitor system-level resource utilization in real time | We employ Datadog and Pagerduty to provide real-time monitoring. *(2n)*
**Key Questions** |**Answers**
How does your team receive automated alerts when incidents occur? | Datadog sends automated alerts as needed

## Play 13: Default to open
**Checklist** |**What we did**
:------------- |:-------------
Ensure that data from the service is explicitly in the public domain, and that rights are waived globally via an international public domain dedication, such as the “Creative Commons Zero” waiver | Data from our prototype is not proprietary.
Ensure that we maintain the rights to all data developed by third parties in a manner that is releasable and reusable at no cost to the public | The State owns all software developed by Taborda as part of this prototype.
When appropriate, publish source code of projects or components online | The source code and artifacts are provided in GitHub.
**Key Questions** |**Answers**
How are you collecting user feedback for bugs and issues? | We included a feedback link/page in mockups. To be implmented in future sprint(s)
