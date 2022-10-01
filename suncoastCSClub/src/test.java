public class test {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5, 8, 8, 8}; 
        int target = 8;
        System.out.println(binarySearch(values,target));
    }
    public static int binarySearch(int[] data, int target)
    {
        int start = 0;
        int end = data.length - 1;
        while (start <= end)
        {
            int mid = (start + end) / 2; /* Calculate midpoint */
            if (target < data[mid])
            {
                end = mid - 1;
            }
            else if (target > data[mid])
            {
                start = mid + 1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
}
