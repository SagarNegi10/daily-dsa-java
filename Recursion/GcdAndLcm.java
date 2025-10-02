import java.util.Scanner;

public class GcdAndLcm{
    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a % b);
    }
    public static int lcm(int a, int b){
        return (a * b) / gcd(a, b);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("Gcd of "+a+" And "+b+" : "+gcd(a, b));
        System.out.println("Lcm of "+a+" And "+b+" : "+lcm(a, b));
        sc.close();
    }
}