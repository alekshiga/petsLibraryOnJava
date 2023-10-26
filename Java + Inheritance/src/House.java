public abstract class House {
    public final String address;
    public String phoneNumber;
    public int howManyKidsLiving;
    public int flatNumber;

    public House(String address, String phoneNumber, int howManyKidsLiving) {
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.howManyKidsLiving = howManyKidsLiving;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getHowManyKidsLiving() {
        return howManyKidsLiving;
    }

    public void setHowManyKidsLiving(int howManyKidsLiving) {
        this.howManyKidsLiving = howManyKidsLiving;
    }

    @Override
    public abstract String toString();

    public abstract int getFlatNumber();

    public static class Flat extends House {

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
            return "Квартира{" +
                    "адрес: " + address + ", квартира №" + flatNumber + ", " +
                    "номер телефона: " + phoneNumber + ", " +
                    "детей живёт: " + howManyKidsLiving + '}';
        }
    }

    public static class PrivateHouse extends House {

        public PrivateHouse(String address, String phoneNumber, int howManyKidsLiving) {
            super(address, phoneNumber, howManyKidsLiving);
            this.flatNumber = 0;
        }

        public int getFlatNumber() {
            return this.flatNumber;
        }

        @Override
        public String toString() {
            return "Частный дом{" +
                    "адрес: " + address + ", " +
                    "номер телефона: " + phoneNumber + ", " +
                    "детей живёт: " + howManyKidsLiving + '}';
        }
    }
}