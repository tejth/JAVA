import java.util.*;
public class FarenhiteToCelcius {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter farenhite value");
        double faren = sc.nextDouble();
        double celcius = ((5/9)*(faren-32));
        System.out.println("The value in celcius is : "+ celcius);
        sc.close();

    }
}
