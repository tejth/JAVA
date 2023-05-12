
class base{
    int age =12;

    public void printdata(){
        System.out.println("i am base class");
    }
}

class derived1 extends base{
    int age = 14;
    public void printdata(){
        System.out.println("i am derived from base");
    }

}
class derived2 extends derived1{
    public void printdata(){
        System.out.println("i am derived from derived1");
    }

}




public class HierarchialInheritance {
           public static void main(String args[]){
            derived2 obj = new derived2();
            obj.age=20;
            System.out.println("Age is :" + obj.age);
            obj.printdata();

           }    
}
