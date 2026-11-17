public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]); 
        System.out.println("The first " + x + " Fibonacci numbers are:");

        int prev1 = 1;
        int prev2 = 1;
        int numOdd = 0;
        for (int i = 0; i < x; i++) {
            int fibNum;
            if (i == 0 || i == 1) {
                fibNum = 1;
            } else {
                fibNum = prev1 + prev2;
                prev2 = prev1;
                prev1 = fibNum;
            }
            if (fibNum % 2 == 1) {
                numOdd++;
            }
            System.out.print(fibNum);
            if (i < x - 1) 
                System.out.print(" ");
        }
        System.out.println();
                
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
