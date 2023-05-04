class car{
    int model;
    String color;

    public void printdata(){
        System.out.println(this.color);

    }
}
public class ThisKeyword {
    public static void main(String args[]){
        car obj1=new car();
        obj1.color="red";

        car obj2=new car();
        obj2.color="green";

        obj1.printdata();
        obj2.printdata();
 
    }
    
}
