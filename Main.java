package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Ввод
        System.out.println("Введите строку: ");
        String str = scanner.nextLine();
        String str2 = str.replace(" ", "");
        StringBuilder sb = new StringBuilder(str2);
        if (str2.equals(sb.reverse().toString())){
            System.out.println("Строка палиндром");
        }
        else {
            System.out.println("Строка не палиндром");
        }
        }
    }
