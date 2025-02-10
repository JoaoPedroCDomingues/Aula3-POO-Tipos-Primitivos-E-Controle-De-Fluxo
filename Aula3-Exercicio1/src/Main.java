public class Main {
    public static void main(String[] args) {

        int lanches = 0;
        int media;

        lanches = lanches + 10;
        System.out.println("Lanches após 1 hora: " + lanches);

        lanches = lanches + 4;
        System.out.println("Lanches após 2 horas: " + lanches);

        lanches = lanches + 2;
        System.out.println("Lanches após 3 horas: " + lanches);

        media = lanches/3;

        System.out.println("Lanches ao fim da noite: " + lanches);
        System.out.println("Media de lanches: " + media);
    }
}