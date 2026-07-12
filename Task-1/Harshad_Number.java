import java.util.Scanner;
public class Harshad_Number {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n =scanner.nextInt();
        int original=n;
        int sum=0;
        while (n!=0){
            int digit = n%10;
            sum+=digit;
            n/=10;
        }
        if (original % sum==0){
            System.out.println(original+ " is a Harshad number");
        } else {
            System.out.println(original+ " is not a Harshad number");
        }
    }
}
