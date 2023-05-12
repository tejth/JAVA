import java.util.*;

class Student{
 String name;
 int Rollno;

 public void setinfo(String nam,int r){
         name = nam;
         Rollno = r;
 }

 public void printinfo(){
    System.out.println("Your name is "+ name +" with roll "+Rollno);
 }
}




public class Classes{
public static  void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter name");
    String str = sc.nextLine();
    System.out.println("enter rollno");
    int r = sc.nextInt();
    Student obj = new Student();
    obj.setinfo(str,r);
    obj.printinfo();

    sc.close();


  

}
}