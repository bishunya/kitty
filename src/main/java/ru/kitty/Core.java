package ru.kitty;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Core {
    Scanner scanner = new Scanner(System.in);
    List<Cat> cats = new ArrayList<>();

    public void start() {

        while (true) {
            menu();
        }
    }
    public Cat createCat() {
        if (cats.size() == 5) {
            System.out.println("Oh, sorry. You can add max 5 cats :(");
        }
        Scanner sc = new Scanner(System.in);
        Cat cat = new Cat();
        while (true) {
            System.out.println("Enter name cat: ");
            cat.setName(sc.nextLine());
            if (hasIsUniqName(cat.getName())) {
                System.out.println("Enter age cat: ");
                cat.setAge(sc.nextInt());
//                if (cat.getAge() == 0) {
//                    System.out.println("How months your cats? ");
//                    cat.setAge(sc.nextInt());
//                    if (cat.getAge() == 0) {
//                        System.out.println("How day your cat?");
//                        cat.setAge(sc.nextInt());
//                        System.out.println("Old your cat: " + cat.getAge() + " day");
//                    } else {
//                        System.out.println("Old your cat: " + cat.getAge() + " month");
//                    }
//                } else System.out.println("Old your cat: " + cat.getAge() + " year");
                System.out.println("Enter color cat: ");
                cat.setColor(sc.nextLine());
                break;
            } else {
                System.out.println("Sorry, the cat with the same name is already on the list");
            }
        }
        return cat;
    }
    public void intoCat() {
        for (Cat cat : cats) {
            System.out.println(cat.getName());
        }
        System.out.println("Enter the name of the cat information about which you want to receive: ");
        Scanner sc = new Scanner(System.in);
        String nameCat = sc.nextLine();
        for (Cat cat : cats) {
            //сравнение строк
            if (cat.getName().equals(nameCat)) {
                System.out.println(cat.getName());
                System.out.print(" " + cat.getAge());
                System.out.print(" " + cat.getColor());
            } else System.out.println("Sorry, the cat with the same name is not in the list");
        }
    }
    public void intoAllCat() {
        for (Cat x : cats) {
            System.out.println(x.getName());
            System.out.print(" " + x.getAge());
            System.out.print(" " + x.getColor());
        }
    }
    public void removeCat() {
        for (Cat cat : cats) {
            System.out.println(cat.getName());
        }
        System.out.println("Enter the name of the cat which you want to remove from list: ");
        Scanner sc = new Scanner(System.in);
        String nameCat = sc.nextLine();
        for (Cat cat : cats) {
            if (cat.getName().equals(nameCat)) {
                cats.remove(cat);
            }
        }

    }
    public void menu() {
        System.out.println("1. Add cat" +
                "\n 2. Show information about the selected cat" +
                "\n 3. Show information about all cats" +
                "\n 4. Remove cat from the list");
        System.out.println("Choose the action you want to perform with the list of cats:");
        Scanner sc = new Scanner(System.in);
        int numberMenu = sc.nextInt();
        switch (numberMenu) {
            case 1:
                createCat();
                break;
            case 2:
                intoCat();
                break;
            case 3:
                intoAllCat();
                break;
            case 4:
                removeCat();
                break;
            default:
                System.out.println("Про то что нет совпалдения");
        }
    }

    //    Проверки списка котиков
    public boolean hasIsUniqName(String name) {
        for (Cat x : cats) {
            if (x.getName().equals(name)) {
                return false;
            }
        }
        return true;
    }
}

