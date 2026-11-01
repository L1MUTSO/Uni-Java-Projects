import java.util.Stack;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pls enter your string: ");
        String str = sc.nextLine();

        if (Bracket_Balancing.checkBalance(str)) {
            System.out.println("Balanced");
        }
        else {
            System.out.println("Unbalanced");
        }
        sc.close();
    }
}