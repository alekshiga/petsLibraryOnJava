import java.util.Scanner;

public class Pet {
    private Animal animal;
    private Residence residence;

    public Pet(Animal animal, Residence residence) {
        this.animal = animal;
        this.residence = residence;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Residence getResidence() {
        return this.residence;
    }

    public void setResidence(Residence residence) {
        this.residence = residence;
    }

    @Override
    public String toString() {
        return "Питомец{" +
                "имя: " + animal.getName() +
                ", хозяин: " + residence.getWhoLiving().getName() +
                ", дом: " + residence.getWhereLiving().getAddress() +
                '}';
    }
}