package ru.kitty;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Core {
    Scanner scanner = new Scanner(System.in);
    List<Cat> cats = new ArrayList<>();

    public void start() {
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
    }

    public Cat createCat() {
        Scanner sc = new Scanner(System.in);
        Cat cat = new Cat();
        while (true) {
            System.out.println("Enter name cat: ");
            cat.setName(sc.nextLine());
            if (hasIsUniqName(cat.getName())) {
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
                System.out.println("Enter color cat: ");
                cat.setColor(sc.nextLine());
                break;
            }
            else {
                System.out.println("Sorry, the cat with the same name is already on the list");
            }
        }
        return cat;
    }


    public void intoCat() {
        for (Cat cat : cats) {
            System.out.println(cat.getName());
        }
        System.out.println("Enter the number of the cat information about which you want to receive: ");
        Scanner sc = new Scanner(System.in);
        String nameCat = sc.nextLine();
        for (Cat cat : cats) {
            //сравнение строк
            if (cat.getName().equals(nameCat)) {
                System.out.println(cat.getName());
                System.out.println(cat.getAge());
                System.out.println(cat.getColor());
            } else System.out.println("Sorry, the cat with the same name is not in the list");
        }
    }
    public boolean hasIsUniqName (String name) {
        for (Cat x : cats) {
            if (x.getName().equals(name)) {
                return false;
            }
        }
        return true;
    }
    public void menu () {
        System.out.println("1. Add cat" +
                "\n 2. Show information about the selected cat" +
                "\n 3. Show information about all cats" +
                "\n 4. Remove cat from the list");
        System.out.println("Choose the action you want to perform with the list of cats:");
        Scanner sc = new Scanner(System.in);
        int numberMenu = sc.nextInt();
        if (numberMenu == 1) {
            createCat();
        }
        else if (numberMenu == 2) {

        }
    }
}

