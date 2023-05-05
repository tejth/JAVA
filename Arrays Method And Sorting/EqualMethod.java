import java.util.*;
public class EqualMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]= new int[6];
        int arr1[]= new int[6];

        System.out.println("Enter elemnets of first array");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter elemnets of second array");
        for(int i=0; i<arr1.length; i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println(Arrays.equals(arr,arr1));
   sc.close();

    }
    
}
