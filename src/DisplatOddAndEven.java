import java.util.Scanner;
public class DisplatOddAndEven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Start Number : ");
        int number = sc.nextInt();
        System.out.print("End Number : ");
        int End = sc.nextInt();

        displayEven(number,End);
        displayOdd(number,End);
    }
    public static void displayEven(int n1, int n2){
        System.out.print("Even number :");
        for(int i = n1 ; i <= n2; i++){
            if(i % 2 == 0){
            System.out.print(" "+i);
            }
            }
        }
        public static void displayOdd(int n1, int n2){
            System.out.print("\nEven number :");
            for(int i = n1 ; i <= n2; i++){
                if(i % 2 != 0){
                System.out.print(" "+i);
                }
                }
            }
    }

