package Test;
import java.util.Scanner;
class vote {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your age:");
        int age =scanner.nextInt();
        if(age>=18){
            System.out.println("you are eligible to vote");
        }
        else if(age<18&&age>0){
            System.out.println("you are not eigible to vote");
        }
        else{
            System.out.println("invalid option");
        }
    }
        
}