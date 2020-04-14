package comparingThings;

import java.util.Comparator;

public class CarSpeedComparator implements Comparator<NormalCar> {

    @Override
    public int compare(NormalCar firstCar, NormalCar secondCard) {
        return firstCar.getMaxSpeed() - secondCard.getMaxSpeed();
    }

}
