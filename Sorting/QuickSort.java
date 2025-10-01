import java.util.Scanner;

public class QuickSort {
    public static void quickSort(int arr[], int s, int e){
        if(s < e){
            int pivIndex = partition(arr, s, e);
            quickSort(arr, s, pivIndex - 1);
            quickSort(arr, pivIndex + 1, e);
        }
    }
    public static int partition(int arr[], int s, int e){
        int pivot = arr[e];
        int i = s - 1;
        for(int j = s; j < e; j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[e];
        arr[e] = temp;
        return i+1;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Elements: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.print("Enter elements in array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        quickSort(arr, 0, n-1);
        System.out.print("Sorted array: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
