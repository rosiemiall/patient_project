### Patient Room and Bed Management System

This project aims to provide a simple yet efficient solution for managing patient rooms and beds within a healthcare facility. It offers functionalities to record patient information, assign them to available beds, and retrieve data through HTTP requests.

#### Features:
1. **Record Keeping**: Store information about patient rooms, beds, and the patients occupying them.
2. **Retrieve Data**: Easily fetch information about all rooms, beds, and patients via GET requests.
3. **Add New Patient**: Utilise POST requests to create a new patient entry in the system.
4. **Assign Patient to Bed**: Assign a patient to a specific bed using a POST request, updating the bed's status accordingly.

#### How to Use:

1. **Setup**: Clone the repository and create the following databse.
```
createdb patient_db
```
2. **API Endpoints**:

| Method | Endpoint       | Description                                            |
|--------|----------------|--------------------------------------------------------|
| GET    | /rooms         | Retrieve a list of all rooms          |
| GET    | /rooms/{id}    | Retrieve a room by id          |
| GET    | /beds          | Fetch information about all beds           |
| GET    | /beds/{id}     | Fetch information a specific bed           |
| GET    | /patients      | Obtain details about all patients  |
| POST   | /patients/new-patient    | Create a new patient record, see below for request body                           |
| POST   | /beds/{bedId}/add-patient/{patientID}   | Assign a patient to an available bed.                  |

#### Example Usage:

1. To Create a new Patient:
```
{
    "name": "Rosie",
    "admissionDate": "29/03/2024",
    "dischargeDate": null
}
```
