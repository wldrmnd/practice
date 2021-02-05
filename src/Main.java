import java.util.Scanner;

/*
1) метод, который возвращает большее из двух чисел
например int maxValue = getMaxValue(10, 5);
         (maxValue == 5) - true

2) метод, который возвращает сумму чисел до числа N
например int sum = getSumToN(10)
         sum у меня будет равен 1 + 2 + 3 + 4 + ... + 9 + 10 = 55

3) метод, который возвращает мне наибольшую из сумм до чилса n
например int sum1 = getSumToN(5)
         sum1 у меня будет равен 1 + 2 + 3 + 4 + 5 = 15
         int sum2 = getSumToN(10);
         sum2 у меня будет равен 55

         и метод getMaxSum(5,10) у меня должен будет вернуть 55
         так как сумма до 5 у меня 15,
         сумма до 10 у меня 55,
         55 > 15, возвращаю 55

4) метод, который разбивает строку и добавляет через каждый
символ пробел
например, String name = "Егор"
          printNewName("Егор");
          String s = "Даник"
          s.charAt(0) = "Д" (s.charAt(index) - возвращает мне символ,
          который находится в строке под индексом index (index должен быть типа int)
          s.charAt(1) = "а"
          в консоль у меня будет вывод - "Е г о р"

5) метод, который считает количество букв 'а' в строке :)
например, String localString = "aaaa"
          int countOfALetters = getCountOfALetters(localString);
          теперь countOfALetters у меня будет = 4, потому что в строке
          localString у меня 4 буквы 'a'

6) метод, который будет возвращать, какая длина у наибольшей из двух строку
например, строка1 = "abc"
          строка2 = "abcd"
          int maxLength = getMaxLength(строка1, строка2) - у меня вернет 4,
          потому что длина строки2 > длины строки1
          и длина строки2 у меня 4 символа :)

7) найти и вывести мне все числа, на которое делится число n
например, число n у меня = 8,
          я должен получить вывод: 1, 2, 4

8) умножить кажое число из массива на 1.5, вывести новые числа массива
например, double[] localArray = { 1, 2, 3 }
          multiplication(localArray);
          вывод: 1.5 3 4.5
 */
public class Main {
    public static void main(String[] args) {
        //задача номер 1
        int maxValue = getMaxValue(2, 5);
        System.out.println(maxValue);
        //задача номер 2
        int sum = getSumToN(10);
        System.out.println(sum);
        //задача номер 3
        int maxSum = getMaxValue(getSumToN(5), getSumToN(10));
        System.out.println(maxSum);
        //задача номер 4
        getNewName("Егор");
        //задача номер 5
        int numberOfALetters = getNumberOfALetters("aaa");
        System.out.println(numberOfALetters);
        //задача номер 6
        int maxLength = getMaxLength("abc","abcd");
        System.out.println(maxLength);
        //задача номер 7
        printDividers(8);
        //задача номер 8
        double[] localArray = { 1, 2, 3 };
        multiplication(localArray);
    }

    private static int getSumToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    private static int getMaxValue(int first, int second) {
        return Math.max(first, second);
    }

    private static void getNewName(String name) {
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i) + " ");
        }
    }

    private static int getNumberOfALetters(String someString) {
        int countALetters = 0;
        for (int i = 0; i < someString.length(); i++) {
            if (someString.charAt(i) == 'a') {
                countALetters++;
            }
        }
        return countALetters;
    }

    private static int getMaxLength(String a, String b) {
        return Math.max(a.length(), b.length());
    }

    private static void printDividers(int number) {
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    private static void multiplication(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] * 1.5 + " ");
        }
    }
}
