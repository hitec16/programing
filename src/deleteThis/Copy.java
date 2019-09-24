package deleteThis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Copy {

    private class Person{
        String name;
    }

    public static void main(String[] args) {
        List<String> personList = new ArrayList<>();
        personList.add("1");
        personList.add("2");
        personList.add("3");

        List<String> clone = new ArrayList<>(personList);
        clone.add("4");
        for (String name: clone){
            System.out.println(name);
        }
    }
}
