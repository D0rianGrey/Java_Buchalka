package Practice;

import java.util.*;

public class Ternary {


    public static void main(String[] args) {

//        Car car1 = new Car("BMW");
//        Car car2 = new Car("AUDI");
//
//        Car car3 = new Car("LADA");
//        Car car4 = new Car("DAEWOO");
//
//
//        Collection<Car> c1 = new ArrayList<>();
//        c1.add(car1);
//        c1.add(car2);
//
//        System.out.println();
//        System.out.println("Collection 1");
//        System.out.println(c1.size());
//        c1.forEach(System.out::println);
//
//        Collection<Car> c2 = new ArrayList<>();
//        c2.add(car3);
//        c2.add(car4);
//        System.out.println();
//        System.out.println("Collection 2");
//        System.out.println(c2.size());
//        c2.forEach(System.out::println);
//
//        System.out.println();
//        System.out.println("Adding collection 2 to collection 1");
//        c1.addAll(c2);
//        System.out.println(c1.size());
//        c1.forEach(System.out::println);

//        System.out.println();
//        System.out.println("Deleting collection 2 from collection 1");
//        c1.removeAll(c2);
//        System.out.println(c1.size());
//        c1.forEach(System.out::println);

//        System.out.println();
//        System.out.println("Retain collection 2 and delete collection 1");
//        c1.retainAll(c2);
//        System.out.println(c1.size());
//        c1.forEach(System.out::println);

//        System.out.println();
//        System.out.println("Clear collection1");
//        c1.clear();
//        System.out.println(c1.size());
//        c1.forEach(System.out::println);

//        System.out.println(c1.isEmpty());


//        System.out.println(c1.contains(car1));

//        System.out.println(c1.contains(c2));

//        c1.toArray();
//        System.out.println(c1);




//        List l1 = new ArrayList();
//        List l2 = new LinkedList();
//
//
//        Integer a = 10;
//        String s = "Hello";
//        int b = 70;
//        ArrayList l3 = new ArrayList();
//        l3.add(a);
//        l3.add(s);
//        l3.add(b);
//
//
//        l3.forEach(System.out::println);
//        System.out.println("Index - 0");
//        System.out.println(l3.get(0));


//        int c = 5;
//        String s1 = "Hello";
//        String s2 = "World";
//
//        ArrayList<String> l1 = new ArrayList<>();
//        l1.add(s1);
//        l1.add(s2);
//        l1.add("oO");
//
//        System.out.println(l1);
//
//
//        Collections.shuffle(l1);
//        l1.forEach(System.out::println);

//        Faker faker = new Faker();
//        String s1 = faker.name().firstName();
//        String s2 = faker.name().name();
//        System.out.println(s1);
//        System.out.println(s2);


         HashMap<Integer, String> map = new HashMap<>();
         map.put(1,"Eugene");
         map.put(2,"Julia");
        map.put(3,"Aleksandra");

         map.replace(3, "Anton");
         map.remove(3);

        System.out.println(map.entrySet());

       




    }

}

class Car {
    String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }
}
