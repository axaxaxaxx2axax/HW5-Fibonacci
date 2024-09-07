package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int iterationFibonacci(int input) {           // ТС = O(n), SC = O(1)
        if (input < 0) {
            throw new IllegalArgumentException();
        }

        if (input == 0) {
            return 0;
        } else if (input == 1) {
            return 1;
        }

        int first = 0;
        int second = 1;
        int result = 0;

        for (int i = 2; i <= input; i++) {
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }

    public static int recursiveFibonacci(int input) {           // ТС = O(2^n), SC = O(n)
        if (input < 0) {
            throw new IllegalArgumentException();
        }

        if (input == 0) {
            return 0;
        } else if (input == 1) {
            return 1;
        } else {
            return recursiveFibonacci(input - 1) + recursiveFibonacci(input - 2);
        }
    }

    public static int dpFibonacci(int input) {              // TC = O(n), SC = O(n)
        if (input < 0) {
            throw new IllegalArgumentException();
        }

        if (input == 0) {
            return 0;
        } else if (input == 1) {
            return 1;
        }

        int arr[] = new int[input + 1];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= input; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[input];
    }

    public static void main(String[] args) {
        System.out.println(iterationFibonacci(6));
        System.out.println(recursiveFibonacci(6));
        System.out.println(dpFibonacci(6));
    }


}