
package PhoneNumber;

import java.util.Scanner;

public class PhoneNumberDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter no of phone number: ");
        int numPhones = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        PhoneNumber[] phoneNumbers = new PhoneNumber[numPhones];

        for (int i = 0; i < numPhones; i++) {
            System.out.print("Enter phone number " + (i + 1) + ": ");
            String number = scanner.nextLine();
            phoneNumbers[i] = new PhoneNumber(number);
        }

        System.out.println("We have " + numPhones + " Phone Numbers");

        for (int i = 0; i < numPhones; i++) {
            System.out.println("Phone number " + (i + 1) + " is " + phoneNumbers[i]);
            phoneNumbers[i].readAs();
            System.out.println("DigitSummary");
            int[] freq = phoneNumbers[i].calFreq();
            for (int j = 0; j < freq.length; j++) {
                System.out.print(j + ": ");
                for (int k = 0; k < freq[j]; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
        }

        scanner.close();
    }
}