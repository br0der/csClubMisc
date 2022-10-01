
import java.util.Scanner;
public class csComp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sets = scan.nextInt();
        //Making a really really big prefix sum
        long[] reallyBig = new long[1000000];
        for (int i = 0; i < reallyBig.length; i++) {
            reallyBig[i]=i;
        }
        for (int i = 1; i < reallyBig.length; i++) {
            reallyBig[i]+=reallyBig[i-1];
        }
        for (int i = 0; i < sets; i++) {
            long total = 0;
            int n1 = scan.nextInt();
            int n2 = scan.nextInt();
            if(n1==0){
                System.out.println(reallyBig[n2]);
            }
            else {
                System.out.println(reallyBig[n2] - reallyBig[n1 - 1]);
            }
        }
        //had to add 1 freaking 0

        /*
        First Name: Rohit
        Age: 16
        Will be 21 in 5 years
         */
    }
}
