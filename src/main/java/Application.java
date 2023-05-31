import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the desired length of your password: ");
        String input = scanner.next();
        System.out.println("Generating new password of length " + input + "...");
        System.out.println("Your new password is: " + new Generate().generatePassword(input));
        scanner.close();
    }
}