public class NumbersFrom1to5 {

    public static void printnum(int n){

        if(n==6){
            return;     //3. Base Case.
        }

        System.out.print(n+" ");  //1. print
        printnum(n+1);   //2. recursion
    }
    public static void main(String[] args) {
        printnum(1);

                
    }
}
