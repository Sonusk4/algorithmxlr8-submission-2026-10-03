import java.util.*;
public class Main {
public static int F(int n){
     if (n <= 1) {
            return n; // Base cases: fib(0) = 0, fib(1) = 1
        }
    int fib1=F(n-1);
    int fib2=F(n-2);
    int total = fib1+fib2;
    return total;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(F(n));

        // Write your solution here.
        // Print F(n).
    }
}
