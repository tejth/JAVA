import java.util.*;
public class SortMethod{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]= new int[6];
        System.out.println("Enter elements of Arrays");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);    //By default Ascending.
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();

    }
}