import java.util.Scanner;
public class LCM {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a =scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b =scanner.nextInt();
        int lcm = (a>b)?a:b;
        while(true){
            if(lcm%a==0 && lcm%b==0){
                System.out.println("LCM of "+a+"and"+b+" is:"+lcm);
                break;
            }
            lcm++;
        }
    }
}
