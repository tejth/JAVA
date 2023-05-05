import java.util.*;
public class CopyMethod {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr[]= new int[6];
    

    System.out.println("Enter elemnets of first array");
    for(int i=0; i<arr.length; i++){
        arr[i]=sc.nextInt();
    }



    int arr1[]=Arrays.copyOf(arr, 5);
    for(int i=0; i<arr.length; i++){
        System.out.println(arr1[i]+" ");
    }
    sc.close();
    


    
   }   
}
