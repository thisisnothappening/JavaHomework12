package Exercise3;

import Exercise2.Person;

public class Employee extends Person {
    private String company;
    private int salary;

    public Employee(String name, int age, String hairColor, String company, int salary) {
        super(name, age, hairColor);
        this.company = company;
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    protected int getAge() {
        return super.getAge();
    }

    @Override
    protected String getHairColor() {
        return super.getHairColor();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", hairColor='" + super.getHairColor() + '\'' +
                ", company='" + company + '\'' +
                ", salary=" + salary +
                '}';
    }
}
