import org.apache.commons.lang3.RandomStringUtils;

import java.util.Scanner;

public class GenerateToken {
    public static void main(String[] args) {
        System.out.println("Enter the length of the token. Select:");
        System.out.println("1 - for a 5-character token");
        System.out.println("2 - for a 10-character token");
        System.out.println("3 - for a 15-character token");

        Scanner sc = new Scanner(System.in);
        String select = sc.nextLine();
        String token;

        switch (select) {
            case "1":
                token = tokenGenerator(5);
                System.out.println("Your generated token: " + token);
                break;
            case "2":
                token = tokenGenerator(10);
                System.out.println("Your generated token: " + token);
                break;
            case "3":
                token = tokenGenerator(15);
                System.out.println("Your generated token: " + token);
                break;
            default:
                System.out.println("You picked wrong option");
        }
    }

    public static String tokenGenerator(int input) {
        return RandomStringUtils.randomAscii(input).replace(" ", "");
    }
}
