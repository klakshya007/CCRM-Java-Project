* `# CCRM Application Usage Guide`  
*   
* `This guide provides a step-by-step command workflow to demonstrate the key features of the Campus Course & Records Manager (CCRM).`  
*   
* `## 🚀 Sample Command Workflow`  
*   
* ``This is a typical session demonstrating how to use the CCRM application after starting it. The `>` symbol indicates user input.``  
*   
* `### Step 1: Import Test Data (Optional)`  
* `This is the quickest way to populate the application with data.`  
*   
* ``* **Action**: Load all records from the `students.csv` and `courses.csv` files.``  
* ``* **Input**: `5` (File Utilities) -> `1` (Import Test Data)``  
* `* **Expected Output**: A series of messages confirming the import of each student and course.`  
*     ```` ``` ````  
*     `Starting data import from C:\...\CCRM\test-data...`  
*     `Imported student: Ravi Kishan`  
*     `Imported student: Sunita Kumari`  
*     `Imported course: Programming In Java`  
*     `Imported course: Introduction To Calculus`  
*     `Data import finished.`  
*     ```` ``` ````  
*   
* `### Step 2: View Existing Data`  
* `* **Action**: Check the courses that were just imported or pre-loaded.`  
* ``* **Input**: `3` (Manage Courses) -> `2` (View All Courses)``  
* `* **Expected Output**: A list of all courses currently in the system.`  
*   
* `### Step 3: Add and Enroll a New Student`  
* `* **Action**: Manually add a new student and enroll them in a course.`  
* ``* **Input (Add)**: `1` (Manage Students) -> `1` (Add New Student)``  
*     `` > Enter ID: > `4` ``  
*     `` > Enter Registration No: > `24BCE10549` ``  
*     `` > Enter Full Name: > `Lakshya Kant` ``  
*     `` > Enter Email: > `lakshya.24bce10549@vitbhopal.ac.in` ``  
* ``* **Input (Enroll)**: `4` (Grades & Transcripts) -> `1` (Enroll Student)``  
*     `` > Enter Student Registration No: > `24BCE10549` ``  
*     `` > Enter Course Code: > `MAT1002` ``  
* `` * **Expected Output**: `Student added!` followed by `Enrollment successful!` ``  
*   
* `### Step 4: Assign a Grade and View Transcript`  
* `* **Action**: Assign a grade to the newly enrolled student and check their academic record.`  
* ``* **Input (Assign Grade)**: `4` (Grades & Transcripts) -> `3` (Assign Grade)``  
*     `` > Enter Student Registration No: > `24BCE10549` ``  
*     `` > Enter Course Code: > `MAT1002` ``  
*     `` > Enter Grade (S, A, B, C, D, E, F): > `S` ``  
* ``* **Input (View Transcript)**: `4` (Grades & Transcripts) -> `4` (View Full Student Transcript)``  
*     `` > Enter Student Registration No: > `24BCE10549` ``  
* ``* **Expected Output**: A formatted transcript for Jean Grey showing the `MAT1002` course with an 'S' grade and a calculated GPA of 10.00.``  
*   
* `### Step 5: Unenroll from a Course`  
* `* **Action**: Remove the student from the course.`  
* ``* **Input**: `4` (Grades & Transcripts) -> `2` (Unenroll Student)``  
*     `` > Enter Student Registration No: > `24BCE10549` ``  
*     `` > Enter Course Code: > `MAT1002` ``  
* `` * **Expected Output**: `Student successfully unenrolled from PSY404` ``  
*   
* `### Step 6: Export Data`  
* `* **Action**: Save the current state of all records to files.`  
* ``* **Input**: `5` (File Utilities) -> `2` (Export All Data)``  
* ``* **Expected Output**: A confirmation message that data has been exported to the `data/exports/` directory.``  
*   
* `### Step 7: Exit the Application`  
* `* **Action**: Close the program.`  
* `` * **Input**: `6` ``  
* `* **Expected Output**:`   
*     ```` ``` ````  
*     `Thank you for using CCRM. Goodbye!`  
*     ```` ``` ````  
* 

