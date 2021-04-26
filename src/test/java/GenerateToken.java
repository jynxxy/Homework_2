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

        switch (select) {
            case "1":
                tokenGenerator(5);
                break;
            case "2":
                tokenGenerator(10);
                break;
            case "3":
                tokenGenerator(15);
                break;
            default:
                System.out.println("You picked wrong option");
        }
    }

    public static String tokenGenerator(int input) {
        return RandomStringUtils.randomAscii(input).replace(" ", "");
    }
}
