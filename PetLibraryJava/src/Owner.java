public class Owner implements Actions{
    private String name;
    private String birthday;
    private int responsibilityDegree;

    public Owner(String name, String birthday, int responsibilityDegree) {
        this.name = name;
        this.birthday = birthday;
        this.responsibilityDegree = responsibilityDegree;
    }

    public String getName() {
            return name;
        }

    public void setName(String name) {
            this.name = name;
        }

    public String getBirthday() {
            return birthday;
        }

    public void setBirthday(String birthday) {
            this.birthday = birthday;
        }

    public int getResponsibilityDegree() {
            return responsibilityDegree;
        }

    public void setResponsibilityDegree(int responsibilityDegree) {
        this.responsibilityDegree = responsibilityDegree;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Owner{").append("name: ").append(name).append(", birthday: ").
                append(birthday).append(", degree: ").append(responsibilityDegree).append('}');
        return builder.toString();
    }

    @Override
    public void goToShelter() {
        System.out.println(this.name + " is right now at animal shelter");
    }

    @Override
    public void petAnimal() {
        System.out.println(this.name + " is petting the animal");
    }
}