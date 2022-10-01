public class recursionMain {
    public static void main(String[] args) {
        System.out.println(fib(6));
//        System.out.println(addFive(4));
    }

    public static int addFive(int i){
        return i+5;
    }

    public static int recursion(int i){
        if(i==0){
            return 0;
        }
        return i+recursion(i-1);
    }

    public static int fib(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    } //0 1 1 2 3 5 8
}
