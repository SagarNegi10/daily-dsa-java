import java.util.Scanner;

public class MaxSubArray {
    public static int max(int [] arr){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int i = 0; i < arr.length; i++){
            cs = cs + arr[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        return ms;
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
        System.out.println("Max sub array: "+ max(arr));
        sc.close();
    }
}
