import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sorting {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of ArrayList: ");
        int n = sc.nextInt();
        ArrayList <Integer> list = new ArrayList<>(n);
        System.out.print("Enter elements in ArrayList: ");
        for(int i = 0; i < n; i++){
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        System.out.println("Sorted: "+list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Reverse Sorted: "+list);
        sc.close();
    }
}
