import java.util.*;
public class ReverseString {
    public String reverseword(String input){
        String result = "";
        for(int i = input.length()-1;i>=0;i--){
            result = result + input.charAt(i) ;
        }
        return result;
    }
    public static void main(String args[]){
                 Scanner sc = new Scanner(System.in);
                 System.out.println("Enter a String");
                 String str = sc.nextLine();
                 ReverseString obj = new ReverseString();
                 System.out.println("Reversed String is : "+ obj.reverseword(str));
                 sc.close();
                }
}
