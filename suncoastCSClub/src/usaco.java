import java.util.*;

public class usaco {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int iterations = scan.nextInt();
        int[] arr = new int[iterations];
        for (int i = 0; i < iterations; i++) {
            arr[i]=scan.nextInt();
        }
        //Making the prefix sum array
        int[] pre = new int[arr.length];
        pre[0]=arr[0];
        for (int i = 1; i < pre.length; i++) {
            pre[i]=pre[i-1]+arr[i];
        }




        int longest = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {

                if(sum(i, j, pre)%7==0){
                    if(j+1-i>longest){
                        longest=j+1-i;
                    }
                }

            }
        }
        System.out.println(longest);
    }

    public static int sum(int a, int b, int[] pre){
        if(a==0){
            return pre[b];
        }
        return pre[b] - pre[a-1];
    }
}
