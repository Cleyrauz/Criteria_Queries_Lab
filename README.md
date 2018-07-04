# Criteria_Queries_Lab

Lab
Extend the student application.

MVP
Create a Student and Course tracking system.

MVP
Create an Student class.
Student should have First Name, Last Name, Age and a enrolment_number.
Create a Course class.
Course should have a title and an Enum for level (BENG, BSC, BA, etc)
Annotate the and Course getter in Student with @ManyToOne annotations.
Change Course so that it has a List<Student> students property.
In Course add OneToMany association to students property. This should have attribute of fetch = FetchType.LAZY and be mapped to course property of the Student class.
Write the CRUD functions in a DBHelper class. (save, update, delete, getAll and find)
Write a method in a DBCourse class to return a list of all students on the course.
Extension
Add a collection of lessons to the course. Lesson swill have title, classroom number and a date
Write a method to return all course lessons.
Add an Instructor Class and give instructor a name and collection of lessons.
Write a method to return all lessons for an instructor.
Notes
HibernateUtil and hibernate.cfg.xml have been written for you.
Remember to add mapping classes to hibernate.cfg.xml
