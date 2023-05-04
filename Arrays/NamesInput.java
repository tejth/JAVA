import java.util.*;
public class NamesInput{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of names");
        int n = sc.nextInt();
        String[] names = new String[10];
        for(int i =0;i<n;i++){
            names[i]=sc.next();
        }
        System.out.print("name are: ");
        for(int j=0;j<n;j++){
            System.out.print(names[j]+" ");
        }
        sc.close();

    }
}