import java.util.*;


class Rectangle{         //CLASS.
    static int l;        //Data Members.
    static int b;
    String name;


    Rectangle(){         //Default Constructor
        System.out.println("Welcome!");
    }


    Rectangle(String nam ){       //Parametirized Constructor.
        name=nam;
        System.out.println(name);
    }


    Rectangle(Rectangle s2){      //Copy constructor.
        this.name=s2.name;
    }








    public void setarea(){      //Methods.
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length:");
        int n = sc.nextInt();
        System.out.println("enter breath:");
        int m = sc.nextInt();
        l=n;
        b=m;

        sc.close();
    }



    public void printdata(){
        System.out.println("Area  is "+ " "+l*b);
    }
}


public class Conclusion{
    public static void main(String args[]){
        Rectangle obj = new Rectangle("tej");
        obj.setarea();
        obj.printdata();

        
       Rectangle obj1 = new Rectangle(obj);
       obj1.name="radha";
       System.out.println(obj1.name);

    }
}