import org.junit.*;

import static org.junit.Assert.*;


public class HumanTest {
    Human h;

    @Before
    public void setUp() throws Exception {
        h = new Human();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("I am a human", h.sound());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(69, h.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        h.upgradeSpeed();
        assertEquals(90, h.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        h.downgradeSpeed();
        assertEquals(48, h.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(98, h.getPrice());
    }

}