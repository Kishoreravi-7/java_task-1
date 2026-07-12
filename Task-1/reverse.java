import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the reverse number:");
        int num =scanner.nextInt();
        int reverse=0;
        while(num!=0){
            int remainder =num%10;
            reverse =reverse*10+remainder;
            num =num/10;
        }
        System.out.println("The reverse of the number is: "+reverse);
    }
}
