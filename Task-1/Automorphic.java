import java.util.Scanner;
public class Automorphic {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num =scanner.nextInt();
        int square = num*num;
        String strNum = Integer.toString(num);
        String strSquare = Integer.toString(square);
        if(strSquare.endsWith(strNum)){
            System.out.println(num+ " is an automorphic number.");
        }else{
            System.out.println(num+ " is not an automorphic number.");
        }
    }
}