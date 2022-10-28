import java.util.*;

class SimpleCalculation {
    public static void main(String args[]) {
        System.out.println("Enter the value of x and y for Addition Subtraction Multiplicatin And Division:");
        Scanner op = new Scanner(System.in);
        int x, y;
        System.out.println("Enter the value of x");
        x = op.nextInt();
        System.out.println("Enter the value of y");
        y = op.nextInt();
        if (x >= y) {
            System.out.println("The Addition of values is:");
            System.out.print(x + y);
            System.out.println("The Subtraction of values is:");
            System.out.println(x - y);
            System.out.println("The Multiplicationi of values is:");
            System.out.println(x * y);
            System.out.println("The Division of values is:");
            System.out.println(x / y);
        } else {
            System.out.println("Please enter value of x greater than y");
        }
    }
}