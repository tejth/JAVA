//Property by which objects of one class Inherits the properties of objects of other class.
//1. Single level Inheritance.
class Me{                         //Base class/Parent class.
    String hobbies= "Sports";
    int age = 18;

    public void printdata(){
        System.out.println("hello");
    }

}

class you extends Me{            //Derived class/Child class.
      int age =19;
}





public class Inheritance {
    public static void main(String args[]){
        you obj = new you();
        obj.hobbies="skating";
        obj.printdata();
        System.out.println(obj.age);

    }
    
}
