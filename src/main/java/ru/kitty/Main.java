package ru.kitty;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main (String[] args) {
        List<Cat> cats = new ArrayList<>();

//        Cat cat1 = new Cat("Tom", 1);
//        Cat cat2 = new Cat("Tom2", 2);
//        cat1.may("qweqweqweqweqe");
boolean flag = true;

while(flag) {
    cats.add(createCat());
    System.out.println("next? (y|n)");
    String tmp = scanner.nextLine();
    if(tmp.equals("n") ) {
        flag = false;
    }
}
//        cats.add(new Cat("Tom", 1));
//        cats.add(new Cat("Tom2", 2));
//        cats.add(new Cat("Tom3", 3));
//        cats.add(new Cat("Tom4", 4));
//        cats.add(new Cat("Tom5", 5));
//        cats.add(new Cat("Tom6", 6));

        for (Cat x: cats) {
            System.out.println(x.getName());
            System.out.println(x.getAge());
        }
//        CatsName.Name();
//        System.out.println("hi!");

        //Scanner nameCats = new Scanner(System.in);
        //int old = 0;
        //System.out.println("How year your cat?");
        //old = nameCats.nextInt();
        //if (old == 0) {
        //    System.out.println("How months your cats? ");
        //    old = nameCats.nextInt();
        //    if (old == 0) {
        //        System.out.println("How day your cat?");
        //        old = nameCats.nextInt();
        //        System.out.println("Old your cat: " + old + " day");
        //    }
        //    else {
        //        System.out.println("Old your cat: " + old + " month");
        //    }
        //}
        //else System.out.println("Old your cat: " + old + " year");
        //System.out.println("qwe");
        //System.out.println("Тут тоже будут котеечки");

    }
    public static Cat createCat(){
        Scanner sc = new Scanner(System.in);
        Cat cat01 = new Cat();
        cat01.setName(sc.nextLine());
        cat01.setAge(sc.nextInt());
        return cat01;
    }
}
