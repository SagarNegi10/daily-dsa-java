import java.util.Scanner;

public class EvenOdd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int bitmask = 1;
        if((n & bitmask) == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
        sc.close();
    }
}