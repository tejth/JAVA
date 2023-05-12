/* Ability to take more than one form is called polymorphism.
 * 1. Function Overloading. (Compile Time)
 * 2. Function Overriding.  (Run time)
 */

//COMPILE TIME. (either return type,parameters type or number of arguments should be different.)

class poly{
    String name;;
    int age;

    public void printinfo(String name){
        System.out.println(name);
    }

    public void printinfo(int age){
        System.out.println(age);
    }
    public void printinfo(String name,int age){
        System.out.println("Name is : " + name+" Age is : "+ age);
    }
}


public class Polymorphism {
   public static void main(String args[]){
    poly obj = new poly();
    obj.name = "tej";
    obj.printinfo(obj.name);
    obj.printinfo(18);
    obj.printinfo("tej",18);

    




   }
    
}
