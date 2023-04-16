package org.example;

//Реализовать простой калькулятор


import java.io.IOException;
import java.util.Scanner;

public class Task1_03 {
    public static void main(String[] args) throws IOException {
        int x, y;
        char op;
        int res = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите х= ");
        x = scanner.nextInt();
        System.out.print("введите y= ");
        y = scanner.nextInt();
        System.out.print("\nвведите оператор (+, -, *, /): ");
        op = scanner.next().charAt(0);

        while (true) {
            if (op == '+') {
                res = x + y;
            }
            if (op == '-') {
                res = x - y;
            }
            if (op == '*') {
                res = x * y;
            }
            if (op == '/') {
                res = x / y;
            }
            System.out.printf(x + " " + op + " " + y + " = " + res);
            break;
        }
    }
}
