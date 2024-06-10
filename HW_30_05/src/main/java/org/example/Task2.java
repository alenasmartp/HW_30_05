package org.example;

public class Task2 {
    public static void main(String[] args) {
//  Дано натуральное число N. Вычислите сумму его цифр.
//  При решении этой задачи нельзя использовать строки, списки, массивы
//  (ну и циклы, разумеется).

        public static int sumDigits ( int n){
            if (n < 10) {
                return n;
            } else {
                return n % 10 + sumDigits(n / 10);
            }
        }
        int n = 123456;
        int sum = sumDigits(n);
        System.out.println(sum);
    }
}






