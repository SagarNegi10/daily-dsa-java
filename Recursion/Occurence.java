import java.util.Scanner;

public class Occurence{
    public static int first(int [] arr, int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return first(arr, key, i+1);
    }
    public static int last(int [] arr, int key, int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = last(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.print("Enter elements in array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter key: ");
        int key = sc.nextInt();
        System.out.println("First occurence at: "+first(arr, key, 0));
        System.out.println("last occurence at: "+last(arr, key, 0));
        sc.close();
    }
}