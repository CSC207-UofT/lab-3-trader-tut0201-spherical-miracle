/* A sample class that implements the given interfaces.
 */
public class Tianji implements Drivable, Domesticatable, Tradable {
    private int maxSpeed;
    public static animes_watched = 0;


    public Tianji() {
        this.maxSpeed = 137;
        animes_watched++;
    }

    public boolean fav_anime(String: anime){
        if (anime == "Tokyo revengers") {
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String sound() {
        return "My BesTO FriEnDO!";
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed++;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed--;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public String getPrice() {
        return this.maxSpeed;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }
}
