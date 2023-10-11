public class Pet {
    private Owner owner;
    private Animal animal;
    private House house;

    public Pet(Owner owner, Animal animal, House house) {
        this.owner = owner;
        this.animal = animal;
        this.house = house;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    @Override
    public String toString() {
        return "Питомец{" +
                "имя: " + animal.getName() +
                ", хозяин: " + owner.getName() +
                ", дом: " + house.getAddress() +
                '}';
    }

}