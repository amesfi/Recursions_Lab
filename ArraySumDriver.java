/*
	Class: CMSC 204
	CRN: 40541
	Instructor: Professor Gary C. Thai
	Assignment: Recursion Lab 
	Due Date: 6/25/23
	Programmer: Abidara Mesfin
*/

public class ArraySumDriver {
    private final static int ARRAY_SIZE = 6;

    /**
	 * @param args
	 */
    public static void main(String[] args) {
        int index = 0;
        Integer[] myArray = new Integer[ARRAY_SIZE];

        myArray[index++] = 13;
        myArray[index++] = 5;
        myArray[index++] = 12;
        myArray[index++] = 6;

        int sum = sumOfArray(myArray, 3);
        System.out.println("Sum of array values: " + sum);

        myArray[index++] = 7;
        myArray[index++] = 1;

        sum = sumOfArray(myArray, 5);
        System.out.println("Sum of array values: " + sum);

        int fibonacciNumber = fibonacci(6);
        System.out.println("Fibonacci number at position 6: " + fibonacciNumber);
    }

    /**
	 * Recursive method for generating sum of values in array
	 * @param arr array of Integers
	 * @param num index of array to sum all previous index values (including num)
	 * @return sum of array values
	 */
    public static int sumOfArray(Integer[] arr, int num) {
        if (num == 0) {
            return arr[0];
        } else {
            return arr[num] + sumOfArray(arr, num - 1);
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        int[] memo = new int[n + 1];
        memo[0] = 0;
        memo[1] = 1;

        return fibonacciHelper(n, memo);
    }
    private static int fibonacciHelper(int n, int[] memo) {
        if (n <= 1) {
            return memo[n];
        }

        if (memo[n] != 0) {
            return memo[n];
        }

        memo[n] = fibonacciHelper(n - 1, memo) + fibonacciHelper(n - 2, memo);
        return memo[n];
    }
}