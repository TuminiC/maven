package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
      /*  int a1 = 11;

        switch (a1){
            case 1->System.out.println("X is 1");
            case 2->System.out.println("X is 2");
            case 3->System.out.println("X is 3");
            default->
                    System.out.println("X is "+a1);


        }*/
        Crocodile croc = new Crocodile(2,3,"Crocodile","AA","Hard-shelled");
        System.out.println(croc.ShowInfo());
        Eel eel = new Eel(3,1,"Eel","B",true);
        System.out.println(eel.ShowInfo());

        Eagle eagle=new Eagle(1,1,"Eagle","AA",true);
        System.out.println(eagle.ShowInfo());

    }
}