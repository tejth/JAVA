import java.util.*;
public class Pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int r = sc.nextInt();
        

        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                int result = i+j;
                if(result%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");

                }
                
        }
        System.out.println();
        
    }
    sc.close();
    
}

}