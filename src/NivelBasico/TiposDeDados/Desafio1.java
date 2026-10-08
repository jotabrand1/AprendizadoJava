package NivelBasico.TiposDeDados;

public class Desafio1 {
    public static void main(String[] args) {
        String name1 = "Naruto";
        int age = 16;
        String nameMission1 = "Pegar hokage";
        char levelDificulty1 = 'S';
        String status = "Concluida";

        if (age < 15) {
            if(levelDificulty1 == 'C' || levelDificulty1 == 'D'){
                System.out.println("Missao concluida");
            }else{
                System.out.println("Missao nao pode ser concluida");
            }
        }else{
            System.out.println("Missao concluida");
        }

        String name2 = "Sasuke";
        int age2 = 5;
        String nameMission2 = "Proteger vila";
        char levelDificulty2 = 'A';
        String status2 = "Concluida";

        String name3 = "Sakura";
        int age3 = 14;
        String nameMission3 = "Pegar hokage";
        char levelDificulty3 = 'S';
        String status3 = "Concluida";


    }
}
