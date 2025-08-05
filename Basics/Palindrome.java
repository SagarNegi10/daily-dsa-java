import java.util.Scanner;

public class Palindrome {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int temp = n;
        int res = 0;
        while(n > 0){
            res = (res * 10) + n % 10;
            n /= 10;
        }
        if(temp == res){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
        sc.close();
    }
}
