# Pet Hospital Project

## Architecture

![Untitled](Pet%20Hospital%20Project%209413a8ee4a1b4e0094565600fc8ade62/Untitled.png)

## Database Design

![Screenshot 2566-06-26 at 16.46.14.png](Pet%20Hospital%20Project%209413a8ee4a1b4e0094565600fc8ade62/Screenshot_2566-06-26_at_16.46.14.png)

source: [https://dbdiagram.io/d/64995d3302bd1c4a5e10cd2e](https://dbdiagram.io/d/64995d3302bd1c4a5e10cd2e)

```
com
 +- packagename
     +- projectname
         +- PetHospitalApplication.java
         |
         +- models
         |   +- Pet.java
         |   +- Owner.java
			   |   +- MedicalRecord.java
		     |   +- Owner.java
				 |   +- Billing.java
         |
         +- controllers
         |   +- OrderController.java
         |   +- UserController.java
         |
         +- services
         |    +- UserService.java
         |    +- OrderService.java
         |
         +- repositories
         |    +- UserRepository.java
         |    +- OrderRepository.java
         |
         +- configs
         |
         +- utils
```
