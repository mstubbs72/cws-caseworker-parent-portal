The primary intended audience for the prototype is parents. In order to exercise the messaging feature of interacting with a case worker, we included a way for a case workers to utilize the parent portal for messaging with parents. 

1. Register two accounts (details below)
	* Parent
	* Case worker (email domain must be **cws.com** - e.g. **bob@cws.com**).

2. Open two different browser windows (using different browser platforms) and login with the Parent account on one, and the Case Worker account on the other.
3. Send / receive messages using both accounts to review the functionality.

***IMPORTANT NOTES:*** For the prototype, we did not implement robust session management, so logging in with different accounts on the same browser platform can yield odd results (looks like all messages were sent to/from the same account). Using two separate browser platforms (e.g. Chrome, Safari, FireFox, IE, etc.) will prevent that issue.

Also, the prototype UI does not refresh the messages display list in real-time. After sending a message from one account, refresh the browser for the other user account to see the new message. 