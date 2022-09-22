package by.itstep.tia.util;

import java.sql.SQLOutput;
import java.util.Scanner;

public class UserInput {
    public static String inputString(String prompt){
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        String input = scanner.nextLine();
        scanner.close();
        return input;
    }
    public static int inputNumber(String prompt){
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        int number = scanner.nextInt();
        scanner.close();
        return number;
    }
}
