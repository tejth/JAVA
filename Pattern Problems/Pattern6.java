import java.util.*;
public class Pattern6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int r = sc.nextInt();

        for(int i =1;i<=r;i++){
            int count =1;
            for(int j = 1;j<=i;j++){
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
        sc.close();


    }
    
}
