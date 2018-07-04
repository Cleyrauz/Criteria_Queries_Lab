import db.DBCourse;
import db.DBHelper;
import models.Course;
import models.Level;
import models.Student;
import sun.util.logging.PlatformLogger;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Course course1 = new Course("Java Enterprise", Level.MA);
        DBHelper.save(course1);
        Course course2 = new Course("Software Development", Level.MSC);
        DBHelper.save(course2);
        Course course3 = new Course("IT Management", Level.BENG);
        DBHelper.save(course3);
        Course course4 = new Course("Oracle Master", Level.BSC);
        DBHelper.save(course4);
        Course course5 = new Course("REACT", Level.MENG);
        DBHelper.save(course5);
        Course course6 = new Course("UX Desing", Level.BA);
        DBHelper.save(course6);

        Student student1 = new Student("Jose", "Calderon", 31, 1, course5);
        DBHelper.save(student1);
        Student student2 = new Student("Cleyra", "Uzcategui", 28, 2, course1);
        DBHelper.save(student2);
        Student student3 = new Student("Pascaline", "Martin", 26, 3, course2);
        DBHelper.save(student3);
        Student student4 = new Student("Mark", "McCasey", 30, 4, course1);
        DBHelper.save(student4);

        student1.setFirstName("Ricardo");
        DBHelper.update(student1);

        DBHelper.delete(student1);

        List<Student> allStudents = DBHelper.getAll(Student.class);

        Student findStudent = DBHelper.find(Student.class, student3.getId());

        List<Student> findStudentByCourse = DBCourse.findStudentsByCourse(course1);
    }
}
