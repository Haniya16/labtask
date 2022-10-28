import java.util.*;

class logintask {
    public static void main(String[] args) {
        String[][] twodArray = new String[5][2];
        System.out.println("\t\t\"In this login page only five Emails can login\"");
        System.out.println(" \t\tEnter the Email or Username and Password for login:");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                if (j == 0) {
                    System.out.println(" Enter an Email or Username: ");
                    String str = sc.nextLine();
                    twodArray[i][j] = str;
                } else {
                    System.out.println(" Enter a Password: ");
                    String str = sc.nextLine();
                    twodArray[i][j] = str;
                    System.out.println("\t\t\"Welcome to the Website\"");
                }

            }
            System.out.println();
        }
        System.out.println("\t\tLogin Emails or Username are :");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                if (j == 0) {
                    System.out.println("\tEmail or Username: " + twodArray[i][j]);
                } else {
                    System.out.println(" \tPassword: " + twodArray[i][j]);
                }
            }
            System.out.println();
        }
    }
}
