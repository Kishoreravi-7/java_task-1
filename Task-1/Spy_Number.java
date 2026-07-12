import java.util.Scanner;
public class Spy_Number {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter a number:");
        int n =scanner.nextInt();
        int original=n;
        int sum=0;
        int product=1;
        while (n!=0){
            int digit =n%10;
            sum+=digit;
            product*=digit;
            n/=10;
        }
        if (sum==product){
            System.out.println(original+" is a Spy number");
        } else {
            System.out.println(original+" is not a Spy number");
        }
    }
}
