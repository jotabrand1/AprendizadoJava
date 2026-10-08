package NivelBasico.Condicoes;

import java.util.Scanner;

public class Scanners {
    public static void main(String[] args) {
        /*
        *Scanner = input do usaurioia
        * objetivo: o usuario vai criar um ninja e vamos validar os dados
        * */

        //Abrir scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome do ninja: ");
        String name = input.nextLine();
        System.out.println("Digite a idade do ninja: ");
        int age = input.nextInt();
        System.out.println("O nome do ninja é: " + name);
        System.out.println("A idade do ninja é: " + age+ " anos");

        //Tratamento de dados
        if (age >=18){
            System.out.println("Ninja maior de idade");
        }else{
            System.out.println("Menor de idade");
        }


        //fechar sempre o scanner
        input.close();


    }
}
