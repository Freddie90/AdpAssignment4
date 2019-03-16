package ac.za.cput;

public class StudentAInheritance extends StudentA{

    public static void main(String[] args) {


        StudentA student = new StudentA();


        student.setStudNr("28984938");
        student.setStudName("Jake");
        student.setCourse("NDIP");
        student.setAge(20);
        student.setYear(2018);

        System.out.println("----Stdent Details---");
        System.out.println("Student Number:\t" + student.getStudNr());
        System.out.println("Student Name:\t" + student.getStudName());
        System.out.println("Course:\t" + student.getCourse());
        System.out.println("Student age:\t" + student.getAge());
        System.out.println("Year studied:\t" + student.getYear());

    }
}
