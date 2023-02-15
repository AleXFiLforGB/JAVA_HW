import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Collections;


public class HW3 {
    public static void main(String[] args) {
//1. Задача
        int[] n = {5, 4, 56, 48, 89, 12, 1, 45, 23};
        System.out.println(Arrays.toString(sortArray(n)));
//2. задача
        List<Integer> list = new ArrayList<>();
        fillList(list);
        printList(list);
        printList(evenDell(list));

//3. Задача
        ArrayList<Integer> myList = new ArrayList<>();
        fillList3(myList);
        printList3(myList);
        System.out.println(average(myList));
        System.out.println(Collections.max(myList));
        System.out.println(Collections.min(myList));
    }


    //        Реализовать алгоритм сортировки слиянием
    public static int[] sortArray(int[] array) {
        if (array == null) {
            return null;
        }
        if (array.length < 2) {
            return array;
        }

        int[] tempArr1 = new int[array.length / 2];
        System.arraycopy(array, 0, tempArr1, 0, array.length / 2);

        int[] tempArr2 = new int[array.length - tempArr1.length];
        System.arraycopy(array, tempArr1.length, tempArr2, 0, array.length - tempArr1.length);

        sortArray(tempArr1);
        sortArray(tempArr2);

        mergeArray(array, tempArr1, tempArr2);

        return array;
    }

    private static void mergeArray(int[] array, int[] tempArr1, int[] tempArr2) {

        int pos1 = 0;
        int pos2 = 0;

        for (int c = 0; c < array.length; c++) {
            if (pos1 == tempArr1.length) {
                array[c] = tempArr2[pos2];
                pos2++;
            } else if (pos2 == tempArr2.length) {
                array[c] = tempArr1[pos1];
                pos1++;
            } else if (tempArr1[pos1] < tempArr2[pos2]) {
                array[c] = tempArr1[pos1];
                pos1++;
            } else {
                array[c] = tempArr2[pos2];
                pos2++;
            }
        }
    }
    //Пусть дан произвольный список целых чисел, удалить из него четные числа
//
    public static void fillList(List<Integer> list) {
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int rnd = random.nextInt(100);
            list.add(rnd);
        }
    }

    public static void printList(List<Integer> list) {
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }

    public static List<Integer> evenDell(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(list.get(i));
                i -= 1;
            }
        }
        return list;
    }

    //Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
    public static void fillList3(List<Integer> list) {
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int rnd = random.nextInt(100);
            list.add(rnd);
        }
    }

    static double average(ArrayList<Integer> list) {
        double sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        return sum / list.size();
    }

    public static void printList3(List<Integer> list) {
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }
}

