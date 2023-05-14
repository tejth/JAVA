class Mynewthr2 extends Thread{
    public void run(){
        int i =0;
        while(i<5){
            System.out.println("bye");
            try {
                Thread.sleep(455);   //method
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}

class Mynewthr3 extends Thread{
    public void run(){
        int i =0;
        while(i<5){
            System.out.println("hy");
            i++;
        }
    }
}

public class ThreadMethods {
    public static void main(String[] args) {
        Mynewthr2 t1 = new Mynewthr2();
        Mynewthr3 t2 = new Mynewthr3();
        t1.start();
        try{
            t1.join();    //First t1 will work then after t2.(method)
        }
        catch(Exception e){
            System.out.println(e);
        }
        t2.start();


//GO TO JAVA THREADMETHOD DOCUMENTATION TO STUDY MORE METHODS.
        
    }
    
}
