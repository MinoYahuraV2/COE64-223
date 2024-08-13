import java.util.Scanner;
public class LoopPassOrFail{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int score1;
        int score2;
        int score3;
        int mean;
        char choice;
        do{
        System.out.print("Enter score1 (1-100) : ");
        score1 = sc.nextInt();
        System.out.print("Enter score2 (1-100) : ");
        score2 = sc.nextInt();
        System.out.print("Enter score3 (1-100) : ");
        score3 = sc.nextInt();

        mean = (score1+score2+score3)/3;
        System.out.println("Mean = "+mean);

        if(mean >= 80 && mean <= 100){
            System.out.println("Grade A");
        }else if(mean >= 70 && mean <= 80){
            System.out.println("Grade B");
        }else if(mean >= 60 && mean <= 70){
            System.out.println("Grade C");
        }else if(mean >= 50 && mean <= 60){
            System.out.println("Grade A");
        }else{
            System.out.println("Fail");
        }
        System.out.print("Do you want to continue : ");
        choice = sc.next().charAt(0);

    }while(choice == 'Y' || choice == 'y');
    System.out.println("Bye Bye !!!");
    }
}