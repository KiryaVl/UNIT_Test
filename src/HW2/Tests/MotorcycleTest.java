package HW2.Tests;

import HW2.Motorcycle;
import HW2.Vehicle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


class MotorcycleTest {

    @Test
    void testInstanceOfVehicle() {
        Motorcycle motorcycle = new Motorcycle("Yamaha", "FZ-07", 2022);
        assertTrue(motorcycle instanceof Vehicle);
    }

    @Test
    void testMotorcycleHasTwoWheels() {
        Motorcycle motorcycle = new Motorcycle("Suzuki", "GSX-R750", 2023);
        assertEquals(2, motorcycle.getNumWheels());
    }

    @Test
    void testMotorcycleTestDriveSpeed() {
        Motorcycle motorcycle = new Motorcycle("Kawasaki", "Ninja 300", 2020);
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    @Test
    void testMotorcyclePark() {
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2021);
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }
}
