import java.util.Scanner;

public class Owner {
    private String name;
    private String birthday;
    private String responsibilityDegree;

    public Owner(String name, String birthday, String responsibilityDegree) {
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

    public String getResponsibilityDegree() {
            return responsibilityDegree;
        }

    public void setResponsibilityDegree(String responsibilityDegree) {
        this.responsibilityDegree = responsibilityDegree;
    }

    @Override
    public String toString() {
        return "Хозяин{" +
                "имя: " + name +
                ", дата рождения: " + birthday +
                ", степень ответственности: " + responsibilityDegree +
                '}';
    }
}