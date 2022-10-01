import java.util.Scanner;

public class blackjack {
    public static void main(String[] args) {
        /*
        Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. Return 0 if they both go over.

        blackjack(19, 21) → 21
        blackjack(21, 19) → 21
        blackjack(19, 22) → 19
         */
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (a > 21 && b > 21) {
            System.out.println(0);
        }
        else if (a > 21) {
            System.out.println(b);
        }
        else if (b > 21) {
            System.out.println(a);
        }
        else System.out.println(Math.max(a, b));
    }
}
