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
        System.out.println("Haluatko laskea nämä yhteen vai jakaa?");
        String kysymys = scanner.nextLine();
        if (kysymys.equals("yhteen")) {
            System.out.println("Summa on: " + (Integer.parseInt(numberone) + Integer.parseInt(numbertwo)));
        } else if (kysymys.equals("jakaa")) {
            System.out.println("Tulos on: " + (Integer.parseInt(numberone) / Integer.parseInt(numbertwo)));
        }
    }
}
