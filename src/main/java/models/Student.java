package models;

import javax.persistence.*;

@Entity
@Table(name="students")
public class Student {

    private String firstName;
    private String lastName;
    private int age;
    private int enrolment_number;
    private int id;
    private Course course;

    public Student(){

    }

    public Student(String firstName, String lastName, int age, int enrolment_number, Course course) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.enrolment_number = enrolment_number;
        this.course = course;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "firstName")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "lastName")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "age")
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Column(name="enrolment_number")
    public int getEnrolment_number() {
        return enrolment_number;
    }

    public void setEnrolment_number(int enrolment_number) {
        this.enrolment_number = enrolment_number;
    }

    @ManyToOne
    @JoinColumn(name = "course_id", nullable = false)
    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
