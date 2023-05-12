class Mee{
    String hobbies;
    int age = 17;
    public void printdata(){
        System.out.println("hy");
    }
}

class You extends Mee{
    String hobbies;
    int age = 19;
    public void printdata(){
        System.out.println("hello");
    }
    
}

class he extends You{
    int age =16;
    public void printdata(){
        System.out.println("whats up");
    }
}


public class MultilevelInheritance  {
    public static void main(String args[]){
        he obj = new he();
        obj.hobbies="swimming";
        System.out.println(obj.hobbies);
        System.out.println(obj.age);
        obj.printdata();

        
    }
}