//inner class refers to the class that is declared inside class or interface which were mainly introduced, to sum up, same logically relatable classes as Java is purely object-oriented so bringing it closer to the real world.
//There are certain advantages associated with inner classes are as follows:

//Making code clean and readable.
//Private methods of the outer class can be accessed, so bringing a new dimension and making it closer to the real world.
//Optimizing the code module.

class A{
    int age;

    public void show(){
        System.out.println("helo");
    }

    class B{
        public void config(){
            System.out.println("Inner class");
        }
    }
}
public class InnerClass{
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        A.B obj1 = obj.new B();
        obj1.config();

    }
}