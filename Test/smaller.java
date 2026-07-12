package Test;
import java.util.Scanner;
public class smaller {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value for a: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter value for b: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter value for c: ");
        int num3 = scanner.nextInt();
        if(num1<num2){
            if(num1<num3){
                System.out.println("a is the smallest number");
            }
            else{
                System.out.println("c is the smallest number");
            }  
        }
        else{
            if(num2<num3){
                System.out.println("b is the smallest number");
            }
            else{
                System.out.println("c is the smallest number");
            }
        }
    }
}
