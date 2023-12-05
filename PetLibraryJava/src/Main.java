import java.util.*;

public class Main {

    public static final List<Animal> animals = new ArrayList<>();
    public static final List<House> houses = new ArrayList<>();
    static HashMap<Integer, Owner> owners = new HashMap<>();
    public static final List<Residence> residences = new ArrayList<>();
    public static final List<Pet> pets = new ArrayList<>();

    public static final Counter counter = new Counter();

    public static Animal.Cat cat = new Animal.Cat("Basilar", "m", 5);
    public static House.Flat flat = new House.Flat("Bread avenue", 105, "+79831778095", 0, false);
    public static Owner owner = new Owner("Johnson", "21.10.2004", 1);

    public static void searchWithName() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scan.nextLine();
        for (Map.Entry<Integer, Owner> entry : owners.entrySet()) {
            if (entry.getValue().getName().equals(name)) {
                System.out.println("Owner found: " + entry.getValue().getName() + ", " + entry.getValue().getBirthday() + "\n");
            }
        }
    }

    public static Animal createDog() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Adding homeless dog to list");
        System.out.print("Enter name: ");
        String name = scan.nextLine();
        System.out.print("Enter sex: ");
        String sex = scan.nextLine();
        System.out.print("Enter age: ");
        int age = Integer.parseInt(scan.nextLine());
        return new Animal.Dog(name, sex, age);
    }

    public static House createHouse() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Adding private house to a houses list");
        System.out.print("Enter adress: ");
        String adress = scan.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNumber = scan.nextLine();
        System.out.print("Enter amount of living kids: ");
        int howManyKidsLiving = Integer.parseInt(scan.nextLine());
        return new House(adress, phoneNumber, howManyKidsLiving);
    }

    public static Owner createOwner() {
        Scanner scan = new Scanner(System.in);
            System.out.println("Adding an owner to owners list");
        System.out.print("Enter name: ");
        String name = scan.nextLine();
        System.out.print("Enter birthday: ");
        String birthday = scan.nextLine();
        System.out.print("Enter responsibility degree: ");
        int responsibilityDegree = Integer.parseInt(scan.nextLine());
        return new Owner(name, birthday, responsibilityDegree);
    }

    public static void getInfoAboutAllPets() {
        System.out.println("\n\tPets list\n");
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
            result = counter.sizeOf(Arrays.asList(animals.toArray())) / owners.size();
            System.out.println("Homeless animal per owner = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Dividing by zero");
            System.out.println("Add an owner to owners list first");
        }

        System.out.println(ToStringChecker.toStringSupported(cat));
        animals.add(cat);
        animals.add(new Animal.Cat("Kuzya", "m", 2));
        houses.add(flat);
        houses.add(new House("Apples, 84", "+79609991133", 2));
        owners.put(1, new Owner("McGill", "01.01.2001", 0));
        owners.put(2, new Owner("Hamlin", "15.05.2002", 2));
        owners.put(3, new Owner("Smith", "30.12.2003", 1));
        owners.put(4, owner);

        residences.add(new Residence(houses.get(1), owners.get(2)));
        residences.add(new Residence(houses.get(0), owners.get(1)));
        pets.add(new Pet(animals.get(1), residences.get(1)));
        pets.add(new Pet(animals.get(0), residences.get(0)));

        getInfoAboutAllPets();

        System.out.println("\nPets table (2D string array):");

        PetTable petTable = new PetTable();
        petTable.createTable(pets);
        petTable.showTable();

        System.out.println();

        System.out.println(pets.get(0).getAnimal().sleep());
        System.out.println(pets.get(0).getAnimal().sound());
        System.out.println(pets.get(1).getAnimal().sound());
        owners.get(1).goToShelter();
        owners.get(1).petAnimal();

        List<Map.Entry<Integer, Owner>> sortedList = new ArrayList<>(owners.entrySet());
        Collections.sort(sortedList, new Comparator<Map.Entry<Integer, Owner>>() {
            @Override
            public int compare(Map.Entry<Integer, Owner> o1, Map.Entry<Integer, Owner> o2) {
                return o1.getValue().getName().compareTo(o2.getValue().getName());
            }
        });
        System.out.println("\n\tSorted owners list\n");
        for (Map.Entry<Integer, Owner> entry : sortedList) {
            System.out.println("Owner: " + entry.getValue().getName() + ", " + entry.getValue().getBirthday());
        }
        System.out.println("\n");

        searchWithName();

        Animal.Dog originalDog = new Animal.Dog("Rex", "male", 3);

        try {
            Animal.Dog clonedDog = (Animal.Dog) originalDog.clone();

            System.out.println("Original dog: " + originalDog);
            System.out.println("Cloned dog: " + clonedDog);

            clonedDog.setName("Max");

            System.out.println("Original dog after cloning: " + originalDog);
            System.out.println("Cloned dog after changing its name: " + clonedDog);

            Animal.Dog shallowClonedDog = originalDog;

            System.out.println("Original dog: " + originalDog);
            System.out.println("Shallow cloned dog: " + shallowClonedDog);

            shallowClonedDog.setName("Milo");

            System.out.println("Original dog after shallow cloning: " + originalDog);
            System.out.println("Shallow cloned dog after changing its name: " + shallowClonedDog);
        }
        catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported: " + e.getMessage());
        }
    }
}
