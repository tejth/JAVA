//Constructor chaining-- if we have two constructors one in base class and othert in derived class then first base class constructor is called then deruived class.

abstract class Animal{
    abstract void walk();                //it is a  blueprint or imaginary concept.
    public void eat(){
        System.out.println("animals can eat");
    }
}

class Horse extends Animal{
    public void wallk(){
        System.out.println("walk on 4 legs");
    }
}
class chickens extends Animal{
    public void wallk(){
        System.out.println("walk on 2 legs");
    }
}

public class Abstraction{
    public static void main(String args[]){
        Horse vari1 = new Horse();
        vari1.walk();     //walk on 4 legs.
        vari1.eat();      //animals can eat.
        Animal ani = new Animal();
        ani.walk();   //RUNTIME ERROR.
        
    }
}