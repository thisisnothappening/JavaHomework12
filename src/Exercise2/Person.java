package Exercise2;

public class Person {
    private String name;
    private int age;
    private String hairColor;

    protected String getName() {
        return name;
    }

    protected int getAge() {
        return age;
    }

    protected String getHairColor() {
        return hairColor;
    }

    protected Person(String name, int age, String hairColor) {
        this.name = name;
        this.age = age;
        this.hairColor = hairColor;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hairColor='" + hairColor + '\'' +
                '}';
    }
}
