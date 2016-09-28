/**
 * Created by fenji on 9/27/2016.
 */
public class RecursionRunner {
    public static int fibHolder = 0;
    public static void main(String[] args) {
        System.out.println("Running ...");
        RecursionRunner runner = new RecursionRunner();
        runner.recursionTest(0, 25);
    }

    public int recursionTest(int count, int max) {
        System.out.print(count + " ");
        if (count >= max) {
            return count;
        }
        return recursionTest(count+1, max);
    }

    public int fib(int n) {
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else
            return fib(n - 1) + fib(n - 2);
    }

    public int fibonacci(int num1, int num2, int n){
        int num3 = num1 + num2;
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        if (fibHolder == n-2){
            fibHolder = 0;
            return num3;
        }
        fibHolder++;
        return fibonacci(num2, num3, n);
    }

    public int factorial(int n) {
        if(n == 0){
            return 1;
        }
        if(n == 1) {
            return 1;
        }
        return n*factorial(n-1);
    }
}
