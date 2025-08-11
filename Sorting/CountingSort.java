import java.util.Scanner;

public class CountingSort {
    public static void countingSort(int arr[], int n){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            max = Math.max(max, arr[i]);
        }
        int [] count = new int [max+1];
        for(int i = 0; i < n; i++){
            count[arr[i]]++;
        }
        int j = 0;
        for(int i = 0; i < n; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Elements: ");
        int n = sc.nextInt();
        int [] arr = new int [n];
        System.out.print("Enter elements in array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        countingSort(arr, n);
        System.out.print("Sorted array: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] +" ");
        }
        sc.close();
    }
}