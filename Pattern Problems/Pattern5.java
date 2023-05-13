import java.util.*;
public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int r = sc.nextInt();

        for(int i =1;i<=r;i++){
            //for spaces
            for(int s =1;s<=r-i;s++){
                System.out.print(" ");
            }
            //for stars
        
            for(int j =1;j<=i;j++){
                System.out.print("*");
          }
        System.out.println();
    }
    sc.close();
    
}
}
