package seminars.second.hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    void carIsInstanceOfVehicle() {
        Car car = new Car("Porsche", "Boxster", 2013);
        assertTrue(car instanceof Vehicle);
    }

    @Test
    void carHasFourWheels() {
        Car car = new Car("Porsche", "Boxster", 2013);
        assertEquals(4, car.getNumWheels());
    }

    @Test
    void motorcycleHasTwoWheels() {
        Motorcycle motorcycle = new Motorcycle("Suzuki", "Hayabusa", 2013);
        assertEquals(2, motorcycle.getNumWheels());
    }

    @Test
    void carAcceleratesTo60DuringTestDrive() {
        Car car = new Car("Porsche", "Boxster", 2013);
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    @Test
    void motorcycleAcceleratesTo75DuringTestDrive() {
        Motorcycle motorcycle = new Motorcycle("Suzuki", "Hayabusa", 2013);
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    @Test
    void carStopsWhenParked() {
        Car car = new Car("Porsche", "Boxster", 2013);
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }

    @Test
    void motorcycleStopsWhenParked() {
        Motorcycle motorcycle = new Motorcycle("Suzuki", "Hayabusa", 2013);
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }
}