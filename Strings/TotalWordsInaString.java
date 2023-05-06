import java .util.*;
public class TotalWordsInaString{
    public int countwords(String input){
        int words =1;
        for(int i =0;i<input.length();i++){
            if(input.charAt(i)==' '){
                words++;
            }
        }
        return words;
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        TotalWordsInaString obj = new TotalWordsInaString();
        System.out.println("Number of Words ARE: "+ obj.countwords(str));
        sc.close();
      

}
}