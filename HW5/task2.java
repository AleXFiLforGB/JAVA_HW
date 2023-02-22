package HW5;

import java.util.*;

//2 .
//Пусть дан список сотрудников:
//Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.
public class task2 {
    public static void main(String[] args) {
        HashMap<Integer, String> workers = new HashMap<>();
        workers.put(1, "Иван Иванов");
        workers.put(2, "Светлана Петрова");
        workers.put(3, "Кристина Белова");
        workers.put(4, "Анна Мусина");
        workers.put(5, "Анна Крутова");
        workers.put(6, "Иван Юрин");
        workers.put(7, "Петр Лыков");
        workers.put(8, "Павел Чернов");
        workers.put(9, "Петр Чернышов");
        workers.put(10, "Марина Светлова");
        workers.put(11, "Мария Савина");
        workers.put(12, "Мария Рыкова");
        workers.put(13, "Мария Федорова");
        workers.put(14, "Марина Лугова");
        workers.put(15, "Анна Владимирова");
        workers.put(16, "Иван Мечников");
        workers.put(17, "Петр Петин");
        workers.put(18, "Иван Ежов");

        //Считаем количество повторений имени
        HashMap<String, Integer> popular = new HashMap<>();
        for (int i = 1; i <= workers.values().size(); i++) {
            String name = workers.get(i).substring(0, workers.get(i).indexOf(" "));
            if (popular.containsKey(name) == false) {
                popular.put(name, 1);
            } else {
                popular.put(name, (popular.get(name) + 1));
            }
        }

        //Сортируем по убыванию
        Map<Integer, ArrayList<String>> sortedMap = new TreeMap<>();
        for (Map.Entry<String, Integer> entry : popular.entrySet()) {
            if (entry.getValue() > 1) {
                if (!sortedMap.containsKey(entry.getValue()))
                    sortedMap.put(entry.getValue(), new ArrayList<>(List.of(entry.getKey())));
                else sortedMap.get(entry.getValue()).add(entry.getKey());
            }
        }
        //переворачиваем порядок
        sortedMap = new TreeMap<>(sortedMap).descendingMap();

        //вывод
        for (int key : sortedMap.keySet()) {
            for (String val : sortedMap.get(key)) {
                System.out.printf("%s - %d раза\n", val, key);
            }

        }
    }
}
