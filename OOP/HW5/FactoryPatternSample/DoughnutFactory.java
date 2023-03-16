package HW5.FactoryPatternSample;

import homework5.FactoryPatternSample.doughnuts.AlmondDoughnut;
import homework5.FactoryPatternSample.doughnuts.CherryDoughnut;
import homework5.FactoryPatternSample.doughnuts.ChocolateDoughnut;

public class DoughnutFactory {

    private int almondDoughnutCount;
    private int chocolateDoughnutCount;
    private int cherryDoughnutCount;

    public DoughnutInterface getDoughnut(Fill type) {

        DoughnutInterface toReturn;

        switch (type) {
            case ALMOND -> {
                almondDoughnutCount++;
                toReturn = new AlmondDoughnut();
            }
            case CHERRY -> {
                cherryDoughnutCount++;
                toReturn = new CherryDoughnut();
            }
            case CHOCOLATE -> {
                chocolateDoughnutCount++;
                toReturn = new ChocolateDoughnut();
            }
            default -> throw new IllegalArgumentException ("No such filling available: " + type);
        }
        return toReturn;
    }

    public void printCounts() {
        System.out.println("Totally produced doughnuts:");
        System.out.println("Almond doughnuts: " + almondDoughnutCount);
        System.out.println("Cherry doughnuts: " + cherryDoughnutCount);
        System.out.println("Chocolate doughnuts: " + chocolateDoughnutCount);
    }
}
