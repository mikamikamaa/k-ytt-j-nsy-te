import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String numberone;
        String numbertwo;
        int numero;
        numero = 10;
        System.out.println("Anna ensimmäinen numero:");
        numberone = scanner.nextLine();
        System.out.println("Anna toinen numero:");
        numbertwo = scanner.nextLine();
        if (Integer.parseInt(numberone) + Integer.parseInt(numbertwo) > numero) {
            System.out.println("Summa on suurempi kuin " + numero);
            System.out.println("Summa on: " + (Integer.parseInt(numberone) + Integer.parseInt(numbertwo)));
        } else {
            System.out.println("Summa on pienempi kuin " + numero);
         System.out.println("Summa on: " + (Integer.parseInt(numberone) + Integer.parseInt(numbertwo)));
        }
    }
}
