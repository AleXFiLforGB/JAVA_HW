package HW6;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set <Notebook> notebooks = new HashSet<>();
        Notebook n1 = new Notebook("Huawei", "Matebook d15", "Silver", "IntelCore i5", 15.6, "Windows 11", 16, 256); 
        Notebook n2 = new Notebook("Irbis", "NB79", "Blue", "Intel Celeron", 13.3, "Windows 10", 4, 64);
        Notebook n3 = new Notebook("ASUS", "D543MA", "Silver", "Intel Pentium Silver", 15.6, "without OS", 4, 256);
        Notebook n4 = new Notebook("Acer", "A315-34", "Black", "Intel Celeron", 15.6, "Windows 10", 4, 128);
        Notebook n5 = new Notebook("Tecno", "Megabook T1", "Grey", "Intel UHD", 15.6, "Linux", 12, 256);
        Notebook n6 = new Notebook("HP", "Laptop 15s", "Grey", "Athlon Silver 3050U", 15.6, "without OS", 8, 256);
        Notebook n7 = new Notebook("Chuwi", "CoreBook XPro", "Grey", "IntelCore i5", 15.6, "Windows 11", 16, 512);
        Notebook n8 = new Notebook("Huawei", "Matebook d14", "Silver", "IntelCore i5", 14.0, "Windows 11", 8, 256);
        notebooks.add(n1);
        notebooks.add(n2);
        notebooks.add(n3);
        notebooks.add(n4);
        notebooks.add(n5);
        notebooks.add(n6);
        notebooks.add(n7);
        notebooks.add(n8);
        
        Notebook.filterNotebooks(notebooks);
        
    }
}
