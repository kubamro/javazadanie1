import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Uczę");
        System.out.println("się");
        System.out.println("programowania");
        System.out.println("i");
        System.out.println("commitowania");
        System.out.println("");
        System.out.println("Ile masz lat?");
        Scanner scanner = new Scanner(System.in);
        Integer age = scanner.nextInt();
        if (age >= 18){
            System.out.println("Jestes pelnoletni.");

        }
        else {
            System.out.println("Nie jestes pelnoletni");
        }
    }
}