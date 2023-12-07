public class TowerOfHanoi {

    public static int tOh(int n, String src, String helper, String dst) {
        int steps = 0;
        if (n == 1) {
            steps += 1;
            System.out.println("Transfer disk " + n + " from " + src + " to " + dst);
            return steps;
        }

        steps += tOh(n - 1, src, dst, helper);
        steps += 1;
        System.out.println("Transfer disk " + n + " from " + src + " to " + dst);
        steps += tOh(n - 1, helper, src, dst);
        
        return steps;
    }

    public static void main(String[] args) {
        int n = 3;
        int totalSteps = tOh(n, "S", "H", "D");
        System.out.println("Total steps: " + totalSteps);
    }
}
