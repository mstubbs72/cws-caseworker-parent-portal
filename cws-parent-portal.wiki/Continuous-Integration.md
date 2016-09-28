Continuous integration is a critical supporting tool for agile development. Rapid build and deploy is foundational to sprint velocity and staff efficiency. A high level overview of our continuous integration and deploy process is provided below:

* Jenkins polls GitHut on a regular basis for commits
* Jenkins retrieves application code (API, UI) and performs automated builds and testing
* If builds pass test validation Jenkins deploys the new application version to Docker containers
* Jenkins deploys the matching UI and API builds to the prototype production environment

Jenkins maintains a manifest of build history. Detailed information on the results of builds and tests is maintained in the underlying tools.

As evidence of our use of continuous integration for build, test and deploy we have included the screenshots below of our continuous integration automation which was an important part of completing the prototype in our 15 day development period. 

Jenkins Dashboard![Jenkins Dashboard](https://github.com/taborda-cws-prototype/cws-parent-portal/blob/master/designs/JenkinsMainConsole.png)

Jenkins API Build![Jenkins API Build Console](https://github.com/taborda-cws-prototype/cws-parent-portal/blob/master/designs/JenkinsAPIConsole.png)

Jenkins UI Build![Jenkins API Build Console](https://github.com/taborda-cws-prototype/cws-parent-portal/blob/master/designs/JenkinsUIConsole.png)

Jenkins Deploy![Jenkins Deploy Console](https://github.com/taborda-cws-prototype/cws-parent-portal/blob/master/designs/JenkinsDeploy.png)