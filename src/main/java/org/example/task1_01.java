//Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class task1_01
{
    public static void main(String[] args)
    {
        System.out.printf("Введите число n: ");
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int summ = 0;
        int composition = 1;
        for (int i = 1; i <= n; i++)
        {
            summ += i;
            composition *= i;
        }
        System.out.printf("Сумма чисел от 1 до %d: %d%n", n, summ);
        System.out.printf("Произведение чисел от 1 до %d: %d%n", n, composition);
        num.close();
    }
}
