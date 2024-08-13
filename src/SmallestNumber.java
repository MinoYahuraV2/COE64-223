import java.util.Scanner;
public class SmallestNumber
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 3 numbers");
        System.out.print("no.1 : ");
        int no1 = sc.nextInt();
        System.out.print("no.2 : ");
        int no2 = sc.nextInt();
        System.out.print("no.3 : ");
        int no3 = sc.nextInt();
        
        int min = no1;
        if(min > no2){
            min = no2;
        }else if(min > no3){
            min = no3;
        }
        System.out.println(min+" is the smallest");
    }    
}
