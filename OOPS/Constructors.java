import java.util.*;

class Students{
    int rollno;
    int age;

    Students(){                     //Default constructor.
        System.out.println("Hello World");
    }

    Students(int r, int a){           //Parameterized constructor.
        rollno = r;
        age = a;
    }

   public void printinfo(){
        System.out.println("Your roll number and age are:" + this.rollno +" "+this.age);
    }
}



public class Constructors {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rollno");
        int n1 = sc.nextInt();
        System.out.println("enter age");
        int n2 = sc.nextInt();

        Students obj=new Students(n1,n2);
        obj.printinfo();
        sc.close();

    }
    
}
