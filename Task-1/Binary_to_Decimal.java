import java.util.Scanner;
public class Binary_to_Decimal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the binary number:");
        int num =scanner.nextInt();
        int decimal=0;
        int power=0;
        while(num>0){
            int remainder = num%10;
            decimal+=remainder*Math.pow(2,power);
            num = num/10;
            power++;
        }
        System.out.println("Decimal representation is:"+decimal);
    }
    
}
