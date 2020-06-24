package ru.kitty;
import java.util.ArrayList;
import java.util.Scanner;

public class CatsName {
    public static void Name () {
        Scanner CatsName = new Scanner(System.in);
        ArrayList <String> ListCatName = new ArrayList ();
        while (CatsName.hasNext()){
           String i = CatsName.nextLine();
           ListCatName.add(i);
       }
        for(String i : ListCatName) {
            System.out.println(i);
         }
    }
}
