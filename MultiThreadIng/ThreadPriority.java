
class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }
    public void run(){
        int i =0;
        while(i<5){
            System.out.println("hy");
            i++;
        }
    }
}


class Mythr2 extends Thread{
    public Mythr2(String name){
        super(name);
    }
    public void run(){
        int i =0;
        while(i<5){
            System.out.println("bye" + this.getName());
            i++;
        }
    }
}

public class ThreadPriority {
    public static void main(String[] args) {
        MyThr1 t1 = new MyThr1("Tej");
        MyThr1 t2 = new MyThr1("Spars1");
        MyThr1 t3 = new MyThr1("Tej2");
        MyThr1 t4 = new MyThr1("Tej3");
        MyThr1 t5 = new MyThr1("Sparsh2 (MOST IMPORTANT)");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
    
}
