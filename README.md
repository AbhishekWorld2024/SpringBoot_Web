# SpringBoot_Web
<h1>**Spring Boot Web Application with Login and User-Specific Details Pages**</h1>
This project is a Spring Boot web application with a simple login system that directs users to personalized detail pages based on their unique ID. The project demonstrates basic Spring MVC functionality with JSP for the view layer and includes conditional routing, handling login requests, and error handling.
**
Features**
**Login Page:** The initial page where users can input their ID, email, and password.
**Conditional Routing:**
If the ID is valid, the user is redirected to their designated details page.
If an invalid ID is provided, the user is redirected to an error page with a message indicating an incorrect ID.
**Details Pages:** Each valid user ID leads to a personalized profile page:
User 1: Displays details for "Abhishek Arugonda."
User 2: Displays details for "Dr. Emma Watson."
Error Page: Renders if an invalid ID is entered.

**Project Structure**
Controller: Handles requests and redirects users to appropriate views based on the input ID.
Model: Contains an Information class to manage user credentials.
View Layer: Uses JSP files for the login page, details pages, and error page.
**Setup**
Clone the repository.
Run the application on port 8099.
Access the login page at http://localhost:8099/LoginPage.
Test different IDs to view conditional navigation.

**WebController Class**
This WebController class is a core part of the application, handling user navigation based on login information and ID. The controller uses Spring MVC's @Controller annotation to manage incoming HTTP requests, rendering appropriate JSP views based on the login form submission and ID validation logic.

Code Breakdown
**Login Form Display (showLoginForm method):**

The showLoginForm method is mapped to @GetMapping("/LoginPage").
This method renders the LoginPage.jsp view where users can input their ID, email, and password.
It is responsible for presenting the login interface to users at the /LoginPage URL.
**Form Submission and Processing (processLoginForm method):**

The processLoginForm method is mapped to @PostMapping("/LoginPage") and processes login submissions.
It accepts id, Email, and Password as parameters via @RequestParam, along with a Model object to pass data to the view.

**Conditional Routing Logic:**
If the user's id is 1, the controller attaches the name "Abhishek" to the model and returns the Details.jsp view.
If the id is 2, the controller adds "Emma Watson" to the model and returns the Details2.jsp view.
If the id does not match any predefined IDs, it redirects the user to an error page, /error.
Error Page Display (showErrorPage method):

The showErrorPage method is mapped to @GetMapping("/error").
It returns the error.jsp view, displaying an error message for users who provided an incorrect ID.
This provides user-friendly feedback for invalid login attempts.
**Features and Use Cases**
Dynamic Rendering: The controller dynamically routes users to different pages based on their ID, demonstrating simple but effective conditional logic within a Spring MVC application.
Model Data Passing: User details (such as Email and id) are passed to the view layer using the Model object, enabling data-driven rendering on the JSP pages.
Error Handling: Redirects to a dedicated error page to inform users of invalid credentials in a clear and user-friendly way.
Example Workflow
User Accesses Login Page:
A user navigates to http://localhost:8099/LoginPage, and LoginPage.jsp is displayed.
User Submits Login Form:
The form data is posted to /LoginPage.
If the ID matches 1, the user is redirected to the Details.jsp page with personalized details for "Abhishek."
If the ID matches 2, the user is redirected to Details2.jsp with details for "Emma Watson."
If the ID is invalid, the user is redirected to /error.
This class provides a straightforward, user-specific login routing system using Spring MVC, making it an ideal demonstration of condition-based navigation in a Spring Boot application.

**Technologies Used**
Spring Boot: Handles back-end logic and server setup.
Spring MVC: Manages the controller and routing logic.
JSP: Renders HTML pages for login, user details, and error pages.
BCrypt: (Optional) Could be integrated for password encoding.
This application demonstrates a basic login and conditional navigation system built with Spring Boot and JSP, ideal for understanding Spring MVC's web capabilities.
