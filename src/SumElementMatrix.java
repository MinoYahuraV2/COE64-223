import java.util.Scanner;
public class SumElementMatrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter matrix row and column : ");
        int numc1 = sc.nextInt();
        int numc2 = sc.nextInt();
        System.out.print("Enter start number : ");
        int number = sc.nextInt();
        System.out.println("Display");
        
        int num1 = numc1*numc2;
        int summury =0;
        for(int i = 0; i < numc1; i++){
            for(int j = 0; j < numc2; j++){
                System.out.print(number+"  ");
                summury = summury+number;
                number++;

            }
            System.out.println();
        }
        System.out.println("Summury : "+summury);
    }
}
