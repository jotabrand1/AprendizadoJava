package NivelBasico;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        String[] ninjas = new String[3];

         for (int i = 0; i < ninjas.length; i++){
             ninjas[i] = input.nextLine();
         }
        for (int i = 0; i < ninjas.length; i++){
            System.out.println(ninjas[i]);
        }

         input.close();
    }
}
