public abstract class Animal {
    protected String name;
    protected String kind;
    protected String sex;
    protected int age;

    public Animal(String name, String kind, String sex, int age) {
        this.name = name;
        this.age = age;
        this.kind = kind;
        this.sex = sex;
    }

    public String sleep() {
        return "Animal is sleeping";
    }

    public abstract String sound();

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

    public abstract String toString();


    public static class Dog extends Animal {

        public Dog(String name, String sex, int age) {
            super(name, "dog", sex, age);
        }

        @Override
        public String sleep() {
            return "Dog " + this.name + " is sleeping";
        }

        @Override
        public String sound() {
            return "Bark!";
        }

        @Override
        public String getKind() {
            return this.kind;
        }

        @Override
        public String toString() {
            return "Dog{" +
                    "name: " + name + ", " +
                    "sex: " + sex + ", " +
                    "age: " + age + '}';
        }
    }

    public static class Cat extends Animal {

        public Cat(String name, String sex, int age) {
            super(name, "cat", sex, age);
        }

        @Override
        public String sleep() {
            return "Cat " + this.name + " is sleeping";
        }

        @Override
        public String sound() {
            return "Meow!";
        }

        @Override
        public String getKind() {
            return this.kind;
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "name: " + name + ", " +
                    "sex: " + sex + ", " +
                    "age: " + age + '}';
        }
    }

    public static class Turtle extends Animal {

        public Turtle(String name, String sex, int age) {
            super(name, "turtle", sex, age);
        }

        @Override
        public String sleep() {
            return "Turtle " + this.name + " is sleeping";
        }

        @Override
        public String sound() {
            return "...";
        }

        @Override
        public String getKind() {
            return this.kind;
        }

        @Override
        public String toString() {
            return "Turtle{" +
                    "name: " + name + ", " +
                    "sex: " + sex + ", " +
                    "age: " + age + '}';
        }
    }
}