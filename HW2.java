package HW;

import java.util.Scanner;
import java.util.logging.*;
import java.io.IOException;

public class HW2 {
    public static void main(String[] args) throws SecurityException, IOException {
        int[] nums = { 5, 45 ,456, 94, 23, 78,2, 13 };
        bubbleSort(nums);
        calculate();

    }

    public static void bubbleSort(int[] arr) throws IOException {
        Logger logger = Logger.getLogger("MyLog");
        logger.setUseParentHandlers(false);
        FileHandler fh;

        try {
            fh = new FileHandler("log.txt");
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);

        } catch (IOException e) {
            e.printStackTrace();
        }
        int temp = 0;
        String text = "";
        for (int k = 0; k < arr.length; k++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    text = String.format("Поменяли местами число %d и %d \n", arr[i + 1], arr[i]);
                    logger.info(text);

                } else {
                    text = "Ничего не поменяли местами \n";
                    logger.info(text);

                }
            }
        }

    }



    public static void calculate() {
        Logger logger = Logger.getLogger("MyLog2");
        logger.setUseParentHandlers(false);
        FileHandler fh;

        try {
            fh = new FileHandler("calcLog.txt");
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);

        } catch (IOException e) {
            e.printStackTrace();
        }
        int result = 0;
        Scanner sc = new Scanner(System.in);
        String logStr = "Результат - ";

        while (true) {
            System.out.print("Введите операцию +-*/ либо команду stop для выхода из калькулятора ");
            String op = sc.next();
            logger.info("Ввел " + op);
            System.out.print("Введите первое число: ");
            int a = sc.nextInt();
            logger.info(getText(a));
            System.out.print("Введите второе число: ");
            int b = sc.nextInt();
            logger.info(getText(b));

            if (op.equals("stop")) {
                logger.info(op);
                break;
            } else if (op.equals("+")) {
                result = a + b;
                logger.info(logStr + result);
                System.out.println(result);
            } else if (op.equals("-")) {
                result = a - b;
                logger.info(logStr + result);
                System.out.println(result);
            } else if (op.equals("*")) {
                result = a * b;
                logger.info(logStr + result);
                System.out.println(result);
            } else {
                result = a / b;
                logger.info(logStr + result);
                System.out.println(result);
            }
        }
        sc.close();

    }

    private static String getText(int value) {
        return "Пользователь ввёл число " + Integer.toString(value);
    }
}

