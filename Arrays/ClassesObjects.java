import java.util.*;

class Student{
    int roll;
    String name;

    public void readinput(int r,String n){
        roll =r;
        name = n;
    }
    public void printdata(){
        System.out.println("name is : "+ name + " roll is : "+ roll);
    }
}
public class ClassesObjects{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name : ");
        String str = sc.nextLine();
        System.out.println("Enter roll :");
        int n = sc.nextInt();

        Student obj = new Student();
        obj.readinput(n, str);
        obj.printdata();
        sc.close();
    }
}