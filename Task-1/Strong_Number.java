import java.util.Scanner;
public class Strong_Number {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num =scanner.nextInt();
        int originalNum = num;
        int sum = 0;
        while(num>0){
            int digit =num%10;
            int factorial =1;
            for(int i=1;i<=digit;i++){
                factorial*=i;
            }
            sum+=factorial;
            num/=10;
        }
        if(sum==originalNum){
            System.out.println("Strong number");
        }
        else{
            System.out.println("not strong number");
        }
    }
}
