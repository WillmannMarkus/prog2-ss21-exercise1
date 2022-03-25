import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestFuelEstimator {

    void calculateFuelForMassOfTwelve() {
        int mass = 12;
        FuelEstimator fuelEstimator = new FuelEstimator();
        int fuel = fuelEstimator.calculateFuel(mass);

        assertEquals(2,fuel);

    }

}
