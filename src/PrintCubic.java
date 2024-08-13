import java.util.Scanner;
public class PrintCubic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start number : ");
        int number = sc.nextInt();

        for(int i = 0 ; i <= 10 ; i++){
            double result ;
            result = Math.pow((number+i), 3);
            System.out.println((number+i)+"     "+result);
        }
    }
}
