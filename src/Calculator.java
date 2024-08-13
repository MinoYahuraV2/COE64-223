import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Press operatoAr : ");
        char choice = sc.next().charAt(0);
        System.out.print("Please enter x : ");
        int x = sc.nextInt();
        System.out.print("Please enter y : ");
        int y = sc.nextInt();
        switch(choice){
            case 'A' : 
                System.out.println(+x+" + "+y+" = "+(x+y));
                break;
            case 'S' :
                System.out.println(+x+" - "+y+" = "+(x-y));
                break;
            case 'M' :
                System.out.println(+x+" * "+y+" = "+(x*y));
                break;
            case 'D' :
                System.out.println(x+" / "+y+" = "+(x/y));
                break;
        }
        System.out.println("Bye Bye !!!");
    }
}
