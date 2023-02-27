package HW6;


import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Notebook {
    private String firm;
    private String model;
    private String color;
    private String processor;
    private Double size;
    private String operatingSystem;
    private int memory;
    private int storage;

    public Notebook(String firm, String model, String color, String processor, Double size, String operatingSystem, int memory, int storage) {
        this.firm = firm;
        this.model = model;
        this.color = color;
        this.processor = processor;
        this.size = size;
        this.operatingSystem = operatingSystem;
        this.memory = memory;
        this.storage = storage;
    }
    public String getModel() {
        return model;
    }
    public String getFirm() {
        return firm;
    }
    public String getColor() {
        return color;
    }
    private String getProcessor() {
        return processor;
    }
    private double getSize() {
        return size;
    }
    private String getOperatingSystem() {
        return operatingSystem;
    }
    private int getMemory() {
        return memory;
    }
    private int getStorage() {
        return storage;
    }

    @Override
    public String toString() {
        return firm + " " + model + " " + color + " " + processor + " " + size + " " + operatingSystem + " " + memory + " "+ storage;
    }
    
    public static void filterNotebooks(Set<Notebook> setNb) {
        HashMap<Integer, String> questions = new HashMap<>();
        HashMap<Integer, String> filters = new HashMap<>();
        filters.put(1, "Цвет");
        filters.put(2, "Процессор");
        filters.put(3, "Дагональ");
        filters.put(4, "Операционная система");
        filters.put(5, "Оперативная память");
        filters.put(6, "Объем жесткого диска");
        questions.put(1, "Введите цвет: ");
        questions.put(2, "Введите желаемый процессор: ");
        questions.put(3, "Введите минимальную диагональ: ");
        questions.put(4, "Введите операционную сиситему: ");
        questions.put(5, "Введите минимальный оъём оперативной памяти: ");
        questions.put(6, "Введите минимальный объем жесткого диска: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите параметры фильтрации: ");
        filters.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });
        String filter = sc.nextLine();
        String[] nums = filter.split(" ");
        int[] intNums = new int[nums.length];
        HashMap<Integer, String> userFilters = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            intNums[i] = Integer.parseInt(nums[i]);
        }
        System.out.println("По вашему запросу: \n");
        for (var item : setNb) {
            StringBuilder sb = new StringBuilder();
            sb.append(item.getFirm() + " ");
            for(int j = 0; j < intNums.length; j++) {
                if(intNums[j] == 1) {
                    sb.append(item.getColor());
                }
                else if(intNums[j] == 2) {
                    sb.append(item.getProcessor());
                }
                else if(intNums[j] == 3) {
                    sb.append(item.getSize());
                }
                else if(intNums[j] == 4) {
                    sb.append(item.getOperatingSystem());
                }
                else if(intNums[j] == 5) {
                    sb.append(item.getMemory());
                }
                else if(intNums[j] == 6) {
                    sb.append(item.getStorage());
                }
                sb.append(" ");
            }
            System.out.println(sb);
        }
        System.out.println("\n Для дальнейшей фильтрации введите нижние границы параметров в таком же формате, как в выборке выше");
        System.out.println("(Названия пишите с заглавной буквы) \n");
        for (int i = 0; i < intNums.length; i++) {
            System.out.println(questions.get(intNums[i]));
                if (sc.hasNextLine()) {
                userFilters.put(intNums[i], sc.nextLine());
                }
        }
        sc.close();
        System.out.println("Результаты фильтрации: ");
        StringBuilder res = new StringBuilder();
        
        for (var item : setNb) {
            int counter = 0;
            for(int j = 0; j < intNums.length; j++) {
                if (intNums[j] == 1 && (item.getColor().equals(userFilters.get(intNums[j])))) {
                    counter++;
                }
                else if (intNums[j] == 2 && (item.getProcessor().equals(userFilters.get(intNums[j])))) {
                    counter++;
                }
                else if (intNums[j] == 3 && (item.getSize() >= Double.parseDouble(userFilters.get(intNums[j])))) {
                    counter++;
                }
                else if (intNums[j] == 4 && (item.getOperatingSystem().equals(userFilters.get(intNums[j])))) {
                    counter++;
                }
                else if (intNums[j] == 5 && (item.getMemory() >= Integer.parseInt(userFilters.get(intNums[j])))) {
                    counter++;
                }
                else if (intNums[j] == 6 && (item.getStorage() >= Integer.parseInt(userFilters.get(intNums[j])))) {
                    counter++;
                }
            }
            if (counter == intNums.length) res.append(item + "\n ");
        }
        if(res.isEmpty()) System.out.println("По вашему запросу ничего не найдено");
        else System.out.println(res);
        
    } 
}
