class Test{
    public void printd1(){
        System.out.println("I am method 1");
    }
}

class Test1 extends Test{
    @Override
    public void printd1(){
        System.out.println("I am method2");
    }
}



public class MethodOverriding {
  public static void main(String args[]){
    Test obj  = new Test();
    obj.printd1();
    Test1 obj2 = new Test1();
    obj2.printd1();

  }  
}
