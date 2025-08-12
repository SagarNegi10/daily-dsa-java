import java.util.*;

public class LinearSearch{
    public static int linearSearch(int [] arr, int key){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                return i;
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
        System.out.println("Found at: "+ linearSearch(arr, k));
        sc.close();
    }
}