package S07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Whats your name?");
        Scanner scanner = new Scanner(System.in);
        //String name = scanner.next();
        //String name = scanner.nextLine();
        //int name = scanner.nextInt();
       float name = scanner.nextFloat();
        System.out.println("Hello "+name);
        scanner.close();


    }
}
