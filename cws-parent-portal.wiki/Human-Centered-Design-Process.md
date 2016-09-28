## Overview
For the Parent Portal Prototype, Taborda employed the Human-Centered Design process to elicit User Interface requirements that ultimately formed the Product Backlog. Human-Centered Design (also referred to as “Design Thinking”) involves three phases: Inspiration, Ideation, and Implementation. These phases include building a sense of empathy for the users of the system that helps the team envision and design innovative solutions to the problem at hand. Each phase usually involves a series of iterations that help to refine and develop desirable, feasible, and viable solutions. Due to the short timeframe and narrow scope for the prototype effort, only a few iterations were conducted. The product backlog was developed as user stories based on feedback captured during the Human-Centered Design process. On larger efforts, stories would likely be grouped into Epics and Themes.
![Human-Centered Design Overview Diagram](https://github.com/taborda-cws-prototype/cws-parent-portal-documentation/blob/master/human-centered-design/hdc-diagram.png)

##Inspiration Phase
During the Inspiration phase, the team worked through a series of exercises that helped foster understanding of the users and their needs by observing what they do and asking about their hopes and desires for the system. Exercises included:
### Developing a Design Challenge
The Design Challenge is a statement that describes the problem that needs to be solved. Our Design Challenge statement was:
*“How might we implement a modern, convenient app for parents to communicate with case workers and easily access resources?”*
### Interviews
1:1 and group interviews were used to gain insight into what the users want. We included one real case worker and a few staff members that are not participating on the project. In order to simulate target audience members, the staff were given the list of requirements from the RFI:
_“The working prototype will be an application that will allow parents of foster kids to establish and manage their    profile, and view children's residential facilities in their zip code, and communicate with the case worker via a private inbox. The working prototype will access open data through the HHS API to retrieve data about foster family agency locations that are nearby.”_
### Defining the Audience (User Research)
We developed 4 user personas for basic audience types based on the user research conducted by the product owner. 
### Brainstorming / Diverging / Converging
This session involved brainstorming solutions and ideas, and writing them on yellow post-its -- without any concern for viability or feasibility. We asked the group to “diverge”, which is the process of “going big” to not limit ideas based on budget, technology, or schedule constraints. We then worked with the group to “converge” the list of grand ideas back towards reality, now considering viability and feasibility. After the converge stage, we captured a photograph for artifact archival. We only conducted one iteration of this process due to the compressed nature of the effort, but typically might do two or three iterations to get to the “just right” state.

## Ideation Phase
During the Ideation phase, the team employed brainstorming, card sorting, and whiteboard sketch sessions to develop design ideas that met the design challenge. 

### Key insights we learned

Users told us:

* They didn’t like screens that were “too busy”
* The system needs to look “trustworthy”
* They want clean, simple pages that are easy to understand
* They want to be able to “put a face to a name” (for the case workers they interact with)
* They want to be able to see photos of their child(ren)
* They want to be able to print conversations with their case worker(s), including timestamps

Using these insights and best practices around current User Experience design, we brainstormed design concepts for the following high level user requirements:

* Create and manage a user profile
* Secure Log in
* Communicate with a case worker through a secure messaging system
* View residential foster agencies in the local zip code

### User Stories
The Product Manager developed the initial set of user stories using the high level requirements and the insights. The initial story content focused on the user needs statement. The stories were elaborated to include more detail and acceptance criteria as they were discussed during the subsequent whiteboard, wireframe review, and mockup review sessions with users.

* [Create Profile](https://github.com/taborda-cws-prototype/cws-parent-portal-documentation/wiki/User-Story:-Create-Profile)

* [View or Update Profile](https://github.com/taborda-cws-prototype/cws-parent-portal/wiki/User-Story:-View-or-Update-Profile)

* [Log In or Register](https://github.com/taborda-cws-prototype/cws-parent-portal-documentation/wiki/User-Story:-Log-in-or-Register)

* [Receive Messages](https://github.com/taborda-cws-prototype/cws-parent-portal-documentation/wiki/User-Story:-Receive-Messages)

* [Send or Reply to Message](https://github.com/taborda-cws-prototype/cws-parent-portal-documentation/wiki/User-Story:-Send-or-Reply-to-Message)

* [View Foster Agencies in Zip](https://github.com/taborda-cws-prototype/cws-parent-portal/wiki/User-Story:-View-Foster-Agencies-in-Zip)

### Whiteboard sessions
The design concepts were sketched on a whiteboard during 2 sessions with the internal team. The whiteboards were photographed for artifact archival, and then shown to users for feedback. The designs were modified directly on the whiteboard using the feedback. 
![User Stories sketched on whiteboard](https://github.com/taborda-cws-prototype/cws-parent-portal-documentation/blob/master/whiteboard/IMG_9665.jpeg)
![Whiteboard Wireframe 1](https://github.com/taborda-cws-prototype/cws-parent-portal-documentation/blob/master/whiteboard/wireframes1.jpeg)
![Whiteboard wireframe 2](https://github.com/taborda-cws-prototype/cws-parent-portal-documentation/blob/master/whiteboard/wireframes2.JPG)
![Whiteboard wireframe 3](https://github.com/taborda-cws-prototype/cws-parent-portal-documentation/blob/master/whiteboard/wireframes3.jpg)

## Implementation Phase
### Low Fidelity Wireframes
Low fidelity wireframes were developed in Balsamiq from the whiteboard. These were then used to get feedback from users. The wireframes were modified as feedback was received.
#### Profile Screen
![Balsamiq wireframe - Profile Screen](https://github.com/taborda-cws-prototype/cws-parent-portal-documentation/blob/master/wireframes/Registration%20Screen.png)
#### Login Screen
![Balsamiq wireframe - Login Screen](https://github.com/taborda-cws-prototype/cws-parent-portal-documentation/blob/master/wireframes/Login%20Screen.png)
#### Home Screen
![Balsamiq wireframe  - Home Screen](https://github.com/taborda-cws-prototype/cws-parent-portal-documentation/blob/master/wireframes/Home%20Screen.png)

#### Messages Screen
![Balsamiq wireframe - Messages Screen](https://github.com/taborda-cws-prototype/cws-parent-portal-documentation/blob/master/wireframes/Messages%20Screen.png)

#### Wireframe User Testing
[Wireframe User Testing can be found here.](https://github.com/taborda-cws-prototype/cws-parent-portal/wiki/Wireframe-User-Testing)

### High Fidelity Web Mockup Prototype
The team decided to put together higher fidelity mockups in PhotoShop based on the final Balsamiq wireframes. This was done for two main purposes:

* Allow users who had a hard time committing “thumbs up” or “thumbs down” to the wireframe designs because they couldn’t completely visualize the final screens
* Develop the [Design Style Guide (DSG)](https://parentportal.tabordasolutions.net/guidelines.html) for the development team in the form of a live HTML page with typical page elements incorporating CSS (SASS) style rules.

#### Profile Screen
![Profile](https://github.com/taborda-cws-prototype/cws-parent-portal-documentation/blob/master/designs/Profile.jpg)

#### Login Screen
![Login](https://github.com/taborda-cws-prototype/cws-parent-portal-documentation/blob/master/designs/login.jpg)

#### Home Screen (Messages Tab)
![Home-Messages](https://github.com/taborda-cws-prototype/cws-parent-portal-documentation/blob/master/designs/Home4.jpg)

#### Home Screen (Foster Agencies Tab)
![Home-Agencies](https://github.com/taborda-cws-prototype/cws-parent-portal-documentation/blob/master/designs/HomeFoster.jpg)

#### New Message Screen
![Messages](https://github.com/taborda-cws-prototype/cws-parent-portal-documentation/blob/master/designs/Home4NewMessage.jpg)

The PhotoShop mockups were exported to .png files, and used to quickly develop a clickable mockup prototype in InVision. Users were then given the URL for the InVision prototype and asked to navigate through the various screens and features. Feedback was captured in the InVision comments facility, and used during the development of the initial HTML pages.

[The clickable mockup prototype is located here.](https://github.com/taborda-cws-prototype/cws-parent-portal-documentation/tree/master/hi-fi-mockups) (See the [README.md](https://github.com/taborda-cws-prototype/cws-parent-portal-documentation/blob/master/hi-fi-mockups/README.md) for simple setup details.)

[The clickable mockup prototype feedback can be found here.](https://github.com/taborda-cws-prototype/cws-parent-portal-documentation/tree/master/user-feedback)

### HTML Pages
For each of the user stories, responsive HTML pages were developed based on the PhotoShop/InVision mockups, using the [Design Style Guide (DSG)](https://parentportal.tabordasolutions.net/guidelines.html) HTML elements and CSS. These pages were then wired up with Angular models and controllers as the development process continued. The HTML designs were tested on a variety of desktop and mobile devices for responsiveness and accessibility.