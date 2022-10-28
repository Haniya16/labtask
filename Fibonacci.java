import java.util.*;

class Fibonacci {
    public static void main(String args[]) {
        int i, term1 = 0, term2 = 1, terms, n;
        System.out.println("Enter the number for how many terms you want to print in fibonacci series:");
        Scanner ob = new Scanner(System.in);
        n = ob.nextInt();
        System.out.println("The Fibonacci series is:");
        System.out.println(term1);
        System.out.println(term2);
        for (i = term1; i <= n - 2; i++) {
            terms = term1 + term2;
            System.out.println(terms);
            term1 = term2;
            term2 = terms;

        }
    }
}