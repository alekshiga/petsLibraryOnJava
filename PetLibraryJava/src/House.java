public class House {
    private String address;
    private String phoneNumber;
    private int howManyKidsLiving;

    public House(String address, String phoneNumber, int howManyKidsLiving) {
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.howManyKidsLiving = howManyKidsLiving;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Дом{").append("адрес: ").append(address).append(", номер телефона: ")
                .append(phoneNumber).append(", детей живёт: ").append(howManyKidsLiving).append('}');
        return builder.toString();
    }
}