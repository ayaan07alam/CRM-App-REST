# CRM-App-REST

## Overview

This is a Customer Relationship Management (CRM) application built using Spring Boot, Thymeleaf, Spring Security, and MySQL. It provides a platform for managing customer interactions, tracking leads, and maintaining customer information.
![image](https://github.com/ayaan07alam/CRM-App-REST/assets/77435615/45cbbe3a-cc14-4c62-90ab-4c2e39f6a378)

## Features

- **User Authentication:** Secure user authentication and authorization with Spring Security.
- **Customer Management:** Create, update, and delete customer records.
- **Lead Tracking:** Manage leads and track their progress through the sales pipeline.
- **MySQL Database:** Utilizes MySQL for data storage.

## Prerequisites

Before running the application, make sure you have the following installed:

- Java Development Kit (JDK) 8 or higher
- MySQL Database
- Maven

## Setup

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/your-username/crm-application.git
   cd crm-application

2. Configure MySQL Database:

Create a MySQL database for the application.
Update src/main/resources/application.properties with your database configuration.

3. Build and Run:
   mvn clean install
   java -jar target/crm-application.jar

4. Access the Application:
Open a web browser and navigate to http://localhost:8080

Configuration
Database configuration can be modified in src/main/resources/application.properties.
Customize Thymeleaf templates in the src/main/resources/templates directory.
Contributing
If you'd like to contribute to the project, please follow the standard GitHub fork and pull request workflow.

License
This project is licensed under the MIT License.

For any inquiries, please contact [ayaanalam78670@gmail.com].



