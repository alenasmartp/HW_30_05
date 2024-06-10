package org.example;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
//  Дано натуральное число N. Выведите слово YES, если число N является точной
//  степенью двойки, или слово NO в противном случае.
//  Операцией возведения в степень пользоваться нельзя!

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (isPowerOfTwo(n)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }


    public static boolean isPowerOfTwo(int n) {
        if (n == 1) {
            return true;
        } else if (n % 2 == 0 || n != 0) {
            return isPowerOfTwo(n / 2);
        } else {
            return false;
        }
    }
}