package Practice_10.Task_1to3;

public class Student {
    private String Name;

    private String Surname;

    private String Specialization;

    private int Course;

    private int Group;

    private double GPA;

    public Student(String name, String surname, String specialization, int course, int group, double gpa) {
        Name = name;
        Surname = surname;
        Specialization = specialization;
        Course = course;
        Group = group;
        GPA = gpa;
    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public String getSpecialization() {
        return Specialization;
    }

    public int getCourse() {
        return Course;
    }

    public int getGroup() {
        return Group;
    }

    public double getGPA(){
        return GPA;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public void setSpecialization(String specialization) {
        Specialization = specialization;
    }

    public void setCourse(int course) {
        Course = course;
    }

    public void setGroup(int group) {
        Group = group;
    }

    public void setGPA(double gpa){
        GPA = gpa;
    }

    @Override
    public String toString() {
        return "Имя: '" + Name + '\'' +
                ", Фамилия: '" + Surname + '\'' +
                ", Специализация: '" + Specialization + '\'' +
                ", Курс: " + Course +
                ", Группа: " + Group +
                ", Ср. балл: " + GPA;
    }
}
