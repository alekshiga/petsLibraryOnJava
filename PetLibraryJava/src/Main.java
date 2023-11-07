import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static final List<Animal> animals = new ArrayList<>();
    public static final List<House> houses = new ArrayList<>();
    public static final List<Owner> owners = new ArrayList<>();
    public static final List<Residence> residences = new ArrayList<>();
    public static final List<Pet> pets = new ArrayList<>();

    public static Animal createAnimal() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Вы собираетесь добавить животное в список бездомных животных");
        System.out.print("Введите кличку: ");
        String name = scan.nextLine();
        System.out.print("Укажите вид: ");
        String kind = scan.nextLine();
        System.out.print("Укажите пол: ");
        String sex = scan.nextLine();
        System.out.print("Укажите вес: ");
        int weight = Integer.parseInt(scan.nextLine());
        return new Animal(name, kind, sex, weight);
    }

    public static House createHouse() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Вы собираетесь добавить дом в список мест жительства");
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

    static Animal testAnimal = new Animal("Жора", "собака", "м", 8);
    static House testHouse = new House("Северо-западная 105", "+79831778095", 2);
    static Owner testOwner = new Owner("Тимофей", "19.12.2004", 1);
    static House houseWeMovingTo = new House("Главная 61", "+77777777777", 0);

    public static void main(String[] args) {
        animals.add(testAnimal);
        houses.add(testHouse);
        owners.add(testOwner);

        animals.add(createAnimal());
        owners.add(createOwner());
        houses.add(createHouse());

        residences.add(new Residence(houses.get(1), owners.get(1)));
        residences.add(new Residence(houses.get(0), owners.get(0)));
        pets.add(new Pet(animals.get(1), residences.get(1)));
        pets.add(new Pet(animals.get(0), residences.get(0)));

        getInfoAboutAllPets();

        animals.add(createAnimal());

        pets.add(new Pet(animals.get(2), residences.get(0)));
        pets.get(0).setResidence(residences.get(1));

        residences.get(1).setWhereLiving(houseWeMovingTo);

        getInfoAboutAllPets();
    }
}