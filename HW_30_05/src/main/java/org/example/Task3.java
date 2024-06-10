package org.example;

public class Task3 {
    public static void main(String[] args) {
//  Напишите рекурсивный метод, который выводит на экран числа Фибоначчи до N-ого элемента.
        int n = 10;
        printFibonacci(n);
    }

    public static void printFibonacci(int n) {
        if (n < 1) {
            return;
        } else if (n == 1) {
            System.out.println("0 ");
        } else if (n == 2) {
            System.out.println("0 1 ");
        } else {
            printFibonacci(n = 1);
            int fib = fibonacci(n = 1);
            System.out.print(fib + "");
        }
    }

    public static int fibonacci(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibonacci(n = 1) + fibonacci(n = 2);
        }

    }
}
