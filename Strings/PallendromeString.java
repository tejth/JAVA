import java.util.*;
public class PallendromeString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an String");
        String str = sc.nextLine();

        int length = str.length();

        for(int i=0;i<length; i++){
            if(str.charAt(i)!=str.charAt(length-i-1)){
                System.out.println("String is not pallendrome");
                break;
            }
            else{
                System.out.println("String is pallendrome");
                break;
            }
        }
        sc.close();
    }
}

