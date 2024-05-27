package ru.otus.lesson1;

import java.util.Random;
import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
/*        System.out.println("Begin");
        greetings();
        checkSign(1, 2, -53);
        checkSign(1, 2, -1);
        selectColor();
        compareNumbers();
        addOrSubtractAndPrint(10, 3, false);
        addOrSubtractAndPrint(10, 5, true); */

        /*Каждый метод последовательно вызовите из метода main();
(*) При запуске приложения, запросите у пользователя число от 1 до 5, и после ввода выполнения метод, соответствующий указанному номеру со случайным значением аргументов;
Домашнее задание сдается через Pull Request!*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 5");
        int metodNum = scanner.nextInt();
        if (metodNum == 1) {
            greetings();
        }
        if (metodNum == 2) {
            checkSign(1, 2, -53);
            checkSign(1, 2, -1);
        }
        if (metodNum == 3) {
            selectColor();
        }
        if (metodNum == 4) {
            compareNumbers();
        }
        if (metodNum == 5) {
            addOrSubtractAndPrint(10, 3, false);
            addOrSubtractAndPrint(10, 5, true);
        }

    }

    /*(1) Реализуйте метод greetings(), который при вызове должен отпечатать в столбец 4 слова: Hello, World, from, Java;*/
    public static void greetings() {
        System.out.println("Hello,\nWorld,\nfrom,\nJava;");
    }

    /*(2) Реализуйте метод checkSign(..), принимающий в качестве аргументов 3 int переменные a, b и c. Метод должен посчитать их сумму,
    и если она больше или равна 0, то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”;*/
    public static void checkSign(int a, int b, int c) {
        if (a + b + c >= 0) {
            System.out.println("Сумма положительная =" + (a + b + c));
        } else {
            System.out.println("Сумма отрицательная =" + (a + b + c));
        }

    }

    /*(3) Реализуйте метод selectColor() в теле которого задайте int переменную data с любым начальным значением.
    Если data меньше 10 включительно, то в консоль должно быть выведено сообщение “Красный”,
    если от 10 до 20 включительно, то “Желтый”,
    если больше 20 - “Зеленый”; */
    public static void selectColor() {
        Random rand = new Random();
        int data = rand.nextInt(30);
        if (data <= 10) {
            System.out.println("Красный =" + data);
        }
        if (data > 10 && data <= 20) {
            System.out.println("Желтый =" + data);
        }
        if (data > 20) {
            System.out.println("Зеленый =" + data);
        }
    }

    /*(4) Реализуйте метод compareNumbers(), в теле которого объявите две int переменные a и b с любыми начальными значениями.
    Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”;*/
    public static void compareNumbers() {
        Random rand = new Random();
        int a = rand.nextInt(100);
        int b = rand.nextInt(100);
        if (a >= b) {
            System.out.println("a >= b  " + a + ">=" + b);
        } else {
            System.out.println("a < b  " + a + "<" + b);
        }
    }

    /*(5) Создайте метод addOrSubtractAndPrint(int initValue, int delta, boolean increment).
    Если increment = true, то метод должен к initValue прибавить delta и отпечатать в консоль результат,
    в противном случае - вычесть;*/
    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment) {
            System.out.println(" +  " + (initValue + delta));
        } else {
            System.out.println(" -  " + (initValue - delta));
        }

    }

}

