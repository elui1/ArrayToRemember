import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] presidents = new String[10];
        String president = "";

        while (!president.equals("history")) {
            for (int i = presidents.length - 1; i >= 0; i--) {
                System.out.print("Enter the name of a president: ");
                president = sc.nextLine();
                presidents[i] = president;
            }
            System.out.print("Enter the name of a president: ");
            president = sc.nextLine();
        }

        System.out.println(Arrays.toString(presidents));
    }
}
