import java.util.Scanner;

public class PowerOfX{
    // TC - O(n)
    // public static int power(int x, int n){
    //     if(n == 0){
    //         return 1;
    //     }
    //     return x * power(x, n-1);
    // }

    // TC - O(logn)
    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        int halfPower = power(x, n/2);
        int halfPowerSqr = halfPower * halfPower;
        if(n % 2 != 0){
            halfPowerSqr = x * halfPowerSqr;
        }
        return halfPowerSqr;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = sc.nextInt();
        System.out.print("Enter power: ");
        int n = sc.nextInt();
        System.out.println("Power of X^n: "+power(x, n));
        sc.close();
    }
}