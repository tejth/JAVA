import java.util.*;
public class Pattern2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int r = sc.nextInt();
        System.out.println("Enter number of columns");
        int n = sc.nextInt();

        for(int i =1;i<=r;i++){
            for(int j =1;j<=n;j++){
                if(i==1 || j==1 || i==r || j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
        }
        System.out.println();


    }
    sc.close();
}
}