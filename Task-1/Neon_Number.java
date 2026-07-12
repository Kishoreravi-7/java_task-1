import java.util.Scanner;
public class Neon_Number {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=scanner.nextInt();
        int square =n*n;
        int sum =0;
        while (square!=0) {
            sum+=square%10;
            square/=10;
        }
        if (sum==n) {
            System.out.println(n+" is a Neon number");
        } else {
            System.out.println(n+" is not a Neon number");
        }
    }
}
