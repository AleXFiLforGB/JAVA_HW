package HW4;
import java.util.LinkedList;
//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
public class task1 {

        public static void main(String[] args) {
            LinkedList <Integer> ld = new LinkedList<>();
            ld.add(2);
            ld.add(4);
            ld.add(6);
            ld.add(7);
            ld.add(8);
            System.out.println(ld);
            System.out.println(reversList(ld));

        }
        public static LinkedList<Integer> reversList(LinkedList<Integer> l) {
            int temp = 0;
            int len = l.size() - 1;
            for (int i = 0; i < l.size()/2; i++) {
                temp = (int)l.get(i);
                l.set(i, (int)l.get(len - i));
                l.set(len - i, temp);
            }
            return l;
        }
    }
