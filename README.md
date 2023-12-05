# Cars-Crud-Springboot
This project is a car Management System, a robust and user-friendly solution designed to revolutionize the way you handle car-related data. This project implements CRUD operations, allowing users to seamlessly Create, Read, Update, and Delete information about vehicles. With an intuitive interface, users can effortlessly add new cars, retrieve specific details, update information as needed, and remove outdated entries. 

## Table of Contents
* [General Information](#general-information)
* [Technologies Used](#technologies-used)
* [Setup](#setup)
* [Usage](#usage)
* [Screenshots](#screenshots)


## General Information
### Architecture of the project
The Model-View-Controller (MVC) architectural pattern is employed in our project to enhance the organization and maintainability of the codebase. This design pattern divides the application into three interconnected components:

- Model: Represents the data and business logic of the application. It encapsulates the application's state and ensures that any changes to the data trigger appropriate responses.
- View: Responsible for presenting the data to the users. It displays information from the Model and communicates user inputs back to the Controller. Views are designed to be modular and independent of the underlying application logic.
- Controller: Acts as an intermediary between the Model and View components. It processes user input from the View, updates the Model accordingly, and triggers the appropriate changes in the View. The Controller essentially manages the flow of data and ensures the separation of concerns.

### File structure
The file structure of the project is the following:
```
├── controller
|   ├── controlleur_admin.php
|   ├── controlleur_doctor.php
|   └── controlleur_user.php
├── model
|   ├── model_admin.php
|   ├── model_doctor.php
|   └── model_user.php
├── view
|   ├── view_admin
|   ├── view_doctor
|   └── view_user
├── styling.css
├── index.html
├── script.js
├── images.png
└── README.md
```


## Technologies Used
[![PHP](https://skillicons.dev/icons?i=java,springboot,docker,mariadb)](https://skillicons.dev)




## Setup
### Pre-Requisites
To set up this project you should install the following:
- XAMPP (apache, mysql)
- VSCODE (or any other IDE)

### Usage
To use the project you should do the following:
- Add the project to **'htdocs'** folder on the xampp environment.
- Create the database on phpmyadmin panel.
  * patients(**`id`**, **`email`**, **`password`**, **`first_name`**, **`last_name`**, **`sexe`**, **`date_of_birth`**)
  * maladies(**`id_maladie`**, **`name_of_maladie`**)
  * cathegories(**`id_cathegory`**, **`name_of_cathegory`**)
  * patient_maladie(**`id_patient`**, **`id_maladie`**)
  * forum(**`id`**, **`Description`**, **`Post`**, **`patient`**, **`id_categorie`**, **`statut`**, **`type`**)
  * answers(**`id_consultation`**, **`id_doctor`**, **`answer`**)
  * admins(**`id_admin`**, **`email`**, **`password`**, **`first_name`**, **`last_name`**)
  * doctors(**`id_doctor`**, **`email`**, **`password`**, **`first_name`**, **`last_name`**, **`sexe`**, **`id_cathegory`**)

## Screenshots
### Home Page
![Example screenshot](Screenshots/home.png)
### Admin dashboard 
![Example screenshot](Screenshots/Dashboard.png)
### Blog page
![Example screenshot](Screenshots/Blog.png)
### Consultations page
![Example screenshot](Screenshots/consultations.png)
