package homeWork3;

public class Main {
    public static void main(String[] args) {
        HomeWork hw = new HomeWork();

        hw.task1ForOddFrom1To99();

        int f = 5;
        System.out.println("\n\nTask2. Factorial (use for) number " + f + " is " + hw.task2Factorial(f));

        hw.task3_1WhileOddFrom1To99();

//        f = 6;
        System.out.println("\n\nTask3.2. Factorial (use while) number " + f + " is " + hw.task3_2WhileFactorial(f));

        hw.task4_1DoWhileOddFrom1To99();

        System.out.println("\n\nTask4.2. Factorial (use do..while) number " + f + " is " + hw.task4_2DoWhileFactorial(f));

        double x = 5d;
        double n = 3;
        System.out.println("\nTask5. Number " + x + " to the " + n +" power is " + hw.task5XPowN(x, n));

        hw.task6FirstTenSubsequence();

        hw.task7MultiplicationTable();

        hw.task8FirstTenOddNumbers();

        hw.task9PrintMinNumberArray(8);

        hw.task11ChangeMinMaxInArray(6);
    }
}
