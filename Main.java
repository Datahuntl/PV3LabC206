import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Jogo jogo1 = new Jogo();

        System.out.println("Coloque o nome do Jogo");
        entrada.nextLine();
        jogo1.setNome(entrada);
        entrada.nextLine();
        jogo1.setGenero(entrada);
        entrada.nextInt();
        jogo1.setPreco(entrada);

        Arquivo arquivo1 = new Arquivo();

        arquivo1.escrever(jogo1);

        arquivo1.ler();


    }
}
