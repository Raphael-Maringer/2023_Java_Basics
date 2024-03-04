package at.ram.units.oo.examples.ISaHASa;

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Animal(40, 20);
        Animal a2 = new Animal(50, 30);

        Zoo z1 = new Zoo("Kinderzoo", "Elefantenstraße");

        z1.addAnimal(a1);
        z1.addAnimal(a2);
        z1.printAnimals();

    }
}
