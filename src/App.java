import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String numberone;
        String numbertwo;

        System.out.println("Anna ensimmäinen numero:");
        numberone = scanner.nextLine();
        System.out.println("Anna toinen numero:");
        numbertwo = scanner.nextLine();
        System.out.println("Tulos: " + (Integer.parseInt(numberone) + Integer.parseInt(numbertwo)));
    }
}
