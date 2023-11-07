package Practice_19.Task_2;

public class Student {
    protected String name;
    protected int iDNumber;
    protected double GPA;
    protected String surname;
    protected String specialization;
    protected int course;
    protected int group;

    Student(String name, int iDNumber, double GPA, String surname, String specialization, int course, int group) {
        this.name = name;
        this.iDNumber = iDNumber;
        this.GPA = GPA;
        this.surname = surname;
        this.specialization = specialization;
        this.course = course;
        this.group = group;
    }
    Student(String name, String surname, int iDNumber, double GPA) {
        this.name = name;
        this.surname = surname;
        this.iDNumber = iDNumber;
        this.GPA = GPA;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setiDNumber(int iDNumber) {
        this.iDNumber = iDNumber;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public int getiDNumber() {
        return iDNumber;
    }

    public double getGPA() {
        return GPA;
    }

    public String getSurname() {
        return surname;
    }

    public String getSpecialization() {
        return specialization;
    }

    public int getCourse() {
        return course;
    }

    public int getGroup() {
        return group;
    }
}