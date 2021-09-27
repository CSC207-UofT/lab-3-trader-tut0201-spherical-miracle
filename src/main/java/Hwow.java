public class Hwow implements Tradable, Domesticatable, Drivable {
    private int ms;

    public Hwow() {
        this.ms = 2;
    }

    @Override
    public String sound() {
        return "AAAAAAAAAAAAAAAAAAAAAAAH";
    }

    @Override
    public void upgradeSpeed() {
        this.ms++;
    }

    @Override
    public void downgradeSpeed() {
        this.ms--;
    }

    @Override
    public int getMaxSpeed() {
        return this.ms;
    }

    @Override
    public int getPrice() {
        return -200;
    }
}
