package DataStructures.customHashmap;

public class TestMap {
    public static void main(String[] args) {
        MyMap<String, Integer> map = new MyMap<>();
        map.put("a",1);
        map.put("a",10);
        map.put("b",2);
        map.put("c",3);
        map.put("d",4);

        System.out.println(map.get("a") +"");
        System.out.println(map.get("b") +"");
        System.out.println(map.get("c") +"");
        System.out.println(map.get("d") +"");
    }
}
