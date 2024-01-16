import java.util.Scanner;
public class cwa_ch7_recursion {
  /*  static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
        static int factorial_iterative(int n) {
            if (n == 1 || n == 0) {
                return 1;
            } else {
                int product = 1;
                for (int i = 1; i <= n; i++) {
                    product *= i;
                }
                return product;
            }
        }

    public static void main(String[] args) {
int x=5;
        System.out.println("factorial of 5 is:" + factorial(x));
        System.out.println("factorial of 5 is:" + factorial_iterative(x));
    }
}*/
// Formula - fib(n-1)+fib(n-2)

    static int fib(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number = ");
        num = sc.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.println(fib(i));
        }
    }
}