import java.util.Scanner;
public class Swap_Two_Numbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a =scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b =scanner.nextInt();
        int temp =a;
        a =b;
        b =temp;
        System.out.println("swapping:a="+a+",b="+b);
    }
    
}
