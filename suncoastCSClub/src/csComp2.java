import java.util.Scanner;

public class csComp2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int iterations = scan.nextInt();
        char[] IDs = new char[iterations];
        int[] starts = new int[iterations];
        int[] ends = new int[iterations];
        for (int i = 0; i < iterations; i++) {
            String[] input = scan.nextLine().split(" ");
            IDs[i]=input[0].charAt(0);
            starts[i]=Integer.parseInt(input[1]);
            ends[i]=Integer.parseInt(input[2]);
        }
        for (int i = 0; i < iterations-1; i++)
            for (int j = 0; j < iterations-i-1; j++)
                if (starts[j] > starts[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = starts[j];
                    starts[j] = starts[j+1];
                    starts[j+1] = temp;
                    temp = ends[j];
                    ends[j] = ends[j+1];
                    ends[j+1] = temp;
                    //char tempC = IDS
                }

    }
}
