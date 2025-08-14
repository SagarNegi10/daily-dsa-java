import java.util.Scanner;

public class PrintSeries{
    public static void printInc(int n){
        if(n == 1){
            System.out.print(n+" ");
            return;
        }
        printDec(n-1);
        System.out.print(n+" ");
    }
    public static void printDec(int n){
        if(n == 1){
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.print("Increasing: ");
        printInc(n);
        System.out.println();
        System.out.print("Decreasing: ");
        printDec(n);
        sc.close();
    }
}