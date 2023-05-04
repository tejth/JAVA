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
        sc.close();
    }
    public void printdata(){
        System.out.println("your name is "+ name +"with id "+ id);
    }
   
}
public class Classes {
    public static void main(String args[]){
    ClassesObjects2 obj = new ClassesObjects2();
    obj.getData();
    obj.printdata();

    }
    
}
