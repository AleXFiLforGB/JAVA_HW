package HW5.FactoryPatternSample;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        DoughnutFactory factory = new DoughnutFactory();

        DoughnutInterface almond = factory.getDoughnut(Fill.ALMOND);
        DoughnutInterface cherry = factory.getDoughnut(Fill.CHERRY);
        DoughnutInterface chocolate = factory.getDoughnut(Fill.CHOCOLATE);

        almond.eat();
        chocolate.eat();
        cherry.eat();

        for (int i = 0; i < 100; i++) {
            eatRandomDoughnut(factory);
        }

        factory.printCounts();
    }

    private static void eatRandomDoughnut(DoughnutFactory factory) {

        DoughnutInterface randomDoughnut = getRandomDoughnut(factory);

        System.out.println("What a surprise!");
        randomDoughnut.eat();
    }

    private static DoughnutInterface getRandomDoughnut(DoughnutFactory factory) {
        Random random = new Random();
        Fill randomFill = Fill.values()[random.nextInt(Fill.values().length)];
        return factory.getDoughnut(randomFill);
    }
}
