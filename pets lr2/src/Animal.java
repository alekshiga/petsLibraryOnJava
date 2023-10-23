import java.util.Scanner;

public class Animal {
    private String name;
    private String kind;
    private String sex;
    private String weight;

    public Animal(String name, String kind, String sex, String weight) {
        this.name = name;
        this.weight = weight;
        this.kind = kind;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Животное{" +
                "имя: " + name +
                ", вид: " + kind +
                ", пол: " + sex +
                ", вес: " + weight +
                '}';
    }
}