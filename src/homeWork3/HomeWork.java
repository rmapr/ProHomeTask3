package homeWork3;

import java.util.Scanner;

public class HomeWork {

    //1   За допомогою циклу for вивести на екран непарні числа від 1 до 99.
    public void task1ForOddFrom1To99() {
        System.out.println("Task1. Use for print odd from 1 to 99:");
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) System.out.print(i + " ");
        }
    }

    //2   Дано число n за допомогою циклу for порахувати факторіал n!
    public int task2Factorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result *= i;
        }
        return result;
    }

    //3   Перепишіть програми 1 та 2 за допомогою циклу while.
    public void task3_1WhileOddFrom1To99() {
        System.out.println("\nTask3.1. Use while print odd from 1 to 99:");
        int i = 1;
        while (i <= 99) {
            if (i % 2 != 0) System.out.print(i + " ");
            i++;
        }
    }

    public int task3_2WhileFactorial(int f) {
        int result = 1;
        int i = 1;
        while (i <= f) {
            result *= i;
            i++;
        }
        return result;
    }

    //4   Перепишіть програми 1 та 2 із використанням циклу do - while.
    public void task4_1DoWhileOddFrom1To99() {
        System.out.println("\nTask4.1. Use do..while print odd from 1 to 99:");
        int i = 1;
        do {
            if (i % 2 != 0) System.out.print(i + " ");
            i++;
        } while (i <= 99);
    }

    public int task4_2DoWhileFactorial(int f) {
        int result = 1;
        int i = 1;
        do {
            result *= i;
            i++;
        } while (i <= f);
        return result;
    }

    //5   Дано змінні x і n обчислити x^n.
    public double task5XPowN(double x, double n) {
        return Math.pow(x, n);
    }

    //6   Вивести 10 перших чисел послідовності 0, -5,-10,-15.
    public void task6FirstTenSubsequence() {
        System.out.println("\nTask6. First 10 subsequence 0, -5, -10,-15:");
        int[] array = new int[10];
        int count = 0;
        while (count < 10) {
            if (count == 0) array[count] = 0;
            else array[count] = array[count - 1] - 5;
            count++;
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    //    7   Необхідно вивести на екран таблицю множення на Х: (будь-яке число, що вводиться з консолі)
    public void task7MultiplicationTable() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\nTask7. Enter number 1..10: ");
        int x = sc.nextInt();
        System.out.println("Multiplication table for " + x);
        for (int i = 1; i < 11; i++) {
            System.out.println(x + " * " + i + " = " + x * i);
        }
        sc.close();
    }

    // 8   Створіть масив, що містить 10 перших непарних чисел.
//    Виведіть елементи масиву на консоль в один рядок, розділяючи комою.
    public void task8FirstTenOddNumbers() {
        System.out.println("\nTask8. First 10 odd numbers:");
        int[] arrayOdd = new int[10];
        int i = 1;
        int count = 0;
        while (count < 10) {
            if (i % 2 != 0) {
                arrayOdd[count] = i;
                count++;
            }
            i++;
        }
        for (int j : arrayOdd) {
            if (j == arrayOdd[arrayOdd.length - 1]) System.out.print(j + ".");
            else System.out.print(j + ", ");
        }
    }

    //9   Даний масив розмірності N, знайти найменший елемент масиву і вивести на консоль
    public void task9PrintMinNumberArray(int n) {
        int[] array = new int[n];
        int minRange = -50;
        int maxRange = 50;
        System.out.println("\n\nTask9&10. Find min/max number in array:");
        for (int i = 0; i < n; i++) {
            array[i] = (int) Math.round(((Math.random() * ((maxRange - minRange) + 1)) + minRange) * 100) / 100;
        }
        int min = array[0];
//10  У масиві із завдання 9. Визначити найбільший елемент.
        int max = array[0];
        for (int ar : array) {
            System.out.print(ar + " ");
            if (ar < min) min = ar;
            if (ar > max) max = ar;

        }
        System.out.print("\nMin number in array: " + min);
        System.out.print("\nMax number in array: " + max);
    }

    //    11  Поміняти максимальний і найменший елементи масиву місцями.
//    Приклад: дано масив {4, -5, 0, 6, 8}. Після заміни виглядатиме {4, 8, 0, 6, -5}.
    public void task11ChangeMinMaxInArray(int n) {
        int[] array = new int[n];
        int minRange = -50;
        int maxRange = 50;
        System.out.println("\n\nTask11. Change min max in places on array:");
        for (int i = 0; i < n; i++) {
            array[i] = (int) Math.round(((Math.random() * ((maxRange - minRange) + 1)) + minRange) * 100) / 100;
        }
        int min = array[0];
        int indexMin = 0;
        int max = array[0];
        int indexMax = 0;

        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
            if (array[j] < min) {
                min = array[j];
                indexMin = j;
            }
            if (array[j] > max) {
                max = array[j];
                indexMax = j;
            }
        }
        array[indexMin] = max;
        array[indexMax] = min;
        System.out.println("\nNew array:");
        for (int ar : array) {
            System.out.print(ar + " ");
        }
    }
}