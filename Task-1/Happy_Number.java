import java.util.Scanner;
public class Happy_Number {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num =scanner.nextInt();
        int originalNum = num;
        int sum = 0;
        while(num>9){
            int sumOfSquares = 0;
            while(num>0){
                int digit = num%10;
                sumOfSquares += digit*digit;
                num/=10;
            }
            num =sumOfSquares;
        }
        while(num>0){
            int digit = num%10;
            sum += digit*digit;
            num/=10;
        }
        if(sum==1){
            System.out.println(originalNum +" is a happy number.");
        }
        else{
            System.out.println(originalNum + " is not a happy number.");
        }
    }   
    
}
