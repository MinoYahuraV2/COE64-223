import java.util.Scanner;
public class DiceToss {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        
        int n1 = (int)(Math.random()*6)+1;
        int n2 = (int)(Math.random()*6)+1;
        int n3 = (int)(Math.random()*6)+1;

        int sum = n1+n2+n3;

        if(isNetween6And12(sum)){
            System.out.print(n1+" "+n2+" "+n3+" Between 6 And 12\n");
        }else{
            System.out.print(n1+" "+n2+" "+n3+" Out Of Range\n");
        }
        System.out.println();
    }
    public static boolean isNetween6And12(int n1){
        if(n1 >= 6 && n1 <= 12){
            return true;
        }
        return false;
    }
}
