import java.util.ArrayList;
import java.util.Scanner;

public class HW1 {
    //1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
    //Вычисление треугольника
    static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    //факториал
    static int factor(int n) {
        int multi = 1;
        for (int i = 1; i <= n; i++) {
            multi *= i;
        }

        return multi;
    }

    //2. Вывести все простые числа от 1 до 1000
    static void simpleNums(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == j) {
                    System.out.println(i);
                    break;
                } else if (i % j == 0 && j != 1) {
                    break;
                }
            }
        }
    }

    //3. Реализовать простой калькулятор
    static void calculater() {
        Scanner console = new Scanner(System.in);
        System.out.println("Добро пожаловать в калькулятор. \n Введите первое число: ");
        double numOne = console.nextDouble();
        System.out.println("Что будем делать с числом \n Укажите символ соответствующий операции: \n 1 сложение \n 2 вычитание \n 3 умножение \n 4 деление.");
        int symbol = console.nextInt();
        System.out.println("Укажите второе число: ");
        double numTwo = console.nextDouble();

        if (symbol == 1) {
            System.out.println(numOne + numTwo);
        }
        if (symbol == 2) {
            System.out.println(numOne - numTwo);
        }
        if (symbol == 3) {
            System.out.println(numOne * numTwo);
        }
        if (symbol == 4) {
            System.out.println(numOne / numTwo);
        }
    }

    //4. Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69.
    // Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет
    static void equation() {
        int numOne = 0;
        int numTwo = 0;
        boolean hasSolution = false;

        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                if ((20 + i) + ((10 * j) + 5) == 69) {
                    numOne = i;
                    numTwo = j;
                    hasSolution = true;
                }
            }
        }
        if (hasSolution == true) {
            System.out.println("Искомое уравнение 2" + numOne + " + " + numTwo + "5 = 69");
        } else {
            System.out.println("Решение данного уравнения отсутствует");
        }
    }

    //5. 5 Дан массив nums = [3, 2, 2, 3] и число val = 3.
    //Если в массиве есть числа, равные заданному нужно перенести эти элементы в конец массива.
    //Таким образом, первые несколько (или все) элементов масива должны быть отличны от заданного, а остальные - равны ему.

    static void sortArr() {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int point = nums.length - 1;
            while (nums[point] == val) {
                point -= 1;
            }
        for (int i = 0; i < point; i++) {
            if (nums[i] == val) {
                nums[i] = nums[point];
                nums[point] = val;
                point -= 1;
            }
        }
        for (int i = 0; i <= nums.length - 1; i++) {
            System.out.print(nums[i]);
        }
    }

    public static void main(String[] args) {


        System.out.println(factor(5));
        System.out.println(sum(5));
        simpleNums(1000);
        calculater ();
        equation();
        sortArr();

    }

}
