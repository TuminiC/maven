package org.example;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Sample {
    public static void main(String[] args) {
       /* float max = 3.40282346638528860e+38f;
        float min = 1.40129846432481707e-45f;
        double doubleMax = 3.40282346638528860e+38d;
        double doubleMin = 4.94065645841246544e-324d;*/
        /* System.out.println(doubleMax);
        System.out.printf("%.2f",max);
        System.out.println();
        String a1="10";
        int i = Integer.parseInt(a1);
        System.out.println(a1);

        int a2=5000;
        byte a3= (byte)a2;
*/
        //Ternary operator:
        //int x=11; int y =5;

       // String result = (x==10)? "X is 10": "X is not 10";
       // System.out.println(result);

     //   if (y ==15);
       // System.out.println("Condition is true");

       // float g = 1.2f;
      //  System.out.println(g%y);
/*
        int a1 = 11;
        switch (a1){
            default:
                System.out.println("X is "+a1);
                break;
            case 1:
                System.out.println("X is 1");
                break;
            case 2:
                System.out.println("X is 2");
                break;
            case 3:
                System.out.println("X is 3");
                break;

        } switch is used for in char and strings only
        */
        //to stop statement need to explicitly apply break and continue
//adding default before case requires default to have a break statement

        for(int i =1; i<10; i++){
            for (int j=1; j<=i;j++){
                System.out.print('@');
            }
            System.out.println();
        }
    }
}
