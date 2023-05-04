import java.util.Scanner;

class Student{
    int id;
    String name;

    public void getData( ){
        System.out.println("Enter id: ");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        System.out.println("Enter  name: ");
        String str = sc.nextLine();
        id = n;
        name = str;
    }
    public void printdata(){
        System.out.println("your name is "+ name +"with id "+ id);
    }
   
}
public class ClassesObjects2 {
    public static void main(String args[]){
    ClassesObjects2 obj = new ClassesObjects2();
    obj.getData();
    obj.printdata();

    }
    
}
