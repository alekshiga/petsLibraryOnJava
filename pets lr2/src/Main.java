import java.util.*;

public class Main {

    public static final List<Animal> animals = new ArrayList<>();
    public static final List<House> houses = new ArrayList<>();
    public static final List<Owner> owners = new ArrayList<>();
    public static final List<Residence> residences = new ArrayList<>();
    public static final List<Pet> pets = new ArrayList<>();

    public static boolean flatOrHouse(Pet pet) {
        if (pet.getResidence().getWhereLiving().getFlatNumber() != 0) {
            return true;
        } else if (pet.getResidence().getWhereLiving().getFlatNumber() == 0) {
            return false;
        }
        else {
            throw new RuntimeException("Вы не должны были оказаться тут");
        }
    }

    public static Animal.Dog createDog() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Вы собираетесь добавить собаку в список бездомных животных");
        System.out.print("Введите кличку: ");
        String name = scan.nextLine();
        System.out.print("Укажите пол: ");
        String sex = scan.nextLine();
        System.out.print("Укажите вес: ");
        String weight = scan.nextLine();
        return new Animal.Dog(name, sex, weight);
    }

    public static Animal.Cat createCat() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Вы собираетесь добавить кота в список бездомных животных");
        System.out.print("Введите кличку: ");
        String name = scan.nextLine();
        System.out.print("Укажите пол: ");
        String sex = scan.nextLine();
        System.out.print("Укажите вес: ");
        String weight = scan.nextLine();
        return new Animal.Cat(name, sex, weight);
    }

    public static House.Flat createFlat() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Вы собираетесь добавить квартиру в список мест жительства");
        System.out.print("Введите адрес: ");
        String adress = scan.nextLine();
        System.out.print("Введите номер квартиры: ");
        String flatNumber = scan.nextLine();
        System.out.print("Укажите номер телефона: ");
        String phoneNumber = scan.nextLine();
        System.out.print("Укажите кол-во проживающих там детей: ");
        String howManyKidsLiving = scan.nextLine();
        System.out.print("Введите 1, если соседи злые, 0, если соседи добрые: ");
        String areNeighborsAngry = scan.nextLine();
        boolean areNeighborsAngryToBoolean;
        if (areNeighborsAngry.equals("0")) {
            areNeighborsAngryToBoolean = false;
        }
        else if (areNeighborsAngry.equals("1")) {
            areNeighborsAngryToBoolean = true;
        } else {
            throw new RuntimeException("Вы оказались тут, т.к. ввели некорректные данные");
        }
        int intFlatNumber = Integer.parseInt(flatNumber);
        int intKidsCount = Integer.parseInt(howManyKidsLiving);
        return new House.Flat(adress, intFlatNumber, phoneNumber, intKidsCount, areNeighborsAngryToBoolean);
    }

    public static House.PrivateHouse createPrivateHouse() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Вы собираетесь добавить частный дом в список мест жительства");
        System.out.print("Введите адрес: ");
        String adress = scan.nextLine();
        System.out.print("Введите номер телефона: ");
        String phoneNumber = scan.nextLine();
        System.out.print("Укажите кол-во проживающих там детей: ");
        String howManyKidsLiving = scan.nextLine();
        int intKidsCount = Integer.parseInt(howManyKidsLiving);
        return new House.PrivateHouse(adress, phoneNumber, intKidsCount);
    }

    public static Owner createOwner() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Вы собираетесь добавить человека в список потенциальных хозяев");
        System.out.print("Введите ФИО: ");
        String name = scan.nextLine();
        System.out.print("Укажите дату рождения: ");
        String birthday = scan.nextLine();
        System.out.print("Укажите степень ответственности: ");
        String responsibilityDegree = scan.nextLine();
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

        animals.add(createDog());
        owners.add(createOwner());
        houses.add(createFlat());

        residences.add(new Residence(houses.get(0), owners.get(0)));
        pets.add(new Pet(animals.get(0), residences.get(0)));

        getInfoAboutAllPets();

        animals.add(createCat());

        pets.add(new Pet(animals.get(1), residences.get(0)));

        System.out.print("Теперь по адресу " + pets.get(1).getResidence().getWhereLiving().getAddress());
        if (flatOrHouse(pets.get(1))) {
            System.out.println(", квартира " + pets.get(1).getResidence().getWhereLiving().getFlatNumber());
        }
        System.out.println("соседям мешают спать постоянные ");
        for (final Pet pet : pets) {
            if (pet.getResidence().getWhereLiving().getAddress() ==
                    pets.get(1).getResidence().getWhereLiving().getAddress()) {
                System.out.println(pet.getAnimal().sound());
            }
        }
    }
}