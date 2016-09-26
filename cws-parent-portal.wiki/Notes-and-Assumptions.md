* NOTE: The prototype implemented a simple authentication scheme that stores identity in the application database and passes the user token in response headers. A production-grade application  would implement SAML 2.0 or OATH solution with centralized user store decoupled from the application.

* NOTE: Some artifacts were checked in later due to infrastructure being built in parallel with the human-centered design process.

* NOTE: We developed unit tests during test-driven development, but only developed a sampling of unit/integration tests during defect fixes due to time constraints. In an actual production system, additional test scripts would be created.

* NOTE: When creating a profile, we are not validating that cities and/or zip codes are valid for the selected state.

* ASSUMPTION: We assumed that showing Foster Agency facilities that have been closed is not helpful for parents, so we filtered out closed agencies. Because we could not find a way to do "!closed" (not closed), we selected all that were "Licensed" -- this appears to provide the intended result.
