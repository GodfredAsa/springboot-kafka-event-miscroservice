### MINI-REAL WORLD MICROSERVICE PROJECT 
This is an exploratory project with microservices using spring boot with kafka.
The services are listed below. The producer Order-service makes a request and the consumers (Email and Stock Service) receives and 
log if received and state what to do next.

#### SERVICES
1. Base Domain: Houses all the DTOs and Models of the application to have a single unit of Models/DTOs
2. Email Service: Consumer 
3. Order Service: Producer
4. Stock Service : Consumer
5. Kafka :Download and kept in the project but in production it will be a server running else where and url pointed to.


### STARTING SERVICES 
1. `cd kafka-download` b4 running the codes below
2. START ZOOKEEPER `bin/zookeeper-server-start.sh config/zookeeper.properties`
3. START KAFKA SERVER `bin/kafka-server-start.sh config/server.properties`
4. START THE SPRING BOOT APPLICATION 