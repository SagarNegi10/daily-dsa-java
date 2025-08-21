import java.util.ArrayList;
import java.util.Scanner;

public class PrintReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of ArrayList: ");
        int n = sc.nextInt();
        ArrayList <Integer> list = new ArrayList<>(n);
        System.out.print("Enter elements in ArrayList: ");
        for(int i = 0; i < n; i++){
            list.add(sc.nextInt());
        }
        System.out.print("Reversed ArrayList: ");
        for(int i = list.size()-1; i >= 0; i--){
            System.out.print(list.get(i)+" ");
        }
        sc.close();
    }
}
