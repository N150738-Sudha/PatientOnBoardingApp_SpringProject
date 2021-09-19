<h1>PatientOnBoarding WebApp</h1>
<h2>Project Description</h2>
<h4>This webapp is used by a doctor to update his availability to patients and patients can check availability of a doctor and they can book appointment if the doctor is available.</h4>
<h3>Roles of each user</h3>
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
<h2>Technical Aspect</h2>
<li> Used spring starter project to build the application.</li>
<li> Used spring data JPA to connect to database PostgreSQL that I have used.</li>
<li> Followed DAO design pattern.</li>
<li> Created interactive web pages using Angular as front end.
      <h4>Note :</h4><a href="https://github.com/SudharaniKonari/PatientOnBoarding_AngularProject/" target="_blank">click here</a> to go to my angular project.</h4></li>
<li> Tested all the functions using JUnit4.</li>
<li> Implemented logging by Log4j.</li>
<h2>Working of PatientOnBoarding WebApp</h2>
<h4> First run the spring boot project in eclipse IDE and then run angular project(download angular project <a href="https://github.com/SudharaniKonari/PatientOnBoarding_AngularProject/" target="_blank">click here</a>) in Visual Studio code by using command "ng serve" to build the project or "npm start" to start the project.
Next go to web browser and type localhost:(portNumber) to the web application. A doctor can update his available timings and can see all his patient details. A patient can register for new account and can book appointment.</h4>
<h2>Installation and Run</h2>
  <h2>Step1 :</h2> 
    <h4>Import this project using Github Desktop or download zip file. If you download this zip file, then extract all files and go to eclipse IDE then go to file --> Import --> Maven Project ---> select project folder --> Import. Change configurations of database in application.properties and also change mail id and password to sent mails from your gmail account.</h4>
   <h2>Step2 :</h2> 
    <h4>Import angular project from the link given above by Gitub Desktop or by downloading zip file. If you download zip file , extract all files and go to Visual Studio Code --> file --> open folder (select folder that you have extracted). Now open terminal in Visual Studio Code and type ngServe to build the application.
    Now you can run the project in browser and you can see results there.</h4>
 <h2>Bug/Feature Request</h2>
  <h4>If you find a bug (unable to running the project due to any error or having issues in downloading project), kindly open an issue by including your search query and expected result</h4>
 <h2>Technologies Used</h2>
   <h4>Java, Angular, SpringBoot, SpringData, PostgreSQL, JSON</h4>




