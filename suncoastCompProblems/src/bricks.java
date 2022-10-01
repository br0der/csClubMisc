import java.util.Scanner;

public class bricks {
    public static void main(String[] args) {
        /*
        We want to make a row of bricks that is goal inches long
        We have a number of small bricks (1 inch each) and big bricks (5 inches each)
        Return true if it is possible to make the goal by choosing from the given bricks
        This is a little harder than it looks and can be done without any loops

        makeBricks(3, 1, 8) → true
        makeBricks(3, 1, 9) → false
        makeBricks(3, 2, 10) → true
        */
        Scanner scan = new Scanner(System.in);
        int small = scan.nextInt();
        int big = scan.nextInt();
        int goal = scan.nextInt();
        System.out.println(goal%5<=small&&5*big+small>=goal);
    }
}
