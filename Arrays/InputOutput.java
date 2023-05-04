import java.util.*;
public class InputOutput{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter number of elements");
       int n = sc.nextInt();
       int[] arr = new int[10];
       System.out.println("Enter elements");
       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
       }
       for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
       }
       sc.close();
    }

}