import java.util.Scanner;

public class ProcessInterger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers [Exit press number <=0 ] : ");
        int number;
        int sum1 = 0; // Sum of even numbers
        int sum2 = 0; // Sum of odd numbers
        int min = Integer.MAX_VALUE; // Initialize min to maximum possible value
        int max = Integer.MIN_VALUE; // Initialize max to minimum possible value
        
        do {
            number = sc.nextInt();
            if (number == 0) {
                break; // Exit loop if input is 0
            }
            if (number % 2 == 0) {
                sum1 += number; // Add to sum1 if even
            } else {
                sum2 += number; // Add to sum2 if odd
            }
            if (number > max) {
                max = number; // Update max if current number is greater
            }
            if (number < min) {
                min = number; // Update min if current number is smaller
            }
        } while (true); // Continue loop until break
        
        // Handle case when no numbers were entered (except 0)
        if (min == Integer.MAX_VALUE) {
            min = 0; // or you can choose to handle it differently
        }
        if (max == Integer.MIN_VALUE) {
            max = 0; // or you can choose to handle it differently
        }
        
        System.out.println("Summary of odd numbers: " + sum2);
        System.out.println("Summary of even numbers: " + sum1);
        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
    }
}
