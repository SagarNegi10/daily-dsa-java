import java.util.Scanner;

public class MergeSort {
    public static void mergeSort(int arr[], int s, int e){
        if(s >= e){
            return;
        }
        int mid = s + (e - s) / 2;
        mergeSort(arr, s, mid);
        mergeSort(arr, mid+1, e);
        merger(arr, s, mid, e);
    }
    public static void merger(int arr[], int s, int mid, int e){
        int [] temp = new int [e - s + 1];
        int i = s;
        int j = mid + 1;
        int k = 0;
        while(i <= mid && j <= e){
            if(arr[i] < arr[j]){
                temp[k++] = arr[i++];
            }
            else{
                temp[k++] = arr[j++];
            }
        }
        while(i <= mid){
            temp[k++] = arr[i++];
        }
        while(j <= e){
            temp[k++] = arr[j++];
        }
        for(k = 0, i = 0; k < temp.length; k++, i++){
            arr[i] = temp[k];
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
        mergeSort(arr, 0, n-1);
        System.out.print("Sorted array: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] +" ");
        }
        sc.close();
    }
}