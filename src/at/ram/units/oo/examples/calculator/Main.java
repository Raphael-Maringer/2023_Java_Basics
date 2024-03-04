package at.ram.units.oo.examples.calculator;


public class Main {

    public static void main(String[] args) {

        BaseCalculator bc1 = new BaseCalculator();
        ScientificCalculator sc1 = new ScientificCalculator();
        RootCalculator rc1 = new RootCalculator();

        bc1.selection();
        sc1.scientificSelection();
        rc1.rootSelection();
    }

}