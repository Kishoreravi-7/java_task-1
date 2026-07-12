import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num =scanner.nextInt();
        int original=num;
        int reverse=0;
        while(num!=0){
            int remainder =num%10;
            reverse =reverse*10+remainder;
            num =num/10;
        }
        if(original==reverse){
            System.out.println("The number is a palindrome.");
        }else{
            System.out.println("The number is not a palindrome.");
        }
    }
}
