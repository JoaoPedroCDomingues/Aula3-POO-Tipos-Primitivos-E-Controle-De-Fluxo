import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    System.out.println("Quantos alunos terão aula hoje?");
    int alunos = entrada.nextInt();

    switch(alunos){
        case 10:
        case 20:
            System.out.println("Utilize a sala I-16!");
        break;

        case 30:
            System.out.println("Utilize a sala I-22!");
        break;

        default:
            System.out.println("Não existem salas disponíveis!");
        break;
    }

    entrada.close();

    }
}