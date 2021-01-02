import java.util.Scanner;

public class Java_Stdin_and_Stdout_II {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        Double d = scan.nextDouble();
        int option = 0;
        try {
            option = Integer.parseInt(scan.nextLine());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        String s = scan.nextLine();
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
