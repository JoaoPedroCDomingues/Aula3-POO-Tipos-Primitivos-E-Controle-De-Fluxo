import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int lancheTotal;
        int media;

        System.out.println("Quantos lanches foram consumidos nessa hora?");
        int lanches1 = entrada.nextInt();
        lancheTotal = lanches1;
        System.out.println("Lanches após 1 hora: " + lancheTotal);

        System.out.println("Quantos lanches foram consumidos nessa hora?");
        int lanches2 = entrada.nextInt();
        lancheTotal = lancheTotal + lanches2;
        System.out.println("Lanches após 2 horas: " + lancheTotal);

        System.out.println("Quantos lanches foram consumidos nessa hora?");
        int lanches3 = entrada.nextInt();
        lancheTotal = lancheTotal + lanches3;
        System.out.println("Lanches após 3 horas: " + lancheTotal);

        media = lancheTotal/3;

        System.out.println("Lanches ao fim da noite: " + lancheTotal);
        System.out.println("Media de lanches: " + media);

        entrada.close();
    }
}