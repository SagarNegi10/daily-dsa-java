import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int arr[], int n){
        for(int i = 0; i < n; i++){
            int curr = arr[i];
            int prev = i - 1;
            while(prev >= 0 && arr[prev] > curr){
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
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
        insertionSort(arr, n);
        System.out.print("Sorted array: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] +" ");
        }
        sc.close();
    }
}