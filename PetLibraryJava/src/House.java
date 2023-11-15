public class House {
    protected final String address;
    protected String phoneNumber;
    protected int howManyKidsLiving;

    protected House(String address, String phoneNumber, int howManyKidsLiving) {
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.howManyKidsLiving = howManyKidsLiving;
    }

    public String toString() {
        return "Private house{" +
                "address: " + address + ", " +
                "phone number: " + phoneNumber + ", " +
                "kids living: " + howManyKidsLiving + '}';
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public int getHowManyKidsLiving() {
        return howManyKidsLiving;
    }

    public void setHowManyKidsLiving(int howManyKidsLiving) {
        this.howManyKidsLiving = howManyKidsLiving;
    }

    public static class Flat extends House {

        private int flatNumber;
        private boolean areNeighborsAngry;

        public Flat(String address, int flatNumber, String phoneNumber, int howManyKidsLiving, boolean areNeighborsAngry) {
            super(address, phoneNumber, howManyKidsLiving);
            this.areNeighborsAngry = areNeighborsAngry;
            this.flatNumber = flatNumber;
        }

        public void setAreNeighborsAngry(boolean areNeighborsAngry) {
            this.areNeighborsAngry = areNeighborsAngry;
        }

        public final int getFlatNumber() {
            return this.flatNumber;
        }

        @Override
        public String toString() {
            return "Flat{" +
                    "address: " + address + ", flat №" + flatNumber + ", " +
                    "phone number: " + phoneNumber + ", " +
                    "kids living: " + howManyKidsLiving + '}';
        }
    }
}