import java.util.Scanner;
public class TowerOfHonoi {
    public static void toh(int n, char s, char t, char d){
        if(n == 1){
            System.out.println("Move disk 1 form "+s+" to "+d);
            return;
        }
        toh(n-1, s, d, t);
        System.out.println("Move disk "+n+" from "+s+" to "+d);
        toh(n-1, t, s, d);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rings: ");
        int n = sc.nextInt();
        toh(n, 's', 't', 'd');
        sc.close();
    }
}
