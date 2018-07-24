Selenium Grid Setup using Docker-Compose:
As part of our Selenium Grid we need to have 1 hub and few nodes like chrome and firefox. We can define all these services in a file called docker-compose.yml file and bring the entire infrastructure up and running by using a single command. Docker provides a tool for that – Docker-Compose.

Please check the steps here for the installation of docker-compose.

Once installed, create a new directory and create a docker-compose.yml file with below content.

Selenium Grid is used to run our tests on different OS/browsers in parallel. It basically uses master-slaves (or hub-nodes) concept – where there is one master/hub and there are few slaves/nodes registered to the master/hub. When we send our tests to the master/hub for execution, based on the browser/OS requirements of the test, master will route the request to the appropriate nodes and get them executed. Thus it minimizes the overall execution time of the tests.


Commands to 
docker-compose up -d

docker-compose ps

docker-compose scale chrome=5

mvn clean test

sudo docker-compose down