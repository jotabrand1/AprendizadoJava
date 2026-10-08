package NivelBasico.TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {


        /*
        * Dados nao primitivos: String, array, class, enum
        * Objetivo: Criar um ninja e atribuir um metodo a ele
        * */

        String nome = "Naruto Uzumaki";
        String nomeUpperCase = nome.toUpperCase();//vai colocar tudo em capslock
        System.out.println("Esse texto esta em CAPSLOCK: " + nomeUpperCase);

        String aldeia = "Aldeia da folha";
        String aldeiaLowerCase = aldeia.toLowerCase();
        System.out.println("Esse texto está em caixa baixa: "+aldeiaLowerCase);
    }
}
