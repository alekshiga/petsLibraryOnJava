import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {



    public static final List<Animal> animals = new ArrayList<>();
    public static final List<House> houses = new ArrayList<>();
    public static final List<Owner> owners = new ArrayList<>();
    public static final List<Residence> residences = new ArrayList<>();
    public static final List<Pet> pets = new ArrayList<>();

    public static final Counter counter = new Counter();

    public static Animal.Cat cat = new Animal.Cat("Barsik", "m", 5);
    public static House.Flat flat = new House.Flat("Bread avenue", 105, "+79831778095", 0, false);
    public static Owner owner = new Owner("John S.", "21.10.2004", 1);

    public static Animal createAnimal() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Вы собираетесь добавить собаку в список бездомных животных");
        System.out.print("Введите кличку: ");
        String name = scan.nextLine();
        System.out.print("Укажите пол: ");
        String sex = scan.nextLine();
        System.out.print("Укажите возраст: ");
        int age = Integer.parseInt(scan.nextLine());
        return new Animal.Dog(name, sex, age);
    }

    public static House createHouse() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Вы собираетесь добавить частный дом в список мест жительства");
        System.out.print("Введите адрес: ");
        String adress = scan.nextLine();
        System.out.print("Укажите номер телефона: ");
        String phoneNumber = scan.nextLine();
        System.out.print("Укажите кол-во проживающих там детей: ");
        int howManyKidsLiving = Integer.parseInt(scan.nextLine());
        return new House(adress, phoneNumber, howManyKidsLiving);
    }

    public static Owner createOwner() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Вы собираетесь добавить человека в список потенциальных хозяев");
        System.out.print("Введите ФИО: ");
        String name = scan.nextLine();
        System.out.print("Укажите дату рождения: ");
        String birthday = scan.nextLine();
        System.out.print("Укажите степень ответственности: ");
        int responsibilityDegree = Integer.parseInt(scan.nextLine());
        return new Owner(name, birthday, responsibilityDegree);
    }

    public static void getInfoAboutAllPets() {
        System.out.println("\nСписок питомцев\n");
        for (final Pet pet : pets) {
            System.out.println(pet.getAnimal().toString());
            System.out.println(pet.getResidence().getWhoLiving().toString());
            System.out.println(pet.getResidence().getWhereLiving().toString());
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        float result;
        try {
            result = counter.sizeOf(Arrays.asList(animals.toArray())) / counter.sizeOf(Arrays.asList(owners.toArray()));
            System.out.println("В среднем на каждого человека приходится " + result + "бездомных животных");
        } catch (ArithmeticException e) {
            System.out.println("Деление на 0");
            System.out.println("Сначала добавьте людей в список хозяев");
        }

        animals.add(cat);
        houses.add(flat);
        owners.add(owner);

        animals.add(createAnimal());
        owners.add(createOwner());
        houses.add(createHouse());

        residences.add(new Residence(houses.get(1), owners.get(1)));
        residences.add(new Residence(houses.get(0), owners.get(0)));
        pets.add(new Pet(animals.get(1), residences.get(1)));
        pets.add(new Pet(animals.get(0), residences.get(0)));

        getInfoAboutAllPets();

        System.out.println("\nPets table (2D string array):");

        PetTable petTable = new PetTable();
        petTable.createTable(pets);
        petTable.showTable();

        System.out.println(pets.get(0).getAnimal().sleep());
        System.out.println(pets.get(0).getAnimal().sound());
        System.out.println(pets.get(1).getAnimal().sound());
        owners.get(0).goToShelter();
        owners.get(1).petAnimal();
    }
}