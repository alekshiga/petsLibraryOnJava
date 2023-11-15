import java.util.List;

public class PetTable {
    private static String[][] table;
    private int petsNumber;
    private int attributesNumber = 4;

    public void createTable(List<Pet> pets) {
        petsNumber = pets.size();

        table = new String[petsNumber][attributesNumber];

        for (int i = 0; i < petsNumber; i++) {
            Pet pet = pets.get(i);
            table[i][0] = pet.getAnimal().getName();
            table[i][1] = pet.getAnimal().getKind();
            table[i][2] = String.valueOf(pet.getAnimal().getAge());
            table[i][3] = pet.getAnimal().getSex();
        }
    }

    public void showTable() {

        for (int i = 0; i < petsNumber; i++) {
            for (int j = 0; j < attributesNumber; j++) {
                System.out.print(table[i][j] + "\t");
            }
            System.out.println();
        }
    }
}