import java.util.*;

public class BinarySearch{
    public static int binarySearchSearch(int [] arr, int key){
        int s = 0;
        int e = arr.length-1;
        while(s <= e){
            int mid = s + (e - s) / 2;
            if(arr[mid] == key){
                return mid;
            }
            else if(key > arr[mid]){
                s = mid + 1;
            }
            else{
                e = mid - 1;
            }
        }
        return -1;
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
        System.out.print("Enter key: ");
        int k = sc.nextInt();
        System.out.println("Found at: "+ binarySearchSearch(arr, k));
        sc.close();
    }
}