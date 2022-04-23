package com.company;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Ввод
        System.out.println("Введите строку: ");
        String str = scanner.nextLine();
        String str2 = str.replace(" ", "");
        String str3 = str2.toLowerCase(Locale.ROOT);
        System.out.println("Ваша строка: " + str);
        int length = str3.length();
        char[] c = str3.toCharArray();
        int result = 0;
        int k = length - 1;
        if(length % 2 != 0){
            int a = (length / 2) + 1;
            for(int i = 0; i < a; i++, k--){
                if(c[i] == c[k]){
                    result++;
                }
            }
            if(result == (length / 2) + 1){
                System.out.println("Строка палиндром.");
            }
            else{
                System.out.println("Строка не палиндром.");
            }
        }
        if(length % 2 == 0){
            int a = length / 2;
            for(int i = 0; k >= a; i++, k--){
                if(c[i] == c[k]){
                    result++;
                }
            }
            if(result == length / 2){
                System.out.println("Строка палиндром.");
            }
            else{
                System.out.println("Число не палиндром.");
            }
        }
    }
}
