import java.util.ArrayList;
import java.util.Scanner;

public class Swap {
    public static void swap(ArrayList <Integer> list, int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of ArrayList: ");
        int n = sc.nextInt();
        ArrayList <Integer> list = new ArrayList<>(n);
        System.out.print("Enter elements in ArrayList: ");
        for(int i = 0; i < n; i++){
            list.add(sc.nextInt());
        }
        System.out.print("Enter index 1: ");
        int idx1 = sc.nextInt();
        System.out.print("Enter index 2: ");
        int idx2 = sc.nextInt();
        System.out.println("Before swap: "+list);
        swap(list, idx1, idx2);
        System.out.println("After swap: "+list);
        sc.close();
    }
}
