public class Animal {
    private String name;
    private String kind;
    private String sex;
    private int age;

    public Animal(String name, String kind, String sex, int age) {
        this.name = name;
        this.age = age;
        this.kind = kind;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
        StringBuilder builder = new StringBuilder();
        builder.append("Животное{").append("имя: ").append(name).append(", вид: ").
                append(kind).append(", пол: ").append(sex).append(", возраст: ").append(age).append('}');
        return builder.toString();
    }
}