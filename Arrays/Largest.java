import java.util.Scanner;

public class Largest {
    public static int largest(int [] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            max = Math.max(max, arr[i]);
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.print("Enter elements in array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Largest element: "+ largest(arr));
        sc.close();
    }
}
