package org.example;

public class Task4 {
    public static void main(String[] args) {
//  Напишите рекурсивный метод, который проверяет, является ли строка палиндромом
        String str = "racecar";
        if (isPalendrome(str)) {
            System.out.println(str + "is a palendrome");
        } else {
            System.out.println(str + "is not a palendrome");
        }
    }

    public static boolean isPalendrome(String str) {
        if (str.length() <= 1) {
            return true;
        }
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            return isPalendrome(str.substring(1, str.length() - 1));
        }
        return false;
    }
}
