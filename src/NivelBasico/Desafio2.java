package NivelBasico;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int MAX = 5;
        String[] ninjas = new String[MAX];
        int opcao = 0;
        int ninjasCadatrados = 0;


        while(opcao != 3){
            System.out.println("-----Lista Ninjas-----");
            System.out.println("Digite o número para escolher: ");
            System.out.println("1 - Cadastrar Ninja");
            System.out.println("2 - Exibir todos os usuários");
            System.out.println("3 - Encerrar programa");
            int opcaoUsuario = input.nextInt();
            input.nextLine();


            switch (opcaoUsuario){
                case 1:
                    System.out.println("Digite o nome do ninja:");
                    if(ninjasCadatrados < MAX){
                        String nomeNinja = input.nextLine();
                        ninjas[ninjasCadatrados] = nomeNinja;
                        ninjasCadatrados++;

                    }else{
                        System.out.println("Array cheio");
                    }

                    break;
                case 2:
                    for(int i = 0; i < MAX; i++){
                        System.out.println(ninjas[i]);
                    }
                default:
                    System.out.println("Digite um numero valido de 1 a 3");
                    break;


            }
        }









        input.close();
    }
}
