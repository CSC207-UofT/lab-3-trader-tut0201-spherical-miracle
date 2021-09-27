import org.junit.*;

import static org.junit.Assert.*;


public class HwowTest {
    Hwow hwow;

    @Before
    public void setUp() {
        hwow = new Hwow();
    }

    @Test
    public void TestSound() {
        assertEquals("AAAAAAAAAAAAAAAAAAAAAAAH", hwow.sound());
    }

    @Test
    public void TestUpgradeSpeed() {
        hwow.upgradeSpeed();
        assertEquals(3, hwow.getMaxSpeed());
    }

    @Test
    public void TestDowngradeSpeed() {
        hwow.downgradeSpeed();
        assertEquals(1, hwow.getMaxSpeed());
    }

    @Test
    public void TestGetMaxSpeed() {
        assertEquals(2, hwow.getMaxSpeed());
    }

    @Test
    public void TestGetPrice() {
        assertEquals(-200, hwow.getPrice());
    }
}