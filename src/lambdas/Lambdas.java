package lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lambdas {

    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println("Lambda works :)");
            System.out.println("next line");
        }
        ).start();

        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Hitesh", 27));
        list.add(new Employee("Bisht", 22));

        Collections.sort(list, (Employee e1, Employee e2) -> {
            return e1.getName().compareTo(e2.getName());
        });

        for (Employee item : list){
            System.out.println(item.getName());
        }
    }
}

class Employee {

    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
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
}
