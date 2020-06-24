package ru.kitty;
import java.util.ArrayList;
import java.util.Scanner;

public class CatsName {
    public static void Name (String args) {
        Scanner CatsName = new Scanner(System.in);
        ArrayList <String> ListCatName = new ArrayList <String> ();
       while (CatsName.hasNext()){
           String i = CatsName.nextLine();
           ListCatName.add(i);
       }
       // for(String x : ListCatName) {
       //     System.out.println(x);
       //  }
    }
}
