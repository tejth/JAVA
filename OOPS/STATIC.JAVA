class Student{
    String name;
    static String school;

    public static void changeSchool(){
        school="new school";
    }
}

public class STATIC{
    public static void main(String args[]){
        Student.school ="ABC";
        Student st1 = new Student();
        st1.name = "tony";
        System.out.println(st1.school);
    }
}