package comparingThings;

public class ComparableCar implements Comparable<ComparableCar> {

    private String name;
    private int maxSpeed;

    public ComparableCar(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public int compareTo(ComparableCar otherCar) {
        return this.maxSpeed - otherCar.getMaxSpeed();
    }

}
