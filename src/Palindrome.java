
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder sb = new StringBuilder(input);
        String reversed = String.valueOf(sb.reverse());

        if (input.equals(reversed))
            System.out.println("Palindrome");
        else System.out.println("Not a palindrome");
    }

}
