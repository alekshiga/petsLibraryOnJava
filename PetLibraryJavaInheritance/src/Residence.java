public class Residence {
    private House whereLiving;
    private Owner whoLiving;

    public Residence(House whereLiving, Owner whoLiving) {
        this.whereLiving = whereLiving;
        this.whoLiving = whoLiving;
    }

    public House getWhereLiving() {
        return whereLiving;
    }

    public void setWhereLiving(House whereLiving) {
        this.whereLiving = whereLiving;
    }

    public Owner getWhoLiving() {
        return whoLiving;
    }

    public void setWhoLiving(Owner whoLiving) {
        this.whoLiving = whoLiving;
    }
}