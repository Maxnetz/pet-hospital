# Pet Hospital Project

## Architecture

![Untitled](Pet%20Hospital%20Project%209413a8ee4a1b4e0094565600fc8ade62/Untitled.png)

## Database Design

![Screenshot 2566-06-26 at 16.46.14.png](Pet%20Hospital%20Project%209413a8ee4a1b4e0094565600fc8ade62/Screenshot_2566-06-26_at_16.46.14.png)

source: [https://dbdiagram.io/d/64995d3302bd1c4a5e10cd2e](https://dbdiagram.io/d/64995d3302bd1c4a5e10cd2e)

```
 +- pet-hospital
     +- com.company.pethospital
         +- PetHospitalApplication.java
         |
         +- models
         |   +- Billing.java
         |   +- MedicalRecord.java
         |   +- Owner.java
         |   +- Pet.java
         |
         +- controllers
         |   +- HomeController.java
         |   +- BillingController.java
         |   +- MedicalRecordController.java
         |   +- OwnerController.java
         |   +- PetController.java
         |
         +- services
         |    +- OwnerService.java
         |    +- OwnerServiceImpl.java
         |    +- PetService.java
         |    +- PetServiceImpl.java
         |
         +- repositories
         |   +- BillingRepository.java
         |   +- MedicalRecordRepository.java
         |   +- OwnerRepository.java
         |   +- PetRepository.java
         |
         +- configs
         |
         +- utils
```
