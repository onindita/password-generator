import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = 0;
        String input = "";

        do {
            System.out.println("Please enter the desired length of your password (between 8 and 20): ");
            input = scanner.next();
            try {
                length = Integer.valueOf(input);
            } catch(NumberFormatException e){ }
        } while( length < 8 || length > 20);

        System.out.println("Generating new password of length " + length + "...");
        System.out.println("Your new password is: " + new Generator().createNewPassword(length));
        scanner.close();
    }
}