package HW2.Tests;

import HW2.Car;
import HW2.Vehicle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CarTest {

    @Test
    void testInstanceOfVehicle() {
        Car car = new Car("Toyota", "Camry", 2022);
        assertTrue(car instanceof Vehicle);
    }

    @Test
    void testCarHasFourWheels() {
        Car car = new Car("Ford", "Mustang", 2023);
        assertEquals(4, car.getNumWheels());
    }

    @Test
    void testCarTestDriveSpeed() {
        Car car = new Car("Honda", "Civic", 2021);
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    @Test
    void testCarPark() {
        Car car = new Car("Chevrolet", "Impala", 2020);
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }
}