public abstract class Animal {
    public String name;
    public String sex;
    public String weight;

    public Animal(String name, String sex, String weight) {
        this.name = name;
        this.weight = weight;
        this.sex = sex;
    }

    public abstract String sound();

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

    public abstract String getKind();

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public abstract String toString();

    public static class Dog extends Animal {

        public Dog(String name, String sex, String weight) {
            super(name, sex, weight);
        }

        @Override
        public String sound() {
            return "Bark!";
        }

        @Override
        public String getKind() {
            return "dog";
        }

        @Override
        public String toString() {
            return "Собака{" +
                    "имя: " + name + ", " +
                    "пол: " + sex + ", " +
                    "вес: " + weight + '}';
        }
    }

    public static class Cat extends Animal {

        public Cat(String name, String sex, String weight) {
            super(name, sex, weight);
        }

        @Override
        public String sound() {
            return "Meow!";
        }

        @Override
        public String getKind() {
            return "cat";
        }

        @Override
        public String toString() {
            return "Кот{" +
                    "имя: " + name + ", " +
                    "пол: " + sex + ", " +
                    "вес: " + weight + '}';
        }
    }

    public static class Turtle extends Animal {

        public Turtle(String name, String sex, String weight) {
            super(name, sex, weight);
        }

        @Override
        public String sound() {
            return "...";
        }

        @Override
        public String getKind() {
            return "turtle";
        }

        @Override
        public String toString() {
                return "Черепаха{" +
                    "имя: " + name + ", " +
                    "пол: " + sex + ", " +
                    "вес: " + weight + '}';
        }
    }
}