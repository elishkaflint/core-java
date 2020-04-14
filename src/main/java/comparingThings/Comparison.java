package comparingThings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparison {

    public static void main(String[] args) {

        List<ComparableCar> comparableCars = new ArrayList<>();

        comparableCars.add(new ComparableCar("Ford Fiesta", 80));
        comparableCars.add(new ComparableCar("Volkswagen Beetle", 60));
        comparableCars.add(new ComparableCar("Audi TT", 100));

        System.out.println("\nComparable cars before sorting:");
        comparableCars.forEach(car -> System.out.println(car.getName()));

        Collections.sort(comparableCars);

        System.out.println("\nComparable cars after sorting:");
        comparableCars.forEach(car -> System.out.println(car.getName()));


        List<NormalCar> normalCars = new ArrayList<>();
        normalCars.add(new NormalCar("Ford Fiesta", 80));
        normalCars.add(new NormalCar("Volkswagen Beetle", 60));
        normalCars.add(new NormalCar("Audi TT", 100));

        System.out.println("\nNormal cars before sorting:");
        normalCars.forEach(car -> System.out.println(car.getName()));

        CarSpeedComparator carSpeedComparator = new CarSpeedComparator();
        Collections.sort(normalCars, carSpeedComparator);

        System.out.println("\nNormal cars after sorting:");
        normalCars.forEach(car -> System.out.println(car.getName()));

    }
}
