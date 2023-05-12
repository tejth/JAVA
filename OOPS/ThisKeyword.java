import java.util.*;

class Car{
    int modal;
    String color;

    public void setinfo(int mdl,String rang){
        modal = mdl;
        color = rang;
}

public void printinfo(){
   System.out.println("Your modal is "+ this.modal +" with color "+ this.color);
}
}
public class ThisKeyword {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter color");
        String str = sc.nextLine();
        System.out.println("enter modal");
        int r = sc.nextInt();
        Car obj = new Car();
        obj.setinfo(r,str);
        obj.printinfo();

        Car obj2 = new Car();
        obj2.color="green";
        obj2.modal=2;
        obj2.printinfo();
        sc.close();


    }
}
