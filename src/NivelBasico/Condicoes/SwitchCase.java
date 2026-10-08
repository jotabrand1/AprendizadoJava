package NivelBasico.Condicoes;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        /*
        * Switch cases: gerar casos específicos
        * */
        Scanner input = new Scanner(System.in);
        System.out.println("------Digite qual ninja voce quer-----");
        System.out.println("1 - Naruto");
        System.out.println("2 - Sasuke");
        System.out.println("3 - Sakura");
        int ninja = input.nextInt();
        switch (ninja){
            case 1:
                System.out.println("Sou naruto");
                break;
            case 2:
                System.out.println("Sou Sasuke");
                break;
            case 3:
                System.out.println("Sou Sakura");
                break;
            default:
                System.out.println("Ninja invalido");
                break;
        }

        input.close();

    }
}
