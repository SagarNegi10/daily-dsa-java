import java.util.ArrayList;
import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of ArrayList: ");
        int n = sc.nextInt();
        ArrayList <Integer> list = new ArrayList<>(n);
        System.out.print("Enter elements in ArrayList: ");
        for(int i = 0; i < n; i++){
            list.add(sc.nextInt());
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < list.size(); i++){
            max = Math.max(max, list.get(i));
        }
        System.out.println("Maximum element is: "+max);
        sc.close();
    }
}
