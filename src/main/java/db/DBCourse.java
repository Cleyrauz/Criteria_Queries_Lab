package db;

import models.Course;
import models.Student;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBCourse {

    public static Transaction transaction;
    public static Session session;

    public static List<Student> findStudentsByCourse(Course course){
        session = HibernateUtil.getSessionFactory().openSession();
        List <Student> results = null;
        try{
            Criteria cr = session.createCriteria(Student.class);
            cr.add(Restrictions.eq("course", course));
            results = cr.list();
            } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }

        return results;
    }

}
