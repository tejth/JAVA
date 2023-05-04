import java.util.*;
public class MatrixAddition {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows for 1st matrix");
        int r1= sc.nextInt();
        System.out.println("Enter number of columns for 1st matrix");
        int c1=sc.nextInt();
        int arr1[][]= new int[r1][c1];
        System.out.println("Enter elements of 1st matrix");
        for(int i=0;i<r1;i++){
        for(int j =0;j<c1;j++){
            arr1[i][j]=sc.nextInt();
        }
   }


   System.out.println("Enter number of rows for 2nd matrix");
   int r2= sc.nextInt();
   System.out.println("Enter number of columns for 2nd matrix");
   int c2=sc.nextInt();
   int arr2[][]= new int[r2][c2];
   System.out.println("Enter elements of 2nd matrix");
   for(int i=0;i<r2;i++){
   for(int j =0;j<c2;j++){
       arr2[i][j]=sc.nextInt();
   }
}


int c[][]= new int[r1][r2];
System.out.println("The sum of matrix is : ");
for(int i=0;i<r2;i++){
    for(int j =0;j<c2;j++){
        c[i][j]=arr1[i][j]+arr2[i][j];
        System.out.print(" "+c[i][j]+" ");
    }
 }
 sc.close();
    
}
}

