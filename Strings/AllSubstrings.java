import java.util.Scanner;
class AllSubstrings {
	
    static void printSubstrings(String input) {
       for (int len = 1; len <= input.length(); len++) {
            // Pick ending point
            for (int i = 0; i <= input.length() - len; i++) {
                //  Print characters from current
                // starting point to current ending
                // point. 
                int j = i + len - 1;
                for (int k = i; k <= j; k++) {
                    System.out.print(input.charAt(k));
                }
 
                System.out.println();
            }
        }
    }
    
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter A String");
        String input = sc.nextLine();
        printSubstrings(input);
        sc.close();
	}
}
