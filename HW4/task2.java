package HW4;

import java.util.LinkedList;

public class task2 {
    public static void main(String[] args) {

        LinkedList<Integer> linkList = new LinkedList<>();
        for (int i = 1; i < 11; i++) {
            linkList.add(i);
        }

        System.out.println(linkList);

        enqueue(linkList, 7);
        System.out.println(linkList);

        System.out.println(dequeue(linkList));
        System.out.println(linkList);

        System.out.println(first(linkList));
    }

    public static void enqueue(LinkedList<Integer> list, int num) {
        list.addLast(num);
    }

    public static int dequeue(LinkedList<Integer> list) {
        int num = 0;
        num = list.get(0);
        list.remove(0);
        return num;
    }

    public static int first(LinkedList<Integer> list) {
        int num = 0;
        num = list.get(0);
        return num;
    }
}
