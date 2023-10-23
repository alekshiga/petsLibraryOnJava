import java.util.Scanner;

public class House {
    private String address;
    private String phoneNumber;
    private String howManyKidsLiving;

    public House(String address, String phoneNumber, String howManyKidsLiving) {
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

    public String getHowManyKidsLiving() {
        return howManyKidsLiving;
    }

    public void setHowManyKidsLiving(String howManyKidsLiving) {
        this.howManyKidsLiving = howManyKidsLiving;
    }

    @Override
    public String toString() {
        return "Дом{" +
                "адрес: " + address +
                ", номер телефона: " + phoneNumber +
                ", детей живёт: " + howManyKidsLiving +
                '}';
    }
}