package org.example;


//Вывести все простые числа от 1 до 1000

import java.util.ArrayList;
import java.util.List;

public class task1_02
{
    public static void main(String[] args)
    {
        int number = 100;
        List<Integer> array = new ArrayList<>();
        for (int i = 2; i <= number ; i++)
        {
            boolean isPrimeNumber = true;
            for (int j = 2; j < i; j++)
            {
                if (i % j == 0)
                {
                    isPrimeNumber = false;
                    break;
                }
            }

            if (isPrimeNumber)
            {
                array.add(i);
            }
        }
        System.out.println("Простые числа: " + array);
    }
}
