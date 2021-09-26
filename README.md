<h1>PatientOnBoarding WebApp</h1>
<h2>Project Description</h2>
<div>Our application name is PatientOnBoarding WebApp</div>
<div>   Admin, Doctor and Patient are the main users who can use this webapp. Admin will register all doctors along with their details and he can also able to see all the appointments bookied by the patients. Doctor can login into his account and he can add his available timings so that patients can book the appointment at that time. And doctor can also see his patient details.</div>
<div>   Patient can book the appointment of any doctor based upon the doctor available timings. And he can also able to see the all the appointment details that he has booked.</div>
</br>
<li> Used spring starter project to build the application.</li>
<li> Used spring data JPA to connect to database PostgreSQL that I have used.</li>
<li> Followed DAO design pattern.</li>
<li> Created interactive web pages using Angular as front end.
      <h4>Note :</h4><a href="https://github.com/SudharaniKonari/PatientOnBoarding_AngularProject/" target="_blank">click here</a> to go to my angular project.</h4></li>
<li> Tested all the functions using JUnit4.</li>
<li> Implemented logging by Log4j.</li>
 <h2>Technologies Used </h2>
   <li>Java</li>
   <li>Angular</li>
   <li>SpringBoot</li>
   <li>SpringData</li>
   <li>PostgreSQL</li>
   <li>JSON</li>
<h3>Features</h3>
<h4>As an Admin :</h4>
  <li> I can register a doctor such that he can get his id and password of his account through gmail.</li>
  <li> I can see all the appointments booked by the patients along with the doctor details.</li>
  <li> I can see all the patients and doctors along with their full details.</li>
<h4>As a Doctor :</h4>
  <li> I can login into the app using id and password which are sent by admin through gmail.</li>
  <li> I can update my available timings so that patients can book my appointment.</li>
  <li> I can see the patient details of those who has booked my appointment.</li>
<h4>As a Patient :</h4>
  <li> I can login into my account and if I don't have any account in this webapp, I can register here and will get the details of id and password through gmail.</li>
  <li> I can see the available doctors so that I can book appointment from those available timings.</li>
  <li> I can see all the appointments that I have booked.</li>

<h2>Getting Started</h2>
<div> First run the spring boot project in eclipse IDE and then run angular project(download angular project <a href="https://github.com/SudharaniKonari/PatientOnBoarding_AngularProject/" target="_blank">click here</a>) in Visual Studio code by using command "ng serve" to build the project or "npm start" to start the project.
Next go to web browser and type localhost:(portNumber) to the web application. A doctor can update his available timings and can see all his patient details. A patient can register for new account and can book appointment.</siv>
<h3>Installation and Run</h3>
  <h4>Step1 :</h4> 
    <div>Import this project using Github Desktop or download zip file. If you download this zip file, then extract all files and go to eclipse IDE then go to file --> Import --> Maven Project ---> select project folder --> Import. Change configurations of database in application.properties and also change mail id and password to sent mails from your gmail account.</div>
   <h4>Step2 :</h4> 
    <div>Import angular project from the link given above by Gitub Desktop or by downloading zip file. If you download zip file , extract all files and go to Visual Studio Code --> file --> open folder (select folder that you have extracted). Now open terminal in Visual Studio Code and type ngServe to build the application.
    Now you can run the project in browser and you can see results there.</div>
 <h2>Usage</div>
 <div>After installing both spring and angular projects, first login as an Admin and register the doctor details. Later by using doctor details, login in as a doctor and add some available timings.</div>
 <div>In order to login as a patient, first register all patient details in sign up page and then login as a patient where you can see the available timings of a doctor. Then book that appointment and check once whether the appointment is booked or not by clicking on all appointments.</div>
 <h2>Bug/Feature Request</h2>
  If you find a bug (unable to running the project due to any error or having issues in downloading project), kindly open an issue by including your search query and expected result.

  <h2>Contributor</h2>
    PatientOnBoarding WebApp is a group project. We are of 6 members combinely divided our work and later integrated all to make this project.
  <li>Haritha Prabhakaran</li>
  <li>Meena Govindaraj</li>
  <li>Mubasheer</li>
  <li>Pavithra Nagarajan</li>
  <li>Soumya Govindraj/li>
  <li>Sudharani Konari</li>
    <h3>My role in this project</h3>
    <li> Updating Doctor Availabilities by setting date and time.</li>
        <li> Registration of a doctor which is done by admin.</li>
        <li> Admin login and doctor login pages.</li>
        <li> Obtaining the details of the patient who has booked the appointment. </li>




