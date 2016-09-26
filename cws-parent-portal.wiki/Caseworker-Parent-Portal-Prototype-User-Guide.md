## User Guide
This guide is intended to help first-time users through the registration process and provide an overview of the basic features. For a suggested testing workflow, please see this [page](https://github.com/taborda-cws-prototype/cws-parent-portal/wiki/Suggested-Testing-Workflow).

### URL
[http://parentportal.tabordasolutions.net/](http://parentportal.tabordasolutions.net/)

### Create Profile

In order to use the Parent Portal, you first must register. The registration page URL is: [http://parentportal.tabordasolutions.net/#/create-profile](http://parentportal.tabordasolutions.net/#/create-profile)
You can also access the registration page from the [Login Screen](http://parentportal.tabordasolutions.net/) by clicking the "Register" link.

![Create Profile screen](https://github.com/taborda-cws-prototype/cws-parent-portal/blob/master/Screen%20Shot%202016-06-09%20at%2010.02.42%20PM.png)

### Logging In
Once registered, log in from the [Login Screen](http://parentportal.tabordasolutions.net/) with your email address and password. 
![Log In Screen](https://github.com/taborda-cws-prototype/cws-parent-portal/blob/master/Screen%20Shot%202016-06-09%20at%206.49.03%20PM.png)

### Home Page
After logging in, the home page will be displayed. The main region of the portal home page is a tab set that includes:

* MESSAGES
* FOSTER AGENCIES

![Messages Screen](https://github.com/taborda-cws-prototype/cws-parent-portal/blob/master/Screen%20Shot%202016-06-09%20at%207.03.00%20PM.png)

### Messages
#### New Message
![New Message](https://github.com/taborda-cws-prototype/cws-parent-portal/blob/master/Screen%20Shot%202016-06-09%20at%207.07.22%20PM.png)
To send a new message:

1. Click on the **NEW MESSAGE** button
2. Select a recipient from the **Send to** list
3. Enter a subject
4. Enter the message
5. Click the **SEND** button

#### Case Worker Messages

In order to exercise the messaging feature of interacting with a case worker, we included a way for a case workers to utilize the parent portal for messaging with parents. 

1. Register two accounts (details below)
	* Parent
	* Case worker (email domain must be **cws.com** - e.g. **bob@cws.com**).

2. Open two different browser windows (using different browser platforms) and login with the Parent account on one, and the Case Worker account on the other.
3. Send / receive messages using both accounts to review the functionality.

***IMPORTANT NOTES:*** For the prototype, we did not implement robust session management, so logging in with different accounts on the same browser platform can yield odd results (looks like all messages were sent to/from the same account). Using two separate browser platforms (e.g. Chrome, Safari, FireFox, IE, etc.) will prevent that issue.

#### Viewing Messages
Messages are displayed in the **Inbox** and **Sent** lists. Select the list you wish to view from the navigation menu on the left. 

**Mobile UI Note:** On the Mobile UI, the Inbox and Sent navigation is on the menu (Icon with 3 horizontal bars at upper-left edge of screen).

##### Inbox
![Messages Screen](https://github.com/taborda-cws-prototype/cws-parent-portal/blob/master/Screen%20Shot%202016-06-09%20at%207.03.00%20PM.png)

##### Sent 
![Sent list](https://github.com/taborda-cws-prototype/cws-parent-portal/blob/master/Screen%20Shot%202016-06-09%20at%207.19.57%20PM.png)

**IMPORTANT NOTE:** The prototype UI does not refresh the messages list in real-time. To see messages received after a page is displayed, click on the alternate list (if on Inbox, click **Sent**; if on Sent, click **Inbox**) -- or refresh the browser.

#### Message thread
To see a message thread, click on an individual message.
![Individual message thread](https://github.com/taborda-cws-prototype/cws-parent-portal/blob/master/Screen%20Shot%202016-06-09%20at%207.26.51%20PM.png)

#### Printing Messages
Once a message is displayed, you can print the message details by clicking on the print button (upper-right) and completing the print dialog.

### Viewing Foster Agencies in your Zip Code
![View Foster Agencies in Zip Code](https://github.com/taborda-cws-prototype/cws-parent-portal/blob/master/Screen%20Shot%202016-06-09%20at%207.10.09%20PM.png)
To view Foster agencies in your Zip code, select the **FOSTER AGENCIES** tab at the upper-right of the portal.

### Update Profile
To update your profile, click on the user icon at the upper-right corner of the portal. This will display a dropdown list with the following items:

* Update profile
* Help (not implemented for the prototype)
* Log Out

Click on **Update profile**. 
![Profile icon](https://github.com/taborda-cws-prototype/cws-parent-portal/blob/master/Screen%20Shot%202016-06-09%20at%207.12.24%20PM.png)

Make your changes and click on the **UPDATE** button.
![screenshot for update profile screen](https://github.com/taborda-cws-prototype/cws-parent-portal/blob/master/Screen%20Shot%202016-06-09%20at%207.16.38%20PM.png)
### Log Out
To log out, click on the user icon at the upper-right corner of the portal. This will display a dropdown list with the following items:

* Update profile
* Help (not implemented for the prototype)
* Log Out

Click on **Log Out**. You will be taken to the [Login Screen](http://parentportal.tabordasolutions.net/).

