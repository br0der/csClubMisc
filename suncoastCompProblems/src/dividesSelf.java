import java.util.Scanner;

public class dividesSelf {
    public static void main(String[] args) {
        /*
        We'll say that a positive int divides itself if every digit in the number divides into the number evenly
        So for example 128 divides itself since 1, 2, and 8 all divide into 128 evenly
        We'll say that 0 does not divide into anything evenly, so no number with a 0 digit divides itself
        Note: use % to get the rightmost digit, and / to discard the rightmost digit.

        dividesSelf(128) → true
        dividesSelf(12) → true
        dividesSelf(120) → false
         */
        Scanner scan = new Scanner(System.in);
        boolean completed = false;
        int n = scan.nextInt();
        String str = ""+n;
        for(int i = 0; i<str.length(); i++){
            int testInt = Integer.parseInt(str.substring(i,i+1));
            if(testInt==0||n%testInt!=0){
                System.out.println(false);
                completed = true;
                break;
            }
        }
        if(!completed){
            System.out.println(true);
        }
    }
}
