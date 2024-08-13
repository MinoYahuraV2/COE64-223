import java.util.Scanner;

public class TestCharLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of loop: ");
        int loop = sc.nextInt();
        for (int i = 0; i < loop; i++) {
            System.out.print("Any character: ");
            char choice = sc.next().charAt(0);
            if (Character.isLetter(choice)) {
                switch (choice) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        System.out.println(choice + " is a vowel");
                        break;
                    default:
                        System.out.println(choice + " is a consonant");
                        break;
                }
            } else if (Character.isDigit(choice)) {
                System.out.println(choice + " is a number");
            } else {
                System.out.println(choice + " is a speacial character");
            }
        }
    }
}
