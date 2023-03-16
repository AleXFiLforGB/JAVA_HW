package HW5.FactoryPatternSample.doughnuts;

import HW5.FactoryPatternSample.DoughnutInterface;

public class AlmondDoughnut implements DoughnutInterface {
    @Override
    public void eat() {
        System.out.println("You're eating an almond doughnut!");
    }
}
