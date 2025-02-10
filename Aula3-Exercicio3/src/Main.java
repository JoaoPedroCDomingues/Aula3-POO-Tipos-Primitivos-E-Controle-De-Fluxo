import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int npa;
        int media;

        System.out.println("Qual foi a nota da primeira prova?");
        int np1 = entrada.nextInt();

        System.out.println("Qual foi a nota da segunda prova?");
        int np2 = entrada.nextInt();

        media = (np1 + np2)/2;

        if(media >= 60){
            System.out.println("Aprovado!");
        }
        else if(media < 30){
            System.out.println("Reprovado!");
        }
        else{
            System.out.println("Ficou de np3! Insira sua nota!");
            int np3 = entrada.nextInt();
            npa = (media + np3)/2;

            if(npa >= 50){
                System.out.println("Aprovado!");
            }
            else{
                System.out.println("Reprovado!");
            }
        }
        entrada.close();
    }
}