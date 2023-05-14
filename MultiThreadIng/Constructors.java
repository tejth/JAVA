class MyThr extends Thread{
    public MyThr(String name){
        super(name);    //We are calling a constructor of thread class which takes name.
    }

    public void run(){
    int i =0;
    while(i<15){
        System.out.println("I am Thread");
        i++;
    }
    }
}
public class Constructors {
    public static void main(String[] args) {
        MyThr t1 = new MyThr("Tej");
        MyThr t2 = new MyThr("Sparsh");

        t1.start();
        t2.start();
       
        System.out.println("The id of thread t is : "+t1.getName());  //Methodsof thread.
        System.out.println("The id of thread t is : "+t2.getName());  //Methodsof thread.
        
        
    }   
}
