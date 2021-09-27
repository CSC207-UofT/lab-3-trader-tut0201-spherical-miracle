/* A sample class that implements the given interfaces.
 */
public class Human implements Drivable, Domesticatable, Tradable {
    private int maxSpeed;

    public Human() {
        this.maxSpeed = 69;
    }

    @Override
    public String sound() {
        return "I am a human";
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed += 21;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed += -21;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return 99;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }
}

