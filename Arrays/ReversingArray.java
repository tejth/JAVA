import java.util.*;
public class ReversingArray{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of elements");
    int n = sc.nextInt();
    int[] input = new int[n];
    int[] output = new int[n];
    System.out.println("Enter elements");
    for(int i =0;i<n;i++){
        input[i]=sc.nextInt();
    }
    for(int j =0;j<n;j++){
        output[j]=input[n-j-1];
    }
    System.out.println("Reversed array : ");
    for(int k =0;k<n;k++){
        System.out.print(output[k]);
    }
    sc.close();


    }
   
}