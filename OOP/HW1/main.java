import drinks.HotDrink;
import vendingMachine.HotDrinkVendingMachine;

public class Main {
    public static void main(String[] args) {
        HotDrink latte = new HotDrink("latte", 100, 70);
        HotDrink espresso = new HotDrink("espresso", 50, 80);
        HotDrink cappuccino = new HotDrink("cappuccino", 200, 80);

        HotDrinkVendingMachine machine = new HotDrinkVendingMachine();
        machine.addDrink(latte);
        machine.addDrink(espresso);
        machine.addDrink(cappuccino);
        
        System.out.println(machine);
        System.out.println(machine.getDrink("espresso", 80));
        System.out.println(machine);

    }
}
