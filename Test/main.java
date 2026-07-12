package Test;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value for a: ");
            int a = scanner.nextInt();
        System.out.print("Enter value for b: ");
        int b = scanner.nextInt();
        if(a>b){
            System.out.println("a is greater"+a);
        }
        else if(b>a){
            System.out.println("b is greater"+b);
        }
        else{
            System.out.println("Both are equal");
        }
    }

    
}