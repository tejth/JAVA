import java.util.Scanner;


class ReverseWordsInString {

    static String reverseStringWordWise(String input) {
        // Write your code here
        String[] words = input.split("\\s");
		
		String outputString = "";
		
		for (int i = words.length-1; i >= 0; i--)
		{
			outputString = outputString + words[i] + " ";
		}
		
		return outputString;
       
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String input = sc.nextLine();
        String ans = reverseStringWordWise(input);
        System.out.println(ans);
        sc.close();
    }
}