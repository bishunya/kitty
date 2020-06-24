package ru.kitty;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();

//        Cat cat1 = new Cat("Tom", 1);
//        Cat cat2 = new Cat("Tom2", 2);
//        cat1.may("qweqweqweqweqe");
        boolean flag = true;

        while (flag) {
            cats.add(createCat());
            System.out.println("next? (y|n)");
            String tmp = scanner.nextLine();
            if ((tmp.equals("n")) || (cats.size() == 5)) {
                flag = false;
                System.out.println("Oh, sorry. You can add max 5 cats :(");
            }
        }

//        cats.add(new Cat("Tom", 1));
//        cats.add(new Cat("Tom2", 2));
//        cats.add(new Cat("Tom3", 3));
//        cats.add(new Cat("Tom4", 4));
//        cats.add(new Cat("Tom5", 5));
//        cats.add(new Cat("Tom6", 6));

        for (Cat x : cats) {
            System.out.println(x.getName());
            System.out.println(x.getAge());
        }
//        CatsName.Name();
//        System.out.println("hi!");

    }

    public static Cat createCat() {
        Scanner sc = new Scanner(System.in);
        Cat cat = new Cat();
        System.out.println("Enter name cat: ");
        cat.setName(sc.nextLine());
        System.out.println("Enter age cat: ");
        cat.setAge(sc.nextInt());
        if (cat.getAge() == 0) {
            System.out.println("How months your cats? ");
            cat.setAge(sc.nextInt());
            if (cat.getAge() == 0) {
                System.out.println("How day your cat?");
                cat.setAge(sc.nextInt());
                System.out.println("Old your cat: " + cat.getAge() + " day");
            } else {
                System.out.println("Old your cat: " + cat.getAge() + " month");
            }
        } else System.out.println("Old your cat: " + cat.getAge() + " year");
        return cat;
    }
}
