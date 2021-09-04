import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan  = new Scanner(System.in);
        System.out.println("Input an integer to specify the total size of the Fibonacci sequence:");
        int n = scan.nextInt();  // Input the index you want to calculate
        scan.nextLine();

        System.out.println("Calculating with memoization");
        long startTime = System.nanoTime();
        HashMap<Long, Long> fibonacciNumMap = new HashMap<>();

	    for (int i = 0; i <= n; i++)
	    {
	        if (i < n)
	            System.out.print(fibMap(i, fibonacciNumMap) + ", ");
	        else
                System.out.print(fibMap(i, fibonacciNumMap) + ".\r\n");
        }
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println("Execution time in milliseconds: " + timeElapsed / 1000000);


        System.out.println("Calculating without memoization");
        startTime = System.nanoTime();
        for (int i = 0; i <= n; i++)
        {
            if (i < n)
                System.out.print(fib(i) + ", ");
            else
                System.out.print(fib(i) + ".\r\n");
        }
        endTime = System.nanoTime();
        timeElapsed = endTime - startTime;
        System.out.println("Execution time in milliseconds: " + timeElapsed / 1000000);

    }


    // Calculates the n-th Fibonacci number using memoization
    public static long fibMap(int n, HashMap fibonacciNumMap) {
        long valueAtN;
        if (n == 0 || n == 1) // Base case
            return n;
        if (fibonacciNumMap.containsKey(n)) // if n index is known
            return (long) fibonacciNumMap.get(n);
        else
            valueAtN = fibMap(n - 1, fibonacciNumMap ) + fibMap(n - 2, fibonacciNumMap);
            fibonacciNumMap.put(n, valueAtN);
            return valueAtN;
    }

    // Calculates the n-th Fibonacci number - not using a memoization
    public static long fib(int n) {

        if (n == 0 || n == 1) // Base case
            return n;
        else
            return fib(n - 1) + fib(n - 2);
    }





}
