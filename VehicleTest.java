import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VehicleTest {
    private Car car;
    private Motorcycle motorcycle;

    @BeforeEach
    public void setUp() {
        car = new Car("TestCompany", "TestModel", 2020);
        motorcycle = new Motorcycle("TestCompany", "TestModel", 2020);
    }

    @Test
    public void testCarInstanceOfVehicle() {
        assertTrue(car instanceof Vehicle);
    }

    @Test
    public void testCarNumberOfWheels() {
        assertEquals(4, car.numWheels);
    }

    @Test
    public void testMotorcycleNumberOfWheels() {
        assertEquals(2, motorcycle.numWheels);
    }

    @Test
    public void testCarTestDriveSpeed() {
        car.testDrive();
        assertEquals(60, car.speed);
    }

    @Test
    public void testMotorcycleTestDriveSpeed() {
        motorcycle.testDrive();
        assertEquals(75, motorcycle.speed);
    }

    @Test
    public void testCarParkSpeed() {
        car.testDrive();
        car.park();
        assertEquals(0, car.speed);
    }

    @Test
    public void testMotorcycleParkSpeed() {
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.speed);
    }
}
