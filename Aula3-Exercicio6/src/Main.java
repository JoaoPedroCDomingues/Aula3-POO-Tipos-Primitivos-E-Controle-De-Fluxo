import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner entrada = new Scanner(System.in);
        int x = rand.nextInt(10) + 1;

        System.out.println("Adivinhe um numero entre 1 e 10!");

        for(int i = 0;i<10;i++){

            int num = entrada.nextInt();
            if(num == x){
                System.out.println("Você acertou!");
                break;
            }
            else if(num > x){
                System.out.println("O numero é menor do que o inserido!");
            }
            else if(num < x){
                System.out.println("O numero é maior do que o inserido!");
            }

        }

        entrada.close();

    }
}