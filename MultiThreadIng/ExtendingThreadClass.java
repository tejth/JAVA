//MYTHREAD1 ND MYTHREAD2 ARE RUNNING SIMULTANEOUSLY.
//GOOGLE VARIOUS METHODS OF  THREAD.
//CONCURRENT THREADING.
class MyThread1 extends Thread{
    @Override
    public void run() {
        int i =0;
        while(i<56){
        System.out.println("My Thread1 for Studying is Running");
        System.out.println("I am Happy");
        i++;
        }
    }
}


class MyThread2 extends Thread{
    @Override
    public void run() {
        int i =0;
        while(i<56){
        System.out.println("My Thread2 for chatting is Running");
        System.out.println("I am Sad");
        i++;
        }
    }
}

public class ExtendingThreadClass{
    public static void main(String args[]){

        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();

    }
}