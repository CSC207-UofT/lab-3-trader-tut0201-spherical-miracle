public class Truck implements Drivable, Tradable {

    private int maxSpeed;
    private int price;
    private int loadcapacity;


    public Truck() {
        this(200, 150000);
    }

    /**
     * Construct a truck that costs price with a maximum speed of maxSpeed km/h.
     * @param maxSpeed - the maximum speed of this Truck
     * @param price - the cost of this Truck
     */
    public Truck(int maxSpeed, int price) {
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed += 10;
    }

    @Override
    public void downgradeSpeed() {
        int i = 10;
        this.maxSpeed -= i;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    /**
     * Return the load capacity of this Truck.
     * @return The current load capacity of this Truck.
     */
    public int getLoadcapacity() {
        return this.loadcapacity;
    }
}

