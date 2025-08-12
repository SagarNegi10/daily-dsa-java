import java.util.Scanner;

public class Reverse {
    public static int [] reverse(int [] arr){
        int i = 0;
        int j = arr.length-1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
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
        reverse(arr);
        System.out.print("Reversed array: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
