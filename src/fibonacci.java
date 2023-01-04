//i also get this one
public class fibonacci {

    public static void main(String[] args) {
        System.out.println("The 12th fibonacci number is: " + fib(12));
    }

        public static long fib(long n) {
            if ((n == 0) || (n == 1))
                return n;
            else
                return fib(n - 1) + fib(n - 2);
        }


}
