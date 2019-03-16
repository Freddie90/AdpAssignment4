package ac.za.cput;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentA {


    private String studNr;
    private String studName;
    private String course;
    private int age;
    private int year;

    public StudentA(){}

    public StudentA(String studNr, String studName, String course, int age, int year)
    {
        this.studNr = studNr;
        this.studName = studName;
        this.course = course;
        this.age = age;
        this.year = year;
    }

    public String getStudNr() {
        return studNr;
    }

    public void setStudNr(String studNr) {
        this.studNr = studNr;
    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static List<StudentA> getStudDetails()
    {
        ArrayList<StudentA> Stud = new ArrayList<StudentA>();
        Stud.add(new StudentA("28984938","Shakier", "NDIP", 19 , 2018));
        Stud.add(new StudentA("273840048", "Jake", "NDIP", 20, 2018));
        Stud.add(new StudentA("294746258", "Myles", "NDIP", 22, 2019));
        return Stud;
    }




}





