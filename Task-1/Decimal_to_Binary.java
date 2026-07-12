import java.util.Scanner;
public class Decimal_to_Binary {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the decomal nimber:");
        int num =scanner.nextInt();
        String binary="";
        while(num>0){
            int remainder =num%2;
            binary =remainder+binary;
            num =num/2;
        }
        System.out.println("Binary representation is:"+binary);
    }
}
