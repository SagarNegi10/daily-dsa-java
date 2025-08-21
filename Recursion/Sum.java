import java.util.Scanner;

public class Sum{
    public static int printSum(int n){
        if(n == 1){
            return 1;
        }
        return n + printSum(n-1);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Sum of first "+n+" Naturals number: "+printSum(n));
        sc.close();
    }
}