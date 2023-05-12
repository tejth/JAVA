//PURE ABSTRACTION.

interface Animal{
    abstract void walk();
}

interface Herbivore{
                           //NOTE: THIS IS CALLED MULTIPLE INHERITANCE WHICH OCCURS IN JAVA THROUGH INTERFACES.
}
class Horse implements Animal,Herbivore{
   public void walk(){
    System.out.println("walks on 4 legs");
    }
}

public class Interfaces {
    public static void main(String args[]){
        Horse vari1 = new Horse();
        vari1.walk();   
    
}
}
